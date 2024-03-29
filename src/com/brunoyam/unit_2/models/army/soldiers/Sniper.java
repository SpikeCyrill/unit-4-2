package com.brunoyam.unit_2.models.army.soldiers;

import com.brunoyam.unit_2.models.army.Shootable;
import com.brunoyam.unit_2.models.army.Shooter;

public class Sniper extends AbstractSoldier implements Shootable, Shooter {

    private final static int POWER = 150;

    public Sniper(int maxSpeed, int armor, int health) {
        super(maxSpeed, armor, health);
    }

    @Override
    public void getShot(int damage) {
        this.health = this.health - damage;
    }

    @Override
    public int getPower() {
        return POWER;
    }
}
