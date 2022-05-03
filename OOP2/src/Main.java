public class Main {
    public static void main(String[] args) {
        Employee first = new Employee("Саня", "игрок", 50000);
        String info = first.getInfo(12);
        System.out.println(info);
    }
}
