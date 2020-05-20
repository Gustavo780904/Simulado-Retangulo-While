package simuladoRetanguloWhile;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// leitura da largura com validacao
		int largura = 0, altura = 0; 
		System.out.print("Digite a largura do retangulo: ");
		largura = sc.nextInt();
		while (largura <=0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			largura = sc.nextInt();
		}
		// leitura da altura com validacao
		 
		System.out.print("Digite a altura do retangulo: ");
		altura = sc.nextInt();
		while (altura <=0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			altura = sc.nextInt();
		}
		
		sc.close();

	}

}
