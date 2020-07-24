package Iniciante;

import java.util.Scanner;

public class Ex1008 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numero = input.nextInt();
		double qthoras = input.nextDouble();
		double horas = input.nextDouble();
		
		System.out.printf("NUMBER = %d\n", numero);
		System.out.printf("SALARY = U$ %.2f\n ", qthoras * horas);

	}

}
