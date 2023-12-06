package Entity;

import Entity.building.Building;
import Entity.building.Castle;
import Entity.character.Character;

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

    public Character getCharacterById(long id){
        for (Character character:this.characters) {
            if(character.getId()==id)
                return character;
        }
        return null;
    }

    public void addCharacter(Character character) throws Exception{
        if(character.getCostGold()>this.gold)
            throw new Exception("Vous n'avez pas assez d'argent pour acheter ce personnage");
        this.gold-=character.getCostGold();
        this.characters.add(character);
    }

    public void addBuilding(Building building) throws Exception{
        if(building.getCostGold()>this.gold)
            throw new Exception("Vous n'avez pas assez d'or pour acheter ce bâtiment");
        this.gold-= building.getCostGold();
        this.buildings.add(building);
    }

    public Building getBuildingById(long id){
        for(Building building:this.buildings){
            if(building.getId()==id)
                return building;
        }
        return null;
    }
}
