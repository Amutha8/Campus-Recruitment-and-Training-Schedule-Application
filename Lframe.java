/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package design;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Lframe extends javax.swing.JFrame {

    /**
     * Creates new form Lframe
     */
    public Lframe() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rollno = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Student Login");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 220, 60));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Roll No");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 80, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, 30));

        rollno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollnoActionPerformed(evt);
            }
        });
        jPanel1.add(rollno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 140, 40));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 140, 40));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 100, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/left-arrow.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/i6.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rollnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rollnoActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed
Connection con;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/campus1?","s_useer","Student1234");
            Statement st=con.createStatement();
            String sql="select * from login";
            ResultSet rs=st.executeQuery(sql);
            String rollno1=rollno.getText();
            String password1=new String(password.getText());
            boolean loginSuccess1 = false; 
            boolean loginSuccess2 = false; 
            if (rollno1.equals("admin") && password1.equals("admin"))
            {
   
                loginSuccess1 = true;
               
            }
            else
            {
            while(rs.next())
            {
                String roll1=rs.getString("rollno");
                String pass1=rs.getString("password");
                String tbdata[]={roll1,pass1};
               if (rollno1.equals(roll1) && password1.equals(pass1)) {
                loginSuccess2 = true; // Set login success flag
                break; // Exit the loop since credentials match
            }
        }
            }
           if (loginSuccess2) {
            // If login is successful, open the student form
            student s1 = new student();
            s1.setVisible(true);
            this.dispose(); // Close the current login window
        }
           else if (loginSuccess1) {
            // If login is successful, open the student form
           placeadmin p1=new placeadmin();
                p1.setVisible(true);
                
                this.dispose();
        }
           
           else {
            // If login fails, show the dialog for signup
            int log1 = JOptionPane.showConfirmDialog(null, "You don't have any account! ", "Warning", JOptionPane.OK_OPTION);
            if (log1 == JOptionPane.OK_OPTION) {
                Lframe l1 = new Lframe(); // Assuming Lframe is the signup form
                l1.setVisible(true);
            }         
       
            }
        }
           catch(Exception e)
         {
             System.out.println(e.getMessage());
         }
              
                
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
         this.dispose();
        home2 h1=new home2();
        h1.setVisible(true);
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(Lframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField password;
    private javax.swing.JTextField rollno;
    // End of variables declaration//GEN-END:variables
}
