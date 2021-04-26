package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack {
    final double magicAtt;
    final double SELF_HEAL = 50;
    final double MATE_HEAL = 30;

    public Shaman() {
        magicDef = 0.2;
        physDef = 0.2;
        physAtt = 10;
        magicAtt = 15;
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }

    public void magicalAttack(Hero hero) {
        double attackEffect = magicAtt * (1 - hero.magicDef);
        if (hero.health - attackEffect < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        }
        hero.health -= attackEffect;
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
            hero.health += MATE_HEAL;
        }
    }
}
