package exer_Arrays;
import java.util.Scanner;
import java.util.Locale;

public class AbaixoMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int quantRep = sc.nextInt();
		
		double[] num = new double[quantRep];
		double somaVal = 0;
		
		for (int i = 0; i < quantRep; i++) {
			System.out.print("Digite um numero: ");
			num[i] = sc.nextDouble();
			somaVal += num[i];
		}
		
		double mediaVal = somaVal / quantRep;
		
		System.out.printf("%nMedia do Vetor: %.3f%n", mediaVal);
		System.out.println("Elementos abaixo da media: ");
		for (int i = 0; i < quantRep; i++) {
			if (num[i] < mediaVal) {
				System.out.println(num[i]);
			}
		}
		
		sc.close();
	}

}
