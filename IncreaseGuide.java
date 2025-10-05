public class IncreaseGuide {
    public static int increaseGuide(int circleSize) {
        for (int i = 1; i < 10; i++) {
            int currentRow = circleSize * i;
            int increaseCount = i - 1;
            System.out.println("Row " + i + ": " + "(2dc, dc " + increaseCount + ") x " + circleSize + " (" + currentRow + ")");

            // Below is the original counter's printout
            // System.out.println("Row " + i + ": " + currentRow + " stitches");

        } return circleSize;
    }
}
