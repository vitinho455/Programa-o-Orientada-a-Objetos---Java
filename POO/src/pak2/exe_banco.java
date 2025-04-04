package pak2;

import java.util.Scanner;

public class exe_banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Banco banco = new Banco();
		
		System.out.println("Digite o número da sua conta: ");
		banco.setNumero_conta(sc.nextInt());
		
		sc.nextLine();
		
		System.out.println("Digite o seu nome: ");
		banco.setNome(sc.nextLine());
			
		
		System.out.println("Deseja realizar um depósito? (S/ N)");
		String decisao = sc.nextLine().toLowerCase();

		if(decisao.equalsIgnoreCase("S")) {
			
			System.out.println("Digite um valor inicial a ser depositado: ");
			double valor = sc.nextDouble();
			
			banco.deposito_inicial(valor);		
		}
		
		System.out.println("Digite o valor a ser depositado: ");
		double valor_deposito = sc.nextDouble();
		
		banco.deposito(valor_deposito);
			
		System.out.println("Digite o valor a ser sacado: ");
		double saque = sc.nextDouble();
		
		banco.saque(saque);
			
		
		sc.close();
			
		}
		
	}


