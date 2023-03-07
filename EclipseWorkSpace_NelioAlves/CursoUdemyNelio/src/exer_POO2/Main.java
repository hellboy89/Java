package exer_POO2;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a cotação do dolar? ");
		double cotDolar = sc.nextDouble();
		
		System.out.print("Quanto vc quer converter? ");
		double valConverter = sc.nextDouble();
		
		double valor = CotDolar.conversor(cotDolar, valConverter);
		
		System.out.printf("Valor: %.2f", valor);
	}

}
