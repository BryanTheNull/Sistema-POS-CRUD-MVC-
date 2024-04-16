package Controller;

import View.InterfazPrincipal;

import javax.swing.ImageIcon;


/**
 *
 * @author bv587
 */

public class Main {
     public static void main(String[] args) {
        
        // Configuraciones FlatLAF


        // Arrancar menu princial
        InterfazPrincipal principal = new InterfazPrincipal();
        principal.setVisible(true);
        principal.setTitle("SistemaPOS/Principal");
        principal.setLocale(null);
        ImageIcon iconoInterfazPrincipal = new ImageIcon("src/Resources/icon_principal.png");
        principal.setIconImage(iconoInterfazPrincipal.getImage());
    }
}
