package homework;

public class Box {
    private double width;
    private double height;
    private double length;

    public Box (double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public Box (double size) {
        width = size;
        height = size;
        length = size;
    }
    public Box(){
        width = 0;
        height = 0;
        length = 0;
    }

    public Box(Box box){
        this.width = box.width;
        this.height = box.height;
        this.length = box.length;
    }

    public void showInfo(){
        System.out.println("Ширина: " + width);
        System.out.println("Длина: " + length);
        System.out.println("Высота: " + height);
    }
    }

