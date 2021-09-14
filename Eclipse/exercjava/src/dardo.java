import java.util.Locale;
import java.util.Scanner;

public class dardo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ClassePrincipal dard = new ClassePrincipal();
		
		dard.dist1 = sc.nextDouble();
		dard.dist2 = sc.nextDouble();
		dard.dist3 = sc.nextDouble();
		
		dard.Dardo();
		
		sc.close();
	}

}
