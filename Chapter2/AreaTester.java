import java.awt.Rectangle;

public class AreaTester {
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle(0, 0, 50, 50);
        int area =(int) (r.getWidth() * r.getHeight());
        System.out.println("Area: " + area);
        System.out.println("Expected: 2500");
    }
}