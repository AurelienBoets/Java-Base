package org.example.stationery;

public abstract class Article {
    private static long count=1;
    protected long reference;

    protected Article(){
        this.reference=count++;
    }

    public long getReference() {
        return reference;
    }
}
