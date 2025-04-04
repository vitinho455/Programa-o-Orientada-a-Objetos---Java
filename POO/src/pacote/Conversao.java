package pacote;

public class Conversao {
	
	public static final double IOF = 0.06;

	public static double conversor(double precoDolar, double valorDolares) {

		double converter = precoDolar * valorDolares;

		double resultado = converter + (converter * IOF);

		return resultado;
	}

}
