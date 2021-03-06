/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometryoop.model.drawables;

import geometryoop.model.GeometryShape;
import geometryoop.util.PolygonPoints;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author kaushik
 */
public class DrawableTriangle extends GeometryShape {

    @Override
    public void draw(Graphics2D gd, double value) {
        int sides = 3;
        int[] xpoints = new int[sides];
        int[] ypoints = new int[sides];

        PolygonPoints p = new PolygonPoints(xpoints, ypoints, sides);
        p.generatePoints(value);
        p.setOffset(xOffset + (int) value, yOffset + (int) value);

        gd.setColor(Color.BLUE);
        gd.fillPolygon(new Polygon(xpoints, ypoints, sides));
    }
}
