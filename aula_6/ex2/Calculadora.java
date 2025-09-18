public class Calculadora{
    public int multiplica(int a, int b){
        return a * b;
    }

    public double multiplica(double a, double b){
        return a * b;
    }

    public int multiplica(int... valores){
        int resultado = 1;
        for(int i = 0; i < valores.length; i++){
            resultado *= valores[i];
        }
        return resultado;
    }

    public static void main(String[] args){
        Calculadora c = new Calculadora();

        System.out.println(c.multiplica(1,4));
        System.out.println(c.multiplica(1.33,4));
        System.out.println(c.multiplica(1,4,3,4,5,2,1,4,5,3));
    }
}