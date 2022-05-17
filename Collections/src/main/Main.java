package main;

public class Main {
    public static void main(String[] args) {
        MyArrayList employees = new MyArrayList();
        employees.add("Никита");
        employees.add("Женя");
        employees.add("Артём");
        employees.add("Вика");
        employees.add("Оля");
        employees.add("Влад");
        employees.remove("Влад");
        for (int i = 0; i < employees.getSize(); i++){
            System.out.println(employees.get(i));
        }
    }
}
