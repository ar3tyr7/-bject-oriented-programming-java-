package GAME;

import GAME.Protectors.ChainMail;
import Weapons.Melee;

public class Footman extends BaseHero<Melee, ChainMail>{
    public Footman(int health, String name, Melee weapon, ChainMail chainMail) {
        super(health, name, weapon, chainMail);
    }


    @Override
    public String toString() {
        return "Footman{" + '}' + super.toString();
    }
}
