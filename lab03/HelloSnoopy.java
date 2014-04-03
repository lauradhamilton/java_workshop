public class HelloSnoopy {

  public static void main(String[] args) {
    Character comicCharacter = new Character();
    comicCharacter.setName("Snoopy");
    System.out.println(String.format("Hello %1$s!", comicCharacter.getName()));
  }
}
