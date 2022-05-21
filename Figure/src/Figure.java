public abstract class Figure {
    private double a;
    private  double b;

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double area();

    public final double getA() { //запрещаем переопределять метод, добавляем "final"
        return a;
    }

    public final double getB() {
        return b;
    }
}
