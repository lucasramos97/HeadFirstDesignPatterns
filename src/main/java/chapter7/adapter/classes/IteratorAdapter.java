package chapter7.adapter.classes;

import java.util.Enumeration;
import java.util.Iterator;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IteratorAdapter<E> implements Enumeration<E> {

  private Iterator<E> iterator;

  @Override
  public boolean hasMoreElements() {
    return this.iterator.hasNext();
  }

  @Override
  public E nextElement() {
    return this.iterator.next();
  }

}
