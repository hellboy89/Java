import java.util.Scanner;

public class _teste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		_ClasseTeste1 nome = new _ClasseTeste1();
		System.out.print("Qual seu nome? ");
		nome.nome = sc.next();
		nome.PrintNome();
		sc.close();
	}
}
