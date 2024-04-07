package View;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.ImageIcon;

/**
 * @author 
 * @version 1.0
 * @since 2024-04-06 
 * Descripcion: Clase para manejar la conexión con la base de
 * datos MySQL.
 */
public class InterfazPrincipal extends javax.swing.JFrame {

    public InterfazPrincipal() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        BackgroundPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 700));

        BackgroundPrincipal.setBackground(new java.awt.Color(255, 204, 204));
        BackgroundPrincipal.setMinimumSize(new java.awt.Dimension(1366, 768));

        javax.swing.GroupLayout BackgroundPrincipalLayout = new javax.swing.GroupLayout(BackgroundPrincipal);
        BackgroundPrincipal.setLayout(BackgroundPrincipalLayout);
        BackgroundPrincipalLayout.setHorizontalGroup(
            BackgroundPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        BackgroundPrincipalLayout.setVerticalGroup(
            BackgroundPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        FlatLightLaf.setup();
        // Instanciar la clase para cargarla.
        Login login = new Login();
        login.setVisible(true);
        login.setTitle("SistemaPOS/Login");
        login.setLocale(null);
        ImageIcon icono = new ImageIcon("src/Resources/contrasena.png");
        login.setIconImage(icono.getImage());
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPrincipal;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
