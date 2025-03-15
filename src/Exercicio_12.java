public class Exercicio_12 {
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
            System.out.println("Area do círculo: " + area + " m²");
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
            System.out.println("Volume da esfera: " + volume + " m³");
        }
    }

    public static void main(String[] args) {
        circulo c1 = new circulo(3);
        esfera es1 = new esfera(5);

        c1.calcArea();
        es1.calcVolume();
    }
}
