import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio, area, pi = 3.14159;		
		
		System.out.print("Digite o valor do raio do circulo: ");
		raio = sc.nextDouble();
		
		area = pi * (Math.pow(raio, 2));
		
		System.out.println("Area = " + String.format("%.3f", area));
		
		sc.close();
	}

}
