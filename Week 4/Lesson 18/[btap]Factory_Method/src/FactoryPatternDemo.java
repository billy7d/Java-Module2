public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape a = shapeFactory.getShape("Circle");
        a.draw();


    }
}
