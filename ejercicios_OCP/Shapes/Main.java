package ejercicios_OCP.Shapes;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Rectangle(5, 3),
                new Circle(4),
                new Triangle(6, 2)
        };

        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.area(shapes);

        System.out.println("Área total: " + totalArea);
    }
}