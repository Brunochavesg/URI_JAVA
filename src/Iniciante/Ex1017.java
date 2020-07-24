package Iniciante;

import java.util.Scanner;

public class Ex1017 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int A = input.nextInt();
		int B = input.nextInt();
		float C = A * B / 12F;

		System.out.printf("%.3f\n", C);
		
		input.close();
		

	}

}
