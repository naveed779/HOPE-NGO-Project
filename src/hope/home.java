/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hope;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 9470m
 */
public class home extends javax.swing.JFrame {

    Statement st=null;
    ResultSet rs;
    PreparedStatement pst=null;

    /**
     * Creates new form home
     */
    public home() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        email = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        password1 = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        password = new javax.swing.JPasswordField();
        name = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        cell = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        cnic = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        country = new javax.swing.JTextField();
        registerme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(36, 47, 65));
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setPreferredSize(new java.awt.Dimension(1571, 742));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(97, 212, 195));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(786, 371));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("H.O.P.E.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Make Yourself Hope For");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Those Who Needs You");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 630));

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(1571, 742));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SignUp or Sign in");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 120, 50));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FULL NAME");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("EMAIL");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PASSWORD");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RE-ENTER PASSWORD");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CELL NO");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CNIC");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        email.setBackground(new java.awt.Color(36, 47, 65));
        email.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setText("Email here");
        email.setBorder(null);
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 360, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 360, 30));

        password1.setBackground(new java.awt.Color(36, 47, 65));
        password1.setForeground(new java.awt.Color(255, 255, 255));
        password1.setText("jPasswordField1");
        password1.setBorder(null);
        jPanel2.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 360, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 360, 30));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 360, 30));

        password.setBackground(new java.awt.Color(36, 47, 65));
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("jPasswordField1");
        password.setBorder(null);
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 360, -1));

        name.setBackground(new java.awt.Color(36, 47, 65));
        name.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Enter your name here");
        name.setBorder(null);
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 360, -1));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 360, 30));

        cell.setBackground(new java.awt.Color(36, 47, 65));
        cell.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cell.setForeground(new java.awt.Color(255, 255, 255));
        cell.setText("Cell number here (03xx-xxxxxxx)");
        cell.setBorder(null);
        jPanel2.add(cell, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 360, -1));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 360, 30));

        cnic.setBackground(new java.awt.Color(36, 47, 65));
        cnic.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cnic.setForeground(new java.awt.Color(255, 255, 255));
        cnic.setText("CNIC number here like (xxxxx-xxxxxxx-x)");
        cnic.setBorder(null);
        jPanel2.add(cnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 360, -1));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 360, 30));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ENTER COUNTRY ");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 360, 30));

        country.setBackground(new java.awt.Color(36, 47, 65));
        country.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        country.setForeground(new java.awt.Color(255, 255, 255));
        country.setText("Enter Your Country");
        country.setBorder(null);
        country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryActionPerformed(evt);
            }
        });
        jPanel2.add(country, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 360, -1));

        registerme.setText("Register Me");
        registerme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registermeActionPerformed(evt);
            }
        });
        jPanel2.add(registerme, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 500, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryActionPerformed

    private void registermeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registermeActionPerformed
try{
        String nam = name.getText();
        String em=email.getText();
        String pass=password.getText();
        String no=cell.getText();
        String cn=cnic.getText();
        String cntry=country.getText();
        
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hope?autoReconnect=true&useSSL=false", "root", "debacle");
       
        st = conn.createStatement();
        int rs = st.executeUpdate("INSERT INTO`signup` (id,name,email,pass,num,cnic,country) VALUES (10,'"+nam+"','"+em+"','"+pass+"','"+no+"','"+cn+"','"+cntry+"')");
          
   if( name.getText().equals(name.getText()))
       { 
       if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z]+$", email.getText()))) 
            { 
                 JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
            } 
       else  { 
                if(password.getText().equals(password.getText()))
                   {
                        if(password1.getText().equals(password.getText()))
                           {
                                  if (!(Pattern.matches("^[0-9]{4}+[-]{1}+[0-9]{7}+$", cell.getText()))) 
                                        { 
                   JOptionPane.showMessageDialog(null, "Please enter a valid NUMBER", "Error", JOptionPane.ERROR_MESSAGE);
                                        } 
                           
                                  else
                                  { 
                                    if (!(Pattern.matches("^[0-9]{5}+[-]{1}+[0-9][7]{1}+[-]{1}+[0-9]{1}+$", cnic.getText()))) 
                                      { 
                    JOptionPane.showMessageDialog(null, "Please enter a valid CNIC", "Error", JOptionPane.ERROR_MESSAGE);
       
                                      }
                                  
                                     else { 
                               
                                 new AfterSignUP().setVisible(true);
                                     this.setVisible(false);
                                          
                                           }
                                }
       
                                  }
                           }
            } 
       }
   
           
    else{
         
           JOptionPane.showMessageDialog(null, "Please enter a valid PASSWORD", "Error", JOptionPane.ERROR_MESSAGE);  
       }
}
       catch(Exception e ){
           System.out.println("Error " + e.getMessage());
       }       

    }//GEN-LAST:event_registermeActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cell;
    private javax.swing.JTextField cnic;
    private javax.swing.JTextField country;
    public javax.swing.JTextField email;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField password1;
    private javax.swing.JButton registerme;
    // End of variables declaration//GEN-END:variables
}
