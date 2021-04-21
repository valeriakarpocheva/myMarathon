package day7;

//и следующие методы:
//run() - игрок бежит при вызове этого метода. Этот метод уменьшает выносливость игрока на 1 при однократном вызове.
// Когда выносливость достигает 0, игроку нужен отдых и он уходит с поля.
//info() -  выводит сообщение в зависимости от количества игроков на поле. Если игроков меньше 6, то выводит
// сообщение: “Команды неполные. На поле еще есть ... свободных мест”, иначе: “На поле нет свободных мест”.
// Грамматикой русского языка пренебречь, т.е. фраза “еще есть 1 свободных мест” допустима.
public class Player {
    private int stamina;
    static final int MAX_STAMINA = 100;
    static final int MIN_STAMINA = 0;
    static int numberOfPlayers = 0;
    static int maxNumberOfPlayers =6;

    public Player(int stamina) {
        this.stamina = stamina;
        if (stamina == MIN_STAMINA) {
            numberOfPlayers--;
        } else {
            numberOfPlayers++;
        } if (numberOfPlayers >=maxNumberOfPlayers){
            numberOfPlayers = maxNumberOfPlayers;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int countPlayers() {
        return numberOfPlayers;
    }


    public void run() {
        while (true) {
            stamina--;
            if (stamina == 0)
                numberOfPlayers--;
                break;
        }
    }

    public int placesLeft() {
        int number = 6 - numberOfPlayers;
        return number;
    }

    public void info() {
        if (numberOfPlayers < 6)
        System.out.printf("Команды неполные. На поле еще есть " + placesLeft() + " свободных мест.");

        if (numberOfPlayers >= 6)
            System.out.println("На поле нет свободных мест");

    }
}
