package Iniciante;

import java.util.Scanner;

public class Ex1012 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		final double pi = 3.14159;

		System.out.printf("TRIANGULO: %.3f\n", A * C / 2);
		System.out.printf("CIRCULO: %.3f\n", pi * C * C);
		System.out.printf("TRAPEZIO: %.3f\n", C * (A + B) / 2);
		System.out.printf("QUADRADO: %.3f\n", B * B);
		System.out.printf("RETANGULO: %.3f\n", A * B);

		// 3.0 4.0 5.2

	}

}
