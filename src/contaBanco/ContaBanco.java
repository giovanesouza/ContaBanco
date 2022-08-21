package contaBanco;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	// MÉTODOS PERSONALIZADOS
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
		this.saldo = 50;
		this.setSaldo(50);
		} else if (t == "CP") {
		this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso");

	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
			} else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada pois tem débito");
			} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
			}

	}
	
	public void depositar(float v) {
		if (this.getStatus()) {
			// this.saldo = this.saldo + v;
			this.setSaldo(this.getSaldo() + v); // Trabalhar SEMPRE com os MÉTODOS ESPECIAIS
			System.out.println("Depósito realizado com sucesso na conta de " +  this.getDono());

			} else {
			System.out.println("Impossível depositar em uma conta fechada!");
			}

	}
	
	public void sacar(float v) {
		
		if (this.getStatus()) {
				if (this.getSaldo() >= v) {
					
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Saque realizado na conta de " + this.getDono());	
		} else {
			System.out.print("Saldo insuficiente para saque");
			} 
				
		} else {
			System.out.print("Impossível sacar de uma conta fechada!");
			}

	}
	
	public void pagarMensal() {
		// VARIÁVEL LOCAL
		int v = 0;
		
		if (this.getTipo() == "CC") {
		
				v = 12;
		
		} else if (this.getTipo() == "CP") {
		
			v = 20;
			
		}
		if (this.getStatus()) {
		this.setSaldo(this.getSaldo() - v);
		System.out.print("Mensalidade paga com sucesso por " + this.getDono());

		} else {
		System.out.print(" Impossível pagar uma conta fechada!");
		}
	}
	
	public void estadoAtual() {
		System.out.println("--------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());

	}
	
	
	// MÉTODOS ESPECIAIS
	
	// CONSTRUTOR
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);

	}
	
	// GET E SET
	
	public int getNumConta() {
		return numConta;
	}
	
	public void setNumConta(int NumConta) {
		this.numConta = NumConta;
	}
		
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String Tipo) {
		this.tipo = Tipo;
	}

	public String getDono() {
		return dono;
	}
	
	public void setDono(String Dono) {
		this.dono = Dono;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float Saldo) {
		this.saldo = Saldo;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean Status) {
		this.status = Status;
	}

	
}
