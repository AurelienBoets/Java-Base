package Entity.skill;

import Entity.skill.Skill;

public abstract class MagicSkill extends Skill {
    protected long manaCost;

    public MagicSkill(String name, String description,long manaCost) {
        super(name, description);
        this.manaCost=manaCost;
    }

    public long getManaCost() {
        return manaCost;
    }}
