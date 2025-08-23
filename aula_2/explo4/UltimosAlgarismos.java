public class UltimosAlgarismos {
	public static void main(String[] args){
		long numero = 63274682736234L;
		int x = 0, y = 0;
		
		x = (int)(numero % 10);
		y = (int)(numero % 1000);
		
		System.out.println("O ultimo numero eh: " + x);
		System.out.println("Os tres ultimos numeros sao: " + y);
	}
}