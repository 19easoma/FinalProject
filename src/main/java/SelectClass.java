
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antho
 */
public class SelectClass extends javax.swing.JFrame {

    /**
     * Creates new form SelectClass
     */
    public SelectClass() {
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

        lblChooseClass = new javax.swing.JLabel();
        btnChooseKnightClass = new javax.swing.JButton();
        btnChooseHunterClass = new javax.swing.JButton();
        btnChooseSorcererClass = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblChooseClass.setText("Please choose a class");

        btnChooseKnightClass.setBackground(new java.awt.Color(255, 153, 153));
        btnChooseKnightClass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnChooseKnightClass.setText("Knight");
        btnChooseKnightClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseKnightClassActionPerformed(evt);
            }
        });

        btnChooseHunterClass.setBackground(new java.awt.Color(153, 255, 153));
        btnChooseHunterClass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnChooseHunterClass.setText("Hunter");
        btnChooseHunterClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseHunterClassActionPerformed(evt);
            }
        });

        btnChooseSorcererClass.setBackground(new java.awt.Color(153, 153, 255));
        btnChooseSorcererClass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnChooseSorcererClass.setText("Sorcerer");
        btnChooseSorcererClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseSorcererClassActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(1);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(7);
        jTextArea1.setText("Vitality: 11 \nMana: 4 \nPower: 7 \nWisdom: 3 \nDefense: 7 \nAgility: 2 \nWeapon: Wooden Sword  ");
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(1);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(7);
        jTextArea2.setText("Vitality: 8\nMana: 8\nPower: 5 \nWisdom: 4 \nDefense: 5 \nAgility: 8\nWeapon: Oak Bow");
        jTextArea2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea2.setMaximumSize(new java.awt.Dimension(124, 130));
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setColumns(1);
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(7);
        jTextArea3.setText("Vitality: 6\nMana: 12\nPower: 3\nWisdom: 10 \nDefense: 3 \nAgility: 5\nWeapon: Oak Wand");
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnChooseKnightClass, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(btnChooseSorcererClass)
                .addGap(137, 137, 137)
                .addComponent(btnChooseHunterClass, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChooseClass)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChooseClass)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChooseKnightClass)
                    .addComponent(btnChooseHunterClass)
                    .addComponent(btnChooseSorcererClass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChooseKnightClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseKnightClassActionPerformed
        // TODO add your handling code here:
        Player Player = new Player(11,4,7,3,7,2);
                
        JOptionPane.showMessageDialog(null, "You have chosen the Knight class");
        //NAME DOES NOT TRANSFER OVER
        //delete these
        System.out.println(Player.getPlayerName());
        System.out.println(Player.getVitality());
        
        MainMenu MainMenuScreen = new MainMenu();
        MainMenuScreen.show();
        this.dispose();
    }//GEN-LAST:event_btnChooseKnightClassActionPerformed

    private void btnChooseSorcererClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseSorcererClassActionPerformed
        // TODO add your handling code here:
        Player Player = new Player(6,12,3,10,3,5);
                
        JOptionPane.showMessageDialog(null, "You have chosen the Sorcerer class");
        //NAME DOES NOT TRANSFER OVER
        //delete these
        System.out.println(Player.getPlayerName());
        System.out.println(Player.getVitality());
        
        MainMenu MainMenuScreen = new MainMenu();
        MainMenuScreen.show();
        this.dispose();
    }//GEN-LAST:event_btnChooseSorcererClassActionPerformed

    private void btnChooseHunterClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseHunterClassActionPerformed
        // TODO add your handling code here:
        Player Player = new Player(8,8,5,4,5,8);
                
        JOptionPane.showMessageDialog(null, "You have chosen the Hunter class");
        //NAME DOES NOT TRANSFER OVER
        //delete these
        System.out.println(Player.getPlayerName());
        System.out.println(Player.getVitality());
        
        MainMenu MainMenuScreen = new MainMenu();
        MainMenuScreen.show();
        this.dispose();
    }//GEN-LAST:event_btnChooseHunterClassActionPerformed

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
            java.util.logging.Logger.getLogger(SelectClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseHunterClass;
    private javax.swing.JButton btnChooseKnightClass;
    private javax.swing.JButton btnChooseSorcererClass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel lblChooseClass;
    // End of variables declaration//GEN-END:variables
}
