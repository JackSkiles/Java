package Rectangles;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Image;
import java.awt.Toolkit;
/** 7 A component that draws two rectangles. 8 */
public class RectangleComponent extends JComponent {
    public void paintComponent(Graphics g) {// Recover Graphics2D
        Image img = Toolkit.getDefaultToolkit().getImage("kqn9i7ka7h251.jpg");
        Graphics2D g2 = (Graphics2D) g;
        // Construct a rectangle and draw it
        Rectangle box = new Rectangle(20, 25, 30, 40);
        g2.draw(box);
        // Move rectangle 15 units to the right and 25 units down
        box.translate(150, 250); 
        // Draw moved rectangle
        g2.draw(box);
        g2.drawString("Hello", 200, 300);
        g2.drawImage(img, 0, 0, null);
    }
}