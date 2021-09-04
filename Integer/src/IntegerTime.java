public class IntegerTime {
    public static void main(String[] args) {
        int seconds = 23455454;
        int minutes = seconds / 60;
        int hours = minutes  / 60;
        int days = hours / 24;
        int months = days / 12;
        System.out.println("Секунд: " + seconds);
        System.out.println("Минут: " + minutes);
        System.out.println("Часов: " + hours);
        System.out.println("Дней: " + days);
        System.out.println("Месяцев: " + months);

    }
}
