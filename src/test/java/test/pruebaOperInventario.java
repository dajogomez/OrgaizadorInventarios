/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import com.github.javafaker.Faker;
import dto.inventario;
import dto.producto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import utilidades.Utilidades;
import logica.OperInventario;
import org.junit.Test;
import static org.junit.Assert.*;

public class pruebaOperInventario {
    
    //test insertar 
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
    public void insertarStringsVacios(){
        OperInventario oper = new OperInventario();
        inventario i = new inventario();
        producto p = new producto();
        p.setCodigo(111);
        p.setFechaVencimiento("");
        p.setNombre("");
        p.setValorProducto(10000);
        i.setProducto(p);
        i.setCantidadComprada(10);
        i.setCantidadDisponible(5);
        i.setFechaRegistro("");       
        int rta = oper.insertar(i);
        assertEquals(0, rta);
    
    }
    @Test
    public void insertarCodigo0(){
        OperInventario oper = new OperInventario();
        inventario i = new inventario();
        producto p = new producto();
        Utilidades u = new Utilidades();
        p.setCodigo(0);
        p.setFechaVencimiento(u.convertirFecha(new Date()));
        p.setNombre("pepe");
        p.setValorProducto(10000);
        i.setProducto(p);
        i.setCantidadComprada(10);
        i.setCantidadDisponible(5);
        i.setFechaRegistro(u.convertirFecha(new Date()));       
        int rta = oper.insertar(i);
        assertEquals(0, rta);
    
    }
    
    @Test
    public void insertarOK(){
        OperInventario oper = new OperInventario();
        inventario i = new inventario();
        Faker f = new Faker();
        producto p = new producto();
        Utilidades u = new Utilidades();
        int codigo = f.number().randomDigit();
        //1373072083
        System.out.println(codigo);
        p.setCodigo(codigo);
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
    public void insertarCodigoRepetido(){
        OperInventario oper = new OperInventario();
        inventario i = new inventario();
        producto p = new producto();
        Utilidades u = new Utilidades();
        p.setCodigo(1000);
        p.setFechaVencimiento(u.convertirFecha(new Date()));
        p.setNombre("papas");
        p.setValorProducto(10000);
        i.setProducto(p);
        i.setCantidadComprada(10);
        i.setCantidadDisponible(5);
        i.setFechaRegistro(u.convertirFecha(new Date()));       
        int rta = oper.insertar(i);
        assertEquals(0, rta);               
    }
    
    @Test
    public void insertarNull(){
        OperInventario oper = new OperInventario();
        int rta = oper.insertar(null);
        assertEquals(0, rta);
    }
    //teste de actualizar
    @Test
    public void ActualizarNull(){
        OperInventario oper = new OperInventario();
        int rta = oper.actualizar(null);
        assertEquals(0, rta);
    }   
    @Test
    public void acualizarObjetosDatosNull(){
        OperInventario oper = new OperInventario();
       // producto p = new producto();
        inventario i = new inventario();
        int rta = oper.actualizar(i);
        assertEquals(0, rta);               
    }
    @Test
    public void actualizarStringsVacios(){
        OperInventario oper = new OperInventario();
        inventario i = new inventario();
        producto p = new producto();
        p.setCodigo(111);
        p.setFechaVencimiento("");
        p.setNombre("");
        p.setValorProducto(10000);
        i.setProducto(p);
        i.setCantidadComprada(10);
        i.setCantidadDisponible(5);
        i.setFechaRegistro("");       
        int rta = oper.actualizar(i);
        assertEquals(0, rta);
    
    }
    @Test
    public void actualizarCodigo0(){
        OperInventario oper = new OperInventario();
        inventario i = new inventario();
        producto p = new producto();
        Utilidades u = new Utilidades();
        p.setCodigo(0);
        p.setFechaVencimiento(u.convertirFecha(new Date()));
        p.setNombre("pepe");
        p.setValorProducto(10000);
        i.setProducto(p);
        i.setCantidadComprada(10);
        i.setCantidadDisponible(5);
        i.setFechaRegistro(u.convertirFecha(new Date()));       
        int rta = oper.actualizar(i);
        assertEquals(0, rta);
    
    }
    
    @Test
    public void actualizarNoExisteCodigo(){
        OperInventario oper = new OperInventario();
        inventario i = new inventario();
        producto p = new producto();
        Utilidades u = new Utilidades();
        p.setCodigo(89);
        p.setFechaVencimiento(u.convertirFecha(new Date()));
        p.setNombre("papas");
        p.setValorProducto(10000);
        i.setProducto(p);
        i.setCantidadComprada(10);
        i.setCantidadDisponible(5);
        i.setFechaRegistro(u.convertirFecha(new Date()));       
        int rta = oper.actualizar(i);
        assertEquals(0, rta);               
    }
    @Test
    public void actualizarCodigoOK(){
        OperInventario oper = new OperInventario();
        inventario i = new inventario();
        producto p = new producto();
        Utilidades u = new Utilidades();
        p.setCodigo(1000);
        p.setFechaVencimiento(u.convertirFecha(new Date()));
        p.setNombre("carne");
        p.setValorProducto(10000);
        i.setProducto(p);
        i.setCantidadComprada(10);
        i.setCantidadDisponible(5);
        i.setFechaRegistro(u.convertirFecha(new Date()));       
        int rta = oper.actualizar(i);
        assertEquals(1, rta);               
    }
    // prueba metodo consultar 
    @Test 
    public void consultarNotNull(){
        OperInventario oper = new OperInventario();
        List<inventario> inve= oper.consultar();
        assertNotNull(inve);
    }
    //prueba dataReporte
    @Test 
    public void dataReporteNotNull(){
        OperInventario oper = new OperInventario();
        List<inventario> inve = oper.dataReporte();
        assertNotNull(inve);
    }
}
