/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

class BorderDecorator extends ShapeDecorator {
    private BorderStyle borderStyle;
    private Color borderColor;
    private double borderThickness;

    public BorderDecorator(Shape decoratedShape, BorderStyle borderStyle, Color borderColor, double borderThickness) {
        super(decoratedShape);
        this.borderStyle = borderStyle;
        this.borderColor = borderColor;
        this.borderThickness = borderThickness;
    }

    @Override
    public void draw(Graphics2D g) {
        applyBorder(g);
        decoratedShape.draw(g);
    }

    private void applyBorder(Graphics2D g) {
        g.setColor(getAwtColor(borderColor));
         
        float thickness = (float) borderThickness;

        switch (borderStyle) {
            case DASHED:
                g.setStroke(new BasicStroke(thickness, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0));
                break;
            case SOLID:
                g.setStroke(new BasicStroke(thickness));
                break;
            case DOTTED:
                g.setStroke(new BasicStroke(thickness, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 0, new float[]{1, 1}, 0));
                break;
        } g.drawOval(50, 50, 100, 100);
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