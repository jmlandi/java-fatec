package AtividadeAbertoFechado;

public record RendimentoDTO(Integer mes, Double juro, Double valor) {

    public void exibir() {
        System.out.println("Mês: " + mes + " | Juros: " + juro + " | Valor final: " + valor);
    }

}
