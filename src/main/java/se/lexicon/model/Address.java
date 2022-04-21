package se.lexicon.model;

public class Address {

  private String city;
  private String street;
  private String zipCode;

  public Address(String city, String street, String zipCode) {
    setCity(city);
    setStreet(street);
    setZipCode(zipCode);
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    if (city == null) throw new IllegalArgumentException("Parameter: String city was null");
    this.city = city;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    if (street == null) throw new IllegalArgumentException("Parameter: String street was null");
    this.street = street;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    if (zipCode == null) throw new IllegalArgumentException("Parameter: String zipCode was null");
    this.zipCode = zipCode;
  }

}
