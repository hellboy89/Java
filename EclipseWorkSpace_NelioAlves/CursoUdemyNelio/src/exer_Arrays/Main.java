package exer_Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int quantRep = sc.nextInt();

		Alturas[] vetor = new Alturas[quantRep];

		for (int i = 0; i < quantRep; i++) {

			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vetor[i] = new Alturas(nome, idade, altura);

		}

		for (int i = 0; i < quantRep; i++) {
			System.out.println(vetor[i]);
		}

		sc.close();
	}
}
