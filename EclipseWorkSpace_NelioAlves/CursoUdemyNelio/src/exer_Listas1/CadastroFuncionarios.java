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

		for (int i = 0; i < cadastroFunc; i++) {
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

		System.out.print("Entre com o ID do funcionário para dar aumento: ");
		int pegaID = sc.nextInt();
		
		if (id.indexOf(pegaID) != -1) {
			System.out.println("Entre com a porcentagem: ");
			
			double porcAumento = sc.nextDouble();
			
			int buscaID = id.indexOf(pegaID);
			
			double calcAumento = ((salario.get(buscaID) * porcAumento) / 100) + salario.get(buscaID);
			
			salario.set(buscaID, calcAumento);
			
			System.out.println("Lista de Funcionarios: ");
			
			for (int i = 0; i < cadastroFunc; i++) {
				System.out.printf("%d, %s, %.2f%n", id.get(i), nome.get(i), salario.get(i));
			}			
		}
		else {
			System.out.println("Este ID não existe!");
		}
		

		sc.close();
	}
}
