
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
    private int codigoP ;
    private String nombrep ;
    private String fechaVencimientop  ;
    private int valorProductop ;
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
    /**
     * @return the codigoP
     */
    public int getCodigoP() {
        return codigoP;
    }

    /**
     * @param codigoP the codigoP to set
     */
    public void setCodigoP(int codigoP) {
        this.codigoP = codigoP;
    }

    /**
     * @return the nombrep
     */
    public String getNombrep() {
        return nombrep;
    }

    /**
     * @param nombrep the nombrep to set
     */
    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    /**
     * @return the fechaVencimientop
     */
    public String getFechaVencimientop() {
        return fechaVencimientop;
    }

    /**
     * @param fechaVencimientop the fechaVencimientop to set
     */
    public void setFechaVencimientop( String fechaVencimientop) {
        this.fechaVencimientop = fechaVencimientop;
    }

    /**
     * @return the valorProductop
     */
    public int getValorProductop() {
        return valorProductop;
    }

    /**
     * @param valorProductop the valorProductop to set
     */
    public void setValorProductop(int valorProductop) {
        this.valorProductop = valorProductop;
    }     
    @Override
    public String toString() {
      
            return this.codigoP+""+
                    this.nombrep+""+
                    this.fechaVencimientop+""+
                    this.fechaRegistro+""+
                    this.valorProductop+""+
                    this.cantidadComprada+""+
                    this.cantidadDisponible;
                  }

    
}
