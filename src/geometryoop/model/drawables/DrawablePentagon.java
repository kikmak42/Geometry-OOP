/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometryoop.model.drawables;

import geometryoop.model.GeometryShape;
import java.awt.Graphics2D;

/**
 *
 * @author kaushik
 */
public class DrawablePentagon extends GeometryShape{
    
    @Override
    public void draw(Graphics2D gd, double value){
        System.out.println("Pentagon");
    }       
}
