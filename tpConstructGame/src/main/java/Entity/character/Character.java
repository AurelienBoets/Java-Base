package Entity.character;

import Entity.Skill;

import java.util.HashSet;
import java.util.Set;

public abstract class Character {

    protected long id;
    private static long count=0;
    protected String weapon;
    protected String name;
    protected long hp;
    protected long armor;
    protected Set<Skill> skills = new HashSet<>();
    protected long mana;
    protected long physicAtk;
    protected long magicAtk;
    protected int level;

    public abstract void levelUp();
    public abstract String description();
    public String getStats(){
        return String.format("""
                name: %s
                level: %d
                hp: %d
                mana: %d
                armor: %d
                physic attack: %d
                magic attack: %d""",name,level,hp,mana,armor,physicAtk,magicAtk);
    }

    public long getId() {
        return id;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getName() {
        return name;
    }

    public long getHp() {
        return hp;
    }

    public long getArmor() {
        return armor;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public long getMana() {
        return mana;
    }

    public long getPhysicAtk() {
        return physicAtk;
    }

    public long getMagicAtk() {
        return magicAtk;
    }

    public int getLevel() {
        return level;
    }

    protected Character(){
        this.id=++count;
        this.level=1;
    }
}
