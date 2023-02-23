package exer_EstruturaSeq;

public class Exer5 {
	private int codigo1, codigo2, quantidade1, quantidade2;
	private double preco1, preco2;
	private double totalPagar;
	
	public Exer5(int codigo1, int quantidade1, double preco1, int codigo2, int quantidade2, double preco2) {
		super();
		this.codigo1 = codigo1;
		this.quantidade1 = quantidade1;
		this.preco1 = preco1;
		this.codigo2 = codigo2;
		this.quantidade2 = quantidade2;
		this.preco2 = preco2;
	}
	
	public int getCodigo1() {
		return codigo1;
	}
	public void setCodigo1(int codigo1) {
		this.codigo1 = codigo1;
	}
	public int getCodigo2() {
		return codigo2;
	}
	public void setCodigo2(int codigo2) {
		this.codigo2 = codigo2;
	}
	public int getQuantidade1() {
		return quantidade1;
	}
	public void setQuantidade1(int quantidade1) {
		this.quantidade1 = quantidade1;
	}
	public int getQuantidade2() {
		return quantidade2;
	}
	public void setQuantidade2(int quantidade2) {
		this.quantidade2 = quantidade2;
	}
	public double getPreco1() {
		return preco1;
	}
	public void setPreco1(double preco1) {
		this.preco1 = preco1;
	}
	public double getPreco2() {
		return preco2;
	}
	public void setPreco2(double preco2) {
		this.preco2 = preco2;
	}
	public double getTotalPagar() {
		return totalPagar;
	}
	public void setTotalPagar() {
		this.totalPagar = (getPreco1() * getQuantidade1()) + (getPreco2() * getQuantidade2());
	}
	
	public void totalPagarCaloteiro() {
		setTotalPagar();
		
		System.out.printf("Valor a Pagar: R$ %.2f", getTotalPagar());
		
	}
	
	
}
