package View;

import View.Jpanel.Clientes;
import View.Jpanel.Inicio;
import View.Jpanel.Productos;
import View.Jpanel.Proveedores;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;


/**
 * @author 
 * @version 1.0
 * @since 2024-04-06 
 * Descripcion: Creacion de Interfaz principal y sus componentes.
 */
public class InterfazPrincipal extends javax.swing.JFrame {

    public InterfazPrincipal() {
        initComponents();    
                
        // Cargar FlatLAF Y SUS CONFIGURACIONES
        FlatLightLaf.setup();
        ConfigurarBarraNavegacion();
        
        // Iniciar el programa con el menu Princial
        Inicio inicio = new Inicio();
        ShowPanel(inicio);
        
        
        
    }
    
    private void ShowPanel(JPanel p){
        p.setSize(1100, 630);
        p.setLocation(0 ,0);
        
        Contenedor.removeAll();
        Contenedor.add(p, BorderLayout.CENTER);
        Contenedor.revalidate();
        Contenedor.repaint();
    }
    
    
    
    void ConfigurarBarraNavegacion(){
        // BTN Inicio
        btnInicio.setBorder(null);
        btnInicio.setOpaque(false);
        btnInicio.setFocusPainted(false);
        btnInicio.setForeground(Color.WHITE);
        
        
        // BTN Productos
        btnProductos.setBorder(null);
        btnProductos.setOpaque(false);
        btnProductos.setFocusPainted(false);
        btnProductos.setForeground(Color.WHITE);
        
        // BTN Clientes
        btnClientes.setBorder(null);
        btnClientes.setOpaque(false);
        btnClientes.setFocusPainted(false);
        btnClientes.setForeground(Color.WHITE);
        
        // BTN Proveedores
        btnNuevaVenta.setBorder(null);
        btnNuevaVenta.setOpaque(false);
        btnNuevaVenta.setFocusPainted(false);
        btnNuevaVenta.setForeground(Color.WHITE);
        
        
    }
    
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        BarraNavegacion = new javax.swing.JPanel();
        jLogo = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnNuevaVenta = new javax.swing.JButton();
        Contenedor = new javax.swing.JPanel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 800));
        setPreferredSize(new java.awt.Dimension(1300, 800));

        BarraNavegacion.setBackground(new java.awt.Color(23, 162, 180));
        BarraNavegacion.setMinimumSize(new java.awt.Dimension(1300, 100));
        BarraNavegacion.setPreferredSize(new java.awt.Dimension(1300, 100));

        jLogo.setBackground(new java.awt.Color(255, 255, 255));
        jLogo.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLogo.setForeground(new java.awt.Color(255, 255, 255));
        jLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/contrasena.png"))); // NOI18N
        jLogo.setText("NOMBRE");
        jLogo.setMinimumSize(new java.awt.Dimension(128, 50));
        jLogo.setPreferredSize(new java.awt.Dimension(180, 50));

        btnInicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icon_productos.png"))); // NOI18N
        btnInicio.setText("INICIO");
        btnInicio.setMinimumSize(new java.awt.Dimension(128, 50));
        btnInicio.setPreferredSize(new java.awt.Dimension(180, 50));
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnProductos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icon_productos.png"))); // NOI18N
        btnProductos.setText("PRODUCTOS");
        btnProductos.setMinimumSize(new java.awt.Dimension(128, 50));
        btnProductos.setPreferredSize(new java.awt.Dimension(180, 50));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icon_productos.png"))); // NOI18N
        btnClientes.setText("CLIENTES");
        btnClientes.setMinimumSize(new java.awt.Dimension(128, 50));
        btnClientes.setPreferredSize(new java.awt.Dimension(180, 50));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnProveedores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icon_productos.png"))); // NOI18N
        btnProveedores.setText("PROVEDORES");
        btnProveedores.setMinimumSize(new java.awt.Dimension(128, 50));
        btnProveedores.setPreferredSize(new java.awt.Dimension(180, 50));
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });

        btnNuevaVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icon_productos.png"))); // NOI18N
        btnNuevaVenta.setText("NUEVA VENTA");
        btnNuevaVenta.setMinimumSize(new java.awt.Dimension(128, 50));
        btnNuevaVenta.setPreferredSize(new java.awt.Dimension(180, 50));
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BarraNavegacionLayout = new javax.swing.GroupLayout(BarraNavegacion);
        BarraNavegacion.setLayout(BarraNavegacionLayout);
        BarraNavegacionLayout.setHorizontalGroup(
            BarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraNavegacionLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        BarraNavegacionLayout.setVerticalGroup(
            BarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraNavegacionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(BarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor.setMinimumSize(new java.awt.Dimension(1300, 700));
        Contenedor.setPreferredSize(new java.awt.Dimension(1300, 700));
        Contenedor.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BarraNavegacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BarraNavegacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // Cambiar panel
        Productos productos = new Productos();
        ShowPanel(productos);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // Cambiar Panel
        Clientes clientes = new Clientes();
        ShowPanel(clientes);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
        // Cambiar Panel
        Proveedores proveedores = new Proveedores();
        ShowPanel(proveedores);
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // Cambiar 
        Inicio iniciobnt = new Inicio();
        ShowPanel(iniciobnt);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProveedoresActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraNavegacion;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel jLogo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
