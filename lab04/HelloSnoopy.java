public class HelloSnoopy {

  public static void main(String[] args) {
    Character[] comicCharacters = new Character[args.length];
    for (int i=0; i < args.length; i++) {
      Character newComicCharacter = new Character();
      newComicCharacter.setName(args[i]);
      comicCharacters[i] = newComicCharacter;
    }

    for (Character currentComicCharacter : comicCharacters) {
      System.out.println(String.format("Hello %1$s!", currentComicCharacter.getName()));
    }
  }
}
