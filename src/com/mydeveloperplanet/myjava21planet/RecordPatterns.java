package com.mydeveloperplanet.myjava21planet;

import java.awt.Color;

public class RecordPatterns {

    public static void main(String[] args) {
        singleRecordPatternOldStyle();
        singleRecordPattern();
        nestedRecordPattern();
    }

    private static void singleRecordPatternOldStyle() {
        System.out.println("""
                ***********************************
                * Single record pattern old style *
                ***********************************""");
        Object o = new GrapeRecord(Color.BLUE, 2);
        if (o instanceof GrapeRecord grape) {
            System.out.println("This grape has " + grape.nbrOfPits() + " pits.");
        }
    }

    private static void singleRecordPattern() {
        System.out.println("""
                *************************
                * Single record pattern *
                *************************""");
        Object o = new GrapeRecord(Color.BLUE, 2);
        if (o instanceof GrapeRecord(Color color, Integer nbrOfPits)) {
            System.out.println("This grape has " + nbrOfPits + " pits.");
        }
    }

    private static void nestedRecordPattern() {
        System.out.println("""
                *************************
                * Nested record pattern *
                *************************""");
        Object o = new SpecialGrapeRecord(new GrapeRecord(Color.BLUE, 2), true);
        if (o instanceof SpecialGrapeRecord(GrapeRecord grape, boolean special)) {
            System.out.println("This grape has " + grape.nbrOfPits() + " pits.");
        }
        if (o instanceof SpecialGrapeRecord(GrapeRecord(Color color, Integer nbrOfPits), boolean special)) {
            System.out.println("This grape has " + nbrOfPits + " pits.");
        }
    }

}

record GrapeRecord(Color color, Integer nbrOfPits) {}

record SpecialGrapeRecord(GrapeRecord grape, boolean special) {}