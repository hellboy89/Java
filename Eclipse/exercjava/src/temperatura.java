import java.util.Locale;
import java.util.Scanner;


public class temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String escTemp;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ClassePrincipal temp = new ClassePrincipal();
		
		System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
		escTemp = sc.nextLine();
		
		if (temp.escTemp == "f") {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			temp.fahTemp = sc.nextDouble();
		}
		else if (temp.escTemp == "c") {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			temp.celTemp = sc.nextDouble();
		}
		
		temp.Temperatura();
		
		
		sc.close();
	}

}
