//Задание было создать класс Монстр с 3-мя полями типа int
//Создать 4 конструктора (если в параметрах конструктора нет значения, то установить его равным 2)
//оздать методы, которые выводят на эеран слово; которые выводят слово i раз; которое выводит слово word i раз.

public class Monster {
    int eyes;
    int legs;
    int hands;

    public Monster() {
        eyes = 2;
        legs = 2;
        hands = 2;
    }

    public Monster(int eyes) {
        this.eyes = eyes;
    }

    public Monster(int eyes, int legs) {
        this.eyes = eyes;
        this.legs = legs;
    }


    public Monster(int eyes, int legs, int hands) {
        this.eyes = eyes;
        this.legs = legs;
        this.hands = hands;
    }

    void voice() {
        System.out.println("Голос");
    }

    void voice(int i) {
        String getVoice = "Голос";
        int y;
        for (y = 0; y < i; y++) {
            System.out.println(getVoice);
        }
    }

    void voice(int i, String word) {
        int y;
        for (y = 0; y < i; y++) {
            System.out.println(word);
        }
    }
}
