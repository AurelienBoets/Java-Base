package Entity.character;

public class Caster extends Character{
    @Override
    public void levelUp() {

    }

    @Override
    public String description() {
        return "Un mage";
    }


    public Caster(String name,long hp,long armor,long physicAtk,long mana,long magicAtk) {
        super();
        this.name=name;
        this.hp=hp;
        this.armor=armor;
        this.physicAtk=physicAtk;
        this.mana=mana;
        this.magicAtk=magicAtk;
    }
}
