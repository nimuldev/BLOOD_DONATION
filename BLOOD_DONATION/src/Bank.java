
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class Bank extends javax.swing.JFrame {

    /**
     * Creates new form Bank
     */
    Database ob = new Database();
          DefaultTableModel model;
          DefaultTableModel model1;
          DefaultTableModel model2;
          
    public Bank() {
        initComponents();
        donar();
        patient();
      
        bank();
    }
    void donar(){
        
      	String Name;
	String Id;
	String Bgroup;
	String Number;
	String Disease;
	String Address;
	String Donate;
	String Baddress;
	
	String Pass;
        ResultSet rs =null;
        model= (DefaultTableModel) doner.getModel();   
                      
        model.setRowCount(0); 
        String serial="Select * from Donar";
      rs=ob.select(serial); 
      
       try {
           while (rs.next()) {
              
               Name=rs.getString("DName");
               
                Id=rs.getString("DId");
             
                 Bgroup=rs.getString("DBGroup");
                 
                   Donate=rs.getString("Donate");
              
                   Address=rs.getString("DAddress");
                  
                   
                  
                   Number=rs.getString("DCNumber");
                   Object[] objs = {Name,Id,Address,Number,Bgroup,Donate};
                    model.addRow(objs);
                   
           }
       } catch (SQLException ex) {
           Logger.getLogger(DCreate.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }
     void patient(){
        String Name;
	String Id;
	String Bgroup;
	String Number;
	String Disease;
	String Address;
	String Donat;
	String Baddress;
	       
	String Pass;
        ResultSet rs =null;
        model1= (DefaultTableModel) patient.getModel();   
              
        model1.setRowCount(0); 
        String serial="Select * from Patient";
      rs=ob.select(serial); 
    
       try {
           while (rs.next()) {
              
               Name=rs.getString("Pname");
               
                Id=rs.getString("Pid");
             
                 Bgroup=rs.getString("PBGroup");
                  Disease=rs.getString("PDisease");
                  
           
                   Donat=rs.getString("Donate");
                  
                   
                  
                   Number=rs.getString("PNumber");
                    
                   Object[] objs1 = {Name,Id,Disease,Bgroup,Donat,Number};
                  
                    model1.addRow(objs1);
                    
                   
           }
       } catch (SQLException ex) {
           Logger.getLogger(DCreate.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }
      void bank(){
           String DName;
	String DId;
         String PName;
	String PId;
	String Bgroup;
	String Number;
	String Disease;
	String Address;
	String Donat;
	String Baddress;
	       
	String Pass;
        ResultSet rs =null;
        model2= (DefaultTableModel) donet.getModel();   
              
        model2.setRowCount(0); 
        String serial="Select * from Bank";
      rs=ob.select(serial); 
    
       try {
           while (rs.next()) {
              
               DName=rs.getString("DName");
                  PName=rs.getString("Pname");
                DId=rs.getString("DId");
                  PId=rs.getString("PId");
                 Bgroup=rs.getString("BGroup");
                  
                    
                   Object[] objs1 = {DName,PName,DId,DId,Bgroup};
                  
                    model2.addRow(objs1);
                    
                   
           }
       } catch (SQLException ex) {
           Logger.getLogger(DCreate.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        doner = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        patient = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        donet = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Faith Blood Bank");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Faith Blood Bank");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("9/1,Shanti Nagor,Dhaka-1201");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Contact   :01685004731");

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        doner.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        doner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "ID", "Address", "Number", "Group", "Donate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(doner);

        jTabbedPane1.addTab("Donar", jScrollPane1);

        patient.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        patient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "ID", "Disease", "Group", "Satus", "Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(patient);

        jTabbedPane1.addTab("Patient", jScrollPane2);

        donet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        donet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DName", "DId", "PName", "PId", "B Group"
            }
        ));
        jScrollPane3.setViewportView(donet);

        jTabbedPane1.addTab("Donated", jScrollPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable doner;
    private javax.swing.JTable donet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable patient;
    // End of variables declaration//GEN-END:variables
}