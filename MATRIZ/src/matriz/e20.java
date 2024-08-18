package matriz;
import java.util.Scanner;
public class e20 {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		Matriz LM = new Matriz();
		
		int N, a=1, b=4, i, j;
		
		System.out.print("Ingrese el tamaño de la Matriz");
		N = leer.nextInt();
		
		//CREAMOS LA MATRIZ A DE NUMEROS ENTEROS
		int [][] A = new int [N][N];
		
		for(i=0; i<N; i++)
			if(i % 2 == 0){
				for(j=0; j<N; j++){
					A[i][j]=a;
					a+=2;
				}
			}
			else{
				for(j=0; j<N; j++){
					A[i][j]=b;
					if(j%2==0)
						b-=2;
					else
						b += 6;
				}
			}
		LM.mostrarMatriz(A, N, N);
	}

}
