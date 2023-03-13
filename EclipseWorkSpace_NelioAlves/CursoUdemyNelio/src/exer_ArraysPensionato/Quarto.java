package exer_ArraysPensionato;

public class Quarto {

	private String nome;
	private String email;
	private int numQuarto;
	private boolean ocupado;

	public Quarto(String nome, String email, int numQuarto) {
		super();
		this.nome = nome;
		this.email = email;
		this.numQuarto = numQuarto;
		this.ocupado = true;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected int getNumQuarto() {
		return numQuarto;
	}

	protected void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}

	public boolean getOcupado() {
		return ocupado;
	}

	protected void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public void mostra() {

		System.out.printf("%d: %s, %s%n", getNumQuarto(), getNome(), getEmail());

	}

}
