package Iniciante;

import java.util.Scanner;

public class Ex1013 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();

		int local;

		if (A > B && A > C) // && Significa "E" ou "And"
			local = A;

		else if (B > C)
			local = B;

		else
			local = C;
		System.out.println(local + " eh o maior");

	}
}
