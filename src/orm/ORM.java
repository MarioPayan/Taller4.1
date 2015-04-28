/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orm;

import Vista.VentanaPrincipal;
import java.util.Locale;

/**
 *
 * @author marioapv
 */
public class ORM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VentanaPrincipal vent = new VentanaPrincipal();
        vent.setVisible(true);
        vent.setDefaultCloseOperation(VentanaPrincipal.EXIT_ON_CLOSE);
        vent.setLocation(350, 250);
    }
    
}
