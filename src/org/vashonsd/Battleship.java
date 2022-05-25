package org.vashonsd;

public class Battleship {
    private String name; //type of ship
    private int power; //power of attack in range [1 - 10]
    private int health; //health of the ship

    //Constructor
    public Battleship(String shipType, int attackPower) {
        name = shipType;
        power = attackPower;
        health = 100;
    }
    //Modifies health of battleship
    public void isAttacked (int attackPower) {
        if (attackPower < 4) {
            health -=3;
        } else if (attackPower < 8) {
            health -=5;
        } else health -=7;
    }
    // returns true if health of ship is greater than 0
    public boolean stillFloating() {
        return health > 0;
    }
    //returns power of ship
    public int getPower() {
        return power;
    }
    //returns string representation in the form battleship name
    public String toString() {
        return name + "(" + health + ")";
    }
}
