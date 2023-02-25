package exer_EstruturaWhile;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
//		Exer1 verifica = new Exer1(0);
//		while (verifica.getParar()) {
//
//			int senha = sc.nextInt();
//			verifica.confereSenha(senha);
//
//		}
		
		
		
//		Exer2 quad = new Exer2(1, 1);
//		
//		while (quad.getParar()) {
//			
//			int val1 = sc.nextInt();
//			int val2 = sc.nextInt();
//			
//			quad.conferePlano(val1, val2);
//			
//		}
		
		Exer3 comb = new Exer3(0, 0, 0);
		
		while (comb.getParar()) {
			
			int tipoCob = sc.nextInt();
			
			comb.somaOpcoes(tipoCob);
			
		}
		
		sc.close();

	}

}
