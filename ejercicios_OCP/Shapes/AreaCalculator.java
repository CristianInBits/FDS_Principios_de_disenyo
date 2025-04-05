package ejercicios_OCP.shapes;

public class AreaCalculator {
    public double area(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.area();
        }
        return total;
    }
}
