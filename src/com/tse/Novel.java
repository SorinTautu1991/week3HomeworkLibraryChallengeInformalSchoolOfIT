package com.tse;

import java.util.ArrayList;

public class Novel extends Book {
    public String type;



    public Novel(String name, int nrPages, String type) {
        super(name, nrPages);
        this.type = type;

    }

    public String getType() {
        return type;
    }
}
