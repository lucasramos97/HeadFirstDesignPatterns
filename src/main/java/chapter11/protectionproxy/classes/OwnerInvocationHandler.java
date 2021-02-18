package chapter11.protectionproxy.classes;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import chapter11.protectionproxy.interfaces.Person;

public class OwnerInvocationHandler implements InvocationHandler {

  private Person person;

  public OwnerInvocationHandler(Person person) {
    this.person = person;
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {

    try {

      if (method.getName().startsWith("get")) {

        return method.invoke(person, args);

      } else if (method.getName().equals("setGeekRating")) {

        throw new IllegalAccessException();

      } else if (method.getName().startsWith("set")) {

        return method.invoke(person, args);
      }
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }

    return null;
  }
}
