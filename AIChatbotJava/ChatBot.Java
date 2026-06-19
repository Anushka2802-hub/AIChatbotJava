import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== AI CHATBOT =====");
        System.out.println("Type 'bye' to exit");

        while(true) {

            System.out.print("You: ");
            String input = sc.nextLine().toLowerCase();

            if(input.contains("hello") || input.contains("hi")) {
                System.out.println("Bot: Hello! Nice to meet you.");
            }

            else if(input.contains("how are you")) {
                System.out.println("Bot: I am doing great.");
            }

            else if(input.contains("java")) {
                System.out.println("Bot: Java is a powerful object-oriented programming language.");
            }

            else if(input.contains("who created java")) {
                System.out.println("Bot: Java was created by James Gosling.");
            }

            else if(input.contains("internship")) {
                System.out.println("Bot: Internships help gain practical experience.");
            }

            else if(input.contains("bye")) {
                System.out.println("Bot: Goodbye!");
                break;
            }

            else {
                System.out.println("Bot: Sorry, I don't understand that.");
            }
        }

        sc.close();
    }
}