/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import dto.reporte;

/**
 *
 * @author chicu
 */
public class generarReporte {
    reporte R = new reporte();
        public int cantidadV(int cantidadActual, int cantidadComprada){
        R.setCantidadVentas(cantidadComprada - cantidadActual) ; 
        return R.getCantidadVentas();
    }
    public int valorV(int valorProducto, int cantidadV){
        R.setValorVentasTotales(valorProducto*cantidadV);
        return R.getValorVentasTotales();
    }
    public void generarReportee(){       
       OperInventario oper = new OperInventario();
        R.setDatosIn(oper.dataReporte());
        try{
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File archivo = new File("report.txt");
             //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
                   FileWriter escribir = new FileWriter(archivo);
               for(int i = 0; i < R.getDatosIn().size(); i++) {
                   escribir.write(
                                   "Codigo: "+R.getDatosIn().get(i).getProducto().getCodigo()+
                                   " Nombre: "+R.getDatosIn().get(i).getProducto().getNombre()+
                                   " Cantidad disponible: "+R.getDatosIn().get(i).getCantidadDisponible()+
                                   " Total de ventas: "+cantidadV(R.getDatosIn().get(i).getCantidadDisponible(), R.getDatosIn().get(i).getCantidadComprada())+
                                   " Valor total de ventas: "+valorV(R.getDatosIn().get(i).getProducto().getValorProducto(), cantidadV(R.getDatosIn().get(i).getCantidadDisponible(), R.getDatosIn().get(i).getCantidadComprada()))+
                                    "\n"       );
                   
               } 
               escribir.close(); 
    }catch (IOException e) {
            System.out.println("Error al escribir");
        }
    }
}
