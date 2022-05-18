public class Cat extends CatFamily {
    public Cat(){
        super(2,4,false);
    }

    @Override //аннотация для понятия о переопределении метода суперкласса
    public void eat() {
        super.eat();
        System.out.println("вискас");
    }

}
