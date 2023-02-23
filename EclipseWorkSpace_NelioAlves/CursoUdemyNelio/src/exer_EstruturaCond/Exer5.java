package exer_EstruturaCond;

public class Exer5 {
	private int codItem;
	private int quantItem;
	private double valorItem;
	private double valorTot;
	
	public Exer5(int codItem, int quantItem) {
		super();
		this.codItem = codItem;
		this.quantItem = quantItem;
	}
	protected int getCodItem() {
		return codItem;
	}
	protected void setCodItem(int codItem) {
		this.codItem = codItem;
	}
	protected int getQuantItem() {
		return quantItem;
	}
	protected void setQuantItem(int quantItem) {
		this.quantItem = quantItem;
	}
	protected double getValorItem() {
		return valorItem;
	}
	protected void setValorItem(double valorItem) {
		this.valorItem = valorItem;
	}
	protected double getValorTot() {
		return valorTot;
	}
	protected void setValorTot() {

		if (getCodItem() == 1) {
			setValorItem(4.00);
		}
		else if (getCodItem() == 2) {
			setValorItem(4.50);
		}
		else if (getCodItem() == 3) {
			setValorItem(5.00);
		}
		else if (getCodItem() == 4) {
			setValorItem(2.00);
		}
		else if (getCodItem() == 5) {
			setValorItem(1.50);
		}
		else {
			setValorItem(0);
		}
		
		this.valorTot = getValorItem() * getQuantItem();

	}
	
	public void mostraValor() {
		setValorTot();
		
		if (getValorItem() == 0) {
			System.out.println("Codigo INCORRETO");
		}
		else {
			System.out.printf("Valor Total: R$ %.2f", getValorTot());
		}
		
	}
}
