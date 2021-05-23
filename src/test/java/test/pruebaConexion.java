/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import  database.conexion;
import java.sql.Connection;
import org.junit.Assert;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chicu
 */
public class pruebaConexion {
    
    public pruebaConexion() {
        
    }
    
    @Test
    public void conexion(){
    //codigo a verificar 
    conexion c = new conexion();
    Connection cActiva = c.conectarse();
    assertNotNull(cActiva);    
    }
    @Test
    public void desconectarse(){
        conexion c = new conexion();
        Connection cActiva= c.conectarse();
        c.desconectarse(cActiva);      
        assertNotNull(c);               
    }
    @Test
    public void desconectarseNull(){
        conexion c = new conexion();
        c.desconectarse(null);       
        assertNotNull(c);               
    }
}

