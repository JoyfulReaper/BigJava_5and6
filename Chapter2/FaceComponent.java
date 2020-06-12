import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JPanel;
import javax.swing.JComponent;

public class FaceComponent extends JComponent {
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        //Draw head
        Ellipse2D.Double head = new Ellipse2D.Double(5, 10, 100, 150); // 5 right 10 down
        g2.draw(head);

        // Draw eyes
        Line2D.Double eye1 = new Line2D.Double(25, 70, 45, 90);
        Line2D.Double eye2 = new Line2D.Double(85, 70, 65, 90);
        g2.draw(eye1);
        g2.draw(eye2);

        // Draw Mouth
        Rectangle mouth = new Rectangle(30, 130, 50, 5);
        g2.setColor(Color.RED);
        g2.fill(mouth);

        // Draw message
        g2.setColor(Color.BLUE);
        g2.drawString("Hello, World!", 20, 175);
    }
}