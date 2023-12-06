package Entity.skill;

public class PhysicalDamageSkill extends Skill{

    private long damage;
    private int maxUse;
    private int currentUse=0;
    public PhysicalDamageSkill(String name, String description,long damage,int maxUse) {
        super(name, description);
        this.damage=damage;
        this.maxUse=maxUse;
    }

    public void setMaxUse(int maxUse) {
        this.maxUse = maxUse;
    }

    public void setCurrentUse(int currentUse) {
        this.currentUse = currentUse;
    }

    public long getDamage() {
        return damage;
    }

    public int getMaxUse() {
        return maxUse;
    }

    public int getCurrentUse() {
        return currentUse;
    }

    public void use() throws Exception {
        if(currentUse+1>maxUse)
            throw new Exception("Vous avez dépassé le nombre d'utilisation de la compétence");
        currentUse++;
    }
}
