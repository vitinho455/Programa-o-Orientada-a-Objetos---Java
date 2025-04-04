package pacote;

public class Funcionario {

	public String nome;
	public double salario;
	public double taxa;
	public double porcentagem;
	
	public double salarioLiquido() {
		
		return salario - taxa;
	}
	
	public void  aumentoSalario(double porcentagem) {
	
		this.porcentagem = porcentagem;
		double aumento = salario * porcentagem;
		
		salario += aumento;
	}
	
	
}
