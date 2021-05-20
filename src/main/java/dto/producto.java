/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;
import java.util.Date;

/**
 *
 * @author chicu
 */
public class producto {
    private int codigo;
    private String nombre;
    private String fechaVencimiento;
    private int valorProducto;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fechaVencimiento
     */
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * @param fechaVencimiento the fechaVencimiento to set
     */
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * @return the valorProducto
     */
    public int getValorProducto() {
        return valorProducto;
    }

    /**
     * @param valorProducto the valorProducto to set
     */
    public void setValorProducto(int valorProducto) {
        this.valorProducto = valorProducto;
    }
    
}
