package exer_Arrays;
import java.util.Scanner;
import java.util.Locale;

public class SomaVetor {
	
	public static void soma() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros vc vai digitar? ");
		int quantRep = sc.nextInt();
		double[] vetor = new double[quantRep];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		double media = soma / quantRep;
		
		System.out.print("Valores: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println();
		System.out.printf("Soma: %.2f%n", soma);
		System.out.printf("Media: %.2f%n", media);
			
		sc.close();
	}
	
}
