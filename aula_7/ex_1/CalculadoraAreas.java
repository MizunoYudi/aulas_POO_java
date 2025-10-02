class FiguraGeometrica {
    public static double PI = 3.14159;

    public static void saudacao(){
        System.out.println("Bem vindo! Cuidado os cara tao no teto");
    }

    public double calcularArea(double paramUnico){
        return paramUnico * paramUnico;
    }

    public double calcularArea(double base, double altura){
        return base * altura;
    }
}

class Circulo extends FiguraGeometrica {
    @Override
    public double calcularArea(double raio){
        return PI * (raio*raio);
    }
}

class Retangulo extends FiguraGeometrica {
    @Override
    public double calcularArea(double largura, double altura){
        return largura * altura;
    }
}

class Triangulo extends FiguraGeometrica {
    @Override
    public double calcularArea(double base, double altura){
        return (base * altura)/2;
    }
}

public class CalculadoraAreas {
    public static void main(String[] args) {
        FiguraGeometrica.saudacao();
        Circulo obj = new Circulo();

        System.out.println("Resultado: " + obj.calcularArea(3));
    }
}