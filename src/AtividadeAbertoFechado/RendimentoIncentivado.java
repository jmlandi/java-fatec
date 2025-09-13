package AtividadeAbertoFechado;

import java.util.List;

public class RendimentoIncentivado extends RendimentoSimples {

    private double ICENTIVADO_ATE_MIL = 0.01;
    private double ICENTIVADO_ATE_CINCO_MIL = 0.02;
    private double ICENTIVADO_MAIS_DE_CEM_MIL = 0.005;

    @Override
    public List<RendimentoDTO> calcularJuros(Double capital, Double taxa, Integer meses) {
        if (capital < 1000D) taxa += ICENTIVADO_ATE_MIL;
        else if (capital < 5000D) taxa += ICENTIVADO_ATE_CINCO_MIL;
        else if (capital > 100000D) taxa += ICENTIVADO_MAIS_DE_CEM_MIL;
        return super.calcularJuros(capital, taxa, meses);
    }
}
