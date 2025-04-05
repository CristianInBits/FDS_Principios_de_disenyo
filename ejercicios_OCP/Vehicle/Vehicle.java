package ejercicios_OCP.vehicle;

public class Vehicle implements Imprimible {
    public int getWheelCount() {
        return 4;
    }

    public int getMaxSpeed() {
        return 200;
    }

    @Override
    public String toString() {
        return "wheelCount=" + getWheelCount() + ", maxSpeed=" + getMaxSpeed();
    }
}