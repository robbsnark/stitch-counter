public class IncreaseGuide {
    public static void increaseGuide() {

        // BREAKDOWN OF VARIABLES:
        // stitchPick - The type of preferred stitch the user put in the terminal
        // currentRow - Specifies rows of crochet in ascending order
        // increaseCount - Determines how many dc stitches are needed for each row
        /*
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

        } return circleSize; */
    }

    public static void singleCrochet(String stitchPick) {
        // This way of printing the first row is pretty manual/hardcodey:

        int scSmall = 6;
        String startingRow = "Row 1: " + scSmall + "sc in MR (" + scSmall + ")";
        System.out.println(startingRow);

        // I could've done this with Row 2 as well, writing something like this right here:
        // String secondRow = "Row 2: (2dc) x " + scSmall + "(" + scSmall * 2 + ")";
        // System.out.println(secondRow);
        // But I chose to bake that in with the rest of the pattern,
        // using an if statement to ultimately control only that row
        
        for (int i = 2; i < 11; i++) {
            int startingStitch = i * scSmall;
            int increaseCount = i - 1;
            String printResult = "Row " + i + ": " + "(2sc, sc " + increaseCount + ") x " + scSmall + " (" + startingStitch + ")";

            if (increaseCount >= 1) {
               System.out.println(printResult);
            } else {
                System.out.println("Row " + i + ": " + "(2sc) x " + scSmall + " (" + startingStitch + ")");
            }
        }
    }

    public static void halfDoubleCrochet(String stitchPick) {
        int hdcSmall = 8;
        int hdcLarge = 10;
        String startingRow = "Row 1: " + hdcSmall + "hdc in MR (" + hdcSmall + ")";
        System.out.println(startingRow);
        
        for (int i = 2; i < 11; i++) {
            int startingStitch = i * hdcSmall;
            int increaseCount = i - 1;
            String printResult = "Row " + i + ": " + "(2hdc, hdc " + increaseCount + ") x " + hdcSmall + " (" + startingStitch + ")";

            if (increaseCount >= 1) {
               System.out.println(printResult);
            } else {
                System.out.println("Row " + i + ": " + "(2hdc) x " + hdcSmall + " (" + startingStitch + ")");
            }
        }
    }

    public static void doubleCrochet(String stitchPick) {
        int dcSmall = 10;
        int dcLarge = 12;
        String startingRow = "Row 1: " + dcSmall + "dc in MR (" + dcSmall + ")";
        System.out.println(startingRow);
        
        for (int i = 2; i < 11; i++) {
            int startingStitch = i * dcSmall;
            int increaseCount = i - 1;
            String printResult = "Row " + i + ": " + "(2dc, dc " + increaseCount + ") x " + dcSmall + " (" + startingStitch + ")";

            if (increaseCount >= 1) {
               System.out.println(printResult);
            } else {
                System.out.println("Row " + i + ": " + "(2dc) x " + dcSmall + " (" + startingStitch + ")");
            }
        }
    }
}
