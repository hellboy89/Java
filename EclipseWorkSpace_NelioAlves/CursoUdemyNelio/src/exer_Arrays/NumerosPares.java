package exer_Arrays;
import java.util.Scanner;
import java.util.Locale;

public class NumerosPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros vc vai digitar? ");
		int quantRep = sc.nextInt();
		
		int[] numeros = new int[quantRep];
		
		for (int i = 0; i < quantRep; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		int somaPares = 0;
		System.out.printf("%nNumeros Pares: %n");
		for (int i = 0; i < quantRep; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
				somaPares++;
			}
		}
		
		System.out.printf("%nQuantidade de Pares: %d", somaPares);
		
		sc.close();
		
	}

}
