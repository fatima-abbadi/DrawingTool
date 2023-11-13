
package decoratorpattern;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class DrawingToolTest extends JFrame {
    public DrawingToolTest() {
        setTitle("Drawing Tool Test");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        Shape circle = new Circle();
                 

        circle= new ColorDecorator(circle, Color.RED);
       
        circle = new BorderDecorator(circle, BorderStyle.DASHED, Color.BLACK, 2.0);

        circle.draw(g2d);

        System.out.println("Description: " + circle.description());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DrawingToolTest drawingToolTest = new DrawingToolTest();
            drawingToolTest.setVisible(true);
        });
    }
}