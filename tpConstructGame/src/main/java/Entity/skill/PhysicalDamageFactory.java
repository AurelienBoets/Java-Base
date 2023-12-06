package Entity.skill;

public class PhysicalDamageFactory {
    public Skill createSkill(String name,String description,long damage,int maxUse){
        return new PhysicalDamageSkill(name,description,damage,maxUse);
    }
}
