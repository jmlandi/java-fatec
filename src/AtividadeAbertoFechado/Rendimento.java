package AtividadeAbertoFechado;

import java.util.List;

public abstract class Rendimento {

    RendimentoDTO rendimentoDTO;

    public abstract List<RendimentoDTO> calcularJuros(Double capital, Double taxa, Integer meses);

}
