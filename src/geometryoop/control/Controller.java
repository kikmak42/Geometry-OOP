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
    private int xClicked;
    private int yClicked;

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

    public void setOffset(int x, int y) {
        shapeType.getGeometryShape().setOffset(x-xClicked, y-yClicked);
        this.xClicked = x;
        this.yClicked = y;
        main.getCanvas().repaint();
    }
    
    public void setClicked(int x, int y) {
        this.xClicked=x;
        this.yClicked=y;
    }
}
