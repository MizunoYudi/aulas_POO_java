public class verificarMaiuscula {
	public static void main(String[] args) {
		if(args.length < 0) {
			System.out.println("Sem letra para comparar");
		} else {
			String maiuscula = args[0].toUpperCase();
			if(maiuscula == args[0]) {
				System.out.println("A letra eh maiuscula, convertendo: " + args[0].toLowerCase());
			} else {
				System.out.println("A letra eh minuscula, convertendo: " + args[0].toUpperCase());
			}
		}
	}
}