package exer_POO3;

public class Banco {
	private int numConta;
	private String nomeConta;
	private double deposito;
	private double saque;
	private double saldoConta;

	public Banco(int numConta, String nomeConta) {
		super();
		this.numConta = numConta;
		this.nomeConta = nomeConta;
	}

	protected int getNumConta() {
		return numConta;
	}

	protected void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	protected String getNomeConta() {
		return nomeConta;
	}

	protected void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}

	protected double getDeposito() {
		return deposito;
	}

	protected void setDeposito(double deposito) {
		this.saldoConta += deposito;
	}

	protected double getSaque() {
		return saque;
	}

	protected void setSaque(double saque) {
		this.saldoConta -= saque + 5;
	}

	protected double getSaldoConta() {
		return saldoConta;
	}

	protected void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public void statusConta() {

		System.out.printf("%nDados da Conta: %nConta %d, Proprietario %s, Saldo Conta R$ %.2f%n%n", getNumConta(),
				getNomeConta(), getSaldoConta());

	}
}
