package Entity.building;

public class Forge extends Building{
    private Forge(Builder builder) {
        super();
        this.color=(builder.color==null)? "Noir":builder.color;
        this.size=(builder.size==0)?2:builder.size;
        this.material=(builder.material==null)?"Pierre":builder.material;
    }

    public static class Builder{
        public String color;
        public int size;
        public String material;

        public Builder material(String material){
            this.material=material;
            return this;
        }

        public Builder size(int size){
            this.size=size;
            if(size<0)
                throw new RuntimeException("Impossible d'avoir une forge d'une taille négatif");
            return this;
        }

        public Builder color(String color){
            this.color=color;
            return this;
        }

        public Forge build(){
            return new Forge(this);
        }
    }
}
