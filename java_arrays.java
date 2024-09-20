public class java_arrays {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    System.out.println(cars[0]);


    String[] carss = {"Volvo", "BMW", "Ford", "Mazda"};
    carss[0] = "Opel";
    System.out.println(carss[0]);

    String[] carsss = {"Volvo", "BMW", "Ford", "Mazda"};
    System.out.println(carsss.length);


    String[] carrs = {"Volvo", "BMW", "Ford", "Mazda"};
    for (int i = 0; i < carrs.length; i++) {
    System.out.println(carrs[i]);
    }

System.out.println("For each");

    String[] caars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String j : caars) {
    System.out.println(j);
    }
  }
}