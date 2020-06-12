import javax.swing.JFrame;

public class TestViewer {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("Just Some tests");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TestComponent Component = new TestComponent();

        frame.add(Component);
        frame.setVisible(true);
    }
}