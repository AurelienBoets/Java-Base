package org.example.tpHeritage2;

public class Apartment extends House{
    public Apartment( String doorColor) {
        super(50, doorColor);
    }

    @Override
    public void display() {
        System.out.printf("Je suis un appartement et ma surface est de %d m2\n",this.surface);
    }
}
