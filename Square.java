public class Square extends Shape {
    public Square(String stitchType) {
        super(stitchType);
    }

    @Override
    public void generatePattern() {
        System.out.println("Square pattern");
    }
}
