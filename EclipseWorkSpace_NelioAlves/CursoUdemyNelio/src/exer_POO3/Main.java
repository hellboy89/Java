package exer_POO3;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o numero da conta: ");
		int numConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o seu nome: ");
		String nomeConta = sc.nextLine();

		Banco conta = new Banco(numConta, nomeConta);

		while (true) {

			System.out.print("Quer fazer um deposito? (s/n) ");
			char querDep = sc.next().charAt(0);

			if (querDep == 's') {
				System.out.print("Qual valor do deposito? ");
				double valDeposito = sc.nextDouble();

				conta.setDeposito(valDeposito);
				conta.statusConta();
			} else {
				conta.statusConta();
			}

			if (conta.getSaldoConta() != 0) {
				System.out.print("Quer fazer um saque? (s/n) ");
				char querSaq = sc.next().charAt(0);

				if (querSaq == 's') {
					System.out.print("Qual valor do saque? ");
					double valSaque = sc.nextDouble();

					conta.setSaque(valSaque);
					conta.statusConta();
				} else {
					conta.statusConta();
				}
			}
		}
	}
}
