/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometryoop.model;

import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author kaushik
 */
public class GeometryShape {

    protected int xOffset;
    protected int yOffset;

    protected GeometryShape() {
        xOffset = 0;
        yOffset = 0;
    }

    public void draw(Graphics2D gd, double value) {
    }

    public void setOffset(int xOffset, int yOffset) {
        this.xOffset = xOffset+this.xOffset;
        this.yOffset = yOffset+this.yOffset;     
    }
}