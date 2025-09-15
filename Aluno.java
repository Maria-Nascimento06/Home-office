public class Aluno {
    private String nome;
    public double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "nome:" + nome + ", nota: " + nota;
    }
}
