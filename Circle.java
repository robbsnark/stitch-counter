import java.util.Scanner;

public class Circle extends Shape {
    Scanner scan = new Scanner(System.in);

    public Circle(String stitchType) {
        super(stitchType);
    }

    @Override
    public void generatePattern() {
        while (true) {
            System.out.println("Please select your preferred stitch, or else input number of starting stitches manually.\n" +
            "SC - Single crochet \n" + 
            "HDC - Half double crochet \n" + 
            "DC - Double crochet \n" +
            "X - Input starting stitch");
            String stitchType = scan.nextLine();
            switch (stitchType.toUpperCase()) {
                case "SC":
                    IncreaseGuide.singleCrochet(stitchType);
                    break;
                case "HDC":
                    IncreaseGuide.halfDoubleCrochet(stitchType);
                    break;
                case "DC":
                    IncreaseGuide.doubleCrochet(stitchType);
                    break;
                case "X":
                    IncreaseGuide.manualStitch(stitchType);
                    break;
                default:
                    System.out.println("Sorry, I didn't catch that.");
                    continue;
            } break;
        }
    }
}
