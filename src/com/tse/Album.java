package com.tse;

public class Album extends Book{
    public String paperQ;

    public Album(String name, int nrPages, String paperQ) {
        super(name, nrPages);
        this.paperQ = paperQ;
    }

    public String getPaperQ() {
        return paperQ;
    }
}
