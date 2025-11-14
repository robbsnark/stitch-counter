public abstract class Shape {
    public String stitchType;

    public Shape(String stitchType) {
        this.stitchType = stitchType;
    }
    public abstract void generatePattern();
}
