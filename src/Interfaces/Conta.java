package Interfaces;

public class Conta {

    private String cliente;
    private Integer numero;
    private Double saldo;

    public Conta(String cliente, Integer numero) {
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = 0D;
    }

    public Double alterarSaldo(Double valorTransacao) {
        return this.saldo += valorTransacao;
    }

    public String getCliente() {
        return cliente;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }
}
