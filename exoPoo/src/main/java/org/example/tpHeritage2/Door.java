package org.example.tpHeritage2;

public class Door {
    private String color;

    public void display(){
        System.out.println("Je suis une porte de couleur "+color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Door(String color){
        setColor(color);
    }
}
