//Задание было создать класс с 3 полями, в конструкторе проинициализировать все поля
//Добавить метод с параметром int и возвращающим значением String, который
//возвращает инфу о сотруднике, а так же о сумме его з.п за i месяцев

public class Employee {
    String name;
    String position;
    int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    String getInfo(int i) {
        return "Сотрудник: " + name + ", " + "должность: " + position + ", " + "зарплата: " + salary * i;
    }
}
