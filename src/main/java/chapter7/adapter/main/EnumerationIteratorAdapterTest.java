package chapter7.adapter.main;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import chapter7.adapter.classes.EnumerationAdapter;
import chapter7.adapter.classes.IteratorAdapter;

public class EnumerationIteratorAdapterTest {

  public static void main(String[] args) {

    System.out.println("EnumerationAdapterTest");
    enumerationAdapterTest();

    System.out.println("IteratorAdapterTest");
    iteratorAdapterTest();

  }

  public static void enumerationAdapterTest() {

    Vector<Integer> vector = new Vector<>();
    vector.add(1);
    vector.add(2);
    vector.add(3);
    vector.add(4);
    vector.add(5);

    System.out.println(vector);

    Iterator<Integer> adapter = new EnumerationAdapter<>(vector.elements());

    while (adapter.hasNext()) {
      Integer integer = adapter.next();
      if (integer.equals(3)) {
        try {
          adapter.remove();
          break;
        } catch (UnsupportedOperationException e) {
          System.out.println(e.getMessage());
        }
      }
      System.out.println(integer);
    }

    System.out.println(vector);
  }

  public static void iteratorAdapterTest() {

    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    System.out.println(list);

    Enumeration<Integer> adapter = new IteratorAdapter<>(list.iterator());

    while (adapter.hasMoreElements()) {
      Integer integer = adapter.nextElement();
      System.out.println(integer);
    }

    System.out.println(list);

  }

}
