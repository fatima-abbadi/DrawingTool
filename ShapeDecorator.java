/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;


abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw(Graphics2D g) {
        decoratedShape.draw(g);
    }

    @Override
    public String description() {
        return decoratedShape.description();
    }
}


