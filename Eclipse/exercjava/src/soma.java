import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int valorX, valorY, soma;
		
		System.out.print("Digite o valor de X: ");
		valorX = sc.nextInt();
		System.out.print("Digite o valor de Y: ");
		valorY = sc.nextInt();
		
		soma = valorX + valorY;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
