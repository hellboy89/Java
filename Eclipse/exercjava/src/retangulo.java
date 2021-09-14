import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;


public class retangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double baseRet, altRet, area, perimetro, diagonal;
		
		System.out.print("Base do retangulo: ");
		baseRet = sc.nextDouble();
		System.out.print("Altura do retangulo: ");
		altRet = sc.nextDouble();
		
		area = baseRet  * altRet;
		perimetro = baseRet + baseRet + altRet + altRet;
		diagonal = Math.sqrt((baseRet * baseRet) + (altRet * altRet));
				
		System.out.println("AREA = " + String.format("%.4f", area));
		System.out.println("PERIMETRO = " + String.format("%.4f", perimetro));
		System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));
		
		sc.close();
	}

}
