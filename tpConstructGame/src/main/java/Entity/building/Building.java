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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public long getId() {
        return id;
    }
}
