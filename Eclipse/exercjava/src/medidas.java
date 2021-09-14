import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class medidas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ClassePrincipal med = new ClassePrincipal();
		
		System.out.print("Digite a medida A: ");
		med.medA = sc.nextDouble();
		System.out.print("Digite a medida B: ");
		med.medB = sc.nextDouble();
		System.out.print("Digite a medida C: ");
		med.medC = sc.nextDouble();
		
		med.AreaQuad();
		med.AreaTriang();
		med.AreaTrap();
		
		
		sc.close();
	}

}
