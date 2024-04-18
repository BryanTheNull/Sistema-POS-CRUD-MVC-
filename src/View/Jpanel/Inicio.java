/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Jpanel;

import View.PanelesDeReporte.Reporte1;
import View.PanelesDeReporte.Reporte2;
import View.PanelesDeReporte.Reporte3;
import View.PanelesDeReporte.Reporte4;
import View.PanelesDeReporte.Reporte5;
import View.PanelesDeReporte.Reporte6;
import View.PanelesDeReporte.Reporte7;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author bv587
 */
public class Inicio extends javax.swing.JPanel implements ActionListener {

    public Inicio() {
        initComponents();
        // Hacer Jpanel transparentes
        ConteinerUsuario.setOpaque(false);
        ContenedorReportes.setOpaque(false);

        // Agregar ActionListener al a compontes
        ReporteSeleccionado.addActionListener(this);
    }

    public void ShowPanel(JPanel p) {
        p.setSize(452, 221);
        p.setLocation(0, 0);

        contenedorCambiante.removeAll();
        contenedorCambiante.add(p, BorderLayout.CENTER);
        contenedorCambiante.revalidate();
        contenedorCambiante.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        ConteinerUsuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        imagenUsuario = new javax.swing.JLabel();
        ContenedorReportes = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ReporteSeleccionado = new javax.swing.JComboBox<>();
        contenedorCambiante = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        ResumenDeSistema = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1300, 700));
        setPreferredSize(new java.awt.Dimension(1300, 700));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMinimumSize(new java.awt.Dimension(1300, 700));
        background.setPreferredSize(new java.awt.Dimension(1300, 700));

        ConteinerUsuario.setMinimumSize(new java.awt.Dimension(400, 150));
        ConteinerUsuario.setPreferredSize(new java.awt.Dimension(400, 150));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/usuario.png"))); // NOI18N
        jLabel1.setText("Nombre");
        jLabel1.setToolTipText("");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icon_rango.png"))); // NOI18N
        jLabel2.setText("Administrador");
        jLabel2.setToolTipText("");

        imagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/imagenPorDefecto.png"))); // NOI18N
        imagenUsuario.setMinimumSize(new java.awt.Dimension(128, 128));
        imagenUsuario.setPreferredSize(new java.awt.Dimension(128, 128));

        javax.swing.GroupLayout ConteinerUsuarioLayout = new javax.swing.GroupLayout(ConteinerUsuario);
        ConteinerUsuario.setLayout(ConteinerUsuarioLayout);
        ConteinerUsuarioLayout.setHorizontalGroup(
            ConteinerUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConteinerUsuarioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(imagenUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(ConteinerUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37))
        );
        ConteinerUsuarioLayout.setVerticalGroup(
            ConteinerUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConteinerUsuarioLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(imagenUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addGap(11, 11, 11))
            .addGroup(ConteinerUsuarioLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ContenedorReportes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ContenedorReportes.setMinimumSize(new java.awt.Dimension(500, 350));
        ContenedorReportes.setName(""); // NOI18N
        ContenedorReportes.setPreferredSize(new java.awt.Dimension(500, 350));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("GENERAR REPORTES");
        jLabel4.setMinimumSize(new java.awt.Dimension(40, 200));
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Tipo de Reporte: ");
        jLabel5.setMinimumSize(new java.awt.Dimension(40, 200));
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 50));

        ReporteSeleccionado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reporte de Inventario de Productos", "Reporte de Ventas Generales", "Reporte de Clientes ", "Analizis de Ventas por Categoria", "Reporte de Proveedores", "Reporte de Ventas por Cliente", " " }));
        ReporteSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteSeleccionadoActionPerformed(evt);
            }
        });

        contenedorCambiante.setMinimumSize(new java.awt.Dimension(452, 221));
        contenedorCambiante.setPreferredSize(new java.awt.Dimension(452, 221));

        javax.swing.GroupLayout contenedorCambianteLayout = new javax.swing.GroupLayout(contenedorCambiante);
        contenedorCambiante.setLayout(contenedorCambianteLayout);
        contenedorCambianteLayout.setHorizontalGroup(
            contenedorCambianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contenedorCambianteLayout.setVerticalGroup(
            contenedorCambianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 221, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ContenedorReportesLayout = new javax.swing.GroupLayout(ContenedorReportes);
        ContenedorReportes.setLayout(ContenedorReportesLayout);
        ContenedorReportesLayout.setHorizontalGroup(
            ContenedorReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorReportesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(ContenedorReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contenedorCambiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ContenedorReportesLayout.createSequentialGroup()
                        .addGroup(ContenedorReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(ReporteSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        ContenedorReportesLayout.setVerticalGroup(
            ContenedorReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContenedorReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReporteSeleccionado))
                .addGap(18, 18, 18)
                .addComponent(contenedorCambiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("MENU PRINCIPAL");

        ResumenDeSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/img_resumen.png"))); // NOI18N
        ResumenDeSistema.setToolTipText("");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ResumenDeSistema, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ContenedorReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ConteinerUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConteinerUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(ContenedorReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ResumenDeSistema)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ReporteSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteSeleccionadoActionPerformed


    }//GEN-LAST:event_ReporteSeleccionadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel ConteinerUsuario;
    private javax.swing.JPanel ContenedorReportes;
    private javax.swing.JComboBox<String> ReporteSeleccionado;
    private javax.swing.JLabel ResumenDeSistema;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel background;
    private javax.swing.JPanel contenedorCambiante;
    private javax.swing.JLabel imagenUsuario;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        Reporte1 reporte1 = new Reporte1();
        Reporte2 reporte2 = new Reporte2();
        Reporte3 reporte3 = new Reporte3();
        Reporte4 reporte4 = new Reporte4();
        Reporte5 reporte5 = new Reporte5();
        Reporte6 reporte6 = new Reporte6();
        Reporte7 reporte7 = new Reporte7();

        if (ae.getSource() == ReporteSeleccionado) {
            int NumeroReporte = ReporteSeleccionado.getSelectedIndex() + 1;

            switch (NumeroReporte) {
                case 1:
                    ShowPanel(reporte1);
                    break;
                case 2:
                    ShowPanel(reporte2);
                    break;
                case 3:
                    ShowPanel(reporte3);
                    break;
                case 4:
                    ShowPanel(reporte4);
                    break;
                case 5:
                    ShowPanel(reporte5);
                    break;
                case 6:
                    ShowPanel(reporte6);
                    break;
                case 7:
                    ShowPanel(reporte7);
                    break;
            }
        }   

    }
}
