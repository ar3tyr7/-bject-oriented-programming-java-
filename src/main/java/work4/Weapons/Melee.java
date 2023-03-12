package Weapons;

import GAME.Weapon;

public class Melee  implements Weapon {

    String weaponName;
    private int damagePoint;

    public Melee(String weaponName, int damagePoint) {
        this.weaponName = weaponName;
        this.damagePoint = damagePoint;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Melee{" +
                "weaponName='" + weaponName + '\'' +
                ", damagePoint=" + damagePoint +
                '}';
    }

    @Override
    public int damage() {
        return damagePoint;
    }
}
