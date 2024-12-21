package arraysInJava;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] marks = new int[4][3]; // rows: 4, columns: 3

        // Initialize the array with values
        marks[0][0] = 12;
        marks[0][1] = 98;
        marks[0][2] = 34;

        marks[1][0] = 15;
        marks[1][1] = 96;
        marks[1][2] = 36;

        marks[2][0] = 18;
        marks[2][1] = 90;
        marks[2][2] = 32;

        marks[3][0] = 12;
        marks[3][1] = 89;
        marks[3][2] = 43;

        // Using for-each loop to iterate through a multidimensional array
        for (int[] row : marks) { // Each `row` is a one-dimensional array
            for (int value : row) { // Iterate through each value in the row
                System.out.print(value + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
