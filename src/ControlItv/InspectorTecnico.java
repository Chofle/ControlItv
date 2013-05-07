/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlItv;

/**
 *
 * @author DAW
 */
public class InspectorTecnico {
    int id_inspector;
    String nombre;
    String apellidos;
    
    public InspectorTecnico(){     
    }
    
    public InspectorTecnico(int id_inspector, String nombre, String apellidos){
        this.id_inspector = id_inspector;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    public int getId_inspector(){
        return id_inspector;
    }
    
    public void setId_inspector(int id_inspector){
        this.id_inspector = id_inspector;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
}
