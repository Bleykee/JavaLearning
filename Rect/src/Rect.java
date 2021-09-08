public class Rect {
    int length;
    int width;
    void setParam (int length, int width){
        this.length = length;
        this.width = width;
    }
    int ploshad (){
        return 2* (length + width);
    }
    int perimetr (){
        return length + width;
    }
}
