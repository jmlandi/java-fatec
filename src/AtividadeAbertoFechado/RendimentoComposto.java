package AtividadeAbertoFechado;

import java.util.ArrayList;
import java.util.List;

public class RendimentoComposto extends Rendimento {

    @Override
    public List<RendimentoDTO> calcularJuros(Double capital, Double taxa, Integer meses) {

        List<RendimentoDTO> rendimentos = new ArrayList<RendimentoDTO>();
        Double capitalAtual = capital;

        for (int i = 1; i <= meses; i++) {
            Double juros = capitalAtual * taxa;
            Integer mes = i;
            capitalAtual += juros;
            RendimentoDTO valorNoMes = new RendimentoDTO(mes, juros, capitalAtual);
            rendimentos.add(valorNoMes);
        }

        return rendimentos;
    }

}
