/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.accessibility.AccessibleContext;
import javax.swing.JOptionPane;
import javax.swing.text.Document;

/**
 *
 * @author SHARMA
 */
public class FirmAccount extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
   
    public FirmAccount() {
       
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_firm_acc_room_no = new javax.swing.JTextField();
        txt_firm_acc_name = new javax.swing.JTextField();
        btn_firm_acc_save = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea_firm_acc_extra_service = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        jLabel1.setText("Extra Services Details :");

        jLabel2.setText("Room Number");

        jLabel3.setText("Name :");

        txt_firm_acc_room_no.setEditable(false);
        txt_firm_acc_room_no.setBackground(new java.awt.Color(255, 204, 204));

        txt_firm_acc_name.setEditable(false);
        txt_firm_acc_name.setBackground(new java.awt.Color(255, 204, 204));

        btn_firm_acc_save.setText("Save");
        btn_firm_acc_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_firm_acc_saveActionPerformed(evt);
            }
        });

        txtarea_firm_acc_extra_service.setBackground(new java.awt.Color(255, 204, 204));
        txtarea_firm_acc_extra_service.setColumns(20);
        txtarea_firm_acc_extra_service.setRows(5);
        jScrollPane1.setViewportView(txtarea_firm_acc_extra_service);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(58, 58, 58)
                        .addComponent(txt_firm_acc_room_no, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3)
                        .addGap(72, 72, 72)
                        .addComponent(txt_firm_acc_name, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 84, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_firm_acc_save)
                .addGap(278, 278, 278))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_firm_acc_room_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_firm_acc_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btn_firm_acc_save)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        getContentPane().setBackground(Color.getHSBColor(120,130,216));
         String sql = "SELECT * FROM patient WHERE patient_name='" + Information.patient_name_temp + "'";
            
        try
        {
            conn = Connect.ConnectDB();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                txt_firm_acc_room_no.setText(rs.getString("patient_id"));
                txt_firm_acc_name.setText(rs.getString("patient_name"));
                
            }
            conn.close();
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e);          
        }
        
         sql = "SELECT * FROM description WHERE patient_name='" + Information.patient_name_temp + "'";
            
        try
        {
            conn = Connect.ConnectDB();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            { 
                String previous="";
                do{
                previous = previous.concat(rs.getString("description"));
                   }while(rs.next());
                
            }
            conn.close();
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e);          
        }
        
    }//GEN-LAST:event_formMouseEntered

    private void btn_firm_acc_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_firm_acc_saveActionPerformed
        // TODO add your handling code here:
        String patient_id =txt_firm_acc_room_no.getText();
        String patient_name =txt_firm_acc_name.getText();
        String medicine_description = txtarea_firm_acc_extra_service.getText();
        if(medicine_description.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Medicine Description Cannot be Empty"); 
            return;
        }
        String sql = "Insert into description (patient_id,patient_name,description) values ('" +  patient_id + "','" + patient_name + "','" + medicine_description + "')";
        
        try
        {
            conn = Connect.ConnectDB();
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
        
            JOptionPane.showMessageDialog(null, "saved");
           // txt_firm_acc_p_id.setText("");
           // txt_firm_acc_p_id.setText("");
            txtarea_firm_acc_extra_service.setText("");
           
            this.setVisible(false);
            new Information().setVisible(true);
            
            conn.close();
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e);          
        }   
    }//GEN-LAST:event_btn_firm_acc_saveActionPerformed

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
            java.util.logging.Logger.getLogger(FirmAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirmAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirmAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirmAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirmAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_firm_acc_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_firm_acc_name;
    private javax.swing.JTextField txt_firm_acc_room_no;
    private javax.swing.JTextArea txtarea_firm_acc_extra_service;
    // End of variables declaration//GEN-END:variables
}
