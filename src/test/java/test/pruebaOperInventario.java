/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import dto.inventario;
import dto.producto;
import java.util.Date;
import utilidades.Utilidades;
import logica.OperInventario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chicu
 */
public class pruebaOperInventario {
    
    public pruebaOperInventario() {
    }
    @Test
    public void insertarObjetosDatosNull(){
        OperInventario oper = new OperInventario();
       // producto p = new producto();
        inventario i = new inventario();
        int rta = oper.insertar(i);
        assertEquals(0, rta);               
    }
    @Test
    public void insertarOK(){
        OperInventario oper = new OperInventario();
       // producto p = new producto();
        inventario i = new inventario();
        producto p = new producto();
        Utilidades u = new Utilidades();
        p.setCodigo(20);
        p.setFechaVencimiento(u.convertirFecha(new Date()));
        p.setNombre("papas");
        p.setValorProducto(10000);
        i.setProducto(p);
        i.setCantidadComprada(10);
        i.setCantidadDisponible(5);
        i.setFechaRegistro(u.convertirFecha(new Date()));       
        int rta = oper.insertar(i);
        assertEquals(1, rta);               
    }
    
    @Test
    public void insertarNull(){
        OperInventario oper = new OperInventario();
        int rta = oper.insertar(null);
        assertEquals(0, rta);
    }
    
    @Test
    public void ActualizarNull(){
        OperInventario oper = new OperInventario();
        int rta = oper.actualizar(null);
        assertEquals(0, rta);
    }
}
