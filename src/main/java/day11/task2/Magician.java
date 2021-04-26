package day11.task2;

public class Magician extends Hero implements MagicAttack{
    final double magicAtt;

    public Magician() {
        physAtt = 5;
        magicAtt = 20;
        magicDef = 0.8;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackEffect = magicAtt * (1 - hero.magicDef);
        if  (hero.health - attackEffect < MIN_HEALTH){
            hero.health = MIN_HEALTH;
        }
        hero.health -= attackEffect;
    }
}
