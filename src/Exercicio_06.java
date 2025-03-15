public class Exercicio_06 {

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

            public void exibirInformacoes() {
                System.out.println("Produto: " + nome);
                System.out.println("Preço: R$ " + preco);
                System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);

            }

            /*  O construtor da classe Produto permite criar objetos inicializando os atributos nome, preco e quantidadeEmEstoque
                diretamente no momento da criação. Isso garante que todos os produtos tenham valores definidos desde o início,
                evitando a necessidade de definir valores padrão ou realizar várias chamadas de métodos set. */


        public static class AppProduto {
            public static void main(String[] args) {
                Produto produto = new Produto("Leite", 5.99, 20);

                // Exibindo as informações do produto
                System.out.println("Informações do produto criado:");
                produto.exibirInformacoes();

            }
        }


    }

}


/*
Por que usar um Construtor?
Simplicidade:

O construtor permite inicializar os atributos de forma direta e em uma única etapa. Isso evita múltiplas chamadas a
métodos set para definir cada atributo separadamente.

Segurança e Consistência:

Como o construtor exige os valores no momento da criação, garante que os objetos sejam criados com todos os atributos
devidamente preenchidos. Isso reduz o risco de esquecer de definir valores ou deixar atributos com valores inválidos.

Clareza no Código:

A criação de objetos usando um construtor é mais intuitiva e legível, especialmente quando os valores iniciais estão
diretamente relacionados ao estado do objeto.
*/