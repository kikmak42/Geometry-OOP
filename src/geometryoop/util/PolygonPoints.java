/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometryoop.util;

/**
 *
 * @author kaushik
 */
public class PolygonPoints {

    private int[] x,y;
    private int sides;

    public PolygonPoints(int[] x, int[] y, int sides) {
        this.x = x;
        this.y = y;
        this.sides = sides;
    }
    
    public void generatePoints(double length){
        double theta = ((2 * Math.PI) / sides);
        for (int i = 0; i < sides; i++) {
            x[i] = (int)(Math.cos((theta * i)-Math.PI/2)*length);
            y[i] = (int)(Math.sin((theta * i)-Math.PI/2)*length);
        }
    }
    
    public void setOffset(int xOffset, int yOffset){
        for (int i = 0 ; i < sides; i++){
            this.x[i] = xOffset + this.x[i];
            this.y[i] = yOffset + this.y[i];
        }
    }
    
}
