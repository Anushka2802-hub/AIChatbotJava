import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        JFrame f = new JFrame("Test");
        JTextField t = new JTextField();
        f.add(t);
        f.setSize(300,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
