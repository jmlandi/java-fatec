package Interfaces;

public interface Financiamento {

    public void liberarCredito(Conta conta);
    public void pagarFinanciamento(Conta conta, Double valor);
    public void adicionarJurosFinanciamento(Conta conta);
}
