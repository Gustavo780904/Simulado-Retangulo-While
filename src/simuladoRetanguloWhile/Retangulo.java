package simuladoRetanguloWhile;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// leitura da largura com validacao
		double largura = 0, altura = 0;
		System.out.print("Digite a largura do retangulo: ");
		largura = sc.nextDouble();
		while (largura <= 0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			largura = sc.nextDouble();
		}
		// leitura da altura com validacao

		System.out.print("Digite a altura do retangulo: ");
		altura = sc.nextDouble();
		while (altura <= 0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			altura = sc.nextDouble();
		}

		// opcoes menu
		int opcaoMenu = 0;
		double area = 0;
		double perimetro = 0;
		System.out.println();
		System.out.println("MENU: ");
		System.out.println("1 - Mostrar area ");
		System.out.println("2 - Mostrar perimetro ");
		System.out.println("3 - Sair ");
		System.out.print("Digite uma opcao: ");
		opcaoMenu = sc.nextInt();
		while (opcaoMenu != 3) {
			if (opcaoMenu < 1 || opcaoMenu > 3) {
				System.out.println();
				System.out.println("OPÇÃO INVALIDA");
				System.out.println();
				System.out.println("MENU: ");
				System.out.println("1 - Mostrar area ");
				System.out.println("2 - Mostrar perimetro ");
				System.out.println("3 - Sair ");
				System.out.print("Digite uma opcao: ");
				opcaoMenu = sc.nextInt();
			} else {
				while (opcaoMenu > 0 && opcaoMenu < 3) {
					if (opcaoMenu == 1) {
						area = (largura * altura);
						System.out.println();
						System.out.println("AREA = " + area);
						System.out.println();
						System.out.println("MENU: ");
						System.out.println("1 - Mostrar area ");
						System.out.println("2 - Mostrar perimetro ");
						System.out.println("3 - Sair ");
						System.out.print("Digite uma opcao: ");
						opcaoMenu = sc.nextInt();
					} else {
						perimetro = ((largura + altura) * 2);
						System.out.println();
						System.out.println("PERIMETRO = " + perimetro);
						System.out.println();
						System.out.println("MENU: ");
						System.out.println("1 - Mostrar area ");
						System.out.println("2 - Mostrar perimetro ");
						System.out.println("3 - Sair ");
						System.out.print("Digite uma opcao: ");
						opcaoMenu = sc.nextInt();

					}
				}
			}
		}
		System.out.println();
		System.out.println("FIM DO PROGRAMA!");
		sc.close();
	}
}
