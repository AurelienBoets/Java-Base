package org.example.stationery;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Ihm {
    private static final Scanner sc=new Scanner(System.in);
    private static final Stationery stationery=new Stationery();

    public static void start(){
        int choice;
        do {
            System.out.print(menu());
            choice= sc.nextInt();
            switch (choice){
                case 1->addArticle();
                case 2->remove();
                case 3->displayArticles();
                case 4->createInvoice();
                case 5->displayInvoices();
            }
        }while(choice!=0);
    }

    private static String menu(){
        return """
                1.Ajouter article
                2.Supprimer article
                3.Afficher article
                4.Créer facture
                5.Afficher les factures
                0.Quittez
                """;
    }

    private static void addArticle(){
        int choice;
        do {
        System.out.println("""
                Choississez le format
                1.Stylo
                2.Ramette
                3.Lot""");
        choice= sc.nextInt();
        switch (choice){
            case 1->addPencil();
            case 2->addPaperReam();
            case 3->addBatch();
        }

        }while (choice>3 || choice<1);

    }

    private static void addPencil(){
        System.out.println("Nom du stylo");
        sc.nextLine();
        String name= sc.nextLine();
        System.out.println("Couleur du stylo");
        String color=sc.nextLine();
        System.out.println("Prix du stylo");
        double price=sc.nextDouble();
        stationery.addArticle(price,name,color);
    }

    private static void addPaperReam(){
        System.out.println("Nom de la ramette");
        sc.nextLine();
        String name= sc.nextLine();
        System.out.println("Poids de la ramette");
        double weight=sc.nextDouble();
        System.out.println("Prix de la ramette");
        double price=sc.nextDouble();
        stationery.addArticle(price,name,weight);
    }

    private static void addBatch(){
        if(!stationery.hasArticle()) {
            System.out.println("Ajouter d'abord un article avant de créer un lot");
            return;
        }
        System.out.println("     Création d'un lot");
        System.out.println("--------------------------------");
        displayUnitaryArticle();
        System.out.println("Tapez la référence de l'article de l'article dont vous voulez créer un lot");
        sc.nextLine();
        long refArticle=sc.nextLong();
        System.out.println("Tapez la quantité");
        int quantity= sc.nextInt();
        System.out.println("Tapez la remise en %");
        float discount=sc.nextFloat();
        Article article=Stationery.getArticles().get(refArticle);
        if(article!=null && !(article instanceof Batch)){
            stationery.addBatch((UnitaryArticle) article,quantity,discount);
        }else{
            System.out.println("Erreur dans la manipulation");
        }
    }

    private static void displayUnitaryArticle(){
        List<UnitaryArticle> list=stationery.getOnlyArticle();
        if(list.isEmpty()){
            System.out.println("Aucun article n'est présent");
            return;
        }
        for (UnitaryArticle article:list) {
            System.out.println(article);
        }
    }

    private static void displayArticles(){
        HashMap<Long,Article> articles=Stationery.getArticles();
        for (Long key:articles.keySet()) {
            System.out.println(articles.get(key));
        }
    }

    private static void remove(){
        displayArticles();
        System.out.println("Indiquez la référence de l'article que vous voulez supprimez");
        sc.nextLine();
        long refArticle= sc.nextLong();
        if(stationery.removeArticle(refArticle)) System.out.println("L'article/Lot ont été supprimé");
        else System.out.println("Erreur");
    }

    private static void createInvoice(){
        System.out.println("Indiquez le nom et le prénom du client");
        sc.nextLine();
        String client=sc.nextLine();
        Invoice invoice=new Invoice(client);
        displayArticles();
        String continu;
        do {
            System.out.println("Indiquez la référence de l'article");
            long refArticle=sc.nextLong();
            System.out.println("Indiquez la quantité");
            int quantity=sc.nextInt();
            invoice.addLine(refArticle,quantity);
            System.out.println("Article ajouté");
            System.out.println("Continuez o/n");
            sc.nextLine();
            continu= sc.next().toLowerCase();
        }while (continu.equals("o"));
        stationery.addInvoice(invoice);
        displayInvoice(invoice);
    }

    private static void displayInvoice(Invoice invoice){
        System.out.println("Facture du "+invoice.getDate());
        for (Line line:invoice.getLines()) {
            System.out.println(line);
        }
        System.out.println("\t"+invoice.getNum()+"\n\t"+invoice.getClient());
    }

    private static void displayInvoices(){
        for (Invoice invoice:stationery.getInvoices()) {
            displayInvoice(invoice);
            System.out.println();
        }
    }
}
