package Interfaces;

public class FinCaio extends FinanceiraPadrao implements Financeira {

    private static final Double LIMITE_DEPOSITO_INCENTIVADO = 10000D;

    @Override
    public void depositar(Conta conta, Double valor) {
        if (valor <= 0.0) {
            System.err.println("\n[DEPOSITO][ERRO] Valor de depósito inválido");
            return;
        };

        if (valor >= LIMITE_DEPOSITO_INCENTIVADO) {

            System.out.println("\n[DEPOSITO] Iniciando deposito de " + valor);
            System.out.println("[DEPOSITO] Valor anterior: " + conta.getSaldo());
            conta.alterarSaldo(valor * 1.015);
            System.out.println("[DEPOSITO] Valor atual: " + conta.getSaldo());
            return;

        }

        System.out.println("\n[DEPOSITO] Iniciando deposito de " + valor);
        System.out.println("[DEPOSITO] Valor anterior: " + conta.getSaldo());
        conta.alterarSaldo(valor);
        System.out.println("[DEPOSITO] Valor atual: " + conta.getSaldo());
    }
}
