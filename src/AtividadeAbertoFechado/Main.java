package AtividadeAbertoFechado;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Double capital = 1000D;
        Double taxa = 0.15;
        Integer meses = 10;
        System.out.println("\nVALORES INICIAIS:");
        System.out.println("Capital: " + capital);
        System.out.println("Taxa: " + taxa);
        System.out.println("Meses " + meses);

        Rendimento rendimentoSimples = new RendimentoSimples();
        List<RendimentoDTO> extratoRendimentoSimples = rendimentoSimples.calcularJuros(capital, taxa, meses);

        System.out.println("\nJUROS SIMPLES:");
        for (RendimentoDTO n : extratoRendimentoSimples) {
            n.exibir();
        }

        Rendimento rendimentoComposto = new RendimentoComposto();
        List<RendimentoDTO> extratoRendimentoComposto = rendimentoComposto.calcularJuros(capital, taxa, meses);

        System.out.println("\nJUROS COMPOSTOS:");
        for (RendimentoDTO n : extratoRendimentoComposto) {
            n.exibir();
        }

        Rendimento rendimentoIncentivado = new RendimentoIncentivado();
        List<RendimentoDTO> extratoRendimentoIncentivado = rendimentoIncentivado.calcularJuros(capital, taxa, meses);

        System.out.println("\nJUROS INCENTIVADOS:");
        for (RendimentoDTO n : extratoRendimentoIncentivado) {
            n.exibir();
        }

    }

}
