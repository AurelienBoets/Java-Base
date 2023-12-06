package Entity.character;

public class Archer extends Character{
    @Override
    public void levelUp() {

    }

    @Override
    public String description() {
        return "Un archer";
    }


    public Archer(String weapon,String name,long hp,long armor,long physicAtk,long mana,long magicAtk, long costGold) {
        super(costGold);
        this.mana=mana;
        this.magicAtk=magicAtk;
        this.weapon=weapon;
        this.name=name;
        this.hp=hp;
        this.armor=armor;
        this.physicAtk=physicAtk;
    }
}
