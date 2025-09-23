package Interfaces;

public class YBank extends FinanceiraPadrao implements Financeira {

    private static final Double LIMITE_SAQUE = 1000D;

    @Override
    public void sacar(Conta conta, Double valor) {
        Double saldoDisponivel = conta.getSaldo() + LIMITE_SAQUE;

        if (conta.getSaldo() < saldoDisponivel) {
            System.err.println("\n[SAQUE][ERRO] Valor de saque inválido");
            return;
        };

        System.out.println("\n[SAQUE] Iniciando saque de " + valor);
        System.out.println("[SAQUE] Valor anterior: " + conta.getSaldo());
        conta.alterarSaldo(-valor);
        System.out.println("[SAQUE] Valor atual: " + conta.getSaldo());
    }
}
