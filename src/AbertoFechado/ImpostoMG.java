package AbertoFechado;

public class ImpostoMG extends Imposto {
    @Override
    public Double calcularImposto(Double valorImposto) {
        if (valorImposto < 1000D) return valorImposto * 0D;
        return valorImposto * 0.18;
    }
}
