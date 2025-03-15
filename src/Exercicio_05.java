public class Exercicio_05 {

    public static class Produto {

        private String nome;
        private double preco;
        private int quantidadeEmEstoque;

        // Construtor
        public Produto(String nome, double preco, int quantidadeEmEstoque) {
            this.nome = nome;
            this.preco = preco;
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }

        //get
        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public int getQuantidadeEmEstoque() {
            return quantidadeEmEstoque;
        }

        // Set
        public void setNome(String novoNome) {
            this.nome = novoNome;
        }

        public void setPreco(double novoPreco) {
            if (novoPreco > 0) {
                this.preco = novoPreco;
            } else {
                System.out.println("O preço deve ser maior que zero!");
            }
        }

        public void setQuantidadeEmEstoque(int novaQuantidade) {
            if (novaQuantidade >= 0) {
                this.quantidadeEmEstoque = novaQuantidade;
            } else {
                System.out.println("A quantidade em estoque não pode ser negativa!");
            }
        }
    }

    public static class AppProduto {
        public static void main(String[] args) {

            Produto produto = new Produto("Feijão", 7.99, 30);

            System.out.println("Produto inicial:");
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: R$ " + produto.getPreco());
            System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());

            // Atualizando os valores usando set
            System.out.println("\nAtualizando valores...");
            produto.setNome("Feijão Preto");
            produto.setPreco(8.50);
            produto.setQuantidadeEmEstoque(45);

            // Exibindo os valores atualizados usando get
            System.out.println("\nProduto atualizado:");
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: R$ " + produto.getPreco());
            System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());
        }
    }


}
