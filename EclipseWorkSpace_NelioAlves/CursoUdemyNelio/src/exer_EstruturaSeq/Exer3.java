package exer_EstruturaSeq;

public class Exer3 {
	private int val1;
	private int val2;
	private int val3;
	private int val4;
	public Exer3(int val1, int val2, int val3, int val4) {
		super();
		this.val1 = val1;
		this.val2 = val2;
		this.val3 = val3;
		this.val4 = val4;
	}
	public int getVal1() {
		return val1;
	}
	public void setVal1(int val1) {
		this.val1 = val1;
	}
	public int getVal2() {
		return val2;
	}
	public void setVal2(int val2) {
		this.val2 = val2;
	}
	public int getVal3() {
		return val3;
	}
	public void setVal3(int val3) {
		this.val3 = val3;
	}
	public int getVal4() {
		return val4;
	}
	public void setVal4(int val4) {
		this.val4 = val4;
	}
	
	public void diferenca() {
		
		int calc = (getVal1() * getVal2()) - (getVal3() * getVal4());
		
		System.out.printf("Diferença = %d", calc);
		
	}
	
}
