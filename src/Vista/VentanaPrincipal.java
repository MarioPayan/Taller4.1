/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controlador.controladorEmpleado;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logica.Empleado;

/**
 *
 * @author julian
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lbEmpleadoId = new javax.swing.JLabel();
        btEliminar = new javax.swing.JButton();
        cpEmpleadod = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        lbCedula = new javax.swing.JLabel();
        lbCorreo = new javax.swing.JLabel();
        lbBuscar = new javax.swing.JLabel();
        cpCedula = new javax.swing.JTextField();
        cpNombre = new javax.swing.JTextField();
        cpCorreo = new javax.swing.JTextField();
        cpBuscarId = new javax.swing.JTextField();
        lbCargo = new javax.swing.JLabel();
        lbSalario = new javax.swing.JLabel();
        lbDireccion = new javax.swing.JLabel();
        lbTelefono = new javax.swing.JLabel();
        btActualizar = new javax.swing.JButton();
        btIngresar = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        cpCargo = new javax.swing.JTextField();
        cpSalario = new javax.swing.JTextField();
        cpTelefono = new javax.swing.JTextField();
        cpDireccion = new javax.swing.JTextField();
        btNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(254, 254, 254));

        lbEmpleadoId.setText("Empleado ID:");

        btEliminar.setText("Eliminiar");
        btEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEliminarMouseClicked(evt);
            }
        });

        lbNombre.setText("Nombre:");

        lbCedula.setText("Cedula:");

        lbCorreo.setText("Correo:");

        lbBuscar.setText("Buscar ID:");

        cpBuscarId.setForeground(new java.awt.Color(1, 1, 1));

        lbCargo.setText("Cargo:");

        lbSalario.setText("Salario:");

        lbDireccion.setText("Direccion:");

        lbTelefono.setText("Telefono:");

        btActualizar.setText("Actualizar");
        btActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btActualizarMouseClicked(evt);
            }
        });

        btIngresar.setText("Ingresar");
        btIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresarActionPerformed(evt);
            }
        });

        btBuscar.setText("Buscar");
        btBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBuscarMouseClicked(evt);
            }
        });

        btNuevo.setText("Nuevo");
        btNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btNuevoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEmpleadoId)
                    .addComponent(lbNombre)
                    .addComponent(lbCedula)
                    .addComponent(lbCorreo)
                    .addComponent(lbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cpEmpleadod, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpCedula, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(lbCargo)
                                .addGap(38, 38, 38)
                                .addComponent(cpCargo))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(lbSalario)
                                .addGap(33, 33, 33)
                                .addComponent(cpSalario))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(lbDireccion)
                                .addGap(18, 18, 18)
                                .addComponent(cpDireccion))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(lbTelefono)
                                .addGap(22, 22, 22)
                                .addComponent(cpTelefono))))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cpBuscarId, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))))
                .addGap(43, 43, 43))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmpleadoId)
                    .addComponent(cpEmpleadod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCargo)
                    .addComponent(cpCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(cpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSalario)
                    .addComponent(cpSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCedula)
                    .addComponent(cpCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDireccion)
                    .addComponent(cpDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCorreo)
                    .addComponent(cpCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefono)
                    .addComponent(cpTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBuscar)
                    .addComponent(cpBuscarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEliminar)
                    .addComponent(btIngresar)
                    .addComponent(btActualizar)
                    .addComponent(btNuevo))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int validarCampos(){
    
        if((cpCargo.getText().trim().length() == 0) || 
           (cpCedula.getText().trim().length() == 0) ||
           (cpCorreo.getText().trim().length() == 0) ||
           (cpDireccion.getText().trim().length() == 0) ||
           (cpEmpleadod.getText().trim().length() == 0) ||
           (cpNombre.getText().trim().length() == 0) ||
           (cpSalario.getText().trim().length() == 0) ||
           (cpTelefono.getText().trim().length() == 0)){
        
            return 1;
            
        }else{
          
              return 0;
          }
    
    }
    
    private void btIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngresarActionPerformed
       
      if(validarCampos() == 0){
      
          controladorEmpleado contEmple = new controladorEmpleado();
          try {
          
              contEmple.agregarEmpleado(cpEmpleadod.getText(), cpNombre.getText(), cpCedula.getText(),
                                        cpCorreo.getText(), cpCargo.getText(), Float.parseFloat(cpSalario.getText()),
                                        cpDireccion.getText(), cpTelefono.getText());
        
          
              JOptionPane.showMessageDialog(null, "Se ingreso correctamente el usuario");
              
              cpEmpleadod.setText(""); 
              cpNombre.setText("");
              cpCedula.setText("");
              cpCorreo.setText("");
              cpCargo.setText("");
              cpSalario.setText("");
              cpDireccion.setText("");
              cpTelefono.setText("");
              
              
          } catch (Exception ex) {
              
              JOptionPane.showMessageDialog(null, "Error al ingresar el usuario, puede que el id ya exista");
              
          }
          
          
      
      }else{
          
          JOptionPane.showMessageDialog(null, "Todos los campos son requeridos");
      
      }
        
    }//GEN-LAST:event_btIngresarActionPerformed

    private void btBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarMouseClicked
       
        if(cpBuscarId.getText().trim().length() == 0){
            
            JOptionPane.showMessageDialog(null, "El campo debe contener la ID del empleado");
          
        }else{
    
            //Aqui debe retornar un objeto de tipo empleado a partir de la busqueda
            controladorEmpleado contro = new controladorEmpleado();
            
            Empleado emple = null;
            
            emple = contro.buscarEmpleado(cpBuscarId.getText());
            
            cpBuscarId.setText("");
            
            //Se agregan los datos del empleado a la intefaz grafica boqueando la edicion del ID
            if(emple != null){
            cpEmpleadod.setEditable(false);
            cpEmpleadod.setText(emple.getEmpleadoId());
            
            cpCargo.setText(emple.getCargo());
            cpCedula.setText(emple.getCedula());
            cpCorreo.setText(emple.getCorreo());
            cpDireccion.setText(emple.getDireccion());
            cpNombre.setText(emple.getNombre());
            cpSalario.setText(emple.getSalario().toString());
            cpTelefono.setText(emple.getTelefono());
            }else{
            
                JOptionPane.showMessageDialog(null, "Ningun resultado");
            
            }
        
        }
    }//GEN-LAST:event_btBuscarMouseClicked

    private void btEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEliminarMouseClicked
        
        controladorEmpleado contro = new controladorEmpleado();
        
        try {
       
            contro.eliminarEmpleado(cpEmpleadod.getText());
            JOptionPane.showMessageDialog(null, "se elimino correctamente");
            cpEmpleadod.setText(""); 
              cpNombre.setText("");
              cpCedula.setText("");
              cpCorreo.setText("");
              cpCargo.setText("");
              cpSalario.setText("");
              cpDireccion.setText("");
              cpTelefono.setText("");
              cpEmpleadod.setEditable(true);
        
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null, "No se pudo encontrar el registro");
        }
    }//GEN-LAST:event_btEliminarMouseClicked

    private void btActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btActualizarMouseClicked
        
        Empleado emple = new Empleado();
        
        emple.setCargo(cpCargo.getText());
        emple.setCedula(cpCedula.getText());
        emple.setCorreo(cpCorreo.getText());
        emple.setDireccion(cpDireccion.getText());
        emple.setEmpleadoId(cpEmpleadod.getText());
        emple.setNombre(cpNombre.getText());
        emple.setSalario(Float.parseFloat(cpSalario.getText()));
        emple.setTelefono(cpTelefono.getText());
        
        controladorEmpleado contro = new controladorEmpleado();
        
        try {
        
            
            if(emple == null) System.err.println("es  nulo");
            contro.actualizarEmpleado(emple);
            JOptionPane.showMessageDialog(null, "Actualizacion correcta");
            cpEmpleadod.setText(""); 
              cpNombre.setText("");
              cpCedula.setText("");
              cpCorreo.setText("");
              cpCargo.setText("");
              cpSalario.setText("");
              cpDireccion.setText("");
              cpTelefono.setText("");
              cpEmpleadod.setEditable(true);
                
        } catch (Exception ex) {
        
            JOptionPane.showMessageDialog(null, "No se pudo encontrar el registro");
        
        }
                
    }//GEN-LAST:event_btActualizarMouseClicked

    private void btNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNuevoMouseClicked
              
              cpEmpleadod.setText(""); 
              cpNombre.setText("");
              cpCedula.setText("");
              cpCorreo.setText("");
              cpCargo.setText("");
              cpSalario.setText("");
              cpDireccion.setText("");
              cpTelefono.setText("");
              cpEmpleadod.setEditable(true);
    }//GEN-LAST:event_btNuevoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btIngresar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JTextField cpBuscarId;
    private javax.swing.JTextField cpCargo;
    private javax.swing.JTextField cpCedula;
    private javax.swing.JTextField cpCorreo;
    private javax.swing.JTextField cpDireccion;
    private javax.swing.JTextField cpEmpleadod;
    private javax.swing.JTextField cpNombre;
    private javax.swing.JTextField cpSalario;
    private javax.swing.JTextField cpTelefono;
    private javax.swing.JLabel lbBuscar;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbCedula;
    private javax.swing.JLabel lbCorreo;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbEmpleadoId;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbSalario;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
