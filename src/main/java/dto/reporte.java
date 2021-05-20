/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import logica.OperInventario;

/**
 *
 * @author chicu
 */
public class reporte {
    private inventario inventario;
    private int cantidadVentas;
    private int valorVentasTotales;
    private List<inventario> datosIn;
    
    public int cantidadV(int cantidadActual, int cantidadComprada){
        cantidadVentas = cantidadComprada - cantidadActual; 
        return cantidadVentas;
    }
    public int valorV(int valorProducto, int cantidadV){
        valorVentasTotales = valorProducto*cantidadV;
        return valorVentasTotales;
    }
    public void generarReporte(){       
       OperInventario oper = new OperInventario();
        this.datosIn= oper.dataReporte();
        try{
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File archivo = new File("report.txt");
             //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
                   FileWriter escribir = new FileWriter(archivo);
               for(int i = 0; i < datosIn.size(); i++) {
                   escribir.write(
                                   "Codigo: "+datosIn.get(i).getProducto().getCodigo()+
                                   " Nombre: "+datosIn.get(i).getProducto().getNombre()+
                                   " Cantidad disponible: "+datosIn.get(i).getCantidadDisponible()+
                                   " Total de ventas: "+cantidadV(datosIn.get(i).getCantidadDisponible(), datosIn.get(i).getCantidadComprada())+
                                   " Valor total de ventas: "+valorV(datosIn.get(i).getProducto().getValorProducto(), cantidadV(datosIn.get(i).getCantidadDisponible(), datosIn.get(i).getCantidadComprada()))+
                                    "\n"       );
                   
               } 
               escribir.close(); 
    }catch (IOException e) {
            System.out.println("Error al escribir");
        }
    }
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


}
