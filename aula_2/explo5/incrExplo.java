public class incrExplo {
	public static void main ( String[] args ) {
		int a, b, c;
		b = c = 10;
		a = b++ + b++;
		System.out.println("valor de a = " + a ); // 20 - 21
		System.out.println("valor de b = " + b ); // 12
		a = ++c + ++c;
		System.out.println("valor de a = " + a ); // 23
		System.out.println("valor de c = " + c ); // 12
		a = 10;
		b = 5;
		boolean x = a > b || b++ > 3; // true // tem que ser testado para incrementar - o || para de executar assim que encontrar algo verdadeiro, por isso que o resto ta "errado"
		System.out.println("valor de x = " + x ); // true
		System.out.println("valor de b = " + b ); // 6
		a = b++ + b;
		System.out.println("valor de a = " + a ); // 13
		System.out.println("valor de b = " + b ); // 7
	}
}