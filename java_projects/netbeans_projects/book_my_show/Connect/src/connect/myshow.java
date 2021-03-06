package connect;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SHARMA
 */
public class myshow extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    String city="";
    
    
    
    public myshow() {
        initComponents();
       
         String sql = "SELECT * FROM city ORDER BY LOWER(city_name)";
        
        try
        {
            conn = Connect.ConnectDB();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                int count=1;
                do
                {
                    Object item[]={ rs.getString("city_name")};
                    if(((DefaultComboBoxModel)cmbox_myshow_select_city.getModel()).getIndexOf(item[0].toString()) == -1 ) 
                    {
                        cmbox_myshow_select_city.addItem(item[0].toString());
                    }
                    count++;
                }while(rs.next());
           }
           conn.close();
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e);          
        }
       
        sql = "SELECT * FROM theater ORDER BY LOWER(theater_name)";
        
        try
        {
            conn = Connect.ConnectDB();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                int count=1;
                do
                {
                    Object item[]={ rs.getString("theater_name")};
                    if(((DefaultComboBoxModel)cmbox_myshow_theater_name.getModel()).getIndexOf(item[0].toString()) == -1 ) 
                    {
                        cmbox_myshow_theater_name.addItem(item[0].toString());
                    }
                    count++;
                }while(rs.next());
           }
           conn.close();
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e);          
        }
         sql = "SELECT * FROM theater ";
        
        try
        {
            conn = Connect.ConnectDB();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                int count=1;
                do
                {
                    Object item[]={ rs.getString("movie_name")};
                    if(((DefaultComboBoxModel)cmbox_myshow_movie_name.getModel()).getIndexOf(item[0].toString()) == -1 ) 
                    {
                        cmbox_myshow_movie_name.addItem(item[0].toString());
                    }
                    count++;
                }while(rs.next());
           }
           conn.close();
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e);          
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbox_myshow_select_city = new javax.swing.JComboBox();
        lbl_myshow_select_city = new javax.swing.JLabel();
        lbl_myshow_select_Time = new javax.swing.JLabel();
        cmbox_myshow_select_time = new javax.swing.JComboBox();
        btn_myshow_book = new javax.swing.JButton();
        cmbox_myshow_theater_name = new javax.swing.JComboBox();
        cmbox_myshow_movie_name = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_myshow_name = new javax.swing.JTextField();
        txt_myshow_mobile_number = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        cmbox_myshow_select_city.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----Select----" }));
        cmbox_myshow_select_city.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbox_myshow_select_cityItemStateChanged(evt);
            }
        });

        lbl_myshow_select_city.setText("Select Year City :");

        lbl_myshow_select_Time.setText("Select Time :");

        cmbox_myshow_select_time.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----Select----", "11:00 AM", "03:00 PM", "07:00 PM", "10:00 PM" }));

        btn_myshow_book.setText("Book");
        btn_myshow_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_myshow_bookActionPerformed(evt);
            }
        });

        cmbox_myshow_theater_name.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----Select----" }));

        cmbox_myshow_movie_name.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----Select----" }));

        jLabel1.setText("Select Theater Name:");

        jLabel2.setText("Select Movie Name :");

        jLabel3.setText("Name :");

        jLabel4.setText("Mobile Number :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_myshow_select_city)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbox_myshow_theater_name, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbox_myshow_select_city, 0, 100, Short.MAX_VALUE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbox_myshow_movie_name, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_myshow_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(65, 65, 65))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_myshow_select_Time)
                            .addComponent(cmbox_myshow_select_time, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_myshow_name, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_myshow_mobile_number, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbl_myshow_select_city)
                .addGap(18, 18, 18)
                .addComponent(cmbox_myshow_select_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_myshow_select_Time)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbox_myshow_theater_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbox_myshow_movie_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbox_myshow_select_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txt_myshow_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_myshow_mobile_number, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(btn_myshow_book)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
       
       
        
    }//GEN-LAST:event_formFocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void cmbox_myshow_select_cityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbox_myshow_select_cityItemStateChanged
   /*     Object city = cmbox_myshow_select_city.getSelectedItem();
        String sql="";
        
            sql = "SELECT * FROM city WHERE city_name='" + city + "' ";
      
            try
             {
            conn = Connect.ConnectDB();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                 do
                {
                    Object row[]={ rs.getString("theater")};
     
                    DefaultTableModel model = (DefaultTableModel) cmbox_myshow_theater_name.getModel();
                    model.addRow(row);
                }while(rs.next());
            }
            conn.close();
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e);          
        }*/
    }//GEN-LAST:event_cmbox_myshow_select_cityItemStateChanged

    private void btn_myshow_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_myshow_bookActionPerformed
      if(cmbox_myshow_select_city.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(null, "Please Select city"); 
            return;
        }
      if(cmbox_myshow_theater_name.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(null, "Please Select Theater Name"); 
            return;
        }
      if(cmbox_myshow_movie_name.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(null, "Please Select Movie Name"); 
            return;
        }
      if(cmbox_myshow_select_time.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(null, "Please Select Time sheduled"); 
            return;
        }
      
       city =cmbox_myshow_select_city.getSelectedItem().toString();
      
        this.setVisible(false);
        new TTTGraphics2P().setVisible(true);
    }//GEN-LAST:event_btn_myshow_bookActionPerformed

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
            java.util.logging.Logger.getLogger(myshow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myshow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myshow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myshow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myshow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_myshow_book;
    private javax.swing.JComboBox cmbox_myshow_movie_name;
    private javax.swing.JComboBox cmbox_myshow_select_city;
    private javax.swing.JComboBox cmbox_myshow_select_time;
    private javax.swing.JComboBox cmbox_myshow_theater_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_myshow_select_Time;
    private javax.swing.JLabel lbl_myshow_select_city;
    private javax.swing.JTextField txt_myshow_mobile_number;
    private javax.swing.JTextField txt_myshow_name;
    // End of variables declaration//GEN-END:variables
}
