import java.util.Scanner;

public class matrizes {
	int somaMatrizes(int a[][]){
		int i, j, soma = 0;
		for(i = 0; i < 3; i++){
			for(j = 0; i < 3; i++){
				soma += a[i][j];
			}
		}
		return soma;
	}
	
	public int[] diagonais(int m[][]){
		int i, j;
		int diagonal = 0;
		int[] d = new int[2];
		for(i = 0; i < 3; i++){
			diagonal += m[i][i];
		}
		d[0] = diagonal;
		for(i = 2; i >= 0; i--){
			for(j = 0; j < 3; j++){
				diagonal += m[j][i];
			}
		}
		d[1] = diagonal;
		return d;
		
	}
	
	public int[][] transportarMatrizes(int m[][]){
		int i, j;
		int[] mt = new int[3][3];
		
		for(i = 0; i < 3; i++){
			for(j = 0; j < 3; j++){
				mt[j][i] = m[i][j]
			}
		}
		return mt;
	}
	
	public void printMatriz(int m[][]){
		int i, j;
		for(i = 0; i < 3; i++){
			for(j = 0; j < 3; j++){
				System.out.println(m[i][j] + " ");
			}
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int l, c;
		int a[][] = new int[3][3];
		
		for(l = 0; l < 3; l++){
			System.out.println("Insira os numeros da " + (l + 1) " linha");
			for(c = 0; c < 3; c++){
				a[l][c] = sc.nextInt();
			}
		}
		
		System.out.println("Soma dos elementos: " + somaMatrizes(a));
		int[] diagonais = diagonais(a);
		System.out.println("Diagonal principal: " + diagonais[0]);
		System.out.println("Diagonal secundaria: " + diagonais[1]);
		
	}
}