package pak6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exe_Estudante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		ArrayList<Object> estudante = new ArrayList<Object>();
		ArrayList<Integer> quartos = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
		
		
		System.out.println("\n---- Cadastro de alunos ---- ");
		
		System.out.println("Digite a quantidade de alunos que serão cadastrados: ");
		int n = sc.nextInt();
		
		
		for (int i = 0; i < n; i++) {

			System.out.println("Nome: ");
		    sc.nextLine(); 

			String nome = sc.nextLine();
						
			System.out.println("E-mail : ");
			String email = sc.nextLine();
			
			System.out.println("Quarto escolhido: ");
			int quarto =sc.nextInt();
			
			if (quartos.contains(quarto)) {
			    quartos.remove(Integer.valueOf(quarto));
			}
			
			System.out.println("Valor do aluguel: ");
			double aluguel = sc.nextDouble();
			
			Estudante estudantes = new Estudante(nome,email,quarto,aluguel);
			
			estudante.add(estudantes);
		}
		
		System.out.println("\n ---- Alunos Cadastrados ----");
		
		for (Object integer : estudante) {
			 
			System.out.println(integer);
		}
		
		
		System.out.println("\n ---- Lista de quartos ----");
		
		for (Integer integer : quartos) {
			System.out.print(integer + " ");
		}
	}

}
