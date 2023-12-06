package Entity.skill;

public class DamageMagicSkillFactory extends MagicSkillFactory{
    @Override
    public Skill createSkill(String name, String description, long manaCost, long deal) {
        return new DamageMagicSkill(name,description,manaCost,deal);
    }
}
