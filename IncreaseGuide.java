import java.util.Scanner;

public class IncreaseGuide {
    static Scanner scan = new Scanner(System.in);

    // CIRCLE CALCULATORS:

    public static void singleCrochet(String stitchPick) {
        int scSmall = 6;
        String startingRow = "Row 1: " + scSmall + "sc in MR (" + scSmall + ")";
        System.out.println(startingRow);
        
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

    public static void manualStitch(String stitchPick) {
        System.out.println("What's your preferred number of starting stitches?");
        int manualStitches = scan.nextInt();
        String startingRow = "Row 1: " + manualStitches + "st in MR (" + manualStitches + ")";
        System.out.println(startingRow);
        
        for (int i = 2; i < 11; i++) {
            int startingStitch = i * manualStitches;
            int increaseCount = i - 1;
            String printResult = "Row " + i + ": " + "(2st, st " + increaseCount + ") x " + manualStitches + " (" + startingStitch + ")";

            if (increaseCount >= 1) {
               System.out.println(printResult);
            } else {
                System.out.println("Row " + i + ": " + "(2st) x " + manualStitches + " (" + startingStitch + ")");
            }
        }
    }

    // END OF CIRCLE CALCULATORS
}
