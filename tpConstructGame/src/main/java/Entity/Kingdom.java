package Entity;

import Entity.building.Building;
import Entity.building.Castle;

import java.util.*;

public class Kingdom {
    private long id;
    private static long count=0;
    private List<Building> buildings;
    private String name;
    private int size;
    private Set<Bonus> bonusSet;
    private List<Character> characters;
    private long gold;

    public Kingdom(String name){
        this.id=++count;
        this.buildings=new ArrayList<>();
        this.buildings.add(new Castle.Builder().build());
        this.name=name;
        this.size=4;
        this.bonusSet=new TreeSet<>(Comparator.comparing(Bonus::getName));
        this.characters=new ArrayList<>();
        this.gold=500;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public long getGold() {
        return gold;
    }

    public void setGold(long gold) {
        this.gold = gold;
    }
}
