package exer_EstruturaSeq;

public class Exer4 {
	private int numFunc;
	private int horasTrab;
	private double valPorHora;
	private double salario;
	
	public Exer4(int numFunc, int horasTrab, double valPorHora) {
		super();
		this.numFunc = numFunc;
		this.horasTrab = horasTrab;
		this.valPorHora = valPorHora;
	}
	
	public int getNumFunc() {
		return numFunc;
	}
	public void setNumFunc(int numFunc) {
		this.numFunc = numFunc;
	}
	public double getHorasTrab() {
		return horasTrab;
	}
	public void setHorasTrab(int horasTrab) {
		this.horasTrab = horasTrab;
	}
	public double getValPorHora() {
		return valPorHora;
	}
	public void setValPorHora(int valPorHora) {
		this.valPorHora = valPorHora;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario() {
		this.salario = getValPorHora() * getHorasTrab();
	}
	
	public void dindin() {
		setSalario();
		
		System.out.printf("Codigo = %d%nSalario = U$ %.2f", getNumFunc(), getSalario());
		
	}
}
