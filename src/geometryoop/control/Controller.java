/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometryoop.control;

import geometryoop.model.ShapeType;
import geometryoop.view.Main;

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
