public class Space {
    public static void main(String[] args) {
        String[] namesOfMonths = {
                "Январь",
                "Февраль",
                "Март",
                "Апрель",
                "Май",
                "Июнь",
                "Июль",
                "Август",
                "Сентябрь",
                "Октябрь",
                "Ноябрь",
                "Декабрь"

        };
        String result = "";
        for (int i = 0; i < namesOfMonths.length; i++) {
            result += namesOfMonths[i];
            if (i == namesOfMonths.length - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }
}
