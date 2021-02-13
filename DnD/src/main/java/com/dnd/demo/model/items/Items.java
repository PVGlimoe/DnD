package com.dnd.demo.model.items;

public abstract class Items {
    private String name;

    public Items(String name) {
        this.name = name;
    }
// ------------------ GETTER & SETTERS ------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
