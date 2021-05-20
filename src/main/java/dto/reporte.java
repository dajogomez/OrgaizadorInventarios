/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.List;


/**
 *
 * @author chicu
 */
public class reporte {
    private inventario inventario;
    private int cantidadVentas;
    private int valorVentasTotales;
    private List<inventario> datosIn;
    
    /**
     * @return the inventario
     */
    public inventario getInventario() {
        return inventario;
    }

    /**
     * @param inventario the inventario to set
     */
    public void setInventario(inventario inventario) {
        this.inventario = inventario;
    }

    /**
     * @return the cantidadVentas
     */
    public int getCantidadVentas() {
        return cantidadVentas;
    }

    /**
     * @param cantidadVentas the cantidadVentas to set
     */
    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    /**
     * @return the valorVentasTotales
     */
    public int getValorVentasTotales() {
        return valorVentasTotales;
    }

    /**
     * @param valorVentasTotales the valorVentasTotales to set
     */
    public void setValorVentasTotales(int valorVentasTotales) {
        this.valorVentasTotales = valorVentasTotales;
    }

    /**
     * @return the datosIn
     */
    public List<inventario> getDatosIn() {
        return datosIn;
    }

    /**
     * @param datosIn the datosIn to set
     */
    public void setDatosIn(List<inventario> datosIn) {
        this.datosIn = datosIn;
    }


}
