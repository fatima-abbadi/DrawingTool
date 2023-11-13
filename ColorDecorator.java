
package decoratorpattern;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;



class ColorDecorator extends ShapeDecorator {
    private Color color;

    public ColorDecorator(Shape decoratedShape, Color color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g) {
        applyColor(g);
        
        decoratedShape.draw(g);
    }

    private void applyColor(Graphics2D g) {
        g.setColor(getAwtColor(color));
    }

    private java.awt.Color getAwtColor(Color color) {
        switch (color) {
            case RED:
                return java.awt.Color.RED;
            case GREEN:
                return java.awt.Color.GREEN;
            case BLUE:
                return java.awt.Color.BLUE;
            case WHITE:
                return java.awt.Color.WHITE;
            case BLACK:
                return java.awt.Color.BLACK;
            default:
                return java.awt.Color.BLACK;
        }
    }
}
