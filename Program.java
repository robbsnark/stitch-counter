import java.util.Scanner;
public class Program {
    
    public Program() {}
    public void run() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Which shape would you like to crochet? \n" +
            "C - Circle \n" + 
            "S - Square");
            String shapePick = scan.nextLine();

            Shape shape;
            
            switch (shapePick.toUpperCase()) {
                case "C":
                    shape = new Circle(shapePick);
                    break;
                case "S":
                    shape = new Square(shapePick);
                    break;
                case "F":
                    shape = new Flower(shapePick);
                    break;
                default:
                    System.out.println("Sorry, I didn't catch that.");
                    continue;
            }

            shape.generatePattern();
            break;
        }
    }
}

