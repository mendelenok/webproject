package edu.juniorplus;

import edu.juniorplus.controller.UserController;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        UserController userController = Context.userController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("App is ready to handle requests...");
        System.out.println("Type in your request");
        while(true) {
            String line = scanner.nextLine();
            if ("exit app".equals(line)) {
                break;
            }
            try {
                String response = userController.handleRequest(line);
                System.out.printf("Response: %s%n", response);
            } catch (Exception e) {
                System.out.println("Request cannot be handled due to " + e.getMessage());
            }
        }

    }
}
