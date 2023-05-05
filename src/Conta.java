
public abstract class Conta implements IConta {
	private static final int AGENCIA_PADRAO = 1;
	private static  int SEQUENCIAL = 1;
	
	protected int numero;
	protected int agencia;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		numero = SEQUENCIAL++;
		agencia = Conta.AGENCIA_PADRAO;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	public int getNumero() {
		return numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}
}
