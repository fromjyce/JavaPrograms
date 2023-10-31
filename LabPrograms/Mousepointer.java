import java.awt.MouseInfo;
import java.awt.Point;

public class Mousepointer {
    public static void main(String[] args) {
        while (true) {
            Point p = MouseInfo.getPointerInfo().getLocation();
            System.out.println("X: " + p.x + ", Y: " + p.y);
        }
    }
}
