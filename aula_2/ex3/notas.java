public class notas {
	public static void main(String[] args){
		if(args.length < 0) {
			System.out.println("Sem nota para classificar");
		} else {
			int n = Integer.parseInt(args[0]);
			char classificacao = 0;
			if(n > 100 || n < 0) {
				System.out.println("Nota invalida");
			} else {
				if(n >= 90 && !(n > 100)) {
					classificacao = 'a';
				} else {
					if(n >= 80) {
						classificacao = 'b';
					} else {
						if(n >=70) {
							classificacao = 'c';
						} else {
							if(n >= 60) {
							classificacao = 'd';
							} else {
								classificacao = 'f';
							}
						}
					}
				}
				System.out.println("Classificacao: " + classificacao + ", nota: " + n);
			}
		}
	}
}