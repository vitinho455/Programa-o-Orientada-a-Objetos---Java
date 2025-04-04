package pacote;

import java.util.Scanner;

public class exe_Funcionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario1 = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario1.nome = sc.nextLine();
		
		System.out.println("Salário: ");
		funcionario1.salario = sc.nextDouble();

		System.out.println("Imposto: ");
		funcionario1.taxa = sc.nextDouble();
	
		
		System.out.println();
		
		System.out.println(funcionario1.nome + ", R$ " + funcionario1.salarioLiquido());
		
		System.out.println();
		
		System.out.println("Digite o persentual de aumento do seu salário: ");
		double porcentagem = sc.nextDouble();
		
		funcionario1.aumentoSalario(porcentagem);
				
		System.out.println("Dados atualizados: " + funcionario1.nome + ", R$ " + funcionario1.salarioLiquido());
		System.out.println();
		
	}

}
