package Entity.character;

import Entity.skill.Skill;

import java.util.HashSet;
import java.util.Set;

public abstract class Character {

    protected long id;
    private static long count=0;
    protected String weapon;
    protected long costGold;
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

    public String addSkill(Skill skill){
        this.skills.add(skill);
        return "Vous avez appris le sort "+skill.getName();
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

    public long getCostGold() {
        return costGold;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(long hp) {
        this.hp = hp;
    }

    public void setArmor(long armor) {
        this.armor = armor;
    }

    public void setMana(long mana) {
        this.mana = mana;
    }

    public void setPhysicAtk(long physicAtk) {
        this.physicAtk = physicAtk;
    }

    public void setMagicAtk(long magicAtk) {
        this.magicAtk = magicAtk;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void takeDamage(long damage) throws Exception{
        damage-=this.armor;
        if(damage<=0)
            damage=1;
        long currentHp=this.hp-damage;
        if(currentHp<=0){
            setHp(0);
            throw new Exception(this.name+" n'a plus de point de vie");
        }
        setHp(currentHp);
    }
    protected Character(long costGold){
        this.id=++count;
        this.level=1;
        this.costGold=costGold;
    }
}
