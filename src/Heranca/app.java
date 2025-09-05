package Heranca;

public class app {
    public static void main(String[] args) {

        // Aluno e Professor herdam atributos e funções da classe Pessoa
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        // É possível acessar os atributos e funcões da classe Pessoa em ambas partes
        aluno.nome = "João";
        professor.nome = "Otávio";

        // Mas as classes filhas não compartilham suas especificades
        // ex.: aluno não tem atributo salario
        // ex.: professor não tem atributo curso
        aluno.curso = "Desenvolvimento de Software Multiplataforma";
        professor.salario = 3435.56;

        // Podemos criar funções com diferentes classes no construtor para
        // restringir uma função com restrições, como abaixo, que um aumento
        // só acontece ao passar um objeto do tipo Gerente junto com o empregado
        Empregado empregado = new Empregado();
        Gerente gerente = new Gerente();
        Aumentinho(empregado, gerente);

    }

    public static void Aumentinho(Empregado empregado, Gerente gerente) {
        empregado.salario *= 1.1;
    }
}
