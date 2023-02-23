package exer_EstruturaSeq;

public class Exer6 {
	
	private double valA, valB, valC, triangulo, circulo, trapezio, quadrado, retangulo;
	
	public Exer6(double valA, double valB, double valC) {
		super();
		this.valA = valA;
		this.valB = valB;
		this.valC = valC;
	}

	protected double getValA() {
		return valA;
	}

	protected void setValA(double valA) {
		this.valA = valA;
	}

	protected double getValB() {
		return valB;
	}

	protected void setValB(double valB) {
		this.valB = valB;
	}

	protected double getValC() {
		return valC;
	}

	protected void setValC(double valC) {
		this.valC = valC;
	}

	protected double getTriangulo() {
		return triangulo;
	}

	protected void setTriangulo() {
		this.triangulo = (getValA() * getValC()) / 2;
	}

	protected double getCirculo() {
		return circulo;
	}

	protected void setCirculo() {
		this.circulo = 3.14159 * Math.pow(getValC(), 2);
	}

	protected double getTrapezio() {
		return trapezio;
	}

	protected void setTrapezio() {
		this.trapezio = ((getValA() + getValB()) * getValC()) / 2;
	}

	protected double getQuadrado() {
		return quadrado;
	}

	protected void setQuadrado() {
		this.quadrado = getValB() * getValB();
	}

	protected double getRetangulo() {
		return retangulo;
	}

	protected void setRetangulo() {
		this.retangulo = getValA() * getValB();
	}
	
	public void saidaValores() {
		setTriangulo();
		setCirculo();
		setTrapezio();
		setQuadrado();
		setRetangulo();
		
		System.out.printf("Triangulo: %.3f%n", getTriangulo());
		System.out.printf("Circulo: %.3f%n", getCirculo());
		System.out.printf("Trapezio: %.3f%n", getTrapezio());
		System.out.printf("Quadrado: %.3f%n", getQuadrado());
		System.out.printf("Retangulo: %.3f%n", getRetangulo());
		
	}
	
}
