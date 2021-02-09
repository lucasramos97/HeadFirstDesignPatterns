package chapter8.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import chapter8.classes.Duck;

public class DuckSortTestDrive {

  public static void main(String[] args) {

    List<Duck> ducks = new ArrayList<>();
    ducks.add(new Duck("Daffy", 8));
    ducks.add(new Duck("Dewey", 2));
    ducks.add(new Duck("Howard", 7));
    ducks.add(new Duck("Louie", 2));
    ducks.add(new Duck("Donald", 10));
    ducks.add(new Duck("Huey", 2));

    System.out.println("Before sorting:");
    ducks.stream().forEach(System.out::println);

    List<Duck> ducksSorting = ducks.stream().sorted(Comparator.comparingInt(Duck::getWeight))
        .collect(Collectors.toList());

    System.out.println("\nAfter sorting:");
    ducksSorting.stream().forEach(System.out::println);

  }

}
