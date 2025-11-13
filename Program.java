import java.util.Scanner;
public class Program {
    
    public Program() {}
    public void run() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("What's your preferred stitch to use? \n" +
            "SC - Single crochet \n" + 
            "HDC - Half double crochet \n" +
            "DC - Double crochet");
            String stitchPick = scan.nextLine();
            
            switch (stitchPick.toUpperCase()) {
                case "SC":
                    IncreaseGuide.singleCrochet(stitchPick);
                    break;
                case "HDC":
                    IncreaseGuide.halfDoubleCrochet(stitchPick);
                    break;
                case "DC":
                    IncreaseGuide.doubleCrochet(stitchPick);
                    break;
                default:
                    System.out.println("Sorry, I didn't catch that.");
                    continue;
            } 
            break;
        }


        // OLD CODE

        // If-else version of stitchPick switchcase:

        // if (stitchPick.equals("SC")){
        //     IncreaseGuide.singleCrochet(stitchPick);
        // } else if (stitchPick.equals("HDC")) {
        //     IncreaseGuide.halfDoubleCrochet(stitchPick);
        // } else if (stitchPick.equals("DC")) {
        //     IncreaseGuide.doubleCrochet(stitchPick);
        // } else {
        //     System.out.println("Sorry I didn't catch that.");
        //     continue;
        // } break;


        // int circleSize = scan.nextInt();

        // while (circleSize < 6) {
        //     System.out.println("That's too small for this size yarn.");
        //     System.out.println("How wide would you like your circle to be?");
        //     circleSize = scan.nextInt();
        // } 
        // while (circleSize % 2 != 0) {
        //     System.out.println("Please choose an even number.");
        //     System.out.println("How wide would you like your circle to be?");
        //     circleSize = scan.nextInt();   
        // }

        // int increaseCounter = IncreaseGuide.increaseGuide(circleSize);

        // Below is the original counter that only showed how many stitches needed per row
        // (and not which specific stitches to increase)

        /* 
        for (int i = 1; i < 10; i++) {
            int currentRow = circleSize * i;
            System.out.println("Row " + i + ": " + currentRow + " stitches");
        } 
        */

    }
}

