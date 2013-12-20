/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometryoop.control;

import geometryoop.model.ShapeType;
import geometryoop.view.Main;
import java.awt.Graphics2D;

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

    public void setShape(ShapeType shapeType, double value) {
        this.shapeType = shapeType;
        this.value = value;
        main.getCanvas().repaint();
    }

    public void drawShape(Graphics2D g) {
        if (shapeType != null) {
            shapeType.getGeometryShape().draw(g, value);
        }
    }

    public void setOffset(int x, int y) {
        shapeType.getGeometryShape().setOffset(x, y);
        shapeType.getGeometryShape().setClicked(x, y);
        main.getCanvas().repaint();
    }

    public void setClicked(int x, int y) {
        shapeType.getGeometryShape().setClicked(x, y);
    }
}
