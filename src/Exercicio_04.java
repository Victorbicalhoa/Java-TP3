public class Exercicio_04 {
    public static void main(String[] args) {

      Exercicio_03.Produto produto = new Exercicio_03.Produto("Arroz", 20.00, 50);

      System.out.println("Informações do Produto: \n");
      produto.exibirInformacoes();

        System.out.println("Atualizando informação do Produto: \n");
        produto.alterarPreco(18.50);
        produto.alterarQuantidade(100);

        System.out.println("\nInformações atualizadas do produto:");
        produto.exibirInformacoes();
    }
}
