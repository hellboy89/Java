import java.util.Locale;
import java.util.Scanner;

public class terreno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largTerreno, compTerreno, valMetQuad, areaTerreno, precoTerreno;
		
		System.out.print("Digite a largura do terreno: ");
		largTerreno = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		compTerreno = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		valMetQuad = sc.nextDouble();
		
		areaTerreno = largTerreno * compTerreno;
		precoTerreno = areaTerreno * valMetQuad;
		
		System.out.println("Area do Terreno = " + String.format("%.2f", areaTerreno));
		System.out.println("Preco do Terreno = " + String.format("%.2f", precoTerreno));
		
		sc.close();
		
	}
}
