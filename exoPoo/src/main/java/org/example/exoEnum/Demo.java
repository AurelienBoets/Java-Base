package org.example.exoEnum;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MessageType messageType=null;
        while(messageType==null){
            System.out.println("""
                    Choissisez votre type de message
                    A
                    B
                    C
                    D""");
            String message=sc.next();
            switch (message){
                case "A" ->messageType=MessageType.A;
                case "B" ->messageType=MessageType.B;
                case "C" ->messageType=MessageType.C;
                case "D" ->messageType=MessageType.D;
            }
        }
        Priority priority=messageType.getPriority();
        System.out.println("Vous avez la priorité "+priority);
    }
}
