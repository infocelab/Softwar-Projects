package connect;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

public class Information extends javax.swing.JFrame 
{
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    static String user_type;
    
    
    public Information() 
    {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jTabbedPane10 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane9 = new javax.swing.JTabbedPane();
        jTabbedPane13 = new javax.swing.JTabbedPane();
        jTabbedPane11 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tabpan_daily_data_entry = new javax.swing.JTabbedPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        lbl_daily_data_entry_date = new javax.swing.JLabel();
        lbl_data_entry_date1 = new javax.swing.JLabel();
        lbl_daily_data_entry_user_name = new javax.swing.JLabel();
        lbl_daily_data_entry_logged_user = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_book_name = new javax.swing.JTextField();
        lbl_data_entry_address = new javax.swing.JLabel();
        lbl_data_entry_city = new javax.swing.JLabel();
        txt_book_city = new javax.swing.JTextField();
        lbl_data_entry_mnum = new javax.swing.JLabel();
        txt_book_mnum = new javax.swing.JTextField();
        btn_book_room = new javax.swing.JButton();
        lbl_data_entry_pname = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtarea_book_address = new javax.swing.JTextArea();
        lbl_data_entry_email = new javax.swing.JLabel();
        txt_book_email = new javax.swing.JTextField();
        spn_book_days = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spn_book_from_dd = new javax.swing.JSpinner();
        spn_book_from_mm = new javax.swing.JSpinner();
        spn_book_from_yy = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        spn_book_to_dd = new javax.swing.JSpinner();
        spn_book_to_mm = new javax.swing.JSpinner();
        spn_book_to_yy = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        chk_book_breakfast = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        spn_book_room_no = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        txt_book_amount = new javax.swing.JTextField();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_search_option_view_visitors = new javax.swing.JTable();
        btn_search_option_search_name = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btn_search_option_search_room_no = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_search_option_room_no = new javax.swing.JTextField();
        txt_search_option_name = new javax.swing.JTextField();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_view_details = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        tabpane_user_account = new javax.swing.JTabbedPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        lbl1_user_account = new javax.swing.JLabel();
        lbl2_user_account = new javax.swing.JLabel();
        txt1_user_account_user_name = new javax.swing.JTextField();
        btn1_user_account_add = new javax.swing.JButton();
        btn2_user_account_delete = new javax.swing.JButton();
        txt2_user_account_password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(97, 91, 130));

        jTabbedPane1.setForeground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 255));

        lbl_daily_data_entry_date.setText("Date:");

        lbl_data_entry_date1.setText("jLabel7");

        lbl_daily_data_entry_user_name.setText("logged user");

        lbl_daily_data_entry_logged_user.setText("Logged User :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Book Room");
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));

        txt_book_name.setBackground(new java.awt.Color(255, 204, 204));

        lbl_data_entry_address.setText("Address :");

        lbl_data_entry_city.setText("City :");

        txt_book_city.setBackground(new java.awt.Color(255, 204, 204));

        lbl_data_entry_mnum.setText("Mobilel:");

        txt_book_mnum.setBackground(new java.awt.Color(255, 204, 204));

        btn_book_room.setText("Book Room");
        btn_book_room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_book_roomActionPerformed(evt);
            }
        });

        lbl_data_entry_pname.setText("Name :");

        txtarea_book_address.setBackground(new java.awt.Color(255, 204, 204));
        txtarea_book_address.setColumns(20);
        txtarea_book_address.setRows(5);
        jScrollPane4.setViewportView(txtarea_book_address);

        lbl_data_entry_email.setText("E-mail :");

        txt_book_email.setBackground(new java.awt.Color(255, 204, 204));

        jLabel6.setText("Days:");

        jLabel8.setText("From:");

        jLabel9.setText("To:");

        jLabel10.setText("Breakfast:");

        jLabel11.setText("Room No");

        jLabel13.setText("Amount:");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_data_entry_pname)
                    .addComponent(lbl_daily_data_entry_date)
                    .addComponent(lbl_data_entry_city, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lbl_data_entry_date1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_book_name, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_book_city, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(38, 38, 38)
                                        .addComponent(lbl_data_entry_address))
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(spn_book_to_dd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_data_entry_email)))
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_book_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(spn_book_to_mm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(spn_book_to_yy, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addGap(62, 62, 62))))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addComponent(lbl_daily_data_entry_logged_user, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_daily_data_entry_user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(btn_book_room)))))
                .addGap(53, 160, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txt_book_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_data_entry_mnum)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(spn_book_from_dd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spn_book_from_mm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spn_book_from_yy))
                            .addComponent(txt_book_mnum, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spn_book_days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(spn_book_room_no, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(chk_book_breakfast, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_daily_data_entry_date)
                    .addComponent(lbl_data_entry_date1)
                    .addComponent(lbl_daily_data_entry_user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_daily_data_entry_logged_user, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_data_entry_pname)
                    .addComponent(lbl_data_entry_address)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(txt_book_name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_book_city, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_data_entry_city))))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_data_entry_mnum)
                        .addComponent(txt_book_mnum, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_book_email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_data_entry_email)))
                .addGap(36, 36, 36)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spn_book_days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(spn_book_from_dd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spn_book_from_mm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spn_book_from_yy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(spn_book_to_dd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spn_book_to_mm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spn_book_to_yy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(chk_book_breakfast)
                    .addComponent(jLabel11)
                    .addComponent(spn_book_room_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_book_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btn_book_room, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1.setLayer(lbl_daily_data_entry_date, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbl_data_entry_date1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbl_daily_data_entry_user_name, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbl_daily_data_entry_logged_user, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txt_book_name, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbl_data_entry_address, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbl_data_entry_city, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txt_book_city, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbl_data_entry_mnum, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txt_book_mnum, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_book_room, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbl_data_entry_pname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lbl_data_entry_email, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txt_book_email, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(spn_book_days, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(spn_book_from_dd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(spn_book_from_mm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(spn_book_from_yy, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(spn_book_to_dd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(spn_book_to_mm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(spn_book_to_yy, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(chk_book_breakfast, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(spn_book_room_no, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txt_book_amount, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tabpan_daily_data_entry.addTab("Welcome on Book Room", jDesktopPane1);

        jTabbedPane1.addTab("Book Room", tabpan_daily_data_entry);

        jDesktopPane3.setBackground(new java.awt.Color(204, 204, 255));

        tbl_search_option_view_visitors.setBackground(new java.awt.Color(255, 204, 204));
        tbl_search_option_view_visitors.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tbl_search_option_view_visitors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No", "Name", "Address", "City", "Mobile Number", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_search_option_view_visitors);
        if (tbl_search_option_view_visitors.getColumnModel().getColumnCount() > 0) {
            tbl_search_option_view_visitors.getColumnModel().getColumn(0).setResizable(false);
            tbl_search_option_view_visitors.getColumnModel().getColumn(1).setResizable(false);
            tbl_search_option_view_visitors.getColumnModel().getColumn(2).setResizable(false);
            tbl_search_option_view_visitors.getColumnModel().getColumn(3).setResizable(false);
            tbl_search_option_view_visitors.getColumnModel().getColumn(4).setResizable(false);
            tbl_search_option_view_visitors.getColumnModel().getColumn(5).setResizable(false);
        }

        btn_search_option_search_name.setText("Search");
        btn_search_option_search_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_option_search_nameActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("Hotel Management");
        jLabel12.setBorder(new javax.swing.border.MatteBorder(null));

        btn_search_option_search_room_no.setText("Search");
        btn_search_option_search_room_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search_option_search_room_noActionPerformed(evt);
            }
        });

        jLabel2.setText("View Visitors Details by Room No:");

        jLabel4.setText("View Visitors Details by Name :");

        txt_search_option_room_no.setBackground(new java.awt.Color(255, 204, 204));

        txt_search_option_name.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addComponent(btn_search_option_search_room_no)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 311, Short.MAX_VALUE))
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addComponent(txt_search_option_room_no, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_search_option_name, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search_option_search_name))
                .addGap(94, 94, 94))
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search_option_room_no, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txt_search_option_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_search_option_search_room_no)
                    .addComponent(btn_search_option_search_name))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jDesktopPane3.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(btn_search_option_search_name, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(btn_search_option_search_room_no, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(txt_search_option_room_no, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(txt_search_option_name, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("Search option", jDesktopPane3);

        jDesktopPane4.setBackground(new java.awt.Color(204, 204, 255));

        tbl_view_details.setBackground(new java.awt.Color(255, 204, 204));
        tbl_view_details.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tbl_view_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No", "Name", "Address", "City", "Mobile Number", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_view_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_view_detailsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_view_details);
        if (tbl_view_details.getColumnModel().getColumnCount() > 0) {
            tbl_view_details.getColumnModel().getColumn(0).setResizable(false);
            tbl_view_details.getColumnModel().getColumn(1).setResizable(false);
            tbl_view_details.getColumnModel().getColumn(2).setResizable(false);
            tbl_view_details.getColumnModel().getColumn(3).setResizable(false);
            tbl_view_details.getColumnModel().getColumn(4).setResizable(false);
            tbl_view_details.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Here are the datails of all Customers:");

        javax.swing.GroupLayout jDesktopPane4Layout = new javax.swing.GroupLayout(jDesktopPane4);
        jDesktopPane4.setLayout(jDesktopPane4Layout);
        jDesktopPane4Layout.setHorizontalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane4Layout.setVerticalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel5)
                .addGap(63, 63, 63)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane4.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTabbedPane1.addTab("View details", jDesktopPane4);

        jDesktopPane2.setBackground(new java.awt.Color(204, 204, 255));

        lbl1_user_account.setText("UserName :");

        lbl2_user_account.setText("Password :");

        txt1_user_account_user_name.setBackground(new java.awt.Color(255, 204, 204));

        btn1_user_account_add.setText("Add");
        btn1_user_account_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1_user_account_addActionPerformed(evt);
            }
        });

        btn2_user_account_delete.setText("Delete");
        btn2_user_account_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2_user_account_deleteActionPerformed(evt);
            }
        });

        txt2_user_account_password.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setText("Please Log in as Admin to Add or Delete User");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Update User");
        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(443, 443, 443)
                .addComponent(lbl2_user_account, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn1_user_account_add, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(lbl1_user_account, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt1_user_account_user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                        .addComponent(txt2_user_account_password, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btn2_user_account_delete)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel1))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2_user_account, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_user_account_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_user_account_user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl1_user_account, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2_user_account_delete)
                    .addComponent(btn1_user_account_add))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jDesktopPane2.setLayer(lbl1_user_account, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(lbl2_user_account, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txt1_user_account_user_name, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btn1_user_account_add, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btn2_user_account_delete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txt2_user_account_password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tabpane_user_account.addTab("Welcome on User Account", jDesktopPane2);

        jTabbedPane1.addTab("User Account", tabpane_user_account);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) 
    {
      
    }
   
    private void cal_search_option_dateInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_cal_search_option_dateInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cal_search_option_dateInputMethodTextChanged

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained

        Date today = new Date();
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
        String date = DATE_FORMAT.format(today);
        lbl_data_entry_date1.setText(date);
        // lbl_mark_att_date.setText(date);
       // lbl_view_att_date.setText(date);

        lbl_daily_data_entry_user_name.setText(ConnectGUI.logged_user);
        if(ConnectGUI.logged_user.equals("admin"))
        {
            txt1_user_account_user_name.setEnabled(true);
            txt2_user_account_password.setEnabled(true);
            btn1_user_account_add.setEnabled(true);
            btn2_user_account_delete.setEnabled(true);
        }
        else
        {
            txt1_user_account_user_name.setEnabled(false);
            txt2_user_account_password.setEnabled(false);
            btn1_user_account_add.setEnabled(false);
            btn2_user_account_delete.setEnabled(false);
        }
        
      String sql;
      sql = "SELECT * FROM patient ";
      DefaultTableModel tbl_c = (DefaultTableModel) tbl_view_details.getModel();
          tbl_c.setRowCount(0);
            
      try
      {
        conn = Connect.ConnectDB();
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        if(rs.next()){
            
            do
            {
           Object row[]={rs.getString("patient_id"), rs.getString("patient_name"),rs.getString("address"),rs.getString("city"),rs.getString("mobile_number"),rs.getString("e_mail"), true};
           DefaultTableModel model = (DefaultTableModel) tbl_view_details.getModel();
        model.addRow(row);
               
            }while(rs.next());
        }
        conn.close();
      }
     catch(SQLException | HeadlessException e)
     {
          JOptionPane.showMessageDialog(null, e);          
     }
        
    }//GEN-LAST:event_jTabbedPane1FocusGained

    private void btn2_user_account_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2_user_account_deleteActionPerformed
        String username = txt1_user_account_user_name.getText();
        if(username.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Valid User name to Delete");
            return;
        }
        if(username.equals("admin"))
        {
            JOptionPane.showMessageDialog(null, "Admin User Cannot be Deleted");
            return;
        }

        String sql;
        sql = "select * from tableUSERPASS where username='" +  username + "'";
        conn = Connect.ConnectDB();
        try
        {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(!rs.next())
            {
                JOptionPane.showMessageDialog(null, "Please Enter Valid User name to Delete");
                conn.close();
                return;
            }
            conn.close();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Information.class.getName()).log(Level.SEVERE, null, ex);
        }

        sql = "delete from tableUSERPASS where username='" +  username + "'";
        try
        {
            conn = Connect.ConnectDB();
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Delete successful");
            txt1_user_account_user_name.setText("");
            txt2_user_account_password.setText("");
            conn.close();
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn2_user_account_deleteActionPerformed

    private void btn1_user_account_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1_user_account_addActionPerformed
        String username = txt1_user_account_user_name.getText();
        String password = txt2_user_account_password.getText();

        if(username.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Username cannot be Empty");
            return;
        }
        if(password.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Password cannot be Empty");
            return;
        }

        String sql;
        sql = "Insert into tableUSERPASS (username,password) values ('" +  username + "','" + password + "')";

        try
        {
            conn = Connect.ConnectDB();
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "user added successfully");
            txt1_user_account_user_name.setText("");
            txt2_user_account_password.setText("");

            conn.close();
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn1_user_account_addActionPerformed

    private void btn_book_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_book_roomActionPerformed
      
        String pname = txt_book_name.getText();
        String address = txtarea_book_address.getText();
        String city = txt_book_city.getText();
        String mnum = txt_book_mnum.getText();
        String email = txt_book_email.getText();

        if(pname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Patient Name cannot be Empty");
            return;
        }

        if(address.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Patient Address cannot be Empty");
            return;
        }
        if(city.equals(""))
        {
            JOptionPane.showMessageDialog(null, "City cannot be Empty");
            return;
        }
        if(mnum.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Mobile Number cannot be Empty");
            return;
        }
        if(email.equals(""))
        {
            JOptionPane.showMessageDialog(null, "E-mail address cannot be Empty");
            return;
        }

        String sql;
        sql = "Insert into patient (patient_name,address,city,mobile_number,e_mail) values ('" +  pname  + "','" +  address  + "','" + city + "','" +  mnum + "','" + email +"')";

        try
        {
            conn = Connect.ConnectDB();
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Patient Added Successfully");
            txt_book_name.setText("");
            txtarea_book_address.setText("");
            txt_book_city.setText("");
            txt_book_mnum.setText("");
            txt_book_email.setText("");
            conn.close();
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_book_roomActionPerformed

    private void btn_search_option_search_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_option_search_nameActionPerformed
        // TODO add your handling code here:
        String pname = txt_search_option_name.getText();
        if(pname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Patient Name");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tbl_search_option_view_visitors.getModel();
        model.setRowCount(0);
        String sql;
        sql = "select * from patient where patient_name= '"+pname+"'";
        conn = Connect.ConnectDB();
        try
        {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            if(rs.next())
            {
                do
                {
                    Object row[]={ rs.getString("patient_id"), rs.getString("patient_name"),rs.getString("address"),rs.getString("city"),rs.getString("mobile_number"),rs.getString("e_mail"), true};
                    model.addRow(row);
                }while(rs.next());
            }
            txt_search_option_name.setText("");
            conn.close();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Information.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_search_option_search_nameActionPerformed

    static int showFirmAccount=0;
    static String patient_name_temp= "";
    private void tbl_view_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_view_detailsMouseClicked
        // TODO add your handling code here:
        
         int row = tbl_view_details.getSelectedRow();
        String patient_name =(String) tbl_view_details.getValueAt(row, 1);
        String sql = "SELECT * FROM patient WHERE patient_name='" + patient_name + "'";
            
        try
        {
            conn = Connect.ConnectDB();
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next())
            {
                showFirmAccount=1;
                patient_name_temp = patient_name;
                this.setVisible(false);
                new FirmAccount().setVisible(true);
            }        
            conn.close();
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e);          
        } 
    }//GEN-LAST:event_tbl_view_detailsMouseClicked

    private void btn_search_option_search_room_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search_option_search_room_noActionPerformed
        // TODO add your handling code here:
        String pid = txt_search_option_room_no.getText();
        if(pid.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Patient ID");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tbl_search_option_view_visitors.getModel();
        model.setRowCount(0);
        String sql;
        sql = "select * from patient where patient_id= '"+pid+"'";
        conn = Connect.ConnectDB();
        try
        {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            if(rs.next())
            {
                do
                {
                    Object row[]={ rs.getString("patient_id"), rs.getString("patient_name"),rs.getString("address"),rs.getString("city"),rs.getString("mobile_number"),rs.getString("e_mail"), true};
                    model.addRow(row);
                }while(rs.next());
            }
            txt_search_option_room_no.setText("");
            conn.close();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Information.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_search_option_search_room_noActionPerformed
    static boolean toggle_value=true;  
    public static void main(String args[]) 
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //FirmAccount fa=new FirmAccount();
        
       
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new Information().setVisible(true);
            }
 
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1_user_account_add;
    private javax.swing.JButton btn2_user_account_delete;
    private javax.swing.JButton btn_book_room;
    private javax.swing.JButton btn_search_option_search_name;
    private javax.swing.JButton btn_search_option_search_room_no;
    private javax.swing.JCheckBox chk_book_breakfast;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane10;
    private javax.swing.JTabbedPane jTabbedPane11;
    private javax.swing.JTabbedPane jTabbedPane13;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTabbedPane jTabbedPane9;
    private javax.swing.JLabel lbl1_user_account;
    private javax.swing.JLabel lbl2_user_account;
    private javax.swing.JLabel lbl_daily_data_entry_date;
    private javax.swing.JLabel lbl_daily_data_entry_logged_user;
    private javax.swing.JLabel lbl_daily_data_entry_user_name;
    private javax.swing.JLabel lbl_data_entry_address;
    private javax.swing.JLabel lbl_data_entry_city;
    private javax.swing.JLabel lbl_data_entry_date1;
    private javax.swing.JLabel lbl_data_entry_email;
    private javax.swing.JLabel lbl_data_entry_mnum;
    private javax.swing.JLabel lbl_data_entry_pname;
    private javax.swing.JSpinner spn_book_days;
    private javax.swing.JSpinner spn_book_from_dd;
    private javax.swing.JSpinner spn_book_from_mm;
    private javax.swing.JSpinner spn_book_from_yy;
    private javax.swing.JSpinner spn_book_room_no;
    private javax.swing.JSpinner spn_book_to_dd;
    private javax.swing.JSpinner spn_book_to_mm;
    private javax.swing.JSpinner spn_book_to_yy;
    private javax.swing.JTabbedPane tabpan_daily_data_entry;
    private javax.swing.JTabbedPane tabpane_user_account;
    private javax.swing.JTable tbl_search_option_view_visitors;
    private javax.swing.JTable tbl_view_details;
    private javax.swing.JTextField txt1_user_account_user_name;
    private javax.swing.JPasswordField txt2_user_account_password;
    private javax.swing.JTextField txt_book_amount;
    private javax.swing.JTextField txt_book_city;
    private javax.swing.JTextField txt_book_email;
    private javax.swing.JTextField txt_book_mnum;
    private javax.swing.JTextField txt_book_name;
    private javax.swing.JTextField txt_search_option_name;
    private javax.swing.JTextField txt_search_option_room_no;
    private javax.swing.JTextArea txtarea_book_address;
    // End of variables declaration//GEN-END:variables
}