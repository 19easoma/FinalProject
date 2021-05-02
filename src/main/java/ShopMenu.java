/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antho
 */
public class ShopMenu extends javax.swing.JFrame {

    /**
     * Creates new form ShopMenu
     */
    public ShopMenu() {
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

        btnCloseShop = new javax.swing.JButton();
        btnMainfromShop = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaShopDialogue = new javax.swing.JTextArea();
        btnBuyPotion = new javax.swing.JButton();
        btnBuyMegaPotion = new javax.swing.JButton();
        btnBuyMaxPotion = new javax.swing.JButton();
        lblPotionDescription = new javax.swing.JLabel();
        lblMegaPotionDescription = new javax.swing.JLabel();
        lblMaxPotionDescription = new javax.swing.JLabel();
        lblPotionPrice = new javax.swing.JLabel();
        lblMegaPotionPrice = new javax.swing.JLabel();
        lblMaxPotionPrice = new javax.swing.JLabel();
        lblShopkeeperName = new javax.swing.JLabel();
        lblCurrentGold = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCloseShop.setText("Close");
        btnCloseShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseShopActionPerformed(evt);
            }
        });

        btnMainfromShop.setText("Main Menu");
        btnMainfromShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainfromShopActionPerformed(evt);
            }
        });

        areaShopDialogue.setColumns(20);
        areaShopDialogue.setLineWrap(true);
        areaShopDialogue.setRows(4);
        areaShopDialogue.setText("Welcome to my shop! We are still under a fair bit of maintenance, but feel free to check out our current stock, if you're in the market for a bunch of potions, of course!");
        areaShopDialogue.setWrapStyleWord(true);
        jScrollPane1.setViewportView(areaShopDialogue);

        btnBuyPotion.setText("Purchase 1 Potion");
        btnBuyPotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyPotionActionPerformed(evt);
            }
        });

        btnBuyMegaPotion.setText("Purchase 1 Mega Potion");
        btnBuyMegaPotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyMegaPotionActionPerformed(evt);
            }
        });

        btnBuyMaxPotion.setText("Purchase 1 Max Potion");
        btnBuyMaxPotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyMaxPotionActionPerformed(evt);
            }
        });

        lblPotionDescription.setText("This will restore 20 health points in battle!");

        lblMegaPotionDescription.setText("This will restore 50 health points in battle!");

        lblMaxPotionDescription.setText("This will restore all of your health points in battle!");

        lblPotionPrice.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPotionPrice.setText("10 Gold");

        lblMegaPotionPrice.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblMegaPotionPrice.setText("30 Gold");

        lblMaxPotionPrice.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblMaxPotionPrice.setText("200 Gold");

        lblShopkeeperName.setText("Shopkeeper");

        lblCurrentGold.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCurrentGold.setText("Gold: " + Player.getCurrentGold());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnMainfromShop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 352, Short.MAX_VALUE)
                .addComponent(btnCloseShop))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPotionPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMegaPotionPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMaxPotionPrice, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuyMegaPotion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuyPotion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuyMaxPotion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPotionDescription)
                            .addComponent(lblMegaPotionDescription)
                            .addComponent(lblMaxPotionDescription))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblShopkeeperName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCurrentGold)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblShopkeeperName)
                    .addComponent(lblCurrentGold))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuyPotion)
                    .addComponent(lblPotionDescription)
                    .addComponent(lblPotionPrice))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuyMegaPotion)
                    .addComponent(lblMegaPotionDescription)
                    .addComponent(lblMegaPotionPrice))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuyMaxPotion)
                    .addComponent(lblMaxPotionDescription)
                    .addComponent(lblMaxPotionPrice))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCloseShop)
                    .addComponent(btnMainfromShop)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseShopActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCloseShopActionPerformed

    private void btnMainfromShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainfromShopActionPerformed
        // TODO add your handling code here:
        MainMenu MainMenuScreen = new MainMenu();
        MainMenuScreen.show();
        this.dispose();
    }//GEN-LAST:event_btnMainfromShopActionPerformed

    private void btnBuyPotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyPotionActionPerformed
        // used to buy potions
        if (Player.getCurrentGold() >= 10) {
            Player.setPotionsHeld(Player.getPotionsHeld() + 1);
            Player.setCurrentGold(Player.getCurrentGold() - 10);
            
            areaShopDialogue.setText("Thank you for your business!");
        } else {
            areaShopDialogue.setText("I don't quite think you can afford that, buddy");
        }
        
        lblCurrentGold.setText("Gold: " + Player.getCurrentGold());
    }//GEN-LAST:event_btnBuyPotionActionPerformed

    private void btnBuyMegaPotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyMegaPotionActionPerformed
        // used to buy mega potions
        if (Player.getCurrentGold() >= 30) {
            Player.setMegaPotionsHeld(Player.getMegaPotionsHeld() + 1);
            Player.setCurrentGold(Player.getCurrentGold() - 30);
            
            areaShopDialogue.setText("Thank you for your business!");
        } else {
            areaShopDialogue.setText("I don't quite think you can afford that, buddy");
        }
        
                lblCurrentGold.setText("Gold: " + Player.getCurrentGold());

    }//GEN-LAST:event_btnBuyMegaPotionActionPerformed

    private void btnBuyMaxPotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyMaxPotionActionPerformed
        // used to buy max 
        if (Player.getCurrentGold() >= 200) {
            Player.setMaxPotionsHeld(Player.getMaxPotionsHeld() + 1);
            Player.setCurrentGold(Player.getCurrentGold() - 200);
            
            areaShopDialogue.setText("Thank you for your business!");
        } else {
            areaShopDialogue.setText("I don't quite think you can afford that, buddy");
        }
        
        lblCurrentGold.setText("Gold: " + Player.getCurrentGold());
    }//GEN-LAST:event_btnBuyMaxPotionActionPerformed

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
            java.util.logging.Logger.getLogger(ShopMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShopMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShopMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShopMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShopMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaShopDialogue;
    private javax.swing.JButton btnBuyMaxPotion;
    private javax.swing.JButton btnBuyMegaPotion;
    private javax.swing.JButton btnBuyPotion;
    private javax.swing.JButton btnCloseShop;
    private javax.swing.JButton btnMainfromShop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCurrentGold;
    private javax.swing.JLabel lblMaxPotionDescription;
    private javax.swing.JLabel lblMaxPotionPrice;
    private javax.swing.JLabel lblMegaPotionDescription;
    private javax.swing.JLabel lblMegaPotionPrice;
    private javax.swing.JLabel lblPotionDescription;
    private javax.swing.JLabel lblPotionPrice;
    private javax.swing.JLabel lblShopkeeperName;
    // End of variables declaration//GEN-END:variables
}
