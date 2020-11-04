/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iesportada.alquilacarchurriana;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;

/**
 *
 * @author vzh
 */
public class BookingVehicleJFrame extends javax.swing.JFrame {

    private static PersonalDataJFrame pdjf;
    /**
     * Creates new form BookingVehicleJFrame
     */
    public BookingVehicleJFrame(PersonalDataJFrame parent, boolean modal) {
        pdjf = parent;
        initComponents();
        dailyCostJTextField.setText("1");
        totalCostJTextField.setText("80");
    }

    Utils utils = new Utils();
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
        cancelJButton = new javax.swing.JButton();
        okJButton = new javax.swing.JButton();
        cleanJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pickupDateTextField = new javax.swing.JTextField();
        dropDateTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        totalDaysJTextField = new javax.swing.JTextField();
        carTypeJComboText = new javax.swing.JComboBox<>();
        dailyCostJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        totalCostJTextField = new javax.swing.JTextField();
        calculateTotalDaysJButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        quitJMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        aboutJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alquilacarChurrianaResized100x100.png"))); // NOI18N

        cancelJButton.setText("Cancel");
        cancelJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelJButtonActionPerformed(evt);
            }
        });

        okJButton.setText("OK");
        okJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okJButtonActionPerformed(evt);
            }
        });

        cleanJButton.setText("Clean");
        cleanJButton.setToolTipText("");
        cleanJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanJButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Pickup date");

        jLabel3.setText("Drop Date");

        pickupDateTextField.setText(utils.todayDate()
        );
        pickupDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickupDateTextFieldActionPerformed(evt);
            }
        });

        dropDateTextField.setText(utils.defaultDropDate());

        jLabel4.setText("Total Days");

        totalDaysJTextField.setText("1");
        totalDaysJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalDaysJTextFieldActionPerformed(evt);
            }
        });

        carTypeJComboText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "turismo", "todo terreno", "monovolumen" }));
        carTypeJComboText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carTypeJComboTextActionPerformed(evt);
            }
        });

        dailyCostJTextField.setEditable(false);

        jLabel5.setText("Daily cost");

        jLabel6.setText("Total Cost");

        totalCostJTextField.setEditable(false);

        calculateTotalDaysJButton.setFont(new java.awt.Font("Fira Sans", 0, 10)); // NOI18N
        calculateTotalDaysJButton.setText("Calculate");
        calculateTotalDaysJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateTotalDaysJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pickupDateTextField)
                            .addComponent(cancelJButton, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cleanJButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(okJButton)
                                        .addContainerGap())
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(dailyCostJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(totalCostJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(56, 56, 56))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(dropDateTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(calculateTotalDaysJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel1))
                                    .addComponent(totalDaysJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(carTypeJComboText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calculateTotalDaysJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(totalDaysJTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dropDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pickupDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carTypeJComboText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dailyCostJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCostJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelJButton)
                    .addComponent(okJButton)
                    .addComponent(cleanJButton))
                .addContainerGap())
        );

        jMenu1.setText("File");

        quitJMenuItem.setText("Exit");
        quitJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitJMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(quitJMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        aboutJMenuItem.setText("About us");
        aboutJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutJMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(aboutJMenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitJMenuItemActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_quitJMenuItemActionPerformed

    private void aboutJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutJMenuItemActionPerformed
        // TODO add your handling code here:
        try {
           this.setVisible(true);
           AboutUsJFrame au = new AboutUsJFrame();
           au.setVisible(true);
           au.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        }
        catch (HeadlessException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_aboutJMenuItemActionPerformed

    String carType;
    int price;
    private void carTypeJComboTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carTypeJComboTextActionPerformed
        // TODO add your handling code here:
        carType = carTypeJComboText.getSelectedItem().toString();    
         if (carType.equals("turismo")){
            dailyCostJTextField.setText("80");
        } if (carType.equals("todo terreno")){
            dailyCostJTextField.setText("100");
        } if (carType.equals("monovolumen")){
            dailyCostJTextField.setText("125");
        }
        int totalCost = (Integer.valueOf(dailyCostJTextField.getText())*(Integer.valueOf(totalDaysJTextField.getText())));
        totalCostJTextField.setText(Integer.toString(totalCost));
    }//GEN-LAST:event_carTypeJComboTextActionPerformed

    private void cleanJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanJButtonActionPerformed
        // TODO add your handling code here:
        dropDateTextField.setText(utils.defaultDropDate());
        pickupDateTextField.setText(utils.todayDate());
        totalDaysJTextField.setText("1");
        dailyCostJTextField.setText("0");
        carTypeJComboText.setSelectedItem("turismo");
    }//GEN-LAST:event_cleanJButtonActionPerformed

    private void okJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okJButtonActionPerformed
        // TODO add your handling code here:
        if(Integer.valueOf(totalDaysJTextField.getText())<0){
            JOptionPane.showMessageDialog(this, "Error, la reserva de días no puede ser inferior a 0");
        }
        else{
            JOptionPane.showMessageDialog(this, "reserva completa");
            dispose();
            this.setVisible(false);
            MainJFrame mjf = new MainJFrame();
            mjf.setVisible(true);
        }
    }//GEN-LAST:event_okJButtonActionPerformed

    private void totalDaysJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalDaysJTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_totalDaysJTextFieldActionPerformed

    
    private String finalDropDate;
    public String finalDropDate(){
        return finalDropDate;
    }
    private String finalPickUpDate;
    
    public String finalPickUpDate(){
        return finalPickUpDate;
    }
    
    private void calculateTotalDaysJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateTotalDaysJButtonActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            Date date1 = null;
            Date date2 = null;
            
            try {
            date1=sdf.parse(pickupDateTextField.getText());
            } 
            catch(ParseException pe){
            pe.printStackTrace();
            }
            try {
            date2=sdf.parse(dropDateTextField.getText());
            } 
            catch(ParseException ep){
            ep.printStackTrace();
            }
            
            utils.setDate1(date1);
            utils.setDate2(date2);

            totalDaysJTextField.setText(String.valueOf(TimeUnit.DAYS.convert(utils.rentedDays(), TimeUnit.MILLISECONDS)));


    }//GEN-LAST:event_calculateTotalDaysJButtonActionPerformed

    private void pickupDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickupDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pickupDateTextFieldActionPerformed

    private void cancelJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelJButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        pdjf.setVisible(true);
    }//GEN-LAST:event_cancelJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BookingVehicleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingVehicleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingVehicleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingVehicleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BookingVehicleJFrame bvjf = new BookingVehicleJFrame(pdjf, true);
                //new BookingVehicleJFrame().setVisible(true);
                        bvjf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutJMenuItem;
    private javax.swing.JButton calculateTotalDaysJButton;
    private javax.swing.JButton cancelJButton;
    private javax.swing.JComboBox<String> carTypeJComboText;
    private javax.swing.JButton cleanJButton;
    private javax.swing.JTextField dailyCostJTextField;
    private javax.swing.JTextField dropDateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton okJButton;
    private javax.swing.JTextField pickupDateTextField;
    private javax.swing.JMenuItem quitJMenuItem;
    private javax.swing.JTextField totalCostJTextField;
    private javax.swing.JTextField totalDaysJTextField;
    // End of variables declaration//GEN-END:variables
}