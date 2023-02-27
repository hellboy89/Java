package exer_EstruturaFOR;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		int num = sc.nextInt();
//		Exer1 cont = new Exer1(num);
//		cont.contagem();
		
//		Exer2 cont = new Exer2(3);
//		cont.verifica();
		
//		Exer3 pond = new Exer3(3);
//		pond.mediaPond();
		
//		int numRep = sc.nextInt();
//		Exer4 calc = new Exer4(numRep);
//		calc.calculo();
		
//		int val = sc.nextInt();
//		Exer5 result = new Exer5(val);
//		result.resultFat();
		
//		int val = sc.nextInt();
//		Exer6 result = new Exer6(val);
//		result.calcDiv();
		
		int val = sc.nextInt();
		Exer7 mostra = new Exer7(val);
		mostra.saidaDados();
		
		
		sc.close();
	}

}
