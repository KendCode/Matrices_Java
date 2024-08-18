package matriz;
import java.util.Scanner;
public class E8 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Matriz LM = new Matriz();
		
		int N, i, j, aux=1;
		
		System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
		N = leer.nextInt();
		
		//CREAMOS LA MATRIZ A DE NUMEROS ENTEROS
		int [][] A = new int [N][N];
		
		for(j=0; j<N; j++)
			if(j%2==0){
				for(i=0;i<N;i++){
					A[i][j]=aux;
					aux+=2;
				}
				aux++;
			}else
				for(i=0; i<N ; i++){
					A[i][j]=aux;
					aux+=3;
				}
		LM.mostrarMatriz(A, N, N);
			

	}

}
