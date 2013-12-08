/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometryoop.model;

import geometryoop.model.drawables.DrawableCircle;
import geometryoop.model.drawables.DrawableHexagon;
import geometryoop.model.drawables.DrawablePentagon;
import geometryoop.model.drawables.DrawableSquare;
import geometryoop.model.drawables.DrawableTriangle;

/**
 *
 * @author kaushik
 */
public enum ShapeType {

    CIRCLE(new DrawableCircle()), SQUARE(new DrawableSquare()), TRIANGLE(new DrawableTriangle()), PENTAGON(new DrawablePentagon()), HEXAGON(new DrawableHexagon());
    
    private GeometryShape geometryShape;

    private ShapeType(GeometryShape geometryShape) {
        this.geometryShape = geometryShape;
    }

    public GeometryShape getGeometryShape() {
        return geometryShape;
    }
}
