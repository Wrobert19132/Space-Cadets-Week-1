import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main me = new Main();
        me.go();
    }

    private void go() {
        UserFinder userFinder = new UserFinder();
        Scanner inputScanner = new Scanner(System.in);
        String username = "";
        while (userFinder.nameInvalid(username)){
            System.out.print("Enter the user's 3 letter long username: ");
            username = inputScanner.nextLine();
            if (userFinder.nameInvalid(username)) {
                System.out.println("Username was not valid!");
            }
        }

        System.out.println("Searching...");
        try {
            User user = userFinder.loadUser(username);
            displayUser(user);
        } catch (IOException e) {
            System.out.println("Username invalid!");
        }
    }

    private void displayUser(User user) {
        System.out.println(user.getName());
        System.out.println("Phone: " + user.getPhone());
        System.out.println("email: " + user.getEmail());
    }
}

