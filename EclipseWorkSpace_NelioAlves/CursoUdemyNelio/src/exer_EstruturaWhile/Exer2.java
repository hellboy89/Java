package exer_EstruturaWhile;

public class Exer2 {
	private int valor1;
	private int valor2;
	private boolean parar;
	
	public Exer2(int valor1, int valor2) {
		super();
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.parar = true;
	}
	protected int getValor1() {
		return valor1;
	}
	protected void setValor1(int valor1) {
		this.valor1 = valor1;
	}
	protected int getValor2() {
		return valor2;
	}
	protected void setValor2(int valor2) {
		this.valor2 = valor2;
	}
	
	public boolean getParar() {
		return parar;
	}
	
	protected void setParar(boolean parar) {
		this.parar = parar;
	}
	public void conferePlano(int val1, int val2) {
		setValor1(val1);
		setValor2(val2);
		
		if (getValor1() > 0 && getValor2() > 0) {
			System.out.println("1 Quadrante");
		}
		else if (getValor1() < 0 && getValor2() > 0) {
			System.out.println("2 Quadrante");
		}
		else if (getValor1() > 0 && getValor2() < 0) {
			System.out.println("4 Quadrante");
		}
		else if (getValor1() < 0 && getValor2() < 0) {
			System.out.println("3 Quadrante");
		}
		else if (getValor1() == 0 || getValor2() == 0) {
			setParar(false);
		}
		
	}
}
