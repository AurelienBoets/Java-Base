package Entity;

public abstract class Skill {
    private static long count=0;
    protected long id;
    protected String name;
    protected String description;

    public Skill( String name, String description) {
        this.id = ++count;
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
