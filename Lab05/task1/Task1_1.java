package Lab05.task1;

public class Task1_1 {
   // Implement the following method for adding 2 matrices.
// add 2 matrices
public static int[][] add(int[][] a, int[][] b) { 
    int rows = a.length;
    int columns = a[0].length;

    int[][] result = new int[rows][columns];

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            result[i][j] = a[i][j] + b[i][j];
        }
    }

    return result;

}
