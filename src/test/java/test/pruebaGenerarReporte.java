/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.Test;
import static org.junit.Assert.*;
import logica.generarReporte;
import com.github.javafaker.Faker;

/**
 *
 * @author chicu
 */
public class pruebaGenerarReporte {
    
    public pruebaGenerarReporte() {
    }
    //prueba CantidadV
    @Test
    public void cantidadVDoble0(){
        generarReporte g = new generarReporte();
        int rta= g.cantidadV(0, 0);
        assertEquals(0, rta);
    }
    @Test
    public void cantidadVCActual0(){
        generarReporte g = new generarReporte();
        Faker f = new Faker();
        int rta= g.cantidadV(f.number().randomDigitNotZero(), 0);
        assertEquals(0, rta);
    }
    @Test
    public void cantidadVCComprada0(){
        generarReporte g = new generarReporte();
        Faker f = new Faker();
        int rta= g.cantidadV(0, f.number().randomDigitNotZero());
        assertEquals(0, rta);
    }
    @Test
    public void cantidadVDobleMenor0(){
        generarReporte g = new generarReporte();
        int rta= g.cantidadV(-1, -1);
        assertEquals(0, rta);
    }
    @Test
    public void cantidadVCActualMenor0(){
        generarReporte g = new generarReporte();
        Faker f = new Faker();
        int rta= g.cantidadV(-1,f.number().randomDigitNotZero());
        assertEquals(0, rta);
    }
    @Test
    public void cantidadVCCompradaMenor0(){
        generarReporte g = new generarReporte();
        Faker f = new Faker();
        int rta= g.cantidadV(f.number().randomDigitNotZero(),-1);
        assertEquals(0, rta);
    }
    @Test
    public void cantidadVOK(){
        generarReporte g = new generarReporte();
        Faker f = new Faker();
        int rta= g.cantidadV(f.number().randomDigitNotZero(), f.number().randomDigitNotZero());
        assertNotEquals(0, rta);
    }
    //prueba valorV
    @Test
    public void valorVDoble0(){
        generarReporte g = new generarReporte();
        int rta= g.valorV(0, 0);
        assertEquals(0, rta);
    }
    @Test
    public void valorVvcantidadV0(){
        generarReporte g = new generarReporte();
        Faker f = new Faker();
        int rta= g.valorV(f.number().randomDigitNotZero(), 0);
        assertEquals(0, rta);
    }
    @Test
    public void valorVvalorProducto0(){
        generarReporte g = new generarReporte();
        Faker f = new Faker();
        int rta= g.valorV(0, f.number().randomDigitNotZero());
        assertEquals(0, rta);
    }
    @Test
    public void valorVDobleMenor0(){
        generarReporte g = new generarReporte();
        int rta= g.valorV(-1, -1);
        assertEquals(0, rta);
    }
    @Test
    public void valorVvalorProductoMenor0(){
        generarReporte g = new generarReporte();
        Faker f = new Faker();
        int rta= g.valorV(-1,f.number().randomDigitNotZero());
        assertEquals(0, rta);
    }
    @Test
    public void valorVcantidadVMenor0(){
        generarReporte g = new generarReporte();
        Faker f = new Faker();
        int rta= g.valorV(f.number().randomDigitNotZero(),-1);
        assertEquals(0, rta);
    }
    @Test
    public void valorVOK(){
        generarReporte g = new generarReporte();
        Faker f = new Faker();
        int rta= g.valorV(f.number().randomDigitNotZero(), f.number().randomDigitNotZero());
        assertNotEquals(0, rta);
    }
}
