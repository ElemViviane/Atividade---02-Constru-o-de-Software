package br.com.produto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque = 0;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }


    public void adicionaEstoque(int adicionarItem){
        this.quantidadeEstoque += adicionarItem;
    }
    public void removeEstoque(int removerItem){
        if(quantidadeEstoque > 0){
            this.quantidadeEstoque -= removerItem;
        } else{
            System.out.println("Não possui itens a serem removidos do estoque.");
        }
    }
    public void exibeProduto(){
        System.out.println("Nome do produto: " + nome + "\nPreço: " + preco
                + "\nQuantidade em estoque: " + quantidadeEstoque);
    }
}


package br.com.produto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Carregador", 190.60);
        produto1.exibeProduto();

        System.out.println("\nAdicionando quantidade 8 no estoque do produto " + produto1.getNome());
        produto1.adicionaEstoque(8);
        produto1.exibeProduto();

        System.out.println("\nRemovendo quantidade 5 do estoque do produto " + produto1.getNome());
        produto1.removeEstoque(5);
        produto1.exibeProduto();
    }
}
