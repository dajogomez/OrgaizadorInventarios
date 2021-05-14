/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import dto.inventario;
import dto.producto;
import logica.OperInventario;
import database.conexion;
import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;
import sun.java2d.pipe.SpanShapeRenderer.Simple;

/**
 *
 * @author chicu
 */
@ManagedBean
@SessionScoped
public class ManejadorBean_Inventario implements Serializable{
    private int codigoP ;
    private String nombrep ;
    private String mensaje;
    private Date fechaVencimientop  ;
    private String fechaVencimientopS  ;
    private int valorProductop ;
    private Date fechaRegistro;
    private String fechaRegistroS;
    private int cantidadComprada;
    private int cantidadDisponible;
    private List<inventario> inventario;

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
    public Date getFechaVencimientop() {
        return fechaVencimientop;
    }

    /**
     * @param fechaVencimientop the fechaVencimientop to set
     */
    public void setFechaVencimientop(Date fechaVencimientop) {
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

    /**
     * @return the fechaRegistro
     */
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * @param fechaRegistro the fechaRegistro to set
     */
    public void setFechaRegistro(Date fechaRegistro) {
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
     * @return the inventario
     */
    public List<inventario> getInventario() {
        return inventario;
    }

    /**
     * @param inventario the inventario to set
     */
    public void setInventario(List<inventario> inventario) {
        this.inventario = inventario;
    }
    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public ManejadorBean_Inventario(){
    OperInventario oper = new OperInventario();
    this.inventario = oper.consultar();
    
}
    public void onDateSelect(SelectEvent<Date> event){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        facesContext.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Date selected",format.format(event.getObject())));
        
    }

    public void guardar() {
        try {
            OperInventario oper = new OperInventario();
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            
            inventario i = new inventario();
            this.fechaVencimientop = format.parse(fechaVencimientopS);
            this.fechaRegistro = format.parse(fechaRegistroS);
            
            i.setCodigoP(this.codigoP);
            i.setNombrep(this.nombrep);
            i.setFechaVencimientop(this.fechaVencimientop);
            i.setFechaRegistro(this.fechaRegistro);
            i.setValorProductop(this.valorProductop);
            i.setCantidadComprada(this.cantidadComprada);
            i.setCantidadDisponible(this.cantidadDisponible);
            System.out.println("producto " + i);
            this.setMensaje("Se almacenó");
            System.out.println();
            if (oper.insertar(i) > 0) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Almacenó el producto"));
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Se presentó inconveniente en el almacenamiento, intente mas tarde "));
            }
        } catch (ParseException ex) {
            Logger.getLogger(ManejadorBean_Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
public void actualizar() {
        try{
        OperInventario oper = new OperInventario();
        inventario i = new inventario();       
        i.setCodigoP(this.codigoP);
        i.setNombrep(this.nombrep);
        i.setFechaVencimientop(this.fechaVencimientop);
        i.setFechaRegistro(this.fechaRegistro);
        i.setValorProductop(this.valorProductop);
        i.setCantidadComprada(this.cantidadComprada);
        i.setCantidadDisponible(this.cantidadDisponible);
        System.out.println("producto " + i);
        this.mensaje = "Se almacenó";
        System.out.println();
        if (oper.actualizar(i) > 0) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Se modificó el producto"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", "Se presentó inconveniente en el almacenamiento, intente mas tarde "));
        }
        }catch(NullPointerException x){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Warning", " Debe llenar todos los campos de la actualizacion, intente de nuevo"));
        }
    }

    /**
     * @return the fechaVencimientopS
     */
    public String getFechaVencimientopS() {
        return fechaVencimientopS;
    }

    /**
     * @param fechaVencimientopS the fechaVencimientopS to set
     */
    public void setFechaVencimientopS(String fechaVencimientopS) {
        this.fechaVencimientopS = fechaVencimientopS;
    }

    /**
     * @return the fechaRegistroS
     */
    public String getFechaRegistroS() {
        return fechaRegistroS;
    }

    /**
     * @param fechaRegistroS the fechaRegistroS to set
     */
    public void setFechaRegistroS(String fechaRegistroS) {
        this.fechaRegistroS = fechaRegistroS;
    }
   
}
