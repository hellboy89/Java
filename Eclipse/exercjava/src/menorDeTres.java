import java.util.Scanner;

public class menorDeTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ClassePrincipal menor = new ClassePrincipal();
		
		System.out.print("Primeiro Valor: ");
		menor.valor1 = sc.nextInt(); 		
		System.out.print("Segundo Valor: ");
		menor.valor2 = sc.nextInt();
		System.out.print("Terceiro Valor: ");
		menor.valor3 = sc.nextInt();
		
		menor.MenorDeTres();
		
		sc.close();
		
	}

}
