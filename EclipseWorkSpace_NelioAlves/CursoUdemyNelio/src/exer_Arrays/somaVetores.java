package exer_Arrays;
import java.util.Scanner;
import java.util.Locale;

public class somaVetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada setor? ");
		int quantRep = sc.nextInt();
		
		int[] vetA = new int[quantRep];
		int[] vetB = new int[quantRep];
		
		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < quantRep; i++) {
			vetA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < quantRep; i++) {
			vetB[i] = sc.nextInt();
		}
		
		System.out.println("Vetor Resultante: ");
		for (int i = 0; i < quantRep; i++) {
			System.out.println(vetA[i] + vetB[i]);
		}
		
		sc.close();
	}

}
