package com.example.quizzer.adapters;

import java.util.Random;

// adaptee is the class that needs to be put inside the adapter such that the adapter
// adapts the class to the target interface.
public class EnemyRobot {

    private Random random = new Random();

    public void smashWithHands() {
        int attackDamage = random.nextInt(10) + 1;
        System.out.println("EnemyRobot causes " + attackDamage + " damage.");
    }

    public void walkForward() {
        int movement = random.nextInt(5) + 1;
        System.out.println("EnemyRobot walks forward " + movement + " Spaces.");
    }

    public void reactToHuman(String driverName) {
        System.out.println("EnemyRobot tramps on " + driverName +".");
    }
}
