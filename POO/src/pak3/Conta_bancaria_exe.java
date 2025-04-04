package pak3;

import java.util.Scanner;

public class Conta_bancaria_exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Conta_bancaria conta;

		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();

		System.out.println("Digite o número da sua conta: ");
		int numero_conta = sc.nextInt();

		System.out.println("Deseja fazer um depósito inicial? (s/n) ");
		char decisao = sc.next().charAt(0);

		if (decisao == 's') {

			System.out.println("Digite um valor inicial para depositar: ");
			double valor_inicial = sc.nextDouble();

			conta = new Conta_bancaria(nome, numero_conta, valor_inicial);

		} else {
			conta = new Conta_bancaria(nome, numero_conta);
		}

		System.out.println("Status da conta: ");

		System.out.println(conta);

		System.out.println("Digite um valor para depósito: ");
		double deposito = sc.nextDouble();

		conta.deposito(deposito);

		System.out.println("Digite um valor para transferir: ");
		double transferencia = sc.nextDouble();

		conta.transferencia(transferencia);

		System.out.println("Digite um valor para sacar: ");
		double saque = sc.nextDouble();

		conta.saque(saque);

		System.out.println(conta);
	}
}
