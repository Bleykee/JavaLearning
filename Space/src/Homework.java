public class Homework {
    public static void main(String[] args) {
        String month = "Привет";
        if (month.equals("Декабрь") || month.equals("Январь") || month.equals("Февраль")){
            System.out.println("Зима");
        } else if (month.equals("Март") || month.equals("Апрель") || month.equals("Май")){
            System.out.println("Весна");
        } else if (month.equals("Июнь") || month.equals("Июль") || month.equals("Август")){
            System.out.println("Лето");
        } else if (month.equals("Сентябрь") || month.equals("Октябрь") || month.equals("Ноябрь")){
            System.out.println("Осень");
        } else {
            System.out.println("Такого времени года нет");
        }
    }
}
