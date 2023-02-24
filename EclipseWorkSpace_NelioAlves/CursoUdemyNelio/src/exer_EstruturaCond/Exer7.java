package exer_EstruturaCond;

public class Exer7 {
	private double eixoX;
	private double eixoY;
	public Exer7(double eixoX, double eixoY) {
		super();
		this.eixoX = eixoX;
		this.eixoY = eixoY;
	}
	private double getEixoX() {
		return eixoX;
	}
	private void setEixoX(double eixoX) {
		this.eixoX = eixoX;
	}
	private double getEixoY() {
		return eixoY;
	}
	private void setEixoY(double eixoY) {
		this.eixoY = eixoY;
	}
	
	public void verificaEixo() {
		if (getEixoX() > 0 && getEixoY() > 0) {
			System.out.println("Q1");
		}
		else if (getEixoX() > 0 && getEixoY() < 0) {
			System.out.println("Q4");
		}
		else if (getEixoX() < 0 && getEixoY() > 0) {
			System.out.println("Q2");
		}
		else if (getEixoY() < 0 && getEixoX() < 0) {
			System.out.println("Q3");
		}
		else if (getEixoX() == 0 && getEixoY() == 0) {
			System.out.println("Origem");
		}
		else {
			System.out.println("Valor incorreto, tente novamente.");
		}
	}
	
	public void mostraValorEixos() {
		System.out.println("EixoX: " + getEixoX());
		System.out.println("EixoY: " + getEixoY());
	}
}
