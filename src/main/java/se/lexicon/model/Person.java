package se.lexicon.model;

public abstract class Person {

  private String name;
  private String personalNumber;
  private Address address;

  public Person(String name, String personalNumber, Address address) {
    this(name, personalNumber);
    this.address = address;
  }

  public Person(String name, String personalNumber) {
    this.name = name;
    this.personalNumber = personalNumber;
  }

  protected abstract String summaryInformation();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPersonalNumber() {
    // todo : check the param should not be null
    return personalNumber;
  }

  public void setPersonalNumber(String personalNumber) {
    this.personalNumber = personalNumber;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", personalNumber='" + personalNumber + '\'' +
            ", address=" + address +
            '}';
  }

}
