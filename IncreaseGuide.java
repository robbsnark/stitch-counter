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
        // Suggested starting stitches for sc: 6-8
        // Maybe an idea to have the user pick 6 or 8? 
        // But honestly the difference is so small I might skip it

        // This way of printing the first row is pretty manual/hardcodey:

        int scSmall = 6;
        int scLarge = 8;

        String startingRow = "Row 1: " + scSmall + "sc in MR (" + scSmall + ")";
        System.out.println(startingRow);

        // I could've done this with Row 2 as well, writing something like this right here:
        // String secondRow = "Row 2: (2dc) x " + scSmall + "(" + scSmall * 2 + ")";
        // System.out.println(secondRow);

        // But I chose to bake that in with the rest of the pattern,
        // using an if statement to ultimately control only that row
        
        for (int i = 2; i < 11; i++) {
            int startingStitch = i * 6;
            int increaseCount = i - 1;
            String printResult = "Row " + i + ": " + "(2dc, dc " + increaseCount + ") x " + 6 + " (" + startingStitch + ")";

            if (increaseCount > 1) {
               System.out.println(printResult);
            } else {
                System.out.println("Row " + i + ": " + "(2dc) x " + 6 + " (" + startingStitch + ")");
            }
        }
    }

    public static void halfDoubleCrochet(String stitchPick) {
        // Suggested starting stitches for hdc: 8-10
        System.out.println("hdc");
    }

    public static void doubleCrochet(String stitchPick) {
        // Suggested starting stitches for dc: 10-12
        System.out.println("dc");
    }


}
