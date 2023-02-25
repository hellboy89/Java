package exer_EstruturaCond;

public class Exer8 {
	private double salario;
	private double porcentagem;
	private double calcPorcentagem;
	
	public Exer8(double salario) {
		super();
		this.salario = salario;
	}
	protected double getSalario() {
		return salario;
	}
	protected void setSalario(double salario) {
		this.salario = salario;
	}
	protected double getCalcPorcentagem() {
		return calcPorcentagem;
	}
	
	protected double getPorcentagem() {
		return porcentagem;
	}
	
	protected void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}
	
	protected void setCalcPorcentagem() {
		if (getSalario() <= 2000.00) {
			setPorcentagem(0);
		}
		else if (getSalario() <= 3000.00) {
			setPorcentagem((getSalario() - 2000.00) * 0.08);
		}
		else if (getSalario() <= 4500.00) {
			setPorcentagem((getSalario() - 3000.00) * 0.18 + 1000.00 * 0.08);
		}
		else {
			setPorcentagem((getSalario() - 4500.00) * 0.28 + 1500.0 * 0.18 + 1000.00 * 0.08);
		}
		
	}
	
	public void mostraValor() {
		setCalcPorcentagem();
		
		if (getPorcentagem() > 0) {
			System.out.printf("R$ %.2f", getPorcentagem());
		}
		else {
			System.out.println("Isento");
		}
	}
	
}
