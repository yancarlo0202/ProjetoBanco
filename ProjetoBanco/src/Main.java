public class Main {
public static void main(String[] args) {
    
		Cliente yan = new Cliente();
		yan.setNome("Yan");
		
		Conta cc = new ContaCorrente(yan);
		Conta poupanca = new ContaPoupanca(yan);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
