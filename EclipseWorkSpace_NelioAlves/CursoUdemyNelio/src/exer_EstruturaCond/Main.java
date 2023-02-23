package exer_EstruturaCond;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

//		System.out.print("Digite um número: ");
//		int val = sc.nextInt();
//		Exer1 num = new Exer1(val);
//		num.verificaNum();

//		int val = 35;
//		int calculo = val % 2;
//		System.out.println(calculo);
		
//		for (int i = 0; i < 3; i++) {
//			System.out.print("Digite um número: ");
//			int val = sc.nextInt();
//			Exer2 num = new Exer2(val);
//			num.verificaPar();
//
//		}
		
//		System.out.print("Digite o primeiro valor: ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("Digite o segundo valor: ");
//		int num2 = sc.nextInt();
//		
//		Exer3 valor = new Exer3(num1, num2);
//		valor.calcMultiplos();
		
//		System.out.print("Digite a hora inicial: ");
//		int horaInicial = sc.nextInt();
//		System.out.print("Digite a hora final: ");
//		int horaFinal = sc.nextInt();
//		Exer4 calc = new Exer4(horaInicial, horaFinal);
//		calc.calcHoras();
		
//		System.out.print("Informe o Codigo: ");
//		int codigo = sc.nextInt();
//		System.out.print("Informe a Quantidade: ");
//		int quantidade = sc.nextInt();
//		Exer5 valItem = new Exer5(codigo, quantidade);
//		valItem.mostraValor();
		
		System.out.print("Insira um valor: ");
		double numero = sc.nextDouble();
		Exer6 val = new Exer6(numero);
		val.mostraResultado();
		
		sc.close();

	}

}
