public class Geometria {
    public double area(double l) {
        return l*l;
    }

    public double area(double b, double h) {
        return b*h;
    }

    public double area(double r, boolean ehCirculo){
        if(ehCirculo){
            return 3.14*(r*r);
        }
        return 0;
    }

    public static void main(String[] args){
        Geometria g = new Geometria();

        System.out.println("Area do quadrado com 4cm: " + g.area(4));
        System.out.println("Area do retangulo com 5cm e 6cm: " + g.area(5, 6));
        System.out.println("Area do circulo de 4cm: " + g.area(4, true));
    }
}