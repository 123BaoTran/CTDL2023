package Lab04.task1;

public class Task1_3 {
    // sort by descending order
	public static void insertionSort(int[] array) {
		int n= array.length;
		for (int k=1; k<n; k++) {
			int cur = array[k];
			int j=k;
			while(j>0 && array[j-1]>cur) {
				array[j]= array[j-1];
				j--;
			}
			array[j]=cur;
			
		}
	 }
}
