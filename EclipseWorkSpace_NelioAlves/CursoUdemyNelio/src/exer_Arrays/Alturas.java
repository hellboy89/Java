package exer_Arrays;
import java.util.Scanner;
import java.util.Locale;

public class Alturas {
	
	public static void calcDados() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int quantRep = sc.nextInt();
		Pessoas[] vetor = new Pessoas[quantRep];
		
		for (int i = 0; i < vetor.lengh; i++) {
			
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vetor[i] = new Pessoas(nome, idade, altura);
			
		}
		
	}
	
}
