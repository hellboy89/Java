package exer_Arrays;
import java.util.Scanner;
import java.util.Locale;

public class ArraysMultiplosValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantVal = sc.nextInt();
		
		String[] nome = new String[quantVal];
		String[] email = new String[quantVal];
		int[] numQuarto = new int[quantVal];
		
		sc.close();		
	}

}
