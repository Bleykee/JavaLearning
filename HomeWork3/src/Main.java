public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Мухтар";
        dog.breed = "Немецкая овчарка";
        dog.speed = 15;
        dog.run();
        System.out.println(dog.info());
    }
}
