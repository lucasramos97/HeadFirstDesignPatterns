package chapter9.iterator.interfaces;

import java.util.Iterator;
import chapter9.iterator.classes.MenuItem;

public interface Menu {

  public Iterator<MenuItem> getIterator();

  public String getName();

}
