package AbertoFechado;

public class ImpostoRJ extends Imposto {

    @Override
    public Double calcularImposto(Double valorImposto) {
        if (valorImposto < 5000D) return valorImposto * 0.12;
        if (valorImposto < 100000D) return valorImposto * 21.5;
        return valorImposto * 0.10;
    }
}
