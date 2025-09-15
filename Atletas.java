public class Atletas {
    private String nome;
    private String modalidade;
    private double pontuacao;

    public Atletas(String nome, String modalidade, double pontuacao) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public String getModalidade() {
        return modalidade;
    }

    public double getPontuacao() {
        return pontuacao;
    }
}
