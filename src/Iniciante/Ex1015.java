package Iniciante;

import java.util.Scanner;

public class Ex1015 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double x1 = input.nextDouble(); 
		double x2 = input.nextDouble(); 
		double y1 = input.nextDouble(); 
		double y2 = input.nextDouble(); 
		double d = Math.sqrt(Math.pow(x1 - y1, 2) + Math.pow(x2 - y2, 2));
		
		System.out.printf("%.4f", d);

	}

}
//1.0 7.0 5.0 9.0
