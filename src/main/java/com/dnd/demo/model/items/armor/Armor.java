package com.dnd.demo.model.items.armor;

import com.dnd.demo.model.items.Items;

public abstract class Armor extends Items {
    private int amountOfArmor;
    public Armor(String name, int amountOfArmor) {
        super(name);
        this.amountOfArmor = amountOfArmor;
    }
}
