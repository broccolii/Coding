public class Main {

    public static void main(String[] args) {
        ShapeFactory shapreFactory = new ShapeFactory();

        Shape circle = shapreFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapreFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapreFactory.getShape("SQUARE");
        square.draw();


        // 使用反射机制
        Rectangle rect = (Rectangle) ShapeFactory.getClass(Rectangle.class);
        rect.draw();
    }
}
