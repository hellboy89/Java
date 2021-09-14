import java.util.Random;

public class Luta {
	//atributos	
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	//m�todos p�blicos
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		}
		else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		if (this.aprovada) {
			System.out.println(" ### DESAFIADO ### ");
			this.desafiado.apresentar();
			System.out.println(" ### DESAFIANTE ### ");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0 1 2
			switch(vencedor) {
				case 0: //Empate
					System.out.println("Empatou!");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				case 1: //Desafiado Vence
					System.out.println("Vit�ria do " + this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2: //Desafiante Vence
					System.out.println("Vit�ria do " + this.desafiante.getNome());
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					break;
					
			}
			
		}
	}
	
	//m�todos especiais
	public Lutador getDesafiado() {
		return desafiado;
	}
	
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	
	public Lutador getDesafiante() {
		return desafiante;
	}
	
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	
	public int getRounds() {
		return rounds;
	}
	
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	
	public boolean isAprovada() {
		return aprovada;
	}
	
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}
