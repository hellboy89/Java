import java.util.Locale;
import java.util.Scanner;

public class baskara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ClassePrincipal bask = new ClassePrincipal();
		
		System.out.print("Coeficiente a: ");
		bask.coefA = sc.nextDouble();
		
		System.out.print("Coeficiente b: ");
		bask.coefB = sc.nextDouble();
		
		System.out.print("Coeficiente c: ");
		bask.coefC = sc.nextDouble();
		
		bask.Baskara();
		
		sc.close();
		
	}

}
