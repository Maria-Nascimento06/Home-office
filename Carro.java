public class Carro {
    private String modelo;
    private int ano;
    public String cor;

    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Modelo:" + modelo + ", Ano: " + ano + ", Cor:" + cor;
    }
}
