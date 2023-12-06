package Entity.skill;

public class DamageMagicSkill extends MagicSkill{

    private long damage;
    public DamageMagicSkill(String name, String description, long manaCost,long damage) {
        super(name, description, manaCost);
        this.damage=damage;
    }

    public long getDamage() {
        return damage;
    }
}
