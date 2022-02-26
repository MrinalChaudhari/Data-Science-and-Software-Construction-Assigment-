package Homework10;

    /**
     * Utility class that can be used to move or print shapes.
     */
    public class ShapeMover {
        /**
         * Prints a shape, moves it to a new position, and then prints it again.
         *
         * @param figure The shape to move and print.
         * @param position The new position to which the shape should me moved.
         */
        public static void moveShape(Figure figure, Position position) {
            System.out.println("BEFORE MOVING");
            printShape(figure);
            figure.move(position);
            System.out.println("AFTER MOVING");
            printShape(figure);
        }
        public static void scaleShape(Figure figure, double factor) {
            System.out.println("Before Scaling: ");
            printShape(figure);
            figure.scale(factor);
            System.out.println("After Scaling: ");
            printShape(figure);
        }
        /**
         * Prints the details about a shape including the class name, position,
         * area, perimeter, fill color, and outline.
         *
         * @param figure The shape to print.
         */
        public static void printShape(Figure figure) {
            System.out.println("Shape: " + figure.getClass());
            System.out.println("  position: " + figure.getPos());
            System.out.println("  area: " + figure.area());
            System.out.println("  perimeter: " + figure.perimeter());
            System.out.println("  fill color: " + figure.getFillColor());
            System.out.println("  outline: " + figure.getLineColor() + "\n");
        }

        /**
         * Tests the move method with various different shapes.
         *
         * @param args Command line arguments. Not used.
         */
        public static void main(String[] args) {            //main class
            //Shape shape = new Shape(new Position(100, 100), "Red", "Blue");
            //moveShape(shape, new Position(200, 200));

            Rectangle rectangle = new Rectangle(new Position(50, 50), "Brown","Yellow", 100, 50);
            moveShape(rectangle, new Position(25, 75));

            Circle circle = new Circle(new Position(0, 10), "Transparent","Black", 150);
            moveShape(circle, new Position(10, 0));

            Triangle triangle = new Triangle(new Position(-30, -50), "Blue", "Orange", 125);
            moveShape(triangle, new Position(-100, -200));

            scaleShape(triangle,40);
            scaleShape(circle, 20);
            scaleShape(rectangle, 10);
            printShape(triangle);
            printShape(circle);
            printShape(rectangle);
        }//main class ends
    }
