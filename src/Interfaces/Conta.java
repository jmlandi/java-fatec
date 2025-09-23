package Interfaces;

public class Conta {

    private String cliente;
    private Integer numero;
    private Double saldo;
    private Double valorFinanciamentoLiberado;
    private Double valorFinanciado;

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

    public Double getValorFinanciamentoLiberado() {
        return valorFinanciamentoLiberado;
    }

    public void setValorFinanciamentoLiberado(Double valorFinanciamentoLiberado) {
        this.valorFinanciamentoLiberado = valorFinanciamentoLiberado;
    }

    public Double getValorFinanciado() {
        return valorFinanciado;
    }

    public Double alterarValorFinanciado(Double valor) {
        return this.valorFinanciado += valor;
    }
}
