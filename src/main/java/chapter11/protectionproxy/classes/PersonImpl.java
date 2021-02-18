package chapter11.protectionproxy.classes;

import chapter11.protectionproxy.interfaces.Person;

public class PersonImpl implements Person {

  private String name;
  private String gender;
  private String interests;
  private int rating;
  private int ratingCount;

  public PersonImpl() {
    ratingCount = 0;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getGender() {
    return gender;
  }

  @Override
  public String getInterests() {
    return interests;
  }

  @Override
  public int getGeekRating() {

    if (ratingCount == 0) {
      return 0;
    }

    return (rating / ratingCount);
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void setGender(String gender) {
    this.gender = gender;
  }

  @Override
  public void setInterests(String interests) {
    this.interests = interests;
  }

  @Override
  public void setGeekRating(int rating) {
    this.rating += rating;
    ratingCount++;
  }



}
