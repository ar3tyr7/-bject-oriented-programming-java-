package GAME.Protectors;

import GAME.Armors;

public class ChainMail implements Armors {
    String nameOfChain;
    int armor;

    public ChainMail(String nameOfChain, int armor) {
        this.nameOfChain = nameOfChain;
        this.armor = armor;
    }

    protected int getArmor() {
        return armor;
    }
    @Override
    public int armor() {
        return armor;
    }

    @Override
    public String toString() {
        return "ChainMail{" +
                "nameOfChain='" + nameOfChain + '\'' +
                ", armor=" + armor +
                '}';
    }
}
