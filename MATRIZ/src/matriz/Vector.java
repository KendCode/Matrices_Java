package matriz;
public class Vector {
	
	public void mostrarVector(int[] V, int N){
		for(int i=0; i<N; i++)
			System.out.print(V[i] + "\t");
	}	
	public void burbuja(int []V,int N){
		int aux;
		for(int i=0; i<N-1; i++){
			for(int j=i+1; j<N; j++){
				if(V[j] < V[i]){
					aux = V[j];
					V[j]= V[i];
					V[i] = aux;
				}
			}
		}
	}
}