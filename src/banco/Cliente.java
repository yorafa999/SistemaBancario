package banco;

import java.util.Scanner;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void Nome(String nome) {
        this.nome = nome;
    }

    public void Cpf(String cpf) {
        this.cpf = cpf;
    }

}





