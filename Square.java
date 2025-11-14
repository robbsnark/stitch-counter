import java.util.Scanner;

public class Square extends Shape {
    Scanner scan = new Scanner(System.in);

    public Square(String stitchType) {
        super(stitchType);
    }

    @Override
    public void generatePattern() {
        System.out.println("How tight would you like your square to be? \n" +
        "S - Solid (no holes) \n" +
        "L - Looser (regular granny square)");
        String squarePick = scan.nextLine();
        if (squarePick.equals("S")){
            System.out.println("Solid granny square (Small): \n" + 
            "Row 1: MR; ch 3, (dc 3, tr) x 3, dc 3, sl st \n" +
            "Row 2: ch 3, dc 2, 3dc, (dc 2, tr, dc 2, 3dc) x 3, sl st");
        } else if (squarePick.equals("L")){
            System.out.println("Regular granny square: \n" + 
            "Row 1: MR; ch 3, 2dc, (ch 2, 3dc) x 2, ch 2, sl st \n" + 
            "Row 2: ch 3, 2dc, ch 2, 3dc, (ch 1, (3dc, ch 2, 3 dc)) x 3, ch 1, sl st \n" +
            "Row 3: ch 3, 2dc, ch 2, 3 dc, (ch 1, 3dc, ch 1, 3dc, ch 2, 3dc) x 3, ch 1, sl st");
        }
    }
}
