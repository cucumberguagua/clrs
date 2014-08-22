package chap2;

public class InsertionSort {
	public void insertionSort(int[] A){
		for(int j = 1; j < A.length; j++){
			int key = A[j];
			int i = j-1;
			while(i>=0 && A[i] > key){
				A[i+1] = A[i];
				i--;
			}
			A[i+1] = key;
		}	
	}
	
	public static void main(String[] args){
		InsertionSort is = new InsertionSort();
		int[] A = {2, 5, 1, 2, 6, 3, 9, 12};
		is.insertionSort(A);
		for(int i = 0; i < A.length; i++){
			System.out.println(A[i]);
		}
	}
}
