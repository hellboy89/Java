import java.util.Locale;
import java.util.Scanner;

public class consumo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ClassePrincipal cons = new ClassePrincipal();
		
		System.out.print("Distancia Percorrida: ");
		cons.distPerc = sc.nextInt();
		System.out.print("Combustivel Gasto: ");
		cons.combGast = sc.nextDouble();
		
		cons.Consumo();
		
		sc.close();
		
	}

}
