package GAME.Protectors;

import GAME.Armors;

public class Shield implements Armors {
    String armorName;
    private int armorPoint;
    int damageOfShield = 0;

    public Shield(String wariorsName, int armor, int damageOfShield) {
        this.armorName = wariorsName;
        this.armorPoint = armor;
        this.damageOfShield = damageOfShield;
    }

    @Override
    public String toString() {
        return "Shield{" +
                "wariorsName='" + armorName + '\'' +
                ", armor=" + armorPoint +
                ", damageOfShield=" + damageOfShield +
                '}';
    }

    @Override
    public int armor() {
        return armorPoint;
    }
}
