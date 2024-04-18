/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Config.Conexion;
import Model.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bryan Vera
 * @version 1.0
 * @since 2024-04-17 Descripcion: Clase para realizar operaciones con sql en la
 * interfaz de productos.
 */
public class OpProducto {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Producto p = new Producto();

    public int Agregar(Producto producto) {
        int r = 0;
        String sql = "INSERT INTO PRODUCTOS(ID_Categoria, ID_Proveedor, Codigo_Producto, Nombre, Precio_Unitario, Stock)"
                + "VALUE(?,?,?,?,?,?)";

        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, producto.getID_Categoria());
            ps.setInt(2, producto.getID_Proveedor());
            ps.setString(3, producto.getCodigo());
            ps.setString(4, producto.getNombre());
            ps.setFloat(5, producto.getPrecio());
            ps.setInt(6, producto.getStock());

            r = ps.executeUpdate();
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
        }
        return r;
    }

    public List Consultar() {
        List<Producto> DatosProducto = new ArrayList<>();
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement("SELECT * FROM PRODUCTOS");
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setID_Producto(rs.getInt(1));
                p.setID_Categoria(rs.getInt(2));
                p.setID_Proveedor(rs.getInt(3));
                p.setCodigo(rs.getString(4));
                p.setNombre(rs.getString(5));
                p.setPrecio(rs.getFloat(6));
                p.setStock(rs.getInt(7));
                DatosProducto.add(p);
            }
        } catch (Exception e) {
        }
        return DatosProducto;
    }

    public int GuardarProducto(Producto producto) {
        int r = 0;
        String sql = "UPDATE PRODUCTOS SET ID_Categoria =?, ID_Proveedor=?, Codigo_Producto=?, Nombre=?, Precio_Unitario=?, Stock =? "
                + "WHERE ID_Producto= ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, producto.getID_Categoria());
            ps.setInt(2, producto.getID_Proveedor());
            ps.setString(3, producto.getCodigo());
            ps.setString(4, producto.getNombre());
            ps.setFloat(5, producto.getPrecio());
            ps.setInt(6, producto.getStock());
            ps.setInt(7, producto.getID_Producto());
            r = ps.executeUpdate();

            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
        }
        return r;

    }
    
    public int Eliminar(int ID_Producto){
        int r = 0;
        String sql = "DELETE FROM PRODUCTOS WHERE ID_Producto = "+ ID_Producto;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            r = ps.executeUpdate();
        } catch (Exception e) {

        }
        return r;
    }
}
