package GAME;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends BaseHero> implements Iterable<T> {
    List<T> dreamTeam = new ArrayList<>();

    public void add(T teamer) {
        dreamTeam.add(teamer);
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return dreamTeam.iterator();
    }

    public int getTeamHelth() {
        int teamHealth = 0;
        for (T hero : dreamTeam) {
            teamHealth += hero.getHealth();
        }
        return teamHealth;
    }

    public int getMaxRange() {
        int maxRange = 0;
        for (T hero : dreamTeam
        ) {
            if (hero instanceof Archer) {
                Archer archer = (Archer) hero;
                if (maxRange < archer.range()) {
                    maxRange = archer.range();
                }
            }
        }
        return maxRange;
    }

    public int getSumDamage() {
        int sumDamage = 0;
        for (T hero : dreamTeam
        ) {
            sumDamage += hero.getWeapon().damage();
        }
        return sumDamage;
    }

    public int minArmorTeamate() {
        int minArmor = 2147483647;
        for (T item : dreamTeam
        ) { if (minArmor > item.getArmor().armor()){
            minArmor = item.getArmor().armor();
        }
        }
        return minArmor;
    }
}
