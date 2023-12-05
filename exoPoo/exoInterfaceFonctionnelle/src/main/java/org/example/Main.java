package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Produit> produits=new ArrayList<>();
        produits.add(new Produit("Stylo","Ecole",1.32));
        produits.add(new Produit("Regle","Ecole",3.00));
        produits.add(new Produit("Oignon","Legume",0.80));
        List<Produit> produitEcole=Util.filtrerProduits(produits,(produit -> produit.getCategorie().equals("Ecole")));
        System.out.println(produitEcole);
        List<Produit> produitMoinsDeux=Util.filtrerProduits(produits,(produit -> produit.getPrix()<2));
        System.out.println(produitMoinsDeux);
        List<Produit> produitS=Util.filtrerProduits(produits,(produit -> produit.getNom().contains("S")));
        System.out.println(produitS);
    }
}