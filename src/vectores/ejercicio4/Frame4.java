/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores.ejercicio4;

import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author pared
 */
public class Frame4 extends javax.swing.JFrame {

    /**
     * Creates new form Frame4
     */
    double v[];
    public Frame4() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmbCrear = new javax.swing.JButton();
        cmbLlenarManual = new javax.swing.JButton();
        cmbLlenarAutomatico = new javax.swing.JButton();
        cmbMostrar = new javax.swing.JButton();
        cmbBorrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Iniciales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Longitud:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        txtLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitudKeyTyped(evt);
            }
        });
        jPanel2.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 170, 70));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Botones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbCrear.setText("Crear");
        cmbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmbCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 140, -1));

        cmbLlenarManual.setText("Llenar Manual");
        cmbLlenarManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLlenarManualActionPerformed(evt);
            }
        });
        jPanel3.add(cmbLlenarManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, -1));

        cmbLlenarAutomatico.setText("Llenar Autom");
        cmbLlenarAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLlenarAutomaticoActionPerformed(evt);
            }
        });
        jPanel3.add(cmbLlenarAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 140, -1));

        cmbMostrar.setText("Mostrar");
        cmbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmbMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, -1));

        cmbBorrar.setText("Borrar");
        cmbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 140, -1));

        jButton1.setText("Num veces Repetido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 140, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 180, 290));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 140));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 230, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 457));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMostrarActionPerformed
        // TODO add your handling code here:
        double cont;
        for (int i = 0; i < v.length; i++) 
        {
            txtResultado.append(+v[i]+"\n");
        }
        
    }//GEN-LAST:event_cmbMostrarActionPerformed

    private void cmbLlenarAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLlenarAutomaticoActionPerformed
        // TODO add your handling code here:
        double n;
        
        for (int i = 0; i < v.length; i++) 
        {
           n= (int)(Math.random()* 50 + 1);
           v[i]=n; 
        }
    }//GEN-LAST:event_cmbLlenarAutomaticoActionPerformed

    private void cmbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCrearActionPerformed
        // TODO add your handling code here:
        int longitud;
       if (txtLongitud.getText().trim().isEmpty())
       {
           JOptionPane.showMessageDialog(this, "Ingrese la longitud", "ERROR", JOptionPane.ERROR_MESSAGE);
           txtLongitud.requestFocusInWindow();
       }
       else if(Integer.parseInt(txtLongitud.getText().trim())==0)
        {
            JOptionPane.showMessageDialog(this, "La Longitud no puede ser cero", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
            txtLongitud.selectAll();
        }
       else {
        longitud= Integer.parseInt(txtLongitud.getText());
        
        v= new double [longitud];
        JOptionPane.showMessageDialog(this, "Vector creado correctamente");
       }
    }//GEN-LAST:event_cmbCrearActionPerformed

    private void cmbLlenarManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLlenarManualActionPerformed
        // TODO add your handling code here:
        double n;
        for (int i = 0; i < v.length; i++) 
        {
            n= Double.parseDouble(JOptionPane.showInputDialog(this,"Ingrese los numeros"));
            v[i]=n;
        }
    }//GEN-LAST:event_cmbLlenarManualActionPerformed

    private void cmbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBorrarActionPerformed
        // TODO add your handling code here:
        txtLongitud.setText("");
        txtResultado.setText("");
        txtLongitud.requestFocusInWindow();
        
        v=null;
    }//GEN-LAST:event_cmbBorrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double cont=0;
        
        for (int i = 0; i < v.length; i++) 
        {            
            for (int j = i+1; j < v.length; j++) 
            {
               if (v[i]==(v[j])) 
               {
                    cont++;
                    v[i]=cont;
               }
            }
        }
        for (int  k = 0; k < v.length; k++) 
        {   
                if (0>v[k])
                       {
                           cont= v[k];
                       }
        }    
        txtResultado.append("El numero que mas se repite:"+cont);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitudKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume(); 
          } 
    }//GEN-LAST:event_txtLongitudKeyTyped

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
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbBorrar;
    private javax.swing.JButton cmbCrear;
    private javax.swing.JButton cmbLlenarAutomatico;
    private javax.swing.JButton cmbLlenarManual;
    private javax.swing.JButton cmbMostrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
