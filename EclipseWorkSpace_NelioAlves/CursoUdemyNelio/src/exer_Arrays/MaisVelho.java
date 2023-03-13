package exer_Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas vc vai digitar? ");
		int quantRep = sc.nextInt();
		
		String[] nome = new String[quantRep];
		int[] idade = new int[quantRep];
		
		for (int i = 0; i < quantRep; i++) {
			System.out.println("Dados da " + (i + 1) + " pessoa: ");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		int maiorIdade = idade[0];
		int posicaoMaiorId = 0;
		
		for (int i = 0; i < quantRep; i++) {
			if (idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				posicaoMaiorId = i;
			}
		}
		
		System.out.println("Pessoa Mais Velha: " + nome[posicaoMaiorId]);
		
		sc.close();
	}

}
