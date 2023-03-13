package exer_Arrays;
import java.util.Scanner;
import java.util.Locale;

public class Alturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int quantRep = sc.nextInt();
		
		String[] nome = new String[quantRep];
		int[] idade = new int[quantRep];
		double[] altura = new double[quantRep];
		
		for (int i = 0; i < quantRep; i++) {
			System.out.println("Dados da " + (i + 1) + " Pessoa: ");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		double somaAlt = 0;
		int somaMenos16 = 0;
		for (int i = 0; i < quantRep; i++) {
			somaAlt += altura[i];
			
			if (idade[i] < 16) {
				somaMenos16 += 1;
			}
		}
		
		double mediaAlt = somaAlt / quantRep;
		System.out.printf("%nAltura Media: %.2f%n", mediaAlt);
		
		double porcMenos16 = (somaMenos16 / (double) quantRep) * 100;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%n", porcMenos16);
		for (int i = 0; i < quantRep; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
		
	}

}
