package exer_EstruturaWhile;

public class Exer3 {
	private int alcool;
	private int gasolina;
	private int diesel;
	private boolean parar;
	
	public Exer3(int alcool, int gasolina, int diesel) {
		super();
		this.alcool = alcool;
		this.gasolina = gasolina;
		this.diesel = diesel;
		this.parar = true;
	}
	
	protected int getAlcool() {
		return alcool;
	}
	protected void setAlcool(int alcool) {
		this.alcool = alcool;
	}
	protected int getGasolina() {
		return gasolina;
	}
	protected void setGasolina(int gasolina) {
		this.gasolina = gasolina;
	}
	protected int getDiesel() {
		return diesel;
	}
	protected void setDiesel(int diesel) {
		this.diesel = diesel;
	}
	protected boolean getParar() {
		return parar;
	}
	protected void setParar(boolean parar) {
		this.parar = parar;
	}
	
	public void somaOpcoes(int valor) {
		
		if (valor == 1) {
			setAlcool(getAlcool() + 1);
		}
		else if (valor == 2) {
			setGasolina(getGasolina() + 1);
		}
		else if (valor == 3) {
			setDiesel(getDiesel() + 1);
		}
		else if (valor == 4) {
			setParar(false);
			
			System.out.println("Muito Obrigado!");
			System.out.println("Alcool: " + getAlcool());
			System.out.println("Gasolina: " + getGasolina());
			System.out.println("Diesel: " + getDiesel()); 
		}
		else {
			System.out.println("Incorreto, somente de 1 a 4.");
		}
	}
}
