package exer_ArraysPensionato;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos serao alugados? ");
		int quantAluguel = sc.nextInt(); 
		
		Quarto[] aluguel = new Quarto[10];
		
		for (int i = 0; i < quantAluguel; i++) {
			System.out.println("Quarto #" + (i + 1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			aluguel[quarto] = new Quarto(nome, email, quarto);
		}
		
		System.out.println("Quartos Ocupados: ");
		
		for (int i = 0; i < 10; i++) {
			if (aluguel[i] != null) {
				aluguel[i].mostra();
			}
		}
		
		sc.close();
		
	}

}
