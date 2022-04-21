package se.lexicon;


import se.lexicon.dao.UserDao;
import se.lexicon.dao.UserDaoImpl;
import se.lexicon.model.Account;
import se.lexicon.model.Address;
import se.lexicon.model.User;

public class ConsoleUI {


  public static void main(String[] args) {

    Address address = new Address("växjö", "teleborg", "35252");
    Account account = new Account("admin", 2);
    User testUser = new User("test name", "123456-1234", address, null, account);
    UserDao storage = new UserDaoImpl();

    User createdUser = storage.createUser(testUser);
    System.out.println(createdUser.summaryInformation());


  }


}
