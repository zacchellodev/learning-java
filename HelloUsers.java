import java.util.Scanner;

public class HelloUsers {
  public static void main(String[] args) {
    class User {
      String name;
      byte age;
    
      public User(String name, byte age) {
        this.name = name;
        this.age = age;
      }
    }

    Scanner scan = new Scanner(System.in);

    System.out.println("Quantos usuarios deseja registrar?");
    byte numeroUsers = scan.nextByte();
    scan.nextLine();

    User[] users = new User[numeroUsers];
    
    for (byte i = 0; i < numeroUsers; i++) {
      System.out.printf("%d: Username:%n", i + 1);
      String username = scan.nextLine();

      System.out.printf("%d: User age:%n", i + 1);
      byte age = scan.nextByte();
      scan.nextLine();

      users[i] = new User(username, age);

      System.out.println();
    }

    for (User user : users) {
      System.out.printf("User registered:\n - User name: %s\n - User age: %d\n%n", user.name, user.age);
    }

    scan.close();
  }
}
