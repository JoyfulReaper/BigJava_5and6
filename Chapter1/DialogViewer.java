import javax.swing.JOptionPane;

public class DialogViewer {
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog(null, "What is your name?");
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
        System.exit(0);
    }
}