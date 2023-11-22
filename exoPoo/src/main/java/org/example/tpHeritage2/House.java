package org.example.tpHeritage2;

public class House {
    protected int surface;
    protected Door door;

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public House(int surface,String doorColor){
        this.surface=surface;
        this.door=new Door(doorColor);
    }

    public void display(){
        System.out.printf("Je suis une maison et ma surface est de %d m2\n",this.surface);
    }

    public void getDoor(){
        this.door.display();
    }
}
