import java.util.Scanner;

public class classificarTriangulo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.err.println("Digite os lados do triangulo: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a+b>c && a+c>b && b+c>a){
			if(a == b && b == c){
				System.out.println("O triangulo " + a + " " + b + " " + c + " eh equilatero");
			} else {
				if(a == b || a == c || b == c){
					System.out.println("O triangulo " + a + " " + b + " " + c + " eh isoceles");
				} else {
					System.out.println("O triangulo " + a + " " + b + " " + c + " eh escaleno");
				}
			}
		} else {
			System.out.println("Os lados inseridos nao representam um triangulo");
		}
	}
}