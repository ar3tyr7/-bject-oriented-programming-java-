package GAME.Protectors;

import GAME.Armors;

public class LetherArmor implements Armors {
    String nameofLetherArmor;
    int armor;

    public LetherArmor(String nameofLetherArmor, int armor) {
        this.nameofLetherArmor = nameofLetherArmor;
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public int armor() {
        return armor;
    }

    @Override
    public String toString() {
        return "LetherArmor{" +
                "nameofLetherArmor='" + nameofLetherArmor + '\'' +
                ", armor=" + armor +
                '}';
    }
}
