public class Box {
    double width;
    double length;
    double height;

    public Box(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    void setDimens (double width, double length, double height){
        this.width = width;
        this.length = length;
        this.height = height;
    }

    double volume(){
        return width * length * height;
    }
}
