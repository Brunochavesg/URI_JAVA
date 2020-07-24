package Iniciante;

import java.util.Scanner;

public class Ex1018 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int V, T, c100, c50, c20, c10, c05, c02, c01;

		V = input.nextInt();

		T = V;
		c100 = T / 100;
		T = T - (c100 * 100);

		T = V;
		c50 = T / 50;
		T = T - (c50 * 50);
		
		T = V;
		c20 = T / 20;
		T = T - (c20 * 20);
		
		T = V;
		c10 = T / 10;
		T = T - (c10 * 10);
		
		T = V;
		c05 = T / 5;
		T = T - (c05 * 5);
		
		T = V;
		c02 = T / 5;
		T = T - (c02 * 2);
		
		T = V;
		c01 = T / 1;
		T = T - (c01 * 1);

		System.out.println(c100);
		System.out.println(c50);
		System.out.println(c20);
		System.out.println(c10);
		System.out.println(c05);
		System.out.println(c02);
		System.out.println(c01);

	}

}
