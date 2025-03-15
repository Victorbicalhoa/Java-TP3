import java.time.LocalDate;

public class Exercicio_09 {

    public static class conta {
        private String titular;
        private int numero;
        private String agencia;
        private double saldo;
        private String dataAbertura;
        private LocalDate dataDeAbertura;


        public conta(String titular, int numero, String agencia, double saldo, LocalDate dataDeAbertura) {
            this.titular = titular;
            this.numero = numero;
            this.agencia = agencia;
            this.saldo = saldo;
            this.dataDeAbertura = dataDeAbertura;
        }

        public void saca(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saque inválido. Verifique o saldo disponível.");
            }
        }

        public void deposita(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("O valor do depósito deve ser maior que zero.");
            }
        }

        public double calculaRendimento() {
            return saldo * 0.1;
        }

        public void exibirInformacoes() {
            System.out.println("Titular: " + titular);
            System.out.println("Número: " + numero);
            System.out.println("Agência: " + agencia);
            System.out.println("Saldo: R$ " + saldo);
            System.out.println("Data de Abertura: " + dataDeAbertura);
        }

    }
    public static void main(String[] args) {
        conta conta = new conta(
                "João Silva",
                12345,
                "001",
                5000.00,
                LocalDate.of(2023, 1, 10)
        );

        System.out.println("Informações iniciais da conta:");
        conta.exibirInformacoes();


        System.out.println("\nOperações na conta:");

        conta.deposita(1500.00);

        conta.saca(2000.00);

        double rendimento = conta.calculaRendimento();
        System.out.println("Rendimento mensal: R$ " + rendimento);

        System.out.println("\nInformações atualizadas da conta:");
        conta.exibirInformacoes();

    }


}
