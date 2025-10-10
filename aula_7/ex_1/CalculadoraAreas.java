package aula08;

class abstract FiguraGeometrica {
    public static void saudacao(){
        System.out.println("Bem vindo! Cuidado os cara tao no teto");
    }
}

class Circulo extends FiguraGeometrica implements FiguraParametroUnico {
    @Override
    public double calcularArea(double raio){
        return PI * (raio*raio);
    }
}

class Retangulo extends FiguraGeometrica implements FiguraParametroComposto {
    @Override
    public double calcularArea(double largura, double altura){
        return largura * altura;
    }
}

class Triangulo extends FiguraGeometrica implements FiguraParametroComposto {
    @Override
    public double calcularArea(double base, double altura){
        return (base * altura)/2;
    }
    
}

public class CalculadoraAreas {
    public static void main(String[] args) {
        FiguraGeometrica.saudacao();
        FiguraGeometrica obj = new Retangulo();

        System.out.println("Resultado: " + obj.calcularArea(10.0));
    }
}