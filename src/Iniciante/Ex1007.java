package Iniciante;

import java.util.Scanner;

public class Ex1007 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int A, B, C, D, diferenca;

		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		D = input.nextInt();
		diferenca = (A * B) - (C * D);

		System.out.println("DIFERENCA = " + diferenca);

	}

}
