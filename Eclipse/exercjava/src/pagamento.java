import java.util.Locale;
import java.util.Scanner;

public class pagamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ClassePrincipal pag = new ClassePrincipal();
		
		System.out.print("Nome: ");
		pag.nome = sc.nextLine();
		
		System.out.print("Valor por hora: ");
		pag.valHora = sc.nextDouble();
		
		System.out.print("Horas Trabalhadas: ");
		pag.horasTrab = sc.nextInt();
		
		pag.Pagamento();
		
		sc.close();
	}

}
