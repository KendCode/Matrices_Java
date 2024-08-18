package matriz;
import java.util.Scanner;
public class Ejer_13 {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		Matriz LM = new Matriz();
		
		int  N, X, j, i, aux;
		
		System.out.print("Ingrese la dimension del Matriz Cuadrada: ");
		N = leer.nextInt();
		
		int [][] A = new int  [N][N];
		
		X = 1;
		j = N - 1;
		
		for(i = 0; i <N; i++)
		{
			A[i][j]=X;
			j--;
		}
		X = 2;
		
		for(aux = 1; aux < N; aux++)
		{
			j = N - 1;
			for(i = aux; i < N; i++)
			{
				A[i][j] = X;
				j--;
			}
			X += 2;
		}
		X = 3;
		for(aux = N-2; aux >= 0; aux--)
		{
			i=0;
			for(j = aux; j >= 0; j--)
			{
				A[i][j] = X;
				i++;
			}
			X += 2;
		}
		LM.mostrarMatriz(A, N, N);
	}

}
