package pak5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class exe_Funcionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de funcionários: ");
		int x = sc.nextInt();
		
		List<Funcionario> func = new ArrayList<>(x);
		
		for (int i = 0; i <= x; i++) {
						
			System.out.println("ID do funcionário: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Digite o nome do funcionário: ");
			String nome = sc.nextLine();
			
			
			System.out.println("Digite o salario do funcionário: ");
			double salario = sc.nextDouble();

			Funcionario funcionario = new Funcionario(id, nome, salario);
			func.add(funcionario);
				
		}		
		
		System.out.println("Digite o id do funcionario: ");
		int id_funcionario = sc.nextInt();
		
		for (Funcionario funcionario : func) {
			
			if(id_funcionario == funcionario.getId()) {
				
				System.out.println("Digite a porcentagem de aumento do salário: ");
				double aumento = sc.nextDouble();
				
				funcionario.Aumento_salario(aumento);				
				break;
				
			}else {
				
				System.out.println("O ID informado não existe!");
				
				for (Funcionario funcionario2 : func) {
					System.out.println(funcionario2);
				} 	
				
				break;
				
			}
			
			
		}
		
		for (Funcionario funcionario3 : func) {
			System.out.println(funcionario3);
		} 		
	}

}
