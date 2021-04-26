package day11.task2;

//health (здоровье)
//physDef (процент поглощения физического урона)
//magicDef (процент поглощения магического урона)
//physAtt (величина физической атаки), по необходимости
//magicAtt (величина магической атаки), по необходимости
//Реализацию необходимых интерфейсов
//Переопределенный toString()
public abstract class Hero implements PhysAttack {
    final double MAX_HEALTH = 100;
    final double MIN_HEALTH = 0;
    double health;
    double physAtt;
    double physDef;
    double magicDef;

    public Hero() {
        health = MAX_HEALTH;
    }


    public void physicalAttack(Hero hero) {
        double attackEffect = physAtt * (1 - hero.physDef);
        if (hero.health - attackEffect <= MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackEffect;
        }
    }
}

