package javaNelioUdemy;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String produto1 = "Computador";
		String produto2 = "Mesa de escritório";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medir = 53.234567;
		
		System.out.println("Produto: ");
		System.out.printf("%s, com preço de R$ %.2f", produto1, preco1);
		System.out.printf("%n%s, com preço de R$ %.2f", produto2, preco2);
		System.out.println();
		System.out.printf("%nGravação: %d anos de idade, com código %d e genero %s.%n%n", idade, codigo, genero);
		System.out.printf("Medir com 8 casas decimais %.8f%n", medir);
		System.out.printf("Mudado para 3 casas decimais: %.3f%n", medir);
		Locale.setDefault(Locale.US);
		System.out.printf("Padrão Americano: %.3f", medir);
	}

}
