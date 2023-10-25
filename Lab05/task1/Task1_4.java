package Lab05.task1;

public class Task1_4 {
    // tranpose a matrix
public static int[][] transpose(int[][] a) { 
    int rows = a.length;
    int columns = a[0].length;

    int[][] result = new int[columns][rows];

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            result[j][i] = a[i][j];
        }
    }

    return result;
}
