package Entity.building;

public abstract class Building {
    protected long id;
    private static long count=0;
    protected String color;
    protected int size;
    protected String material;

    protected Building(){
        this.id=++count;
    }

}
