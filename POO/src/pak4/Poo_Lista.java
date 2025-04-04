package pak4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Poo_Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de estudantes");
		int n = sc.nextInt();
		sc.nextLine();
		
		Estudante[] vet = new Estudante[n];
		ArrayList<Integer>Lista_quartos = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
		System.out.println("Digite seus dados: ");
		
		for (int i = 0; i < n; i++) {
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			
			System.out.println("E-mail: ");
			String email = sc.nextLine();
			
			System.out.println();
			
			System.out.print("Escolha um quarto: " + Lista_quartos + " : ");
			int quarto = sc.nextInt();
			
			
			if(Lista_quartos.contains(quarto)) {
				
				Lista_quartos.remove(Integer.valueOf(quarto));
			}
			
			vet[i] = new Estudante(nome, email, quarto);
			sc.nextLine();
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(vet[i]);
		}
		
		System.out.print("Quartos disponíveis: "+ Lista_quartos);
		
		sc.close();
	}

}
