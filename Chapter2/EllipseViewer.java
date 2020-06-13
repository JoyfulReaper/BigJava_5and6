import javax.swing.JFrame;

public class EllipseViewer {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("Bloooop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        EllipseComponent c = new EllipseComponent();

        frame.add(c);
        frame.setVisible(true);
    }
}