package AtividadeAbertoFechado;

import java.util.ArrayList;
import java.util.List;

public class RendimentoSimples extends Rendimento {


    @Override
    public List<RendimentoDTO> calcularJuros(Double capital, Double taxa, Integer meses) {
        List<RendimentoDTO> rendimentos = new ArrayList<RendimentoDTO>();

        Double juros = capital * taxa;
        Double capitalAtual = capital;

        for (int i = 1; i <= meses; i++) {
            Integer mes = i;
            capitalAtual += juros;
            RendimentoDTO valorNoMes = new RendimentoDTO(mes, juros, capitalAtual);
            rendimentos.add(valorNoMes);
        }

        return rendimentos;
    }

}
