package Iniciante;

import java.util.Scanner;

public class Ex1014 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int X;
		double Y;

		X = input.nextInt();
		Y = input.nextDouble();

		System.out.printf("%.3f km/l\n", X/Y);
	}

}

