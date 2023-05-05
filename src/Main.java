
public class Main {

	public static void main(String[] args) {
		Cliente pedro = new Cliente();
		pedro.setNome("Pedro");
		Conta cc = new ContaCorrente(pedro);
		cc.depositar(1000.0);
		Conta cp = new ContaPoupanca(pedro);
		cp.depositar(2000.0);
		cp.transferir(200, cc);
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
