package exer_EstruturaCond;

public class Exer3 {
	private int num1;
	private int num2;
	public Exer3(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	protected int getNum1() {
		return num1;
	}
	protected void setNum1(int num1) {
		this.num1 = num1;
	}
	protected int getNum2() {
		return num2;
	}
	protected void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public void calcMultiplos() {
		if (getNum1() % getNum2() == 0 || getNum2() % getNum1() == 0) {
			System.out.println("SÃO Multiplos");
		}
		else {
			System.out.println("NÃO são Multiplos");
		}
	}
	
}
