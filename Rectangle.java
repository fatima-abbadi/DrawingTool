/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

class Rectangle implements Shape {
    @Override
    public void draw(Graphics2D g) {
       
        g.fillRect(50, 50, 100, 100);
    }
 
    @Override
    public String description() {
        return "Rectangle";
    }
}

