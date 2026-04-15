import java.util.*;

public class ChatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("ChatBot: Hello! Type 'exit' to stop.");

        while(true) {
            System.out.print("You: ");
            input = sc.nextLine().toLowerCase();

            if(input.equals("hello")) {
                System.out.println("ChatBot: Hi there!");
            } else if(input.equals("how are you")) {
                System.out.println("ChatBot: I'm fine 😊");
            } else if(input.equals("bye") || input.equals("exit")) {
                System.out.println("ChatBot: Goodbye!");
                break;
            } else {
                System.out.println("ChatBot: I don't understand.");
            }
        }
    }
}