package exer_Matrizes1;
import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

public class Matriz {
	
	public static void valoresMatriz() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pode começar: ");
		
		int quantLinha = sc.nextInt();
		int quantColuna = sc.nextInt();
		
		int[][] mat = new int[quantLinha][quantColuna];
		
		for (int i = 0; i < quantLinha; i++) {
			for (int j = 0; j < quantColuna; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
//		for (int i = 0; i < quantLinha; i++) {
//			for (int j = 0; j < quantColuna; j++) {
//				System.out.print(mat[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		int pesqNum = sc.nextInt();
		
		List<Integer> posicao = new ArrayList<>();
		
		int contRep = 0;
		
		for (int i = 0; i < quantLinha; i++) {
			for (int j = 0; j < quantColuna; j++) {	
				if (mat[i][j] == pesqNum) {
					posicao.add(i);
					posicao.add(j);
					contRep++;
				}
			}
		}
		
		for (int i = 0; i < contRep; i++) {
			System.out.println("Posição " + posicao.get(i));			
		}
		
		sc.close();
		
	}
}
