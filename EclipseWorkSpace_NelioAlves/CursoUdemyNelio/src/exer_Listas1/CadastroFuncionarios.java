package exer_Listas1;
import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

public class CadastroFuncionarios {
	private int id;
	private String nome;
	private double salario;

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected double getSalario() {
		return salario;
	}

	protected void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void cadastroFunc() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Integer> id = new ArrayList<>();
		List<String> nome = new ArrayList<>();
		List<Double> salario = new ArrayList<>();
		
		System.out.print("Quantos funcionarios quer registrar? ");
		int cadastroFunc = sc.nextInt(); 
		
		for(int i = 0; i < cadastroFunc; i++) {
			System.out.println("Empregado " + (i + 1) + ":");
			System.out.print("ID: ");
			int idDados = sc.nextInt();
			id.add(idDados);
			System.out.print("Nome: ");
			sc.nextLine();
			String nomeDados = sc.nextLine();
			nome.add(nomeDados);
			System.out.print("Salario: ");
			double salarioDados = sc.nextDouble();
			salario.add(salarioDados);
		}
		
		System.out.println("Lista de Funcionarios: ");
		System.out.println(id);
		
		sc.close();
	}
}
