import java.util.Scanner;

public class parImpar {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.err.print("Digite o numero: ");
		int n = sc.nextInt();
		if(n % 2 != 0){
			System.out.println("O numero " + n + " eh impar");
		} else {
			System.out.println("O numero " + n + " eh par");
		}
	}
}