package Iniciante;

import java.util.Scanner;

public class Ex1002 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double raio = input.nextDouble();
		final double n = 3.14159;
		double area = n * raio * raio;

		System.out.printf("A=%.4f", area);

	}

}
