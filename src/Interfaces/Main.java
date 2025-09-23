package Interfaces;

public class Main {
    public static void main(String[] args) {

        final Double VALOR_DE_DEPOSITO_UM = 76.87D;
        final Double VALOR_DE_DEPOSITO_DOIS = 2000D;
        final Double VALOR_DE_DEPOSITO_TRES = 10199.99D;
        final Double VALOR_DE_SAQUE_UM = 15.5D;
        final Double VALOR_DE_SAQUE_DOIS = 299.9D;
        final Double VALOR_DE_SAQUE_TRES = 37299.99D;
        final Double PAGAMENTO_FINANCIAMENTO = 1000D;

        Conta contaUm = new Conta("Marquinhos", 1);

        MarcaoTech marcaoTech = new MarcaoTech();
        marcaoTech.depositar(contaUm, VALOR_DE_DEPOSITO_UM);
        marcaoTech.depositar(contaUm, VALOR_DE_DEPOSITO_DOIS);
        marcaoTech.depositar(contaUm, VALOR_DE_DEPOSITO_TRES);
        marcaoTech.sacar(contaUm, VALOR_DE_SAQUE_UM);
        marcaoTech.sacar(contaUm, VALOR_DE_SAQUE_DOIS);
        marcaoTech.sacar(contaUm, VALOR_DE_SAQUE_TRES);
        marcaoTech.liberarCredito(contaUm);
        marcaoTech.pagarFinanciamento(contaUm, PAGAMENTO_FINANCIAMENTO);
        marcaoTech.adicionarJurosFinanciamento(contaUm);

        Financeira FinCaio = new FinCaio();
        FinCaio.depositar(contaUm, VALOR_DE_DEPOSITO_UM);
        FinCaio.depositar(contaUm, VALOR_DE_DEPOSITO_DOIS);
        FinCaio.depositar(contaUm, VALOR_DE_DEPOSITO_TRES);
        FinCaio.sacar(contaUm, VALOR_DE_SAQUE_UM);
        FinCaio.sacar(contaUm, VALOR_DE_DEPOSITO_DOIS);
        FinCaio.sacar(contaUm, VALOR_DE_SAQUE_TRES);

        Financeira yBank = new YBank();
        yBank.depositar(contaUm, VALOR_DE_DEPOSITO_UM);
        yBank.depositar(contaUm, VALOR_DE_DEPOSITO_DOIS);
        yBank.depositar(contaUm, VALOR_DE_DEPOSITO_TRES);
        yBank.sacar(contaUm, VALOR_DE_SAQUE_UM);
        yBank.sacar(contaUm, VALOR_DE_DEPOSITO_DOIS);
        yBank.sacar(contaUm, VALOR_DE_SAQUE_TRES);

    }
}
