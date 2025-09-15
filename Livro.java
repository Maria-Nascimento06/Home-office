public class Livro {
    private String titulo;
    private String autor;
    public int anoDePublicacao;

    public Livro(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    @Override
    public String toString(){
        return "Titulo:" + titulo + ", Autor: " + autor + ", Ano de publicação:" + anoDePublicacao ;
    }
}
