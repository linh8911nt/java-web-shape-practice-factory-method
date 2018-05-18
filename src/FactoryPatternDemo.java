public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("square");
        shape.draw();

        Shape shape2 = shapeFactory.getShape("circle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("rectangle");
        shape3.draw();
    }
}
