package Iniciante;

import java.util.Scanner;

public class Ex1010 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int codigop1 = input.nextInt();
		int qtdpeca1 = input.nextInt();
		double valor1 = input.nextDouble();
		
		
		int codigop2 = input.nextInt();
		int qtdpeca2 = input.nextInt();
		double valor2 = input.nextDouble();
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valor1 * qtdpeca1 + valor2 * qtdpeca2);	
	}

}
