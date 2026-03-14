public class BinaryTrianglePattern {
    public static void main(String[] args) {
        int n = 6; // Number of rows for the pattern

        // Loop through each row
        for (int i = 1; i <= n; i++) {

            // Loop through each column in the row
            for (int j = 1; j <= i; j++) {

                // Print 1 if the column number is odd, otherwise print 0
                if (j % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
