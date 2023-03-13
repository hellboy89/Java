package exer_Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int quantRep = sc.nextInt();

		String[] nome = new String[quantRep];
		double[] nota1 = new double[quantRep];
		double[] nota2 = new double[quantRep];
		
		for (int i = 0; i < quantRep; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + " aluno: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < quantRep; i++) {
			double calcMedia = (nota1[i] + nota2[i]) / 2;
			
			if (calcMedia >= 6.0) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();

	}

}
