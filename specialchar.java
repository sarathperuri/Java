public class specialchar {
  public static void main(String[] args) {

    // The sequence \"  inserts a double quote in a string:
    String txt = "We are the so-called \"Vikings\" from the north.";
    System.out.println(txt);

    //The sequence \'  inserts a single quote in a string:
    String txt1 = "It\'s alright.";
    System.out.println(txt1);

    //The sequence \\  inserts a single backslash in a string
    String txt2 = "The character \\ is called backslash.";
    System.out.println(txt2);

    // \n Escape sequence
    String txt3 = "Hello\nWorld!";
    System.out.println(txt3);

    // \r Escape sequence
    String txt4 = "Hello\rWorld!";
    System.out.println(txt4);

    // \t Escape sequences
    String txt5 = "Hello\tWorld!";
    System.out.println(txt5);

    // \b Escape sequence
    String txt6 = "Hel\blo World!";
    System.out.println(txt6);
  }
}