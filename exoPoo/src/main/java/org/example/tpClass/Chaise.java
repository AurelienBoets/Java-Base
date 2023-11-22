package org.example.tpClass;

public class Chaise {
    private int nbPieds;
    private String couleur, materiaux;

    public Chaise() {
        this.nbPieds = 4;
        this.couleur = "Marron";
        this.materiaux = "Bois";
    }

    public Chaise(int nbPieds, String couleur, String materiaux) {
        this.nbPieds = nbPieds;
        this.couleur = couleur;
        this.materiaux = materiaux;
    }

    public String toString() {
        return String.format("Je suis une chaise avec %d pieds en %s et de couleur %s", nbPieds, materiaux, couleur);
    }

    public static void displayChaise(Chaise chaise){
        System.out.println("---------------Affichage d'un nouvel objet---------------");
        System.out.println(chaise.toString());
        System.out.println("---------------------------------------------------------");
    }
}
