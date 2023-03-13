package exer_Arrays;
import java.util.Scanner;
import java.util.Locale;

public class DadosPessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int quantRep = sc.nextInt();
		
		double[] altura = new double[quantRep];
		char[] genero = new char[quantRep];
		
		for (int i = 0; i < quantRep; i++) {
			System.out.print("Altura da " + (i + 1) + "pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "pessoa: ");
			genero[i] = sc.next().charAt(0);
		}
		
		double menorAltura = altura[0];
		double maiorAltura = altura[0];
		int contMulheres = 0;
		int contHomens = 0;
		double somaAltMulheres = 0;
		
		for (int i = 0; i < quantRep; i++) {
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
			
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			
			if (genero[i] == 'f') {
				contMulheres++;
				somaAltMulheres += altura[i];
			}
			else {
				contHomens++;
			}
		}
		
		double mediaAltMulheres = somaAltMulheres / contMulheres;
		
		System.out.printf("%nMenor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAltMulheres);
		System.out.println("Numero de homens = " + contHomens);
		
		sc.close();
		
	}

}
