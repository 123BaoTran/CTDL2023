package Lab04.task1;

/*
 * Implement bubble sort algorithm to sort an array of integers
 *  (using iterative or recursive approach).

 */
public class Task1_2 {
	// sort by descending order
	public static void bubbleSort(int[] array) { 
		//(array.length -1) iterarion
		for(int k=0; k<array.length-1; k++) { // for ngoai chay bao nhieu lan
			//lasst k items are already sorted, so inner so loop can
			//avoid looking at the last k items
			boolean stop = true;
			for(int i=0; i<array.length -1 -k; i++) {
				if(array[i] > array[i+1]) { // so sanh 2 phan tu lien ke nhau
					stop = false;
					swap(array,i,j);
				}
			}
			//The algorithm can be stopped if the inner loop
			// didn't do any swap
		}
	}

}

