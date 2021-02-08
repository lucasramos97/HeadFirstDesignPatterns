package chapter7.adapter.classes;

import java.util.Enumeration;
import java.util.Iterator;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EnumerationAdapter<T> implements Iterator<T> {

  private Enumeration<T> enumeration;

  @Override
  public boolean hasNext() {
    return this.enumeration.hasMoreElements();
  }

  @Override
  public T next() {
    return enumeration.nextElement();
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException("I can't change collections, sorry...");
  }

}
