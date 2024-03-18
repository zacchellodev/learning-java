import java.util.Scanner;

public class HelloUser {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("What's your name?");
    String name = scan.nextLine();

    System.out.printf("Hello %s! %n", name);

    scan.close();
  }
}
