import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PrincipalSegunda {
    public static void main(String[] args) {

        //🐶Exercício 6 – Lista de Animais

        // ArrayList<Animal> meuAnimal = new ArrayList<>();

        // meuAnimal.add(new Animal("Mimi", "gato"));
        //meuAnimal.add(new Animal("Rex", "cachorro"));
        // meuAnimal.add(new Animal("Frajola", "gato"));
        // meuAnimal.add(new Animal("Luna", "gato"));
        // meuAnimal.add(new Animal("Toby", "cachorro"));

        // System.out.println("Animais da espécie 'gato':");
        // for (Animal animal : meuAnimal) {
        //   if (animal.getEspecie().equalsIgnoreCase("gato")) {
        // System.out.println("- " + animal.getNome());

        //🧳 Exercício 7 – Lista de Viagens

        //ArrayList<Viagens> minhasViagens = new ArrayList<>();
        //minhasViagens.add(new Viagens("Paris", 5));
        //minhasViagens.add(new Viagens("Tóquio", 10));
        // minhasViagens.add(new Viagens("Rio de Janeiro", 8));
        // minhasViagens.add(new Viagens("Lisboa", 7));
        // minhasViagens.add(new Viagens("Nova York", 12));

        // System.out.println("Viagens com mais de 7 dias de duração:");
        // for (Viagens viagem : minhasViagens) {
        //  if (viagem.getDuracaoDias() > 7) {
        //      System.out.println("- " + viagem.getDestino() + " (" + viagem.getDuracaoDias() + " dias)");

        // 🧑‍🍳 Exercício 8 – Lista de Receitas

       // ArrayList<Receitas> minhasReceitas = new ArrayList<>();

       // minhasReceitas.add(new Receitas("Omelete", 10));
       // minhasReceitas.add(new Receitas("Lasanha", 45));
      //  minhasReceitas.add(new Receitas("Salada de frutas", 15));
       // minhasReceitas.add(new Receitas("Macarrão alho e óleo", 20));
       // minhasReceitas.add(new Receitas("Feijoada", 120));

        // Imprimindo receitas com tempo de preparo menor que 30 minutos
       // System.out.println("Receitas que levam menos de 30 minutos:");
       // for (Receitas receita : minhasReceitas) {
          //  if (receita.getTempoPreparo() < 30) {
              //  System.out.println("- " + receita.getNome() + " (" + receita.getTempoPreparo() + " min)");

   // 🎬 Exercício 9 – Lista de Filmes

   // ArrayList<Filme> meuFilme = new ArrayList<>();

      //  meuFilme.add(new Filme("A Origem", "Ficção Científica", 8.8));
       // meuFilme.add(new Filme("Velozes e Furiosos", "Ação", 7.2));
       // meuFilme.add(new Filme("O Poderoso Chefão", "Drama", 9.2));
      //  meuFilme.add(new Filme("Divertida Mente", "Animação", 8.1));
       // meuFilme.add(new Filme("Crepúsculo", "Romance", 5.9));

      //  System.out.println("Filmes com avaliação acima de 8:");
      //  for (Filme filme : meuFilme) {
          //  if (filme.getAvaliacao() > 8.0) {
              //  System.out.println("- " + filme.getTitulo() + " (" + filme.getGenero() + ") - Nota: " + filme.getAvaliacao());

   // 🏆 Exercício 10 – Lista de Atletas

    ArrayList<Atletas> atletas = new ArrayList<>();

        atletas.add(new Atletas("Ana", "Ginástica", 9.5));
        atletas.add(new Atletas("Carlos", "Natação", 8.7));
        atletas.add(new Atletas("Beatriz", "Atletismo", 9.8));
        atletas.add(new Atletas("João", "Judô", 7.9));

        Atletas campeao = atletas.get(0);
        for (Atletas atleta : atletas) {
            if (atleta.getPontuacao() > campeao.getPontuacao()) {
                campeao = atleta;
            }
        }

        System.out.println("Campeão:");
        System.out.println("- Nome: " + campeao.getNome());
        System.out.println("- Modalidade: " + campeao.getModalidade());
        System.out.println("- Pontuação: " + campeao.getPontuacao());
    }
}













