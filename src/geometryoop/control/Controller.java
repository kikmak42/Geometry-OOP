/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometryoop.control;

import geometryoop.model.GeometryShape;
import geometryoop.model.ShapeType;
import geometryoop.model.drawables.DrawableCircle;
import geometryoop.model.drawables.DrawableHexagon;
import geometryoop.model.drawables.DrawablePentagon;
import geometryoop.model.drawables.DrawableSquare;
import geometryoop.model.drawables.DrawableTriangle;
import geometryoop.view.Main;
import java.awt.Graphics2D;
import java.util.HashMap;
import javax.swing.JPanel;

/**
 *
 * @author kaushik
 */
public class Controller {

    private ShapeType shapeType;
    private double value;
    private Main main;
    
    
    public Controller(Main main) {
        this.main = main;
    }
    
    
    public void drawShape(ShapeType shapeType, double value) {
        this.shapeType = shapeType;
        this.value = value;
        main.getCanvas().repaint();
        
    }

    public ShapeType getShapeType() {
        return shapeType;
    }

    public double getValue() {
        return value;
    }

}
