package se.lexicon.util;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PWDGenerator {

  public static String basicPasswordGenerator(int pwdLength){
    // ASCII range – alphanumeric (0-9, a-z, A-Z)
    final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    SecureRandom random = new SecureRandom();
    // each iteration of the loop randomly chooses a character from the given
    // ASCII range and appends it to the `StringBuilder` instance
    return IntStream.range(0, pwdLength)
            .map(i -> random.nextInt(chars.length()))
            .mapToObj(randomIndex -> String.valueOf(chars.charAt(randomIndex)))
            .collect(Collectors.joining());
  }

}
