public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(),
                new Rectangle(),
                new Shape(5)
        };

        for (Shape shape : shapes ){
            System.out.printf("Shape (%s) has %d sides \n", shape.getClass().getSimpleName(), shape.getSides());
        }
    }
}