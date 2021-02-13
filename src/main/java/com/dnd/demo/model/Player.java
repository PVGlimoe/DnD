package com.dnd.demo.model;

import com.dnd.demo.model.items.Items;
import com.dnd.demo.model.items.armor.Armor;
import com.dnd.demo.model.items.weapon.Weapon;

import java.util.ArrayList;

public class Player {
    private String name;
    private int hp;
    private int exp;
    private int level;
    private int amountOfCopper;
    private int amountOfSilver;
    private int amountOfGold;
    private ArrayList<Weapon> ownedWeapons;
    private ArrayList<Armor> ownedArmor;
}
