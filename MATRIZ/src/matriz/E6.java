package matriz;
import java.util.Scanner;
public class E6 {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		Matriz LM = new Matriz();
		
		int N, i, j;
		
		System.out.print("Ingrese el tama�o de la matriz cuadrada: ");
		N = leer.nextInt();
		
		//CREAMOS LA MATRIZ A DE NUMEROS ENTEROS
		int [][] A = new int [N][N];
		
		if(N%2 == 0)
			System.out.print("Inserte un numero impar");
		else{
			for(i=0; i<N; i++){
				for(j=0; j<N; j++){
					if(i<=N/2){
						if((j>=N/2-i)&&(j<=N/2+i))
							A[i][j]=1;
					}
					else{
						if((j>=i-N/2)&&(j<=N-1-(i-N/2)))
							A[i][j]=1;
					}
				}
			}
		LM.mostrarMatriz(A, N, N);
		}
	}

}
