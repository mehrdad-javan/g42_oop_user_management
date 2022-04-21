package se.lexicon.dao;

import se.lexicon.model.Account;
import se.lexicon.model.User;

import java.util.Arrays;
import java.util.UUID;

public class UserDaoImpl implements UserDao {

  private User[] users;

  public UserDaoImpl() {
    users = new User[0];
  }


  @Override
  public User[] getAllUsers() {
    return users;
  }

  @Override
  public User createUser(User user) {
    if (user == null) throw new IllegalArgumentException("User Data should not be null");
    if (checkDuplicateUsername(user.getAccount().getUsername()))
      throw new IllegalArgumentException("username is duplicate");
    User[] tmp = Arrays.copyOf(users, users.length + 1);
    user.setId(UUID.randomUUID().toString());
    tmp[tmp.length - 1] = user;
    users = tmp;
    return user;
  }


  private boolean checkDuplicateUsername(String username) {
    if (username == null) throw new IllegalArgumentException("username should not be null");
    for (User user : users) {
      if (user.getAccount().getUsername().equalsIgnoreCase(username)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int getUserCount() {
    return users.length;
  }

  @Override
  public User findUserByUsername(String username) {
    for (User user : users) {
      Account account = user.getAccount();
      if (account.getUsername().equalsIgnoreCase(username)) {
        return user;
      }
    }
    return null;
  }

  @Override
  public boolean login(String username, String password) {
    if (username == null || password == null) {
      throw new IllegalArgumentException("Username or Password should not be null");
    }
    User result = findUserByUsername(username);
    if (result != null) {
      if (result.getAccount().getUsername().equals(username) && result.getAccount().getPassword().equals(password)) {
        return true;
      }
    }
    return false;
  }

  //...

}
