package com.example.quizzer.adapters;

public interface EnemyAttacker {
    // this is the target that we ant to adapt to

    public void fireWeapon();
    public void driveForward();
    public void assignDriver(String driverName);
}
