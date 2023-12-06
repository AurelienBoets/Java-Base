package Entity.character;

public  class Fighter extends Character{
    @Override
    public void levelUp() {

    }

    @Override
    public String description() {
      return "Un guerrier";
    }


    public Fighter(String weapon,String name,long hp,long armor,long physicAtk,long costGold) {
        super(costGold);
        this.mana=0;
        this.magicAtk=0;
        this.weapon=weapon;
        this.name=name;
        this.hp=hp;
        this.armor=armor;
        this.physicAtk=physicAtk;
    }
}
