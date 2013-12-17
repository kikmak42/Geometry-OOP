/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometryoop.model.drawables;

import geometryoop.model.GeometryShape;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author kaushik
 */
public class DrawableCircle extends GeometryShape {

    @Override
    public void draw(Graphics2D gd, double value) {
        gd.setColor(Color.BLUE);
        gd.fill(new Ellipse2D.Double(xOffset + 0, yOffset + 0, value * 2, value * 2));   // will draw a filled circle
    }
}
