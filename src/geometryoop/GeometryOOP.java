/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometryoop;

import geometryoop.control.Controller;
import geometryoop.view.Main;

/**
 *
 * @author kaushik
 */
public class GeometryOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Main main = new Main();
        Controller controller = new Controller(main);
        main.setController(controller);
        main.setVisible(true);
    }
}
