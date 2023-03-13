package exer_Arrays;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int quantRep = sc.nextInt();

		int[] elementos = new int[quantRep];

		int somaPares = 0;
		int quantPares = 0;
		for (int i = 0; i < quantRep; i++) {
			System.out.print("Digite um numero: ");
			elementos[i] = sc.nextInt();

			if (elementos[i] % 2 == 0) {
				somaPares += elementos[i];
				quantPares++;
			}
		}

		if (quantPares > 0) {
			double mediaPares = somaPares / quantPares;
			System.out.printf("%nMedia dos Pares: %.1f%n", mediaPares);
		} else {
			System.out.println("Nenhum numero par.");
		}

		sc.close();
	}

}
