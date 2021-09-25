package main;

public class Main {
    public static void main(String[] args) {
       MyArrayList employees = new MyArrayList();
       employees.add("Ваня");
       employees.add("Игорь");
       employees.add("Петя");
       employees.add("Ирина");
       employees.add("Женя");
       employees.add("Антон");
       employees.add("Кристина");
       employees.remove("Петя");
       for (int i = 0; i < employees.getSize(); i++){
           System.out.println(employees.get(i));
       }

    }
}
