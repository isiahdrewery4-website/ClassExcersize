public class TwoDArray {
    public static void main(String[] args) {

        // part a
        int[][] board = {
            {10, 22, 35},
            {37, 51, 63},
            {70, 86, 92}
        };

        // Display the array
        System.out.println("Board:");

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.printf("%5d", board[row][col]);
            }
            System.out.println();
        }

        System.out.println("Number of rows: " + board.length);
        System.out.println("Number of columns: " + board[0].length);

        System.out.println("Row 2, column 3: " + board[1][2]);


        // part b
        int[][] matrix = new int[23][15];

        // Assign 10 to every element
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = 10;
            }
        }

        // Change all elements in the first row to 5
        for (int col = 0; col < matrix[0].length; col++) {
            matrix[0][col] = 5;
        }

        // Display the matrix
        System.out.println("\nMatrix:");

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%5d", matrix[row][col]);
            }
            System.out.println();
        }


        // part c
        int sum = 0;
        int evenCount = 0;

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {

                sum = sum + board[row][col];

                if (board[row][col] % 2 == 0) {
                    evenCount++;
                }
            }
        }

        double average = (double) sum /
                        (board.length * board[0].length);

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Number of even values: " + evenCount);
    }
}
