package logica.neppo;

import java.util.Scanner;

public class logica2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer dia = sc.nextInt();
		Integer mes = sc.nextInt();
		Integer ano = sc.nextInt();

		// System.out.println(dia + "/" + mes + "/" + ano);

		if ((dia >= 1 && dia <= 31) || (mes >= 1 && mes <= 12) || (ano > 0)) {
			if ((dia >= 1 && dia <= 28) || dia == 30) {
				System.out.println("true");
			} else if (dia == 31 && mes == 1 && mes == 3 && mes == 5 && mes == 7 && mes == 8 && mes == 10
					&& mes == 12) {
				System.out.println("true");
			} else if (dia == 29) {
				if (ano % 4 == 0) {
					if (ano % 100 != 0) {
						System.out.println("true");
					} else {
						if (ano % 400 == 0) {
							System.out.println("true");
						} else {
							System.out.println("false");
						}
					}
				} else {
					System.out.println("false");
				}
			} else {
				System.out.println("false");
			}
		} else {
			System.out.println("false");
		}

		sc.close();

	}
}
