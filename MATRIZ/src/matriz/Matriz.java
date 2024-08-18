package matriz;

public class Matriz {
	
	//LLENAR MATRIZ CON NUMEROS ALEATORIOS
	public void llenarMatriz(int [][] A , int F, int C)
	{
		for(int i = 0; i < F; i++)
			for(int j = 0; j < C; j++)
				A[i][j] = (int)(Math.random()*100);
	}
	
	//MOSTRAR MATRIZ
	public void mostrarMatriz(int[][]A, int F, int C)
	{
		for(int i = 0; i < F; i++ )
		{
			for(int j=0; j < C; j++)
				System.out.print(A[i][j]+"\t");
			
			System.out.print("\n");
		}
	}
	
	
}
