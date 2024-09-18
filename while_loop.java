public class while_loop {
  public static void main(String[] args) {

    System.out.println("While loop");
    int i = 0;
    while (i < 5) {
      System.out.println(i);
      i++;
    }

    System.out.println("do While loop");
    int j = 0;
    do {
      System.out.println(j);
      j++;
    }
    while (j < 5);


    System.out.println("While loop_realtime");
    int countdown = 3;

    while (countdown > 0) {
      System.out.println(countdown);
      countdown--;
    }

    System.out.println("Happy New Year!!");

    System.out.println("While loop with if else");

    int dice = 1;

    while (dice <= 6) {
      if (dice < 6) {
        System.out.println("No Yatzy.");
      } else {
        System.out.println("Yatzy!");
      }
      dice = dice + 1;
    }
  }
}