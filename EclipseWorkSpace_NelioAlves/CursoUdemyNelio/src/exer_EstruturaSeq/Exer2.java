package exer_EstruturaSeq;

public class Exer2 {
	private double raio;

	public Exer2(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	
	public void calculo() {
		
		
		double area = 3.14159 * (Math.pow(getRaio(), 2));
		
		System.out.printf("Resultado da Area: %.4f", area);
		
		// System.out.println("ola mundo");
	}
}
