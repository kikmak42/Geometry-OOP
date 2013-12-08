/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometryoop.util;

/**
 *
 * @author kaushik
 */
import java.awt.*;
import java.awt.geom.*;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CircleDraw extends JPanel {
 @Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.BLUE);
		g2d.draw(new Ellipse2D.Double(25, 25, 200, 200));
	}
	
}
