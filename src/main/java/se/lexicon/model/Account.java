package se.lexicon.model;

import se.lexicon.util.PWDGenerator;

public class Account {

  private String username;
  private String password;
  private boolean accountExpired;
  private boolean accountBlocked;
  private boolean enable;
  private int role;
  //...


  public Account(String username, int role) {
    this.username = username;
    this.role = role;
    this.password = PWDGenerator.basicPasswordGenerator(10);
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    if (username == null) throw new RuntimeException("Username was null");
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean isAccountExpired() {
    return accountExpired;
  }

  public void setAccountExpired(boolean accountExpired) {
    this.accountExpired = accountExpired;
  }

  public boolean isAccountBlocked() {
    return accountBlocked;
  }

  public void setAccountBlocked(boolean accountBlocked) {
    this.accountBlocked = accountBlocked;
  }

  public boolean isEnable() {
    return enable;
  }

  public void setEnable(boolean enable) {
    this.enable = enable;
  }

  public int getRole() {
    return role;
  }

  public void setRole(int role) {
    this.role = role;
  }

  @Override
  public String toString() {
    return "Account{" +
            "username='" + username + '\'' +
            ", role=" + role +
            '}';
  }
}
