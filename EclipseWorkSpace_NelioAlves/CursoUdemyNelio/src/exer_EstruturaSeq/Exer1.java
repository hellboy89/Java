package exer_EstruturaSeq;

public class Exer1 {
	private int val1;
	private int val2;
	
	public Exer1(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
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
	
	public void soma() {
		
		int soma = getVal1() + getVal2();
		
		System.out.printf("Soma = %d", soma);
	}
}
