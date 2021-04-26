package day11.task2;

public class Warrior extends Hero {

    public Warrior() { // почему не выдаёт ошибку, мы же наследуем от супер класса супер здоровье?
        physDef = 0.8;
        physAtt = 30.0;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}