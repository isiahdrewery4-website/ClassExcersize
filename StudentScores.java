public class StudentScores {
    public static void main(String[] args) {

        int[][] scores = {
            {85, 90, 78},
            {70, 88, 92},
            {95, 89, 84},
            {65, 75, 80}
        };

        System.out.println("Student Scores:");

        for (int row = 0; row < scores.length; row++) {
            for (int col = 0; col < scores[row].length; col++) {
                System.out.printf("%5d", scores[row][col]);
            }
            System.out.println();
        }

        for (int row = 0; row < scores.length; row++) {

            int total = 0;

            for (int col = 0; col < scores[row].length; col++) {
                total = total + scores[row][col];
            }

            double average = (double) total / scores[row].length;

            System.out.println("Student " + (row + 1) + " total: " + total);
            System.out.println("Student " + (row + 1) + " average: " + average);
        }

        int highest = scores[0][0];

        for (int row = 0; row < scores.length; row++) {
            for (int col = 0; col < scores[row].length; col++) {

                if (scores[row][col] > highest) {
                    highest = scores[row][col];
                }
            }
        }

        System.out.println("Highest score: " + highest);
    }
}
