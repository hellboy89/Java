package exer_EstruturaFOR;

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
	
	public void contagem() {
		
		for (int i = 0; i <= getNum(); i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		
	}
	
}
