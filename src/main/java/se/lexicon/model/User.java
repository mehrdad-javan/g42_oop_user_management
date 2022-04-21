package se.lexicon.model;

public class User extends Person {

  private String id;
  private UserType type;
  private Account account;

  public User(String name, String personalNumber,
              Address address, UserType type, Account account) {
    super(name, personalNumber, address);
    this.type = type;
    this.account = account;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserType getType() {
    return type;
  }

  public void setType(UserType type) {
    if (type == null) setType(UserType.GUEST);
    else this.type = type;
  }

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    if (account == null) throw new RuntimeException("Account was null");
    this.account = account;
  }

  @Override
  public String summaryInformation() {
    return "UserId: " + id + " Username: " + account.getUsername() + " Password: " + account.getPassword();
  }

  @Override
  public String toString() {
    return "User{" +
            "id='" + id + '\'' +
            ", type=" + type +
            ", account=" + account +
            super.toString() +
            '}';
  }

}
