package exer_EstruturaCond;

public class Exer4 {
	private int horaIni;
	private int horaFin;
	
	public Exer4(int horaIni, int horaFin) {
		super();
		this.horaIni = horaIni;
		this.horaFin = horaFin;
	}
	protected int getHoraIni() {
		return horaIni;
	}
	protected void setHoraIni(int horaIni) {
		this.horaIni = horaIni;
	}
	protected int getHoraFin() {
		return horaFin;
	}
	protected void setHoraFin(int horaFin) {
		this.horaFin = horaFin;
	}
	
	public void calcHoras() {
		
		if (getHoraIni() == getHoraFin()) {
			System.out.println("O Jogo Duro 24h");
		}
		else if (getHoraIni() < getHoraFin()) {
			int duracao = getHoraFin() - getHoraIni();
			
			System.out.println("O jogo durou " + duracao + " Horas.");
		}
		else {
			int duracao = 24 - getHoraIni() + getHoraFin();
			
			System.out.println("O jogo durou " + duracao + " Horas.");
		}
	}
}
