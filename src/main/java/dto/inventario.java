
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;


/**
 *
 * @author chicu
 */
public class inventario {
    private producto producto;
    private String fechaRegistro;
    private int cantidadComprada;
    private int cantidadDisponible;

    /**
     * @return the producto
     */
    public producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(producto producto) {
        this.producto = producto;
    }

    /**
     * @return the fechaRegistro
     */
    public String getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * @param fechaRegistro the fechaRegistro to set
     */
    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * @return the cantidadComprada
     */
    public int getCantidadComprada() {
        return cantidadComprada;
    }

    /**
     * @param cantidadComprada the cantidadComprada to set
     */
    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    /**
     * @return the cantidadDisponible
     */
    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    /**
     * @param cantidadDisponible the cantidadDisponible to set
     */
    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }  
 
    @Override
    public String toString() {
      
            return this.producto.getCodigo()+""+
                    this.producto.getNombre()+""+
                    this.producto.getFechaVencimiento()+""+
                    this.fechaRegistro+""+
                    this.producto.getValorProducto()+""+
                    this.cantidadComprada+""+
                    this.cantidadDisponible;
                  }

    
}
