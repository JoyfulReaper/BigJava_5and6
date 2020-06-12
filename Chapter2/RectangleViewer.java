import javax.swing.JFrame;

public class RectangleViewer {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("Two Rectangles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //RectangleComponent component = new RectangleComponent();
        SquareComponent bComponent = new SquareComponent();
        //frame.add(component);
        frame.add(bComponent);
        frame.setVisible(true);
    }
}