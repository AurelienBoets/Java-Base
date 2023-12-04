package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Produit> produits=new ArrayList<>();
        produits.add(new Produit("Stylo","Ecole",1.32));
        produits.add(new Produit("Regle","Ecole",3.00));
        produits.add(new Produit("Oignon","Legume",0.80));
        List<Produit> produitEcole=Util.filtrerProduits(produits,(produit -> Objects.equals(produit.getCategorie(), "Ecole")));
        System.out.println(produitEcole);
        List<Produit> produitMoinsDeux=Util.filtrerProduits(produits,(produit -> produit.getPrix()<2));
        System.out.println(produitMoinsDeux);
    }
}