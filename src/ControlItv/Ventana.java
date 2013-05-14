/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlItv;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author DAW
 */
public class Ventana extends javax.swing.JPanel {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }
    
    private DefaultTableModel modeloTabla;
    
    void CargarDatosJTable() {
        ArrayList<Inspección> listaInspecciones = new ArrayList();
         
        modeloTabla = new DefaultTableModel() {
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }                
        };
        jTable1.setModel(modeloTabla);

        //Rellenar las cabeceras de las columnas
        String[] cabecera = {"Id_Inspeccion", "Matricula", "Fecha", "Hora", "Observaciones", "Id_Inspector"};
        modeloTabla.setColumnIdentifiers(cabecera);

        listaInspecciones  =  BDAgenda.leerContactos(this.ordenContactos);
        //Recorrer la lista de contactos para añadir algunos datos en el JTable
        for (Contacto contacto :listaContactos) {
            //Se va mostrar sólo el nombre y los apellidos
            String[] datosFilaContacto = {
                String.valueOf(contacto.getIdContacto()), 
                contacto.getNombre(), 
                contacto.getApellidos()};
            modeloTabla.addRow(datosFilaContacto);
        }        

        //Establecer que sólo se pueda seleccionar una fila
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        //Ocultar columna de idContacto
        TableColumn tc = jTable1.getColumn("IdContacto");
        jTable1.removeColumn(tc);
        
        //Mostrar vacíos los datos de contacto
        mostrarDatosContacto();        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Guardar");

        jButton2.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
