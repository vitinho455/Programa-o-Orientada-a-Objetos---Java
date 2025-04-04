package pacote;

public class Estudante {

	public String nome;
	public double nota1,nota2,nota3;
	
	
	public double somaNota() {
		
		double soma = nota1 + nota2 + nota3;
	
		if(soma >= 60) {
			System.out.println("Final grade = " + soma);
			System.out.println("Pass");
			
		}else {
			double restanteNota = 60 - soma;
			
			System.out.println("Final grade = " + soma);
			System.out.println("Failed");
			System.out.println("Missing " + String.format("%.2f", restanteNota) + " Points!");
			
		}
		
		return soma;
	}
	
	
}
