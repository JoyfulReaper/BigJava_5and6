import javax.swing.JOptionPane;

public class Project1_1
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("What is your name?");
        String input = JOptionPane.showInputDialog("What would you like me to do?");
        JOptionPane.showMessageDialog(null, "I'm sorry, " + name + ". I'm afriad I can't do that.", "Nope!", JOptionPane.ERROR_MESSAGE);
    }
}