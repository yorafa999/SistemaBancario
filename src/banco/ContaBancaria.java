package banco;


public abstract class ContaBancaria {
    protected Cliente cliente;
    protected double saldo;
    protected int numero;

    public ContaBancaria(Cliente cliente, int numero) {
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public abstract void imprimirExtrato();{

    }

    private void registrarHistorico(String s) {
    }

    public void incluir(double valor) {
        this.saldo += valor;
        registrarHistorico("Depósito de R$ " + valor);
    }


    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            registrarHistorico("Saque de R$ " + valor);
            return true;
        }
        return false;
    }


}



