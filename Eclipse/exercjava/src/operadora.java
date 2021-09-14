import java.util.Locale;
import java.util.Scanner;

public class operadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ClassePrincipal oper = new ClassePrincipal();
		
		System.out.print("Digite a quantidade de minutos: ");
		oper.quantMin = sc.nextInt();
		
		oper.Operadora();
				
		sc.close();
		
	}

}
