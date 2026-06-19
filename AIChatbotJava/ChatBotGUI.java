import javax.swing.*;
import java.awt.*;

public class ChatBotGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("AI ChatBot");

        JTextArea chatArea = new JTextArea();
        chatArea.setEditable(false);

        JTextField inputField = new JTextField();

        JButton sendButton = new JButton("Send");

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(inputField, BorderLayout.CENTER);
        panel.add(sendButton, BorderLayout.EAST);

        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(chatArea), BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

        sendButton.addActionListener(e -> {
            String userText = inputField.getText();

            chatArea.append("You: " + userText + "\n");
            chatArea.append("Bot: Hello!\n\n");

            inputField.setText("");
        });

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}