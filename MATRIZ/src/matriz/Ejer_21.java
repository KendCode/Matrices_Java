package matriz;
import java.util.Scanner;
public class Ejer_21 {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		Matriz LM = new Matriz();
		
		int N, i, j, X=1;
		System.out.print("Ingrese el tama�o de la matriz: ");
		N = leer.nextInt();
		int [][] A = new int [N][N];
		
		
		//Llenar la diagonal principal
		for(i=0; i<N; i++){
			A[i][i] = X;
			X++;
			
		}
		for(i=0; i<N; i++){
			for(j=0; j<N; j++){
				if(i != j){
					A[i][j]= X;
					X++;
				}
			}
		}
		LM.mostrarMatriz(A, N, N);

	}

}
