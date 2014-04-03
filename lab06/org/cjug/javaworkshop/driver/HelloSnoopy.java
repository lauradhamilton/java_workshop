package org.cjug.javaworkshop.driver;

import org.cjug.javaworkshop.domain.Character;

public class HelloSnoopy {

  public static void main(String[] args) {

    Character[] comicCharacters = new Character[args.length];
    
    for (int i=0; i < args.length; i++) {
      String firstName = args[i];
      String lastName = null;

      if ("Snoopy".equals(firstName)) {
        lastName = "(My owner is Charlie)";
      }
      else if ("Charlie".equals(firstName) || "Sally".equals(firstName)) {
        lastName = "Brown";
      }
      else if ("Lucy".equals(firstName) || "Linus".equals(firstName)) {
        lastName = "Van Pelt";
      }
      else {
        lastName = "(unknown last name)";
      }

      Character newComicCharacter = new Character();

      newComicCharacter.setName(String.format("%1$s %2$s", firstName, lastName));

      comicCharacters[i] = newComicCharacter;

    }

    for (Character currentComicCharacter : comicCharacters) {
      System.out.println(String.format("Hello %1$s!", currentComicCharacter.getName()));
    }
  }
}
