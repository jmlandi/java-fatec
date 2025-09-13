package Interfaces;

public class Main {
    public static void main(String[] args) {

        Conta contaUm = new Conta("Marquinhos", 1);

        Financeira marcaoTech = new MarcaoTech();

        marcaoTech.depositar(contaUm, 200D);
        marcaoTech.sacar(contaUm, 24.99);
        marcaoTech.sacar(contaUm, 19.99);
        marcaoTech.sacar(contaUm, 3000D);

    }
}
