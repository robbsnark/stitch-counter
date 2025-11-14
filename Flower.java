public class Flower extends Shape {
    public Flower(String stitchType) {
        super(stitchType);
    }

    @Override
    public void generatePattern() {
        System.out.println("This is where a (for example) flower pattern would be - or any other pattern, easily added by the developer.");
    }
}
