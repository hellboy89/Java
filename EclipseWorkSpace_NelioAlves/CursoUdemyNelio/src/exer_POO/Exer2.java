package exer_POO;
import java.util.Scanner;

public class Exer2 {

	private String nome;
	private double salarioBruto;
	private double salarioLiquido;
	private double impostoRenda;

	public Exer2(String nome, double salarioBruto, double impostoRenda) {
		super();
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.impostoRenda = impostoRenda;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected double getsalarioBruto() {
		return salarioBruto;
	}

	protected void setsalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	protected double getimpostoRenda() {
		return impostoRenda;
	}

	protected void setimpostoRenda(double impostoRenda) {
		this.impostoRenda = impostoRenda;
	}

	protected double getSalarioBruto() {
		return salarioBruto;
	}

	protected void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	protected double getSalarioLiquido() {
		return salarioLiquido;
	}

	protected void setSalarioLiquido() {
		this.salarioLiquido = getsalarioBruto() - getimpostoRenda();
	}

	public void mostraDados() {

		setSalarioLiquido();

		System.out.printf("Empregado: %s, R$ %.2f%n", getNome(), getSalarioLiquido());

	}

	public void diminuirSalario() {
		System.out.print("Quer diminuir aumentar em quantos porcentos? ");
		Scanner sc = new Scanner(System.in);
		double aumentoSal = sc.nextDouble();
		setSalarioBruto((getsalarioBruto() * aumentoSal / 100) + getsalarioBruto());
		
		mostraDados();
				
		sc.close();
	}

}
