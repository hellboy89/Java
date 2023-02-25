package exer_EstruturaWhile;

public class Exer1 {
	private int senha;
	private boolean parar;
	
	public Exer1(int senha) {
		super();
		this.senha = senha;
		this.parar = true;
	}

	protected int getSenha() {
		return senha;
	}

	protected void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean getParar() {
		return parar;
	}

	protected void setParar(boolean parar) {
		this.parar = parar;
	}

	public void confereSenha(int senha) {
		setSenha(senha);
		
		if (getSenha() != 2002) {
			System.out.println("Senha Inválida, tente novamente");
		}
		else {
			System.out.println("Acesso PERMITIDO");
			setParar(false);
			
		}
		
	}
}
