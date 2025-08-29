import java.util.Scanner;

public class testeScanner {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.err.println("Digite alguma coisa");
		while(sc.hasNext()){
			String value = sc.next();
			if(!value.equals("Mexido")){
				System.out.println(value);
			} else{
				break;
			}
		}
		sc.close();
	}
}