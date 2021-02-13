package com.dnd.demo.model.items.weapon;

import com.dnd.demo.model.items.Items;

public abstract class Weapon extends Items {
    private int damage;
    private String weaponType;

    public Weapon(String name, int damage, String weaponType) {
        super(name);
        this.damage = damage;
        this.weaponType = weaponType;
    }
}
