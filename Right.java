public class Right {
    public static void main(String[] args) {

        int rows = 5;
        int space = 0;

        // First row
        System.out.println("*");

        // Middle rows (2 to rows-1)
        for (int row = 1; row < rows - 1; row++) {

            // First star
            System.out.print("*");

            // Spaces inside
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            space++;

            // Last star
            System.out.println("*");
        }

        // Last row (5 stars)
        for (int col = 0; col < rows; col++) {
            System.out.print("*");
        }
    }
}
