/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometryoop.model;

import java.awt.Graphics2D;

/**
 *
 * @author kaushik
 */
public abstract class GeometryShape {

    protected int xOffset;
    protected int yOffset;
    protected int xClicked;
    protected int yClicked;

    protected GeometryShape() {
        xOffset = 0;
        yOffset = 0;
    }

    public abstract void draw(Graphics2D gd, double value);

    public void setOffset(int xOffset, int yOffset) {
        this.xOffset = xOffset + this.xOffset - xClicked;
        this.yOffset = yOffset + this.yOffset - yClicked;
    }

    public void setClicked(int x, int y) {
        this.xClicked = x;
        this.yClicked = y;
    }
}