package day11.task2;

public class Paladin extends Hero implements Healer {
    final double SELF_HEAL = 25;
    final double MATE_HEAL = 10;

    public Paladin() {
        physAtt = 15;
        magicDef = 0.2;
        physDef = 0.5;

    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }

    @Override
    public void healHimself() {
        if (health + SELF_HEAL >= MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += SELF_HEAL;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + MATE_HEAL >= MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += MAX_HEALTH;
        }
    }

}
