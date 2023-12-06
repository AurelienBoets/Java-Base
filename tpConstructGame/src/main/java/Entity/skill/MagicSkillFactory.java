package Entity.skill;

public abstract class MagicSkillFactory {
    public abstract Skill createSkill(String name,String description,long manaCost,long deal);
}
