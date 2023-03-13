package exer_Arrays;
import java.util.Scanner;
import java.util.Locale;

public class MaiorPosicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros vc vai digitar? ");
		int quantRep = sc.nextInt();
		
		double[] num = new double[quantRep];
		
		for (int i = 0; i < quantRep; i++) {
			System.out.print("Digite um numero: ");
			num[i] = sc.nextDouble();
		}
		
		double maiorVal = num[0];
		int posicaoMaior = 0;
		
		for (int i = 0; i < quantRep; i++) {
			if (num[i] > maiorVal) {
				maiorVal = num[i];
				posicaoMaior = i;
			}
		}
		
		System.out.println();
		System.out.println("Maior Valor: " + maiorVal);
		System.out.println("Posicao do Maior: " + posicaoMaior);
		
		sc.close();
	}

}
