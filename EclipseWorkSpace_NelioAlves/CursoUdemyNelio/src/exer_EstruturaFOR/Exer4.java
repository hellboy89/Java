package exer_EstruturaFOR;
import java.util.Scanner;

public class Exer4 {
	private int num1;
	private int num2;
	private int resultado;
	private int numRep;
	
	public Exer4(int numRep) {
		super();
		this.numRep = numRep;
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
	protected int getResultado() {
		return resultado;
	}
	protected void setResultado(int val1, int val2) {
		this.resultado = val1 / val2;
	}
	
	protected int getNumRep() {
		return numRep;
	}
	protected void setNumRep(int numRep) {
		this.numRep = numRep;
	}
	
	public void calculo() {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < getNumRep(); i++) {
			
			int val1 = sc.nextInt();
			int val2 = sc.nextInt();

			if (val2 == 0) {
				System.out.println("Divisão Impossível!");
			}
			else {				
				setResultado(val1, val2);
				System.out.println(getResultado());			
			}
		}
		
	}
}
