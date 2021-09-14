
public class exerBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClasseBanco pessoa1 = new ClasseBanco();
		
		pessoa1.setNumConta(1111);
		pessoa1.setDono("Juan");
		pessoa1.abrirConta("cc");

		ClasseBanco pessoa2 = new ClasseBanco();
		
		pessoa2.setNumConta(2222);
		pessoa2.setDono("Denise");
		pessoa2.abrirConta("cp");
		
		pessoa1.depositar(100);
		pessoa2.depositar(500);
		
		pessoa2.sacar(100);
		pessoa2.sacar(550);
		pessoa2.fecharConta();
		
		pessoa1.sacar(150);
		pessoa1.fecharConta();
		
		pessoa1.status();
		pessoa2.status();
	}

}
