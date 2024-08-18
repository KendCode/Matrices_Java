package matriz;
import java.util.Scanner;
public class E14 {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		Matriz LM = new Matriz();
		
		int N, i=0, j, x=2, K;
		System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
		N = leer.nextInt();
		//CREAMOS LA MATRIZ A DE NUMEROS ENTEROS
		int [][] A = new int [N][N];
		for(j=0;j<N;j++){
			A[i][j]=x;
			i++;
			x+=2;
		}
		for(K=1; K<N; K++){
			i=0;
			for(j=K;j<N;j++){
				A[i][j]=x;
				i++;
				x+=2;
			}
		}
		for(K=1;K<N;K++){
			j=0;
			for(i=K;i<N;i++){
				A[i][j]=x;
				j++;
				x+=2;
			}
		}
		LM.mostrarMatriz(A, N, N);

	}

}
