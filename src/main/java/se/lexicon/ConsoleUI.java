package se.lexicon;


import se.lexicon.dao.UserDao;
import se.lexicon.dao.UserDaoImpl;
import se.lexicon.model.Account;
import se.lexicon.model.Address;
import se.lexicon.model.User;

import java.util.Scanner;

public class ConsoleUI {


  public static void main(String[] args) {

   /*Address address = new Address("växjö", "teleborg", "35252");
    Account account = new Account("admin", 2);
    User testUser = new User("test name", "123456-1234", address, null, account);
    UserDao storage = new UserDaoImpl();

    User createdUser = storage.createUser(testUser);
    System.out.println(createdUser.summaryInformation());*/


    UserDao data = new UserDaoImpl();
    while (true) {
      System.out.println("#### Welcome to UMS App ####");
      System.out.println("#### 1. Login ##############");
      System.out.println("#### 2. Register ###########");
      System.out.println("#### 3. Exit ###############");
      System.out.println("############################");
      System.out.println(">>>>>Enter a valid operation: ");
      Scanner scanner = new Scanner(System.in);
      String input = scanner.next();
      switch (input) {
        case "1":
          // login method
          System.out.println("Enter username:");
          String u = scanner.next();
          System.out.println("Enter password:");
          String p = scanner.next();
          boolean isLogin = data.login(u, p);
          if (isLogin) {
            while (isLogin) {
              System.out.println("##### Welcome to Main Menu #####");
              System.out.println("##### 1. Show Users ############");
              System.out.println("##### 2. Search user by username");
              System.out.println("##### 3. Logout ################");
              System.out.println("Enter a valid operation: ");
              String operationType = scanner.next();
              // todo: implement the main menu functionalities
              switch (operationType){
                case "1":
                  // todo: call show users method
                  break;
                case "2":
                  // todo: call Search user by username method
                  break;
                case "3":
                  isLogin = false;
                  break;
              }
            }
          } else {
            System.out.println("username or password is not valid");
          }
          break;
        case "2":
          // register method
          System.out.println("##Address Information");
          System.out.println("Enter city");
          String city = scanner.next();
          System.out.println("Enter street");
          String street = scanner.next();
          System.out.println("Enter zipCode");
          String zipCode = scanner.next();
          Address address = new Address(city, street, zipCode);

          System.out.println("##Account Information");
          System.out.println("Enter username:");
          String username = scanner.next();
          System.out.println("Enter role:");
          String role = scanner.next();
          Account account= new Account(username,Integer.parseInt(role));

          System.out.println("User Information:");
          System.out.println("Enter Name:");
          String name = scanner.next();
          System.out.println("Enter Personal Number:");
          String pn = scanner.next();

          User user= new User(name,pn,address,null, account);

          User createdUser = data.createUser(user);
          System.out.println(createdUser.summaryInformation());

          break;
        case "3":
          System.exit(0);
        default:
          System.out.println("Operation is not valid");
      }

    }


  }


}
