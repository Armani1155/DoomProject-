public class Person {
  private String name;
  private int gender;
  private int age = 7;
  private int reputation = 25;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGender() {
    return gender;
  }

  public void setGender(int gender) // set
  {
    this.gender = gender;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) // set
  {
    this.age = age;
  }

  public int getReputation() {
    return reputation;
  }

  public void setReputation(int reputation) // set
  {
    this.reputation = reputation;
  }

}
