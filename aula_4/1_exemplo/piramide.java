import java.util.Scanner;

public class piramide{
    public static void main(String[] args){
        int nivel;
        int n;
        int i;
        int j;
        int qtdEspaco = 0;
        Scanner sc = new Scanner(System.in);
        System.err.println("Insira o nivel da piramide: ");
        nivel = sc.nextInt();
        System.err.println("Insira o numero da piramide: ");
        n = sc.nextInt();
        for(i = 1; i <= nivel; i++){ // Decrementar
            qtdEspaco = nivel - i;
            for(j = 0; j < nivel; j++){ // Incrementar
                if(j < qtdEspaco / 2 ){
                    System.out.print(" ");
                } else {
                    System.out.print(n);
                }
            }
            System.out.println();
        }
    }
}