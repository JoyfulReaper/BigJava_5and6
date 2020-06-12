import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

/**
 * A component that draws two rectangles 
*/
public class TestComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle r = new Rectangle(10, 10, 50, 100);
        g2.setColor(Color.RED);
        g2.fill(r);

        r.translate(50, 0);
        g2.setColor(Color.BLUE);
        g2.fill(r);

        r.translate(0, 100);
        g2.setColor(Color.GRAY);
        g2.fill(r);

        r.translate(-50, 0);
        g2.setColor(Color.PINK);
        g2.fill(r);

        g2.setColor(Color.BLACK);
        g2.drawString("SQUARES", 25, 220);
    }
}