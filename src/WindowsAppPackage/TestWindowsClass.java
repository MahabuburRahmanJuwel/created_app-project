
package WindowsAppPackage;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class TestWindowsClass extends javax.swing.JFrame {

   
    public TestWindowsClass() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonDisplay = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuNew = new javax.swing.JMenu();
        jMenuItemDoc = new javax.swing.JMenuItem();
        jMenuItemExcel = new javax.swing.JMenuItem();
        jMenuEdit = new javax.swing.JMenu();
        jMenuHelp = new javax.swing.JMenu();
        jMenuItemAbout = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TestWindows");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        jLabelName.setText("Name:");

        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        jLabelID.setText("ID: ");

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonDisplay.setText("Display");
        jButtonDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDisplayActionPerformed(evt);
            }
        });

        jMenuFile.setText("File");

        jMenuNew.setText("New");

        jMenuItemDoc.setText("Doc");
        jMenuNew.add(jMenuItemDoc);

        jMenuItemExcel.setText("Excel");
        jMenuNew.add(jMenuItemExcel);

        jMenuFile.add(jMenuNew);

        jMenuBar1.add(jMenuFile);

        jMenuEdit.setText("Edit");
        jMenuBar1.add(jMenuEdit);

        jMenuHelp.setText("Help");

        jMenuItemAbout.setText("About");
        jMenuItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAboutActionPerformed(evt);
            }
        });
        jMenuHelp.add(jMenuItemAbout);

        jMenuBar1.add(jMenuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelName)
                    .addComponent(jLabelID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdd)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEdit)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDisplay))
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelName))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonDisplay))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
      
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String password = "";
            String url = "jdbc:mysql://127.0.0.1:3306/student?serverTimezone=UTC";
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement statement = conn.createStatement();
            String s1 = jTextFieldID.getText();
            int id = Integer.parseInt(s1);
            String s2 = jTextFieldName.getText();
            String query = "INSERT INTO studentinfo (id, name) VALUES ("+id+",'"+s2+"')";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(TestWindowsClass.this, "Information has been added.");
            statement.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TestWindowsClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jMenuItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAboutActionPerformed
        AboutClass ac = new AboutClass();
        ac.setVisible(true);
        TestWindowsClass.this.dispose();
    }//GEN-LAST:event_jMenuItemAboutActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
      try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String password = "";
            String url = "jdbc:mysql://127.0.0.1:3306/student?serverTimezone=UTC";
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement statement = conn.createStatement();
            String s1 = jTextFieldID.getText();
            int id = Integer.parseInt(s1);
            String s2 = jTextFieldName.getText();
            String query = "UPDATE studentinfo SET name='"+s2+"' WHERE id="+id;
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(TestWindowsClass.this, "Information has been edited.");
            statement.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TestWindowsClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
     
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String password = "";
            String url = "jdbc:mysql://127.0.0.1:3306/student?serverTimezone=UTC";
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement statement = conn.createStatement();
            String s1 = jTextFieldID.getText();
            int id = Integer.parseInt(s1);
          //  String s2 = jTextFieldName.getText();
             String query = "DELETE FROM studentinfo WHERE id = "+id;
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(TestWindowsClass.this, "Information has been deleted.");
            statement.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TestWindowsClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDisplayActionPerformed
        
        try {
            
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String password = "";
            String url = "jdbc:mysql://127.0.0.1:3306/student?serverTimezone=UTC";
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement statement = conn.createStatement();
            String query = "SELECT * FROM studentinfo";
            ResultSet result = statement.executeQuery(query);
            String finalmsg = "";
            while(result.next())
            {
                String id, name; 
                id = result.getString("id");
                name = result.getString("name");
                String msg = id+" "+name+"\n";
                finalmsg = finalmsg + msg;
            }
           JOptionPane.showMessageDialog(TestWindowsClass.this, finalmsg);
            statement.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TestWindowsClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonDisplayActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestWindowsClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonDisplay;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JMenuItem jMenuItemAbout;
    private javax.swing.JMenuItem jMenuItemDoc;
    private javax.swing.JMenuItem jMenuItemExcel;
    private javax.swing.JMenu jMenuNew;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
