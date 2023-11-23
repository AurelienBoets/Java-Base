package org.example.tpManagementBook;

public class Publisher {
    private static int count;
    private int id;
    private String name;
    static {
        count++;
    }

    public Publisher(String name){
        this.id=count;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "Nom: '" + name + '\'' +
                '}';
    }
}
