package AbertoFechado;

public class Main {
    public static void main(String[] args) {

        Double valor = 2000D;
        Imposto imposto = new Imposto();
        Imposto impostoMG = new ImpostoMG();
        Imposto impostoRJ = new ImpostoRJ();

        // Sem alterar a classe imposto, estamos criando variações do imposto.
        // Esse é o princípio de aberto para extensão e fechado para mudança.

        System.out.println("Valor: " + valor);
        System.out.println("Imposto: " + imposto.calcularImposto(valor));
        System.out.println("Imposto MG: " + impostoMG.calcularImposto(valor));
        System.out.println("Imposto RJ: " + impostoRJ.calcularImposto(valor));
    }
}
