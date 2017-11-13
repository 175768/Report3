package jp.ac.uryukyu.ie.e175768;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    public boolean isDead(){
        return  dead;
    }

    public String getName(){
        return name;
    }

    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }



    public void attack(LivingThing opponent) {
        if (hitPoint > 0) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name,getName(), damage);
        opponent.wounded(damage);
        }
    }

    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}