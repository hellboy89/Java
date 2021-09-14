
public class ClasseTeste2 {
	
	private String modelo;
	private float polegadas;
	private String cor;
	private boolean ligado;
	private int botoes;
	
	
	
	public ClasseTeste2(String modelo, float polegadas, String cor, boolean ligado, int botoes) {
		super();
		this.modelo = modelo;
		this.polegadas = polegadas;
		this.cor = cor;
		this.ligado = ligado;
		this.botoes = botoes;
	}

	


	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	public float getPolegadas() {
		return polegadas;
	}




	public void setPolegadas(float polegadas) {
		this.polegadas = polegadas;
	}




	public String getCor() {
		return cor;
	}




	public void setCor(String cor) {
		this.cor = cor;
	}




	public boolean isLigado() {
		return ligado;
	}




	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}




	public int getBotoes() {
		return botoes;
	}




	public void setBotoes(int botoes) {
		this.botoes = botoes;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
