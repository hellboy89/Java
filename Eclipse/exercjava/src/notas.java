import java.util.Locale;
import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ClassePrincipal not = new ClassePrincipal();
		
		System.out.print("Digite a primeira nota: ");
		not.nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		not.nota2 = sc.nextDouble();
		
		not.Notas();
		
		sc.close();
		
	}

}
