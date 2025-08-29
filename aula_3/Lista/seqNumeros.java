import java.util.Scanner;

public class seqNumeros{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n;
		do{
			System.err.print("Digite um numero: ");
			n = sc.nextInt();
			System.out.println(n);
		} while(n != 0);
	}
}