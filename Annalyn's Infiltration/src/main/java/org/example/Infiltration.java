package org.example;

public class Infiltration {
    public static void main(String[] args) {
        boolean knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        boolean petDogIsPresent = false;

        System.out.println(AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
        System.out.println(AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
        System.out.println(AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
    }
}

class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return (knightIsAwake || archerIsAwake || prisonerIsAwake);
    }
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (prisonerIsAwake && !archerIsAwake && !knightIsAwake) || (!archerIsAwake && petDogIsPresent);
    }
}

