package exer_POO;

public class Exer1 {

	private double largura;
	private double altura;
	private double calcArea;
	private double calcPerim;
	private double calcDiag;

	public Exer1(double largura, double altura) {
		super();
		this.largura = largura;
		this.altura = altura;
	}

	protected double getLargura() {
		return largura;
	}

	protected void setLargura(double largura) {
		this.largura = largura;
	}

	protected double getAltura() {
		return altura;
	}

	protected void setAltura(double altura) {
		this.altura = altura;
	}

	protected double getCalcArea() {
		return calcArea;
	}

	protected void setCalcArea() {
		this.calcArea = getAltura() * getLargura();
	}

	protected double getCalcPerim() {
		return calcPerim;
	}

	protected void setCalcPerim() {
		this.calcPerim = 2 * (getAltura() + getLargura());
	}

	protected double getCalcDiag() {
		return calcDiag;
	}

	protected void setCalcDiag() {
		this.calcDiag = Math.sqrt(Math.pow(getAltura(), 2) + Math.pow(getLargura(), 2));
	}

	public void mostraValores() {

		setCalcArea();
		setCalcPerim();
		setCalcDiag();

		System.out.printf("Area = %.2f%nPerimetro = %.2f%nDiagonal = %.2f%n", getCalcArea(), getCalcPerim(),
				getCalcDiag());

	}

}
