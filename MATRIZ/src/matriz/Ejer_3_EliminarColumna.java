package matriz;
import java.util.Scanner;
public class Ejer_3_EliminarColumna {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		Matriz LM = new Matriz();
		
		int N, M, K, i, j;
		
		System.out.print("Ingrese la cantidad de Filas: ");
		N = leer.nextInt();
		
		System.out.print("Ingrese la cantidad de Columnas: ");
		M = leer.nextInt();
		
		//CREAMOS LA MATRIZ A DE NUMEROS ENTEROS
		int [][] A = new int [N][M];
		
		LM.llenarMatriz(A, N, M);
		LM.mostrarMatriz(A, N, M);
		
		System.out.print("Ingrese la columna a Eliminar: ");
		K = leer.nextInt();
		
		if(K < M)
		{
			for(i = 0; i < N; i++)
				for(j=K; j < (M-1); j++)
					A[i][j]= A[i][j+1];
			
			LM.mostrarMatriz(A, N, M-1);
		}
		else
			System.out.println("\n ERROR");

	}

}
