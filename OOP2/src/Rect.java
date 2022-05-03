//Задание сделать класс прямоугольник, сделать методы, которые
//вычисляют его периметр и площадь, а так же принимают
//параметры высоты и ширины
public class Rect {
    double width;
    double length;

    void parameters(double width, double length) {
        this.length = length;
        this.width = width;
    }

    double perimetr() {
        return 2 * (width + length);
    }

    double ploshad() {
        return length * width;
    }
}
