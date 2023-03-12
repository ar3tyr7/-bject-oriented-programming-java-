package Game;

import GAME.Archer;
import GAME.BaseHero;
import GAME.Footman;
import GAME.Protectors.ChainMail;
import GAME.Protectors.LetherArmor;
import GAME.Team;
import Weapons.Melee;
import Weapons.Ranged;

public class Main {
    public static void main(String[] args) {
        Team<Footman> squadF = new Team<>();
        squadF.add(new Footman(55, "Joe", new Melee("spear", 15), new ChainMail("sea", 22)));
        squadF.add(new Footman(55, "moe", new Melee("sword", 10), new ChainMail("fire",18)));
        squadF.add(new Footman(55, "doe", new Melee("axe", 20), new ChainMail("water", 17)));
        for (Footman item : squadF) {
            System.out.println(item);
        }
        System.out.println(squadF.getTeamHelth());
        System.out.println(squadF.getMaxRange());
        System.out.println("Sum damage = " + squadF.getSumDamage());
        System.out.println("___________________________");
        Team<BaseHero> squadA = new Team<>();
        squadA.add(new Archer(55, "Felix", new Ranged("arch", 11, 22),new LetherArmor("cow", 10)));
        squadA.add(new Archer(55, "Ralf", new Ranged("arbalet", 23, 12),new LetherArmor("whitecow", 30)));
        squadA.add(new Footman(70, "Jhonatan", new Melee("balls", 22),new ChainMail("weak",12)));
        for (BaseHero item : squadA) {
            System.out.println(item);
        }
        System.out.println(squadA.getTeamHelth());
        System.out.println(squadA.getMaxRange());
        System.out.println("Sum damage = " + squadA.getSumDamage());

//        Footman footman1 = new Footman(77 , "marks" , new Melee("book"  , 30), new ChainMail("a",12));
//        Footman footman2 = new Footman(66 , "adamS" , new Melee("weights"  , 45), new ChainMail("b",11));
//        while (footman1.getHealth()>0 && footman2.getHealth()> 0){
//            footman1.hit(footman2);
//            System.out.println(footman2);
//            System.out.println("~~~~~~~~");
//            footman2.hit(footman1);
//            System.out.println(footman1);
//            System.out.println("____________");
//        }
//        if (footman1.getHealth()>0){
//            System.out.println(footman1 + " is Winner");
//        }
//        else {
//            System.out.println(footman2 + " is Winner");
//        }

        System.out.println(squadA.minArmorTeamate());
    }


}
