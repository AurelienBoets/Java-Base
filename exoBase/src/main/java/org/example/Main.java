package org.example;

import org.example.bonjour.Bonjour;
import org.example.negativePositive.NegativePositive;
import org.example.priceHT.PriceHT;
import org.example.sort.Sort;
import org.example.square.Square;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Square.calc();
        Bonjour.bonjour();
        PriceHT.calcPrice();
        NegativePositive.isNegative();
        Sort.isSort();
        }
    }
