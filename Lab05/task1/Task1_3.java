package Lab05.task1;

public class Task1_3 {
    public static int[][] multiply(int[][] a, int[][] b){
    int aRows = a.length;
    int aColumns = a[0].length;
    int bRows = b.length;
    int bColumns = b[0].length;

    if (aColumns != bRows) {
        throw new IllegalArgumentException("The number of columns in the first matrix must be equal to the number of rows in the second matrix for multiplication.");
    }

    int[][] result = new int[aRows][bColumns];

    for (int i = 0; i < aRows; i++) {
        for (int j = 0; j < bColumns; j++) {
            for (int k = 0; k < aColumns; k++) {
                result[i][j] += a[i][k] * b[k][j];
            }
        }
    }

    return result;
}}
