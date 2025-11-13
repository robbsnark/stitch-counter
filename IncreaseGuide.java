public class IncreaseGuide {
    public static int increaseGuide(int circleSize) {

        // BREAKDOWN OF VARIABLES:
        // currentRow - Specifies rows of crochet in ascending order
        // circleSize - The number the user put in the terminal
        // increaseCount - Determines how many dc stitches needed each row


        for (int i = 1; i < 11; i++) {
            int currentRow = circleSize * i;
            int increaseCount = i - 1;
            String printResult = "Row " + i + ": " + "(2dc, dc " + increaseCount + ") x " + circleSize + " (" + currentRow + ")";
            if (increaseCount > 0) {
               System.out.println(printResult);
            } else {
                System.out.println("Row " + i + ": " + "(2dc) x " + circleSize + " (" + currentRow + ")");
            }

            // Below is the original counter's printout
            // System.out.println("Row " + i + ": " + currentRow + " stitches");

        } return circleSize;
    }
}
