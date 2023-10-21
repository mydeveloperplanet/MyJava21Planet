package com.mydeveloperplanet.myjava21planet;

public class PatternMatchingSwitch {

    public static void main(String[] args) {
        oldStylePatternMatching(FruitType.APPLE);
        patternMatchingSwitch(FruitType.AVOCADO);
        oldStyleSwitchNull(null);
        switchNull(null);
        inefficientCaseRefinement(FruitType.PEAR);
        caseRefinement(FruitType.ORANGE);
        inefficientEnumConstants(CarType.CABRIO);
        enumConstants(CarType.CABRIO);
    }

    private static void oldStylePatternMatching(Object obj) {
        System.out.println("""
                ******************************
                * Old style pattern matching *
                ******************************""");
        if (obj instanceof Integer i) {
            System.out.println("Object is an integer:" + i);
        } else if (obj instanceof String s) {
            System.out.println("Object is a string:" + s);
        } else if (obj instanceof FruitType f) {
            System.out.println("Object is a fruit: " + f);
        } else {
            System.out.println("Object is not recognized");
        }
    }

    private static void patternMatchingSwitch(Object obj) {
        System.out.println("""
                ***************************
                * Pattern matching switch *
                ***************************""");
        switch(obj) {
            case Integer i   -> System.out.println("Object is an integer:" + i);
            case String s    -> System.out.println("Object is a string:" + s);
            case FruitType f -> System.out.println("Object is a fruit: " + f);
            default -> System.out.println("Object is not recognized");
        }
    }

    private static void oldStyleSwitchNull(Object obj) {
        System.out.println("""
                *****************************
                * Old style switch and null *
                *****************************""");
        try {
            switch (obj) {
                case Integer i -> System.out.println("Object is an integer:" + i);
                case String s -> System.out.println("Object is a string:" + s);
                case FruitType f -> System.out.println("Object is a fruit: " + f);
                default -> System.out.println("Object is not recognized");
            }
        } catch (NullPointerException npe) {
            System.out.println("NullPointerException thrown");
        }
    }

    private static void switchNull(Object obj) {
        System.out.println("""
                *******************
                * Switch and null *
                *******************""");
        switch (obj) {
            case Integer i -> System.out.println("Object is an integer:" + i);
            case String s -> System.out.println("Object is a string:" + s);
            case FruitType f -> System.out.println("Object is a fruit: " + f);
            case null -> System.out.println("Object is null");
            default -> System.out.println("Object is not recognized");
        }
    }

    private static void inefficientCaseRefinement(Object obj) {
        System.out.println("""
                *******************************
                * Inefficient case refinement *
                *******************************""");
        switch (obj) {
            case String s -> System.out.println("Object is a string:" + s);
            case FruitType f -> {
                if (f == FruitType.APPLE) {
                    System.out.println("Object is an apple");
                }
                if (f == FruitType.AVOCADO) {
                    System.out.println("Object is an avocado");
                }
                if (f == FruitType.PEAR) {
                    System.out.println("Object is a pear");
                }
                if (f == FruitType.ORANGE) {
                    System.out.println("Object is an orange");
                }
            }
            case null -> System.out.println("Object is null");
            default -> System.out.println("Object is not recognized");
        }
    }

    private static void caseRefinement(Object obj) {
        System.out.println("""
                *******************
                * Case refinement *
                *******************""");
        switch (obj) {
            case String s -> System.out.println("Object is a string:" + s);
            case FruitType f when (f == FruitType.APPLE) -> {
                System.out.println("Object is an apple");
            }
            case FruitType f when (f == FruitType.AVOCADO) -> {
                System.out.println("Object is an avocado");
            }
            case FruitType f when (f == FruitType.PEAR) -> {
                System.out.println("Object is a pear");
            }
            case FruitType f when (f == FruitType.ORANGE) -> {
                System.out.println("Object is an orange");
            }
            case null -> System.out.println("Object is null");
            default -> System.out.println("Object is not recognized");
        }
    }

    private static void inefficientEnumConstants(Object obj) {
        System.out.println("""
                ******************************
                * Inefficient Enum Constants *
                ******************************""");
        switch (obj) {
            case String s -> System.out.println("Object is a string:" + s);
            case FruitType f when (f == FruitType.APPLE) -> System.out.println("Object is an apple");
            case FruitType f when (f == FruitType.AVOCADO) -> System.out.println("Object is an avocado");
            case FruitType f when (f == FruitType.PEAR) -> System.out.println("Object is a pear");
            case FruitType f when (f == FruitType.ORANGE) -> System.out.println("Object is an orange");
            case CarType c when (c == CarType.CABRIO) -> System.out.println("Object is a cabrio");
            case null -> System.out.println("Object is null");
            default -> System.out.println("Object is not recognized");
        }
    }

    private static void enumConstants(Object obj) {
        System.out.println("""
                ******************
                * Enum Constants *
                ******************""");
        switch (obj) {
            case String s -> System.out.println("Object is a string:" + s);
            case FruitType.APPLE -> System.out.println("Object is an apple");
            case FruitType.AVOCADO -> System.out.println("Object is an avocado");
            case FruitType.PEAR -> System.out.println("Object is a pear");
            case FruitType.ORANGE -> System.out.println("Object is an orange");
            case CarType.CABRIO -> System.out.println("Object is a cabrio");
            case null -> System.out.println("Object is null");
            default -> System.out.println("Object is not recognized");
        }
    }

}
