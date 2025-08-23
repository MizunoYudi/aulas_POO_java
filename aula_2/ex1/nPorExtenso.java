public class nPorExtenso {
	public static void main(String[] args){
		if(args.length < 0){
			System.out.println("Sem numero para exibir por extenso");
		} else {
			int n = Integer.parseInt(args[0]);
			if(n < 4) {
				if(n < 2){
					if(n == 1){
						System.out.println("Um");
					} else {
						System.out.println("Zero");
					}
				} else {
					if(n == 2){
						System.out.println("Dois");
					} else {
						System.out.println("Tres");
					}
				}
			} else {
				if(n == 4){
					System.out.println("Quatro");	
				} else {
					if(n < 7) {
						if(n == 5){
							System.out.println("Cinco");
						} else {
							System.out.println("Seis");
						}
					} else {
						if(n == 7){
							System.out.println("Sete");
						} else {
							if(n == 8){
								System.out.println("Oito");
							} else {
								System.out.println("Nove");
							}
						}
					}
				}
			}
		}
	}
}