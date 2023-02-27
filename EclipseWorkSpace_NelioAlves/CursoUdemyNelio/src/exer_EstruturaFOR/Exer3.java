package exer_EstruturaFOR;
import java.util.Scanner;
import java.util.Locale;

public class Exer3 {
	
	private int quantRep;
	private double val1;
	private double val2;
	private double val3;
	
	public Exer3(int quantRep) {
		super();
		this.quantRep = quantRep;
	}

	protected int getQuantRep() {
		return quantRep;
	}

	protected void setQuantRep(int quantRep) {
		this.quantRep = quantRep;
	}

	protected double getVal1() {
		return val1;
	}

	protected void setVal1(double val1) {
		this.val1 = val1;
	}

	protected double getVal2() {
		return val2;
	}

	protected void setVal2(double val2) {
		this.val2 = val2;
	}

	protected double getVal3() {
		return val3;
	}

	protected void setVal3(double val3) {
		this.val3 = val3;
	}
	
	public void mediaPond() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < getQuantRep(); i++) {
			
			double val1 = sc.nextDouble();
			double val2 = sc.nextDouble();
			double val3 = sc.nextDouble();
			
			double calc = ((val1 * 2) + (val2 * 3) + (val3 * 5)) / (2 + 3 + 5);
			
			System.out.printf("%.1f", calc);
			
		}
		
	}
	
	
}
