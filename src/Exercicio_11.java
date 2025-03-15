public class Exercicio_11 {
    static double pi = Math.PI;

    public static class circulo {
        double raio;
        double area;

        public circulo(double raio){
            this.raio = raio;
        }

        public double getRario(){
            return raio;
        }

        public void setRario(double raio){
            this.raio = raio;
        }

        public void calcArea(){
            area = pi * (raio * raio);
        }
    }

    public static class esfera{
        double raio;
        double volume;

        public esfera(double raio){
            this.raio = raio;
        }

        public double getRaio(){
            return raio;
        }

        public void setRaio(double raio){
            this.raio = raio;
        }
        public void calcVolume(){
            volume = (double) (4 / 3) * pi * (raio * raio * raio);
        }
    }
}
