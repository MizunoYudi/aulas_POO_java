import java.util.Scanner;

public class MDC {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira dois numeros para calcular o MDC deles: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int resto;
		do{
			resto = x % y;
			System.out.println(x + " % " + y + " = " + resto);
			x = y;
			y = resto;
		} while (y != 0);
		System.out.println("MDC = " + x);
	}
}