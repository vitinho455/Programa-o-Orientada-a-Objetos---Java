package pacote;

public class Retangulo {

	public double altura;
	public double largura;
	
	public double Area() {
		return altura * largura;
	}
	
	public double Perimetro() {
		return (altura + largura) * 2;
	}
	
	public double Diagonal() { 
		return Math.sqrt( Math.pow(altura, 2) + Math.pow(largura, 2));
	}
	
}
