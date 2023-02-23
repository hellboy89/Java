package exer_EstruturaCond;

public class Exer2 {
	private int num;

	public Exer2(int num) {
		super();
		this.num = num;
	}

	protected int getNum() {
		return num;
	}

	protected void setNum(int num) {
		this.num = num;
	}
	
	public void verificaPar() {
		
		if (getNum() % 2 == 0) {
			System.out.println("Valor é PAR");
		}
		else {
			System.out.println("Valor é IMPAR");
		}
		
	}
}
