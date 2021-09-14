import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;


public class troco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double precoProd, dinRec, troco; 
		int quantComp;
		
		System.out.print("Preço unitário do produto: ");
		precoProd = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		quantComp = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		dinRec = sc.nextDouble();
		
		troco = dinRec - (precoProd * quantComp);
		
		System.out.println("TROCO = " + String.format("%.2f", troco));
		
		sc.close();
	}

}
