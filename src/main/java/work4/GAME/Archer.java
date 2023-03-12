package GAME;

import GAME.Protectors.LetherArmor;
import Weapons.Ranged;

public class Archer extends BaseHero<Ranged, LetherArmor>{
    public Archer(int health, String name, Ranged ranged, LetherArmor armor) {
        super(health, name, ranged,armor);
    }
protected int range(){
    return weapon.getRange();
}
protected int armor(){
        return armor.getArmor();
}
}
