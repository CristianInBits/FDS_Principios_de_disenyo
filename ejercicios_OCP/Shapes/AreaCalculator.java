package ejercicios_OCP.Shapes;

public class AreaCalculator {
    public double area(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.area();
        }
        return total;
    }
}
