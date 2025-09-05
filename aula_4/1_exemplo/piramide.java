import java.util.Scanner;

public class piramide{
    public static void main(String[] args){
        int nivel;
        int n;
        int esp;
        int j;
        Scanner sc = new Scanner(System.in);
        System.err.println("Insira o nivel da piramide: ");
        nivel = sc.nextInt();
        System.err.println("Insira o numero da piramide: ");
        n = sc.nextInt();
        for(esp = n/2; esp > 0; esp--){ // Decrementar
            System.out.println(" ");
        }
        for(j = 0; j < n; j++){ // Incrementar
            System.out.println(" ");
        }
    }
}