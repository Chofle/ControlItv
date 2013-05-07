/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlItv;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author DAW
 */
public class Inspección {
    int id_Inspeccion;
    String matricula;
    Date fecha;
    Time hora;
    String observaciones;
    int id_inspector;
    
    public Inspección(){
    }
    
    public Inspección(int id_Inspeccion, String matricula,Date fecha, Time hora, String observaciones,int id_inspector){
        this.id_Inspeccion = id_Inspeccion;
        this.matricula = matricula;
        this.fecha = fecha;
        this.hora = hora;
        this.observaciones = observaciones;
        this.id_inspector = id_inspector;
    }
    
    public int getId_Inspeccion (){
        return id_Inspeccion;
    }
    
    public void setId_Inspeccion(int id_Inspeccion){
        this.id_Inspeccion = id_Inspeccion;
    }
    
    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public Date getFecha(){
        return fecha;
    }
    
    public void setFecha(Date fecha){
        this.fecha = fecha;
    }
    
    public Time getHora(){
        return hora;
    }
    
    public void SetHora(Time hora){
        this.hora = hora;
    }
    
    public String observaciones(){
        return observaciones;
    }
    
    public void setObservaciones(String observaciones){
        this.observaciones = observaciones;
    }
      
    public int getId_inspector (){
        return id_inspector;
    }
    
    public void setId_inspector (int id_inspector){
        this.id_inspector = id_inspector;
    }
}

