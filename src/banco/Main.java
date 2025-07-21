package banco;

public class Main {
    public static void main(String[] args) {
        // Criando cliente
        Cliente c1 = new Cliente("Rafael Silva", "574.061.432-01");
        Cliente c2 = new Cliente("Carla Dias", "333.675.978-02");
        Cliente c3 = new Cliente("Diego Duarte", "123.890.453-00");

        // Criação das contas
        ContaCorrente cc = new ContaCorrente(c1, 1001);
        ContaPoupanca cp = new ContaPoupanca(c2, 1002);
        ContaPoupanca cp1 = new ContaPoupanca(c3, 1003);

        // Operações
        cc.depositar(1000.0);
        cc.sacar(300.0);
        cp.depositar(500.0);
        cp1.depositar(678.99);
        cp1.sacar(678.99);


        // Exibindo os extratos das contas
        cc.imprimirExtrato();
        System.out.println(); // texto para deixar o código fonte mais organizado
        cp.imprimirExtrato();
        System.out.println();
        cp1.imprimirExtrato();
    }
}

