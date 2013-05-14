/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlItv;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author DAW
 */
public class GestionItv {
    
    Statement stmt;
    static String filtro = "";
    
    protected  ArrayList<Inspección>list() {
        Inspección inspección = null;
        ArrayList<Inspección> listItv = new ArrayList();
        String sql = "SELECT * FROM inspección";
        try {
            Statement stmt = Conexion.conexion.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            /*if(!filtro.isEmpty()) {
                sql += "WHERE matricula LIKE '%"+filtro+"%' OR "
                        + "fecha LIKE '%"+filtro+"%' OR "
                        + "hora LIKE '%"+filtro+"%' OR "
                        + "observaciones LIKE '%"+filtro+"%' ";
            }*/
            
            while (rs.next()) {
                int id_Inspeccion = rs.getInt("Id_Inspeccion");
                String Matricula = rs.getString("Matricula");
                Date fecha = rs.getDate("fecha");
                Time hora = rs.getTime("hora");
                String observaciones = rs.getString("observacion");
                int id_inspector = rs.getInt("Id_Inspector");
                inspección = new Inspección(id_Inspeccion,Matricula, fecha, hora, observaciones, id_inspector);
                listItv.add(inspección);
            }

        } catch (SQLException ex) {
            System.out.println("Error al consultar los datos");
        }
        return listItv;
    }
    
    
    
    public int insert(Inspección inspección) {

         try {
            stmt = Conexion.conexion.createStatement();
        } catch (SQLException ex) {
            System.out.print("Error en el statement");
            
        }
        
        
        int id_Inspeccion = inspección.id_Inspeccion;
        String matricula = inspección.matricula;
        Date fecha = inspección.fecha;
        Time hora = inspección.hora;
        String observaciones = inspección.observaciones;
        int id_inspector = inspección.id_inspector;
        
        
        String sql = "INSERT INTO inspeccion (Id_Inspeccion,Matricula,Fecha,Hora,Observaciones,Id_Inspector) VALUES "
                + "('"+id_Inspeccion+"','"+matricula+"'','"+fecha+"'','"+hora+"'','"+observaciones+"'','"+id_inspector+"')";
        
        try {
                 stmt.executeUpdate(sql);

        }catch (Exception e) {
            System.out.print("Error");
            System.out.print(sql);
            e.printStackTrace();
        }
        return 0;
  
    }
    
     public boolean update(Inspección inspección) {
        try {

            stmt = Conexion.conexion.createStatement();
            String sql = "Update inspeccion set Id_Inspeccion =" + inspección.getId_Inspeccion() + ", Matricula =" + inspección.getMatricula() + ", Fecha =" + inspección.getFecha() + ", Hora" + inspección.getHora() + ", Observaciones =" + inspección.getObservaciones() + ", Id_inspector =" + inspección.getId_inspector();
            stmt.executeUpdate(sql);

        } catch (SQLException ex) {
            System.out.println("Error al actualizar la base de datos");
            ex.printStackTrace();
            return false;
        }
        return true;
    }
     
     public boolean delete(Inspección inspección) {

        try {

            stmt = Conexion.conexion.createStatement();
            String sql = "Delete from inspeccion =" + inspección.getId_Inspeccion();
            stmt.executeUpdate(sql);

        } catch (SQLException ex) {
            System.out.println("Error al consultar la base de datos");
            ex.printStackTrace();
            return false;
        }
        return true;
     }
    
}
