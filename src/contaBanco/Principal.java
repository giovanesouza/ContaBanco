package contaBanco;

public class Principal {

	public static void main(String[] args) {

		ContaBanco p1 = new ContaBanco();
		
		p1.setNumConta(001);
		p1.setDono("Giovane");
		p1.abrirConta("CP");
		p1.depositar(100);
		
		p1.estadoAtual();
		

		ContaBanco p2 = new ContaBanco();
		
		p2.setNumConta(001);
		p2.setDono("Souza");
		p2.abrirConta("CC");
		p2.depositar(100);
		
		p2.estadoAtual();


	}

}
