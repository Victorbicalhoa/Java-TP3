public class Exercicio_10 {

    public static class circulo {
        double raio;

        public circulo(double raio){
            this.raio = raio;
        }

        public double getRario(){
            return raio;
        }

        public void setRario(double raio){
            this.raio = raio;
        }
    }

    public static class esfera{
        double raio;

        public esfera(double raio){
            this.raio = raio;
        }

        public double getRaio(){
            return raio;
        }

        public void setRaio(double raio){
            this.raio = raio;
        }
    }
}

/*
Círculo: O raio define o tamanho e é usado em todas as fórmulas associadas, como área e circunferência.

Esfera: Sem o raio, não seria possível calcular o volume ou a área da superfície, que dependem diretamente dessa medida.
*/