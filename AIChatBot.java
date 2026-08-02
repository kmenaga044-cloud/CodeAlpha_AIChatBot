import java.util.Scanner;

public class AIChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== AI CHATBOT =====");
        System.out.println("Type 'bye' to exit.");

        while (true) {

            System.out.print("\nYou: ");
            String message = sc.nextLine().toLowerCase();

            if (message.equals("hello")) {
                System.out.println("Bot: Hello! Welcome!");
            } 
            else if (message.equals("hi")) {
                System.out.println("Bot: Hi! How can I help you?");
            } 
            else if (message.equals("how are you")) {
                System.out.println("Bot: I am doing great!");
            } 
            else if (message.equals("what is your name")) {
                System.out.println("Bot: My name is CodeAlpha AI ChatBot.");
            } 
            else if (message.equals("thank you")) {
                System.out.println("Bot: You're welcome!");
            } 
            else if (message.equals("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day.");
                break;
            } 
            else {
                System.out.println("Bot: Sorry, I don't understand.");
            }
        }

        sc.close();
    }
}