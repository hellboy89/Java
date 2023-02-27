package exer_EstruturaFOR;

public class Exer6 {
	private int num;

	public Exer6(int num) {
		super();
		this.num = num;
	}

	protected int getNum() {
		return num;
	}

	protected void setNum(int num) {
		this.num = num;
	}
	
	public void calcDiv() {
		
		for(int i = 1; i <= getNum(); i++) {
			if (getNum() % i == 0) {
				System.out.print(i + " ");
			}
		}
		
	}
}
