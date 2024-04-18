package Controller;

import Model.Producto;
import View.Jpanel.Productos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 * @author Bryan Vera
 * @version 1.0
 * @since 2024-04-17 Descripcion: Clase para manejar los datos traidos desde la
 * clase OpProductos y poder manipularlos desde aqui.
 */
public class CtrProducto implements ActionListener {

    private Productos panelProductos;

    Producto p = new Producto();
    OpProducto opProducto = new OpProducto();
    DefaultTableModel modelo = new DefaultTableModel();

    public CtrProducto(Productos panelProductos) {
        this.panelProductos = panelProductos;
        this.panelProductos.btnAgregarProductos.addActionListener(this);
        this.panelProductos.btnConsultarProductos.addActionListener(this);
        this.panelProductos.btnModificarProductos.addActionListener(this);
        this.panelProductos.btnGuardarProductos.addActionListener(this);
        this.panelProductos.btnLimpiarProductos.addActionListener(this);
        this.panelProductos.btnEliminarProductos.addActionListener(this);

        // CONSULTAR BASE DE DATOS AL INICIO DE LA VENTANA
        ConsultarProductos(panelProductos.jTableDatosProductos);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == panelProductos.btnAgregarProductos) {
            LimpiarProductos();
            AgregarProductos();
            ConsultarProductos(panelProductos.jTableDatosProductos);

        }
        if (ae.getSource() == panelProductos.btnConsultarProductos) {
            ConsultarProductos(panelProductos.jTableDatosProductos);

        }
        if (ae.getSource() == panelProductos.btnModificarProductos) {
            int fila = panelProductos.jTableDatosProductos.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(panelProductos, "Debe seleccionar una fila.");
            } else {
                // Obtener datos de las columna seleccionada.
                int ID_Categoria = Integer.parseInt(panelProductos.jTableDatosProductos.getValueAt(fila, 1).toString());
                int ID_Proveedor = (int) panelProductos.jTableDatosProductos.getValueAt(fila, 2);
                String codigo = (String) panelProductos.jTableDatosProductos.getValueAt(fila, 3);
                String nombre = (String) panelProductos.jTableDatosProductos.getValueAt(fila, 4);
                float precio = (Float) panelProductos.jTableDatosProductos.getValueAt(fila, 5);
                int cantidad = (int) panelProductos.jTableDatosProductos.getValueAt(fila, 6);

                // Traer los datos de la tabla a los campos de textos
                panelProductos.txtID_Categoria.setText(String.valueOf(ID_Categoria));
                panelProductos.txtID_Proveedor.setText(String.valueOf(ID_Proveedor));
                panelProductos.txtCodigoProducto.setText(codigo);
                panelProductos.txtNombreProducto.setText(nombre);
                panelProductos.txtPrecioProducto.setText(String.valueOf(precio));
                panelProductos.txtCantidadProducto.setValue(cantidad);
            }
        }
        if (ae.getSource() == panelProductos.btnGuardarProductos) {
            GuardarProducto();
            limpiarTablaProductos();
            ConsultarProductos(panelProductos.jTableDatosProductos);
            LimpiarProductos();
        }
        if (ae.getSource() == panelProductos.btnLimpiarProductos) {
            LimpiarProductos();
        }
        if (ae.getSource() == panelProductos.btnEliminarProductos) {
            ElimarProducto();
            ConsultarProductos(panelProductos.jTableDatosProductos);
        }
    }

    // FUNCIONES PARA EL PANEL "PRODUCTOS"
    public void LimpiarProductos() {
        panelProductos.txtID_Categoria.setText("");
        panelProductos.txtID_Proveedor.setText("");
        panelProductos.txtCodigoProducto.setText("");
        panelProductos.txtNombreProducto.setText("");
        panelProductos.txtPrecioProducto.setText("");
        panelProductos.txtCantidadProducto.setValue(0);
    }

    public void AgregarProductos() {
        int ID_Categoria = Integer.parseInt(panelProductos.txtID_Categoria.getText());
        int ID_Proveedor = Integer.parseInt(panelProductos.txtID_Proveedor.getText());
        String codigo = panelProductos.txtCodigoProducto.getText();
        String nombre = panelProductos.txtNombreProducto.getText();
        float precio = Float.parseFloat(panelProductos.txtPrecioProducto.getText());
        int cantidad = (int) panelProductos.txtCantidadProducto.getValue();

        p.setID_Categoria(ID_Categoria);
        p.setID_Proveedor(ID_Proveedor);
        p.setCodigo(codigo);
        p.setNombre(nombre);
        p.setPrecio(precio);
        p.setStock(cantidad);

        int r = opProducto.Agregar(p);
       
        if (r == 1) {
            JOptionPane.showMessageDialog(panelProductos, "Producto añadido con exito");
        } else {
            JOptionPane.showMessageDialog(panelProductos, "Error al añadir prducto");
        }
    }

    public void ConsultarProductos(JTable tablaProductos) {
        limpiarTablaProductos();
        centrarCeldasProductos(tablaProductos);
        modelo = (DefaultTableModel) tablaProductos.getModel();
        tablaProductos.setModel(modelo);
        List<Producto> lista = opProducto.Consultar();
        Object[] objeto = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getID_Producto();
            objeto[1] = lista.get(i).getID_Categoria();
            objeto[2] = lista.get(i).getID_Proveedor();
            objeto[3] = lista.get(i).getCodigo();
            objeto[4] = lista.get(i).getNombre();
            objeto[5] = lista.get(i).getPrecio();
            objeto[6] = lista.get(i).getStock();
            modelo.addRow(objeto);
        }
    }

    public void GuardarProducto() {
        if (panelProductos.txtNombreProducto.getText().equals("")) {
            JOptionPane.showMessageDialog(panelProductos, "No se Identifica el nombre del producto para actualizar");
        } else {
            int fila = panelProductos.jTableDatosProductos.getSelectedRow();
            int ID_Producto = Integer.parseInt(panelProductos.jTableDatosProductos.getValueAt(fila, 0).toString());

            // Obtener los datos de los campos de textos
            int ID_Categoria = Integer.parseInt(panelProductos.txtID_Categoria.getText());
            int ID_Proveedor = Integer.parseInt(panelProductos.txtID_Proveedor.getText());
            String codigo = panelProductos.txtCodigoProducto.getText();
            String nombre = panelProductos.txtNombreProducto.getText();
            float precio = Float.parseFloat(panelProductos.txtPrecioProducto.getText());
            int cantidad = (int) panelProductos.txtCantidadProducto.getValue();
            
            p.setID_Producto(ID_Producto);
            p.setID_Categoria(ID_Categoria);
            p.setID_Proveedor(ID_Proveedor);
            p.setCodigo(codigo);
            p.setNombre(nombre);
            p.setPrecio(precio);
            p.setStock(cantidad);

            int r = opProducto.GuardarProducto(p);
            if (r == 1) {
                JOptionPane.showMessageDialog(panelProductos, "Producto Actualizado con exito!");
            } else {
                JOptionPane.showMessageDialog(panelProductos, "Error al añadir Actualizar Producto");
            }
        }

    }
    
    public void ElimarProducto(){
        int fila = panelProductos.jTableDatosProductos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(panelProductos, "Debe seleccionar una fila.");
        } else {
            int ID_Producto = (int) panelProductos.jTableDatosProductos.getValueAt(fila, 0);
            opProducto.Eliminar(ID_Producto);
            JOptionPane.showMessageDialog(panelProductos, "Producto eliminadado con Exito");
        }
    }
    

    void centrarCeldasProductos(JTable tablaProductos) {
        DefaultTableCellRenderer dtm = new DefaultTableCellRenderer();
        dtm.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < panelProductos.jTableDatosProductos.getColumnCount(); i++) {
            tablaProductos.getColumnModel().getColumn(i).setCellRenderer(dtm);
        }
    }

    void limpiarTablaProductos() {
        for (int i = 0; i < panelProductos.jTableDatosProductos.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
}
