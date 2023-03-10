package exer_Arrays;
import java.util.Scanner;

public class Negativos {
	
	public static void pegaNegativos() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores? ");
		int numRep = sc.nextInt();
		int[] vetor = new int[numRep];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextInt();
		}
		
		// Lista Valores
		System.out.println("Numeros Negativos: ");
		for(int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);				
			}
		}
		
		sc.close();
	}

}
