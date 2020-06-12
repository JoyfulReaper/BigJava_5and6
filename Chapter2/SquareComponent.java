import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 * A component that draws two rectangles 
*/
public class SquareComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        // Construct a rectangle and draw it
        Rectangle box = new Rectangle(5, 10, 50, 50);
        g2.draw(box);

        // Move rectangle 15 units to the right and 25 units down
        box.translate(15, 25);
        g2.draw(box);
    }
}