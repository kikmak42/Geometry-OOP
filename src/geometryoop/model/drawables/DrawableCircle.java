/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometryoop.model.drawables;

import geometryoop.util.CircleDraw;
import geometryoop.model.GeometryShape;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author kaushik
 */
public class DrawableCircle extends GeometryShape{
    
    @Override
    public void draw(Graphics2D gd, double value){
        gd.setColor(Color.BLUE);
        gd.fill(new Ellipse2D.Double(0, 0, value*2, value*2));   // will draw a filled circle
        //gd.draw(new Ellipse2D.Double(25, 25, 200, 200));  // will draw only the outline
    }
}
