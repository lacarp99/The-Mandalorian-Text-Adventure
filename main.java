import java.io.*;

class Main {
  public static void main(String[] args) {
		int i = 0;
		while (i < 1) {
			Console console = System.console();
			String input = console.readLine("Enter anything: ");

			if (input.equals("exit")) {
			    break;
			} else if (!input.equals("This is the way")) {
    		System.out.println("I don't know: " + input);
    		System.out.println("That is not the way");
			} else {
				System.out.println("This is the way");
			}

		}

  }
}