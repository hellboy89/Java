package exer_EstruturaFOR;
import java.util.Scanner;

public class Exer2 {

	private int val;
	private int numOp;
	private int valDentro;
	private int valFora;

	public Exer2(int numOp) {
		super();
		this.numOp = numOp;
	}

	protected int getVal() {
		return val;
	}

	protected void setVal(int val) {
		this.val = val;
	}

	protected int getNumOp() {
		return numOp;
	}

	protected void setNumOp(int numOp) {
		this.numOp = numOp;
	}

	protected int getValDentro() {
		return valDentro;
	}

	protected void setValDentro(int valDentro) {
		this.valDentro = valDentro;
	}

	protected int getValFora() {
		return valFora;
	}

	protected void setValFora(int valFora) {
		this.valFora = valFora;
	}

	public void verifica() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores: ");
		int num = sc.nextInt();
		
		setVal(num);

		for (int i = 1; i <= getVal(); i++) {
			
			int digito = sc.nextInt();
			
			if (digito >= 10 && digito <= 20) {
				setValDentro(getValDentro() + 1);
			} else {
				setValFora(getValFora() + 1);
			}
		}
		
		System.out.println(getValDentro() + " in");
		System.out.println(getValFora() + " out");

	}

}
