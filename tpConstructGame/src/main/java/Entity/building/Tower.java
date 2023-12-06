package Entity.building;

public class Tower extends Building{
    private Tower(Builder builder) {
        super();
        this.color=(builder.color==null)? "Gris":builder.color;
        this.size=(builder.size==0)?1:builder.size;
        this.material=(builder.material==null)?"Pierre":builder.material;
        this.costGold= builder.costGold;
    }

    public static class Builder{
        private String color;
        private int size;
        private String material;
        private long costGold;

        public Builder costGold(long constGold){
            this.costGold=constGold;
            return this;
        }


        public Builder material(String material){
            this.material=material;
            return this;
        }

        public Builder size(int size){
            this.size=size;
            if(size<0)
                throw new RuntimeException("Impossible d'avoir une tour d'une taille négatif");
            return this;
        }

        public Builder color(String color){
            this.color=color;
            return this;
        }

        public Tower build(){
            return new Tower(this);
        }
    }
}
