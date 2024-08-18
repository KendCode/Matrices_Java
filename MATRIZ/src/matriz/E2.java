package matriz;
import java.util.Scanner;

public class E2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Matriz LM = new Matriz();
        
        int N, i, j;
		System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
		N = leer.nextInt();
		
		//CREAMOS LA MATRIZ A DE NUMEROS ENTEROS
		int [][] A = new int [N][N];
		
		for(i=0; i<N; i++)
			for(j=0; j<N; j++)
				if(i==j||i+j==N-1)
					A[i][j]=1;
				else
					if(i<j && i+j<N-1)
						A[i][j]=2;
					else
						if(i>j && i+j>N-1)
							A[i][j]=4;
						else 
							if(i>j)
								A[i][j]=5;
							else
								A[i][j]=3;
		LM.mostrarMatriz(A, N, N);
    }
}

