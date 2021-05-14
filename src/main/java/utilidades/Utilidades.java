/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilidades {
    
    public String convertirFecha(Date fecha){
        String fechaS;        
        DateFormat formato = new SimpleDateFormat("yyyy/MM/dd");        
	fechaS = formato.format(fecha);    
        return fechaS;
    }
}
