// Declaração de uma classe
public class Exercicio_01 {
    // Campos (ou atributos)
    String marca;
    double combustivel;

    // Método para exibir informações do carro
    public void dirigir(double quilometros) {
        if (combustivel >= quilometros / 12.0) { // Supondo 12 km/L
            combustivel -= quilometros / 12.0;
            System.out.println("Dirigiu " + quilometros + " km.");
        } else {
            System.out.println("Combustível insuficiente!");
        }
    }

    // Método para abastecer o carro
    public void abastecer(double litros) {
        combustivel += litros;
        System.out.println("Abastecido com " + litros + " litros.");
    }
}
