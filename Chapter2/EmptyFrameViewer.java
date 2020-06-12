import javax.swing.JFrame;

public class EmptyFrameViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(300, 300);
        //frame.setTitle("An Empty Frame :(");
        frame.setTitle("Hello, World!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }

}