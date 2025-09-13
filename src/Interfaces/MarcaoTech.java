package Interfaces;

public class MarcaoTech implements Financeira {

    @Override
    public void depositar(Conta conta, Double valor) {
        if (valor <= 0.0) {
            System.err.println("\n[DEPOSITO][ERRO] Valor de depósito inválido");
            return;
        };
        System.out.println("\n[DEPOSITO] Iniciando deposito de " + valor);
        System.out.println("[DEPOSITO] Valor anterior: " + conta.getSaldo());
        conta.alterarSaldo(valor);
        System.out.println("[DEPOSITO] Valor atual: " + conta.getSaldo());
    }

    @Override
    public void sacar(Conta conta, Double valor) {
        if (conta.getSaldo() < valor) {
            System.err.println("\n[SAQUE][ERRO] Valor de saque inválido");
            return;
        };
        System.out.println("\n[SAQUE] Iniciando saque de " + valor);
        System.out.println("[SAQUE] Valor anterior: " + conta.getSaldo());
        conta.alterarSaldo(-valor);
        System.out.println("[SAQUE] Valor atual: " + conta.getSaldo());
    }
}
