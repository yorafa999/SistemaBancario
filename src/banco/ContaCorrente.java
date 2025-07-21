package banco;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(Cliente cliente, int numero) {
        super(cliente, numero);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Número: " + numero);
        System.out.println("Saldo: R$ " + saldo);
    }
}
