package banco;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(Cliente cliente, int numero) {
        super(cliente, numero);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Número: " + numero);
        System.out.println("Saldo: R$ " + saldo);


    }
}
