public class if_else {
	public static void main(String[] args) {

		if (20 > 18) {
  		System.out.println("20 is greater than 18");
  		}

  		int x = 20;
		int y = 18;
		if (x > y) {
  		System.out.println("x is greater than y");
		}

		int time = 15;
		if (time < 10) {
		  System.out.println("Good morning.");
		} else if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		// Outputs "Good evening."

		int timee = 20;
		String result = (timee < 18) ? "Good day." : "Good evening.";
		System.out.println(result);


		int doorCode = 1337;

		if (doorCode == 1337) {
		  System.out.println("Correct code. The door is now open.");
		} else {
		  System.out.println("Wrong code. The door remains closed.");
		}

		int myNum = 10; // Is this a positive or negative number?

		if (myNum > 0) {
		  System.out.println("The value is a positive number.");
		} else if (myNum < 0) {
		  System.out.println("The value is a negative number.");
		} else {
		  System.out.println("The value is 0.");
		}

		int myAge = 25;
		int votingAge = 18;

		if (myAge >= votingAge) {
		  System.out.println("Old enough to vote!");
		} else {
		  System.out.println("Not old enough to vote.");
		}

		int mynUm = 5;

		if (mynUm % 2 == 0) {
		  System.out.println(mynUm + " is even");
		} else {
		  System.out.println(mynUm + " is odd");
		} 
	}
}