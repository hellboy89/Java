import java.util.Scanner;


public class duracao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ClassePrincipal dur = new ClassePrincipal();
		
		System.out.print("Digite a duracao em segundos: ");
		dur.segundos = sc.nextInt();
		
		dur.Duracao();
		
		sc.close();
		
	}

}
