/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometryoop.model.drawables;

import geometryoop.model.GeometryShape;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author kaushik
 */
public class DrawableTriangle extends GeometryShape{
    
    @Override
    public void draw(Graphics2D gd, double value){
        int[] xpoints = new int[3];
        int[] ypoints = new int[3];
        double factor=(value/200);
        xpoints[0]=(int)(50*factor);
        xpoints[2]=(int)(150*factor);
        ypoints[0]=(int)(250*factor);
        ypoints[1]=(int)(250*factor);
        ypoints[2]=(int)(77*factor);
        xpoints[1]=(int)(250*factor);
        
        gd.setColor(Color.BLUE);
        gd.fillPolygon(new Polygon(xpoints, ypoints, 3));
    }   
}
