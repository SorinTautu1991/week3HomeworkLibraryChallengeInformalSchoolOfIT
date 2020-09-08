package com.tse;

public class Album extends Book{
    private String paperQuality;

    public Album(String name, int numberOfPages, String paperQuality) {
        super(name, numberOfPages);
        this.paperQuality = paperQuality;
    }

    public String getPaperQuality() {
        return paperQuality;
    }
}
