import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        // 🧮 Exercício 2 – Lista de Produtos
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        //pesquisa
        listaDeProdutos.add(new Produto("Cama", 89.99));
        listaDeProdutos.add(new Produto("Brinquedo", 25));
        listaDeProdutos.add(new Produto("Tapete higienico", 66.80));

        System.out.println("Total de produtos: " + listaDeProdutos.size());

        System.out.println(listaDeProdutos);

        System.out.println("Produto mais caro é o " + listaDeProdutos.get(0));

        System.out.println("\\0/ \\0/ \\0/ \\0/ \\0/ \\0/ \\0/ \\0/");


        // 📚 Exercício 3 – Lista de Livros

        ArrayList<Livro> listaDeLivros = new ArrayList<>();

        listaDeLivros.add(new Livro("Código limpo", "Robert Cecil Martin", 2008));
        listaDeLivros.add(new Livro("O Programador Pragmático", "Andy Hunt, Dave Thomas", 1999));
        listaDeLivros.add(new Livro("O Codificador Limpo", "Robert Cecil Martin", 2011));

        System.out.println(listaDeLivros);

        System.out.println("Livro lançado após 2010:");

        for (Livro L : listaDeLivros) {
            if (L.anoDePublicacao > 2010) {
                System.out.println(L);

                System.out.println("\\0/ \\0/ \\0/ \\0/ \\0/ \\0/ \\0/ \\0/");


                // 🎓 Exercício 4 – Lista de Alunos

                ArrayList<Aluno> listaDeAlunos = new ArrayList<>();

                listaDeAlunos.add(new Aluno("Nina", 6.8));
                listaDeAlunos.add(new Aluno("Roberto", 9.9));
                listaDeAlunos.add(new Aluno("Gamora", 2.0));

                System.out.println(listaDeAlunos);

                double soma = 0;
                for (Aluno aluno : listaDeAlunos) {
                    soma += aluno.nota;
                }
                double media = soma = listaDeAlunos.size();
                System.out.println("A média de notas é: " + media);

                System.out.println("Aprovado...");

                for (Aluno aluno : listaDeAlunos) {
                    if (aluno.nota >= 7) {
                        System.out.println(aluno);

                        System.out.println("\\0/ \\0/ \\0/ \\0/ \\0/ \\0/ \\0/ \\0/");

                        // 🏎️ Exercício 5 – Lista de Carros

                        ArrayList<Carro> listaDeCarros = new ArrayList<>();

                        listaDeCarros.add(new Carro("Toyota Corolla XEi", 2022, "prata"));
                        listaDeCarros.add(new Carro("Jeep Renegade Longitude", 2023, "vermelho"));
                        listaDeCarros.add(new Carro("Chevrolet Onix LT Turbo", 2021, "branco"));

                        System.out.println(listaDeCarros);

                        System.out.println("Carro da cor vermelho:");

                        for (Carro carrro2 : listaDeCarros) {
                            if (carrro2.cor == "vermelho") {
                                System.out.println(carrro2);
                            }
                        }
                    }
                }
            }
        }
    }
}


