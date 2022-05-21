public class Rect extends Figure {
    public Rect(double a, double b) { //создаем конструктор дочернего класса
        super(a,b);
    }

    public Rect (double size){
        super(size,size);
    }

    @Override
    public double area() {
        return getA() * getB();
    }
}
