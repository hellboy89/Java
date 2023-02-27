package exer_EstruturaFOR;

public class Exer7 {
	private int num;
	private double numQuad;
	private double numCubo;

	public Exer7(int num) {
		super();
		this.num = num;
	}

	protected int getNum() {
		return num;
	}

	protected void setNum(int num) {
		this.num = num;
	}

	protected double getNumQuad() {
		return numQuad;
	}

	protected void setNumQuad(double numQuad) {
		this.numQuad = Math.pow(numQuad, 2);

	}

	protected double getNumCubo() {
		return numCubo;
	}

	protected void setNumCubo(double numCubo) {
		this.numCubo = Math.pow(numCubo, 3);
	}

	public void saidaDados() {

		for (int i = 1; i <= getNum(); i++) {

			setNumQuad(i);
			setNumCubo(i);
			System.out.printf("%d %.0f %.0f%n", i, getNumQuad(), getNumCubo());

		}

	}
}
