public class Flower extends Shape {
    public Flower(String stitchType) {
        super(stitchType);
    }

    @Override
    public void generatePattern() {
        System.out.println("Flower pattern");
    }
}
