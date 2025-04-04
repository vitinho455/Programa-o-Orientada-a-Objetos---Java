package pacote;

import java.util.Scanner;

public class exe_Conversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Conversao conversao = new Conversao();
		
		System.out.println("Qual é o preço do dólar? :");
		double precoDolar = sc.nextDouble();
		
		System.out.println("Quantos dólares serão comprados? :");
		double valorDolares = sc.nextDouble();
		
		double resultado = Conversao.conversor(precoDolar,valorDolares);
		
		
		System.out.println("Valor a pagar em reais: " + String.format("%.2f", resultado));
	}

}
