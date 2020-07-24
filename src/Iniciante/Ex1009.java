package Iniciante;

import java.util.Scanner;

public class Ex1009 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String nome = input.next();
		double salariofixo = input.nextDouble();
		double vendas = input.nextDouble();

		System.out.printf("TOTAL = R$ %.2f\n", vendas * 15 / 100 + (salariofixo));

	}

}
