
public class ClasseBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public void status() {
		System.out.println("=================");
		System.out.println("conta: " + this.getNumConta());
		System.out.println("tipo: " + this.getTipo());
		System.out.println("dono: " + this.getDono());
		System.out.println("saldo: " + this.getSaldo());
		System.out.println("status: " + this.getStatus());
	}
	
	public ClasseBanco() {
		this.saldo=0;
		this.status=false;
	}
	
	public int getNumConta() {
		return this.numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (tipo == "cc") {
			this.setSaldo(50);
		}
		else if (tipo == "cp") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso");
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");			
		}
		else if (this.getSaldo() < 0) {
			System.out.println("conta não pode ser fechada pois tem débito");
		}
		else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso de " + this.getDono());
		}
	}
	
	public void depositar(float v) {
		this.setSaldo(this.getSaldo() + v);
		System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
	}
	
	public void sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getDono());
			}
			else {
				System.out.println("Saldo insuficiente para saque");
			}
		}
		else {
			System.out.println("Impossível sacar de uma conta fechada!");
		}
	}
	
	public void pagarMensalidade() {
		int v = 0;
		if (this.getTipo() == "cc") {
			v = 12;
		}
		else if (this.getTipo() == "cp") {
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		}
		else {
			System.out.println("Impossível pagar uma conta fechada!");
		}
	}
	

	public static void main(String[] args) {

		// TODO Auto-generated method stub

	}

}
