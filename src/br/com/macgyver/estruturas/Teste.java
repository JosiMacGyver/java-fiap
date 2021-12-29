package br.com.macgyver.estruturas;

public class Teste {

    public static void main(String[] args) {

        Produto[] produtos = new Produto[2];

        Produto prod1 = new Produto();
        prod1.setNome("Limão");
        prod1.setDescricao("Galego");
        prod1.setValor(4);

        Produto prod2 = new Produto();
        prod2.setNome("Maçã");
        prod2.setDescricao("Gala");
        prod2.setValor(5);

        produtos[0] = prod1;
        produtos[1] = prod2;

        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }

        //para cada item de nome prod do tipo Produtos no array produtos:
        for (Produto prod : produtos) {
            System.out.println(prod.toString());
        }

        Produto[][] localizacaoProduto = new Produto[10][3];
        localizacaoProduto[0][1] = prod1;
        localizacaoProduto[1][1] = prod2;

        System.out.println(localizacaoProduto[0][1].getNome());

    }
}
