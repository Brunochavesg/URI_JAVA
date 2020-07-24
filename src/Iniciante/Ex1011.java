package Iniciante;

import java.util.Scanner;

public class Ex1011 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double pi = 3.14159;
		double raio = input.nextDouble();
		double area = 4 / 3.0 * pi * raio * raio * raio;

		System.out.printf("VOLUME = %.3f", area);
		
	}
}
