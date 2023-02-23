package exer_EstruturaCond;

public class Exer1 {
	private int num;

	public Exer1(int num) {
		super();
		this.num = num;
	}

	protected int getNum() {
		return num;
	}

	protected void setNum(int num) {
		this.num = num;
	}
	
	public void verificaNum() {
		if (getNum() < 0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("NÃO Negativo");
		}
	}
}
