public class Exercicio_03 {

    public static class Produto {
        String nome; // O nome é essencial para identificar e diferenciar os produtos.
        double preco; // O preço define o valor de venda do produto.
        int quantidadeEmEstoque; // Esse atributo indica a quantidade disponível do produto no estoque.


        public Produto(String nome, double preco, int quantidadeEmEstoque) {
            this.nome = nome;
            this.preco = preco;
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }


        public void alterarPreco(double novoPreco) {
            if (novoPreco > 0) { // Validação para garantir que o preço seja positivo
                this.preco = novoPreco;
                System.out.println("Preço atualizado para: R$ " + novoPreco);
            } else {
                System.out.println("O preço deve ser maior que zero!");
            }
        }

        public void alterarQuantidade(int novaQuantidade) {
            if (novaQuantidade >= 0) { // Validação para evitar valores negativos
                this.quantidadeEmEstoque = novaQuantidade;
                System.out.println("Quantidade em estoque atualizada para: " + novaQuantidade + " Un.");
            } else {
                System.out.println("A quantidade em estoque não pode ser negativa!");
            }
        }

        public void exibirInformacoes(){
            System.out.println("Nome: " + nome);
            System.out.println("Preco: R$ " + preco);
            System.out.println("Quantidade: " + quantidadeEmEstoque + " Un.");
        }
    }
}
