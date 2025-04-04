package pak5;

public class Funcionario {

	private int id;
	private String nome;
	private double salario;

	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void Aumento_salario(double porcentagem) {

		salario += (salario * porcentagem);

	}

	public String toString() {
		
		return id + ", " + nome + ", " + String.format("%.4f", salario);
	
	}
}
