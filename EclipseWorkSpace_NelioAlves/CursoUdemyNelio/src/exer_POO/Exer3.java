package exer_POO;

public class Exer3 {
	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;
	private double media;

	public Exer3(String nome, double nota1, double nota2, double nota3) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	protected double getNota1() {
		return nota1;
	}

	protected void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	protected double getNota2() {
		return nota2;
	}

	protected void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	protected double getNota3() {
		return nota3;
	}

	protected void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	protected double getMedia() {
		return media;
	}

	protected void setMedia() {
		this.media = getNota1() + getNota2() + getNota3();
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	public void mostraValores() {
		setMedia();
		double minAprov = 60.00;
		
		System.out.println("Nome: " + getNome());
		
		if (getMedia() > minAprov) {
			System.out.println("Media: " + getMedia());
			System.out.println("Passou!");
		} else {
			double calc = minAprov - getMedia();

			System.out.println("Media: " + getMedia());
			System.out.println("Reprovado!");
			System.out.println("Faltou " + calc + " pontos!");
		}

	}
}
