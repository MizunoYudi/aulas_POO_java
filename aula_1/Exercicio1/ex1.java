public class ex1 {
	public static void main(String[] args){
		if(args[0].equals("prod")){
			System.out.println("Ambiente PRODUCAO ativado!!!");
		} else if(args[0].equals("dev")){
			System.out.println("Ambiente DESENVOLVIMENTO ativado!!!");
		} else {
			System.out.println("Ambiente invalido!!!");
		}
	}
}