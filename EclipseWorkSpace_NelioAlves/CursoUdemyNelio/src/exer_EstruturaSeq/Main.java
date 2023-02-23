package exer_EstruturaSeq;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// int num1 = sc.nextInt();
		// int num2 = sc.nextInt();
		
		// Exer1 calc = new Exer1(num1, num2);
		// calc.soma();
		
		// double valRaio = sc.nextDouble(); 
		// Exer2 calc = new Exer2(valRaio);
		// calc.calculo();
		
		// int val1 = sc.nextInt();
		// int val2 = sc.nextInt();
		// int val3 = sc.nextInt();
		// int val4 = sc.nextInt();
		// Exer3 diferenca = new Exer3(val1, val2, val3, val4);
		// diferenca.diferenca();
		
		// int codeFunc = sc.nextInt();
		// int horasTrab = sc.nextInt();
		// double valHora = sc.nextFloat();
		// Exer4 calc = new Exer4(codeFunc, horasTrab, valHora);
		// calc.dindin();
		
		// int cod1 = sc.nextInt();
		// int quant1 = sc.nextInt();
		// double prec1 = sc.nextFloat();
		// int cod2 = sc.nextInt();
		// int quant2 = sc.nextInt();
		// double prec2 = sc.nextFloat();
		// Exer5 calc = new Exer5(cod1, quant1, prec1, cod2, quant2, prec2);
		// calc.totalPagarCaloteiro();
		
		double val1 = sc.nextDouble();
		double val2 = sc.nextDouble();
		double val3 = sc.nextDouble();
		Exer6 calc = new Exer6(val1, val2, val3);
		calc.saidaValores();
		
		
		sc.close();
	}
}
p
