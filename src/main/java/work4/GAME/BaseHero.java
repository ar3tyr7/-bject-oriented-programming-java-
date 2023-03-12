package GAME;

import java.util.Random;
import java.util.WeakHashMap;

public abstract class BaseHero<W extends Weapon, A extends Armors> {
    private int health;
    private String name;

    protected W weapon;
    protected A armor;

    protected BaseHero(int health, String name, W weapon, A armor) {
        this.health = health;
        this.name = name;
        this.weapon = weapon;
        this.armor = armor;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public W getWeapon() {
        return weapon;
    }

    public A getArmor() {
        return armor;
    }

    public void setArmor(A armor) {
        this.armor = armor;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    public boolean hit(BaseHero recepien) {
        int damage = weapon.damage();
        return !recepien.reduceHelth(damage);
    }

    public int damageFork() {
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }

    public boolean reduceHelth(int damage) {
        health -= damage;
        return health>0;
    }


    @Override
    public String toString() {
        return "BaseHero{" +
                "health=" + health +
                ", name='" + name + '\'' +
                ", weapon=" + weapon +
                '}';
    }
}
