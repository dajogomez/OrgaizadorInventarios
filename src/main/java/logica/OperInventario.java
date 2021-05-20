/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import dto.inventario;
import database.conexion;
import dto.producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author chicu
 */
public class OperInventario implements Operaciones<inventario>{   
    @Override
    public int insertar(inventario dato) {
        conexion c = new conexion();
        Connection cActiva = c.conectarse();
        if (cActiva != null){
            try {
                String sql = "insert into producto (codigo, nombre, fechaVencimiento, fechaRegistro, valorProducto, cantidadComprada, cantidadActual ) values (?,?,?,?,?,?,?)";
                PreparedStatement ps =  cActiva.prepareStatement(sql);
                ps.setInt(1, dato.getProducto().getCodigo());
                ps.setString(2, dato.getProducto().getNombre());
                ps.setString(3, dato.getProducto().getFechaVencimiento());
                ps.setString(4, dato.getFechaRegistro());
                ps.setInt(5, dato.getProducto().getValorProducto());
                ps.setInt(6, dato.getCantidadComprada());
                ps.setInt(7, dato.getCantidadDisponible());

                int rta = ps.executeUpdate();
                return rta;
            } catch (SQLException ex) {
                Logger.getLogger(OperInventario.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally{
                c.desconectase(cActiva);
            }
        }
        return 0;
                
    }
   @Override
    public List<inventario> consultar() {
        conexion c = new conexion();
        Connection cActiva = c.conectarse();
        List<inventario> datos = new ArrayList<>();
        if (cActiva != null){
            try {
                String sql = "select * from producto";
                PreparedStatement ps =  cActiva.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){                  
                    inventario i = new inventario(); 
                    producto p = new producto();
                    p.setCodigo(rs.getInt("codigo"));
                    p.setNombre(rs.getString("nombre"));
                    p.setFechaVencimiento(rs.getString("fechaVencimiento"));
                    p.setValorProducto(rs.getInt("valorProducto"));
                    i.setProducto(p);
                    i.setFechaRegistro(rs.getString("fechaRegistro"));
                    i.setCantidadComprada(rs.getInt("cantidadComprada"));
                    i.setCantidadDisponible(rs.getInt("cantidadActual"));             
                    datos.add(i);
                }
            }
             catch (SQLException ex) {
                Logger.getLogger(OperInventario.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally{
                c.desconectase(cActiva);
            }
        }
        return datos;
    }
   @Override
    public List<inventario> dataReporte() {
        conexion c = new conexion();
        Connection cActiva = c.conectarse();
        List<inventario> datos = new ArrayList<>();
        if (cActiva != null){
            try {
                String sql = "select codigo, nombre , valorProducto, cantidadComprada, cantidadActual  from producto";
                PreparedStatement ps =  cActiva.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){                  
                    inventario i = new inventario();
                    producto p = new producto();
                    p.setCodigo(rs.getInt("codigo"));
                    p.setNombre(rs.getString("nombre"));
                    p.setValorProducto(rs.getInt("valorProducto"));
                    i.setProducto(p);
                    i.setCantidadComprada(rs.getInt("cantidadComprada"));
                    i.setCantidadDisponible(rs.getInt("cantidadActual"));             
                    datos.add(i);
                }
            }
             catch (SQLException ex) {
                Logger.getLogger(OperInventario.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally{
                c.desconectase(cActiva);
            }
        }
        return datos;
    }
@Override
    public int actualizar(inventario dato) {
        conexion c = new conexion();
        Connection cActiva = c.conectarse();
        if (cActiva != null){
            try {
                String sql = "UPDATE producto SET nombre = ?, fechaVencimiento = ?, fechaRegistro = ?, valorProducto = ?, cantidadComprada = ?, cantidadActual = ? Where  codigo = ?";
                PreparedStatement ps =  cActiva.prepareStatement(sql);
                ps.setString(1, dato.getProducto().getNombre());
                ps.setString(2,dato.getProducto().getFechaVencimiento());
                ps.setString(3,dato.getFechaRegistro());
                ps.setInt(4, dato.getProducto().getValorProducto());
                ps.setInt(5,dato.getCantidadComprada());
                ps.setInt(6,dato.getCantidadDisponible());
                ps.setInt(7,dato.getProducto().getCodigo());

                int rta = ps.executeUpdate();
                return rta;
            } catch (SQLException ex) {
                Logger.getLogger(OperInventario.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally{
                c.desconectase(cActiva);
            }
        }
        return 0;
    }
}
