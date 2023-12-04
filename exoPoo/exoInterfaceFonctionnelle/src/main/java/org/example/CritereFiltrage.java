package org.example;

@FunctionalInterface
public interface CritereFiltrage {
    public boolean run(Produit produit);
}
