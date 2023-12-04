package org.example;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static List<Produit> filtrerProduits(List<Produit> produits,CritereFiltrage filtrage){
        List<Produit> filterList=new ArrayList<>();
        for (Produit produit:produits) {
            if(filtrage.run(produit)){
                filterList.add(produit);
            }
        }
        return filterList;
    }
}
