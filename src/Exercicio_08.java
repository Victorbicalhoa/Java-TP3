public class Exercicio_08 extends Exercicio_07{
    public static class Conta {
        // Atributos da classe
        private double saldo;

        // Construtor
        public Conta(double saldoInicial) {
            this.saldo = saldoInicial;
        }

        public void saca(double valor) {
            if (valor > 0 && valor <= saldo) { // Validação para saques válidos
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saque inválido. Verifique o saldo disponível.");
            }
        }

        public void deposita(double valor) {
            if (valor > 0) { // Validação para depósitos válidos
                saldo += valor;
                System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("O valor do depósito deve ser maior que zero.");
            }
        }

        public double calculaRendimento() {
            return saldo * 0.1; // Retorna o rendimento mensal
        }

        public void exibirSaldo() {
            System.out.println("Saldo atual: R$ " + saldo);
        }
    }

}
