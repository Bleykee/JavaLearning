public class MoneyInMyPocket {
    public static void main(String[] args) {
        int money = 350;
        if (money >= 500){
            System.out.println("Можно купить пиццу");
        } else if (money <= 100){
            System.out.println("Можно купить Доширак");
        } else {
            System.out.println("Лучше купить продуктов на пару дней");
        }
    }
}
