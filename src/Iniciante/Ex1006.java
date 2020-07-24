package Iniciante;

import java.util.Scanner;

public class Ex1006 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double A, B, C;
		float media;

		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();
		media = (float) ((A * 2 + B * 3 + C * 5) / 10);

		System.out.printf("MEDIA = %.1f\n", media);

	}

}
