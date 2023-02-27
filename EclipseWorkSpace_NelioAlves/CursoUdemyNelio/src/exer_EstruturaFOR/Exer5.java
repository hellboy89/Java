package exer_EstruturaFOR;

public class Exer5 {
	private int num;
	private int resultFat;

	public Exer5(int num) {
		super();
		this.num = num;
	}

	protected int getNum() {
		return num;
	}

	protected void setNum(int num) {
		this.num = num;
	}

	protected int getResultFat() {
		return resultFat;
	}

	protected void setResultFat() {
		
		int fat = 1;
		for (int i = 1; i <= getNum(); i++) {
			fat = fat * i;
		}
		
		this.resultFat = fat;
	}

	public void resultFat() {
		
		setResultFat();
		System.out.println(getResultFat());
		
	}
}
