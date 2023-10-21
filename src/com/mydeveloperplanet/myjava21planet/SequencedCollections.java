package com.mydeveloperplanet.myjava21planet;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SequencedCollections {

    public static void main(String[] args) {
        sequencedCollection();
        sequencedSet();
        sequencedMap();
    }

    private static void sequencedCollection() {
        System.out.println("""
                ************************
                * Sequenced Collection *
                ************************""");
        List<String> sc = Stream.of("Alpha", "Bravo", "Charlie", "Delta").collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Initial list: " + sc);
        System.out.println("Reversed list: " + sc.reversed());
        System.out.println("First item: " + sc.getFirst());
        System.out.println("Last item: " + sc.getLast());
        sc.addFirst("Before Alpha");
        sc.addLast("After Delta");
        System.out.println("Added new first and last item: " + sc);
    }

    private static void sequencedSet() {
        System.out.println("""
                *****************
                * Sequenced Set *
                *****************""");
        SortedSet<String> sortedSet = new TreeSet<>(Set.of("Charlie", "Alpha", "Delta", "Bravo"));
        System.out.println("Initial list: " + sortedSet);
        System.out.println("Reversed list: " + sortedSet.reversed());
        System.out.println("First item: " + sortedSet.getFirst());
        System.out.println("Last item: " + sortedSet.getLast());
        try {
            sortedSet.addFirst("Before Alpha");
        } catch (UnsupportedOperationException uoe) {
            System.out.println("addFirst is not supported");
        }
        try {
            sortedSet.addLast("After Delta");
        } catch (UnsupportedOperationException uoe) {
            System.out.println("addLast is not supported");
        }
    }

    private static void sequencedMap() {
        System.out.println("""
                *****************
                * Sequenced Map *
                *****************""");
        LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
        hm.put(1, "Alpha");
        hm.put(2, "Bravo");
        hm.put(3, "Charlie");
        hm.put(4, "Delta");
        System.out.println("== Initial List ==");
        printMap(hm);
        System.out.println("== Reversed List ==");
        printMap(hm.reversed());
        System.out.println("First item: " + hm.firstEntry());
        System.out.println("Last item: " + hm.lastEntry());
        System.out.println(" == Added new first and last item ==");
        hm.putFirst(5, "Before Alpha");
        hm.putLast(3, "After Delta");
        printMap(hm);
    }

    private static void printMap(Map<Integer, String> map) {
        for (Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

}
