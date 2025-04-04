package pak2;

public class Banco {
	
	private static int numero_conta;
	private String titular;
	private double saldo;
	
	public static int getNumero_conta() {
		return numero_conta;
	}
	public static void setNumero_conta(int numero_conta) {
		Banco.numero_conta = numero_conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getNome() {
		return titular;
	}
	public void setNome(String titular) {
		this.titular = titular;
	}
	
	
	public void deposito_inicial(double valor_inicial) {
		
		saldo += valor_inicial;

		System.out.println("Conta atualizada: ");
		System.out.println();
		System.out.println(numero_conta + ", " + titular + " , "+ saldo);		
		System.out.println();

	}
	
	public void deposito(double valor_depositado) {
		
		saldo += valor_depositado;
		
		System.out.println("Conta atualizada: ");
		System.out.println();
		System.out.println(numero_conta + ", " + titular + " , "+ saldo);
		System.out.println();

	}
	
	public void saque(double valor_sacado) {
		
		saldo -= valor_sacado + 5.00;
		
		System.out.println("Conta atualizada: ");
		System.out.println();
		System.out.println(numero_conta + " , " + titular + " , "+ saldo);
		System.out.println();

	}
	
	
}
