
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		System.out.println(String.format("Titular: %s", super.cliente.getNome()));
		System.out.println(String.format("Agência: %d", super.agencia));
		System.out.println(String.format("Número: %d", super.numero));
		System.out.println(String.format("Saldo: %.2f", super.saldo));
	}
	
}
