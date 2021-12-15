public class Main {

    public static void main(String[] args) {

        Cliente thainara = new Cliente();
        thainara.setNome("Thainara");

        Conta cc = new ContaCorrente(thainara);
        Conta poupanca = new ContaPoupanca(thainara);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
