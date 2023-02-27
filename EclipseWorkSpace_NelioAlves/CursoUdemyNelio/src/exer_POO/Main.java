package exer_POO;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

//		double num1 = sc.nextDouble();
//		double num2 = sc.nextDouble();
//		Exer1 val = new Exer1(num1, num2);
//		val.mostraValores();

//		System.out.print("Nome: ");
//		String nome = sc.nextLine();
//		System.out.print("Salario Bruto: ");
//		double salario = sc.nextDouble();
//		System.out.print("Imposto: ");
//		double imposto = sc.nextDouble();
//
//		Exer2 calcSal = new Exer2(nome, salario, imposto);
//		calcSal.mostraDados();
//		calcSal.diminuirSalario();
		
		String nome = sc.nextLine();
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		Exer3 notas = new Exer3(nome, nota1, nota2, nota3);
		notas.mostraValores();

		sc.close();
	}

}
