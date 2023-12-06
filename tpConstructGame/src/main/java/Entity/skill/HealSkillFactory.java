package Entity.skill;

public class HealSkillFactory extends MagicSkillFactory{

    @Override
    public Skill createSkill(String name, String description, long manaCost, long deal) {
        return new HealSkill(name,description,manaCost,deal);
    }
}
