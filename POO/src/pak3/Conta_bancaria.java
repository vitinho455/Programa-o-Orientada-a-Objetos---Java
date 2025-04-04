package pak3;

public class Conta_bancaria {

	private String nome_titular;
	private final int numero_conta;
	private double saldo;

	public Conta_bancaria(String nome_titular, int numero_conta) {

		this.nome_titular = nome_titular;
		this.numero_conta = numero_conta;
	}

	public Conta_bancaria(String nome_titular, int numero_conta, double valor_inicial) {

		this.nome_titular = nome_titular;
		this.numero_conta = numero_conta;
		this.saldo += valor_inicial;
	}

	public String getNome_titular() {
		return nome_titular;
	}

	public void setNome_titular(String nome_titular) {
		this.nome_titular = nome_titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero_conta() {
		return numero_conta;
	}

	public void deposito(double valor) {

		saldo += valor;

	}

	public void saque(double valor) {

		saldo -= valor;

	}

	public void transferencia(double valor) {

		saldo -= valor + 17.90;

	}

	public String toString() {

		return "Nome: " + nome_titular + ", " + numero_conta + ", " + String.format("%.2f", saldo);
	}

}
