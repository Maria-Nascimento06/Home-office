public class Receitas {

    private String nome;
    private int tempoPreparo; // em minutos

    public Receitas(String nome, int tempoPreparo) {
        this.nome = nome;
        this.tempoPreparo = tempoPreparo;
    }

    public String getNome() {
        return nome;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }
}
