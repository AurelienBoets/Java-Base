package Entity.skill;

public class HealSkill extends MagicSkill {


    private long hpReturned;
    public HealSkill(String name, String description,long manaCost,long hpReturned) {
        super(name, description,manaCost);
        this.hpReturned=hpReturned;
    }



    public long getHpReturned() {
        return hpReturned;
    }
}
