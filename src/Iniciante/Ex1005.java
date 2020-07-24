package Iniciante;

import java.util.Scanner;

public class Ex1005 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		float A, B;
		double MEDIA;

		A = input.nextFloat();
		B = input.nextFloat();
		MEDIA = (double) ((A * 3.5 + B * 7.5) / 11); // double na frente para forçar ele a ser double

		System.out.printf("MEDIA = %.5f\n", MEDIA); // \n para nao dar erro de presentetion no URI

	}

}
