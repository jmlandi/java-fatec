package Interfaces;

public class MarcaoTech extends FinanceiraPadrao implements Financeira, Financiamento {

    @Override
    public void liberarCredito(Conta conta) {
        conta.setValorFinanciamentoLiberado(conta.getSaldo() * 4.0);
    }

    @Override
    public void pagarFinanciamento(Conta conta, Double valor) {
        System.out.println("\n[FINANCIADO] valor de emprestado: " + valor);
        System.out.println("[FINANCIADO] Valor anterior: " + conta.getValorFinanciado());
        conta.alterarValorFinanciado(-valor);
        System.out.println("[FINANCIADO] Valor atual: " + conta.getValorFinanciado());
    }

    @Override
    public void adicionarJurosFinanciamento(Conta conta) {
        Double valorDeJuros = conta.getValorFinanciado() * 0.015;

        System.out.println("\n[FINANCIADO] valor de emprestado: " + conta.getValorFinanciado());
        System.out.println("[FINANCIADO] Valor anterior: " + conta.getValorFinanciado());
        conta.alterarValorFinanciado(valorDeJuros);
        System.out.println("[FINANCIADO] Valor atual: " + conta.getValorFinanciado());
    }
}
