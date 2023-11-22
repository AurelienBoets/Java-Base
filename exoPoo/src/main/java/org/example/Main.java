package org.example;


import org.example.tpClass.Chaise;
import org.example.tpHeritage1.*;
import org.example.tpHeritage2.Apartment;
import org.example.tpHeritage2.Person;
import org.example.tpHeritage3.PayAccount;
import org.example.tpHeritage3.SavingAccount;
import org.example.tpHeritage3.SimpleAccount;

public class Main {


    public static void main(String[] args) {

//        Chaise chaise1=new Chaise();
//        Chaise.displayChaise(chaise1);
//        Chaise chaise2=new Chaise(2,"Rouge","Plastique");
//        Chaise.displayChaise(chaise2);

//        Person person=new Person(20);
//        person.hello();
//        Student student=new Student(15);
//        student.hello();
//        student.goToClass();
//        student.displayYear();
//        Teacher teacher=new Teacher(40);
//        teacher.hello();
//        teacher.explain();

//        Apartment apartment=new Apartment("Bleu");
//        Person person=new Person("Thomas",apartment);
//        person.display();

        PayAccount payAccount=new PayAccount(0);
        payAccount.add(150);
        System.out.println(payAccount.toString());

        SavingAccount savingAccount=new SavingAccount( 0, 9.5F);
        savingAccount.add(150);
        savingAccount.interestRateCalcultaion();
        System.out.println(savingAccount);

        SimpleAccount simpleAccount=new SimpleAccount(0,-500);
        simpleAccount.debit(600);
        System.out.println(simpleAccount.toString());
    }
}