package pacote;

import java.util.Scanner;

public class exe_Retangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite o valor da largura do retangulo: ");
		retangulo.largura = sc.nextDouble();
		
		System.out.println("Digite o valor da altura do retangulo: ");
		retangulo.altura = sc.nextDouble();
		
		System.out.println("Valor da area: " + retangulo.Area());
		
		System.out.println("Valor do perimetro: " + retangulo.Perimetro());
		
		System.out.println("Valor da diagonal: " + retangulo.Diagonal());
		
	}

}
