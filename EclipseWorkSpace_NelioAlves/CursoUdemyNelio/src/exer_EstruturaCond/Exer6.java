package exer_EstruturaCond;

public class Exer6 {
	private double valor;

	public Exer6(double valor) {
		super();
		this.valor = valor;
	}

	protected double getValor() {
		return valor;
	}

	protected void setValor(double valor) {
		this.valor = valor;
	}
	
	public void mostraResultado() {
		
		if (getValor() >= 0 && getValor() <= 25) {
			System.out.println("intervalo [0,25]");
		}
		else if (getValor() >= 25 && getValor() <= 50) {
			System.out.println("Intervalo [25,50]");
		}
		else if (getValor() >= 75 & getValor() <= 100) {
			System.out.println("Intervalo [75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}
		
	}
}
