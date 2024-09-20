public class for_loop {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

      System.out.println("another example");

    for (int i = 0; i <= 10; i = i + 2) {
      System.out.println(i);
    }

      System.out.println("Nested loop");

      // Outer loop.
    for (int i = 1; i <= 2; i++) {
      System.out.println("Outer: " + i); // Executes 2 times
    
      // Inner loop
      for (int j = 1; j <= 3; j++) {
        System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
      }
      }
      System.out.println("For each");

    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String k : cars) {
    System.out.println(k);
      
    } 
  }
}