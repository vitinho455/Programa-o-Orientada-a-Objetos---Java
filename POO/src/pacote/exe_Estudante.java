package pacote;

import java.util.Scanner;

public class exe_Estudante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		System.out.println("Digite o seu nome: ");
		estudante.nome = sc.nextLine();
		
		System.out.println("Digite suas notas: ");
		
		estudante.nota1 = sc.nextDouble();
		estudante.nota2 = sc.nextDouble();
		estudante.nota3 = sc.nextDouble();
		
		
		estudante.somaNota();
		
		}

}
