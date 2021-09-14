import java.util.Locale;
import java.lang.Math;

public class ClassePrincipal {
	
	public String nome, escTemp;
	public double valHora, valTot, combGast, consMed, medA, medB, medC, calculos, 
	nota1, nota2, coefA, coefB, coefC, x1, x2, raizQ, valPag, precUnit, dinRec, troco,
	glicose, dist1, dist2, dist3, distMaior, celTemp, fahTemp;
	public int horasTrab, distPerc, horas, minutos, segundos, restos, 
	valor1, valor2, valor3, menor, quantMin, quantComp;
	
	public void Temperatura() {
		if (this.escTemp == "f") {
			this.celTemp = (5 / 9) * (this.fahTemp - 32);
			System.out.println("Temperatura equivalente em Celsius: " + String.format("%.2f", this.celTemp));
		}
		else if (this.escTemp == "c") {
			this.fahTemp = (this.celTemp * (9 / 5)) + 32;
			System.out.println("Temperatura equivalente em Fahrenheit: " + String.format("%.2f", this.escTemp));
		}
	}
	
	public void Dardo() {
		this.distMaior = dist1;
		if (this.distMaior < dist2) {
			this.distMaior = dist2;
		}
		else if (this.distMaior < dist3) {
			this.distMaior = dist3;
		}
		System.out.println("MAIOR DISTANCIA = " + String.format("%.2f", this.distMaior));
	}
	
	public void Glicose() {
		if (this.glicose <= 100.0) {
			System.out.println("Classificacao: Normal");
		}
		else if (this.glicose > 100.0 && this.glicose <= 140.0) {
			System.out.println("Classificacao: Elevado");
		}
		else if (this.glicose > 140.0) {
			System.out.println("Classificacao: Diabetes");
		}
		else {
			System.out.println("Valor Incorreto, TENTE NOVAMENTE!" + String.format("%.2f", this.glicose));
		}
	}
	
	public void Troco() {
		this.valTot = (precUnit * quantComp);
		if (valTot > dinRec) {
			this.troco = valTot - dinRec;
			System.out.println("Dinheiro Insuficiente. Faltam " + String.format("%.2f", this.troco) + " Reais");
		}
		else {
			this.troco = dinRec - valTot;
			System.out.println("Troco = " + String.format("%.2f", this.troco));
		}
	}
	
	public void Operadora() {
		if (this.quantMin <= 100) {
			System.out.println("Valor a pagar: R$ 50.00");
		}
		else {
			this.valPag = ((quantMin - 100) * 2) + 50;
			System.out.println("Valor a pagar: R$ " + String.format("%.2f", this.valPag));
		}
	}
	
	public void MenorDeTres() {
		this.menor = 0;
		if (this.valor1 > this.valor2) {
			this.menor = valor2;
		}
		else if (this.valor2 > this.valor3 ) {
			this.menor = valor3;
		}
		else {
			this.menor = valor1;
		}
		System.out.println("Menor = " + this.menor);
	}
	
	protected void Baskara() {
		Locale.setDefault(Locale.US);
		this.calculos = (Math.pow(coefB, 2)) - (4 * coefA * coefC);
		if (this.calculos < 0) {
			System.out.println("Esta equa��o n�o tem raizes reais.");
		}
		else {
			this.raizQ = Math.sqrt(this.calculos);
			this.x1 = (- coefB + raizQ) / (2 * coefA);
			this.x2 = (- coefB - raizQ) / (2 * coefA);
			System.out.println("X1 = " + String.format("%.4f", this.x1));
			System.out.println("X2 = " + String.format("%.4f", this.x2));
		}
	}
	
	protected void Notas() {
		Locale.setDefault(Locale.US);
		this.calculos = nota1 + nota2;
		System.out.println("Nota Final = " + String.format("%.1f", this.calculos));
		if (this.calculos < 60) {
			System.out.println("Reprovado");
		}
		else {
			System.out.println("Aprovado");
		}
	}
	
	protected void Duracao() {
		this.horas = segundos / 3600;
		this.restos = segundos % 3600;
		this.minutos = restos / 60;
		this.segundos = restos % 60;
		System.out.println(this.horas + " : " + this.minutos + " : " + this.segundos);
	}
	
	protected void Pagamento() {
		Locale.setDefault(Locale.US);
		this.valTot = valHora * horasTrab;
		System.out.println("O pagamento para " + nome + " deve ser R$ " 
		+ String.format("%.2f", this.valTot));
	}
	
	protected void Consumo() {
		Locale.setDefault(Locale.US);
		this.consMed = distPerc / combGast;
		System.out.println("Consumo Medio = " + String.format("%.3f", this.consMed));
	}
	
	protected void AreaQuad() {
		this.calculos = Math.pow(medA, 2);
		System.out.println("Area do Quadrado = " + String.format("%.4f", this.calculos));
	}
	
	protected void AreaTriang() {
		this.calculos = (medA * medB) / 2;
		System.out.println("Area do Triangulo = " + String.format("%.4f", this.calculos));
	}
	
	protected void AreaTrap() {
		this.calculos = ((medA + medB) * medC) / 2;
		System.out.println("Area do Trap�zio = " + String.format("%.4f", this.calculos));
	}
	
	
	
	

}
