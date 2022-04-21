package se.lexicon.dao;

import se.lexicon.model.User;

public interface UserDao {

  // CRUD -> Create, Read, Update & Delete
  // login method

  User[] getAllUsers();
  User createUser(User user);
  int getUserCount();
  User findUserByUsername(String username);
  boolean login(String username, String password);

  //more abstract methods...
}
