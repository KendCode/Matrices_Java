package matriz;
import java.util.Scanner;
public class E10 {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		Matriz LM = new Matriz();
		
		int N, i, j;
		System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
		N = leer.nextInt();
		
		//CREAMOS LA MATRIZ A DE NUMEROS ENTEROS
		int [][] A = new int [N][N];
		
		for(i=0; i<N; i++)
			for(j=0;j<N;j++)
				if(j==0 || i==N-1 || j==N-1)
					A[i][j]=1;
				else
					if(j==1||i==N-2||j==N-2)
						A[i][j]=2;
					else
						if(j==N/2)
							A[i][j]=3;
		LM.mostrarMatriz(A, N, N);
	}

}
