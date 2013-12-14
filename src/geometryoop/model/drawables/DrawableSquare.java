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
public class DrawableSquare extends GeometryShape{
    
    @Override
    public void draw(Graphics2D gd, double value){
         int sides = 4;
        int[] xpoints = new int[sides];
        int[] ypoints = new int[sides];
        
        PolygonPoints p = new PolygonPoints(xpoints,ypoints,sides);
        p.generatePoints(value);
        p.setOffset((int)value,(int)value);
        
        gd.setColor(Color.BLUE);
        gd.scale(value*0.1, value*0.1);
        gd.fillPolygon(new Polygon(xpoints, ypoints, sides));
    }   
}
