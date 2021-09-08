public class Homework2 {
    public static void main(String[] args) {
        String month = "Июнь";
        switch (month){
            case "Декабрь":
            case "Январь":
            case "Февраль":
                System.out.println("Зима");
                break;
            case "Март":
            case "Апрель":
            case "Май":
                System.out.println("Весна");
                break;
            case "Июнь":
            case "Июль":
            case "Август":
                System.out.println("Лето");
                break;
            case "Сентябрь":
            case "Октябрь":
            case "Ноябрь":
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
                break;
        }
        if (month.equals("Сентябрь")){
            System.out.println("Снова в школу!");
        } else if (month.equals("Июнь")){
            System.out.println("Ура! Каникулы!");
        }
    }


}
