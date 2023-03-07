package exer_POO2;

public class CotDolar {
	
	public static double conversor(double cotDolar, double valConverter) {
		
		double valConvertido = valConverter * cotDolar;
		double comImpost = (valConvertido * 0.06) + valConvertido;

		return comImpost;
		
	}

}
