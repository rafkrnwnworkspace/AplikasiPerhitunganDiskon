import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class PerhitunganDiskon extends javax.swing.JFrame {


    public PerhitunganDiskon() {
        initComponents();
        setTitle("Aplikasi Perhitungan Diskon");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        discountBox = new javax.swing.JComboBox<>();
        discountSlider = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        finalPriceLabel = new javax.swing.JLabel();
        savingsLabel = new javax.swing.JLabel();
        kuponTambahan = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        calculateButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(228, 232, 237));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel6.setText("APLIKASI PERHITUNGAN DISKON");

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel1.setText("Harga Awal");

        priceField.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N

        discountBox.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        discountBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "10", "20", "30" }));
        discountBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountBoxActionPerformed(evt);
            }
        });

        discountSlider.setMaximum(50);

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel3.setText("Diskon Tambahan");

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        jLabel7.setText("%");

        finalPriceLabel.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        finalPriceLabel.setText("Harga Akhir :");

        savingsLabel.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        savingsLabel.setText("Hemat :");

        kuponTambahan.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        kuponTambahan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "10", "20", "30" }));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        jLabel2.setText("Bonus Member");

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        jLabel8.setText("%");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalPriceLabel)
                    .addComponent(savingsLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(kuponTambahan, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(16, 16, 16))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kuponTambahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(finalPriceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(savingsLabel)
                .addGap(16, 16, 16))
        );

        calculateButton.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        calculateButton.setText("Hitung");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        historyArea.setColumns(20);
        historyArea.setRows(5);
        jScrollPane1.setViewportView(historyArea);

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel4.setText("CHECK OUT :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discountSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(discountBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addComponent(jLabel6))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(discountBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(priceField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(discountSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void discountBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountBoxActionPerformed

    }//GEN-LAST:event_discountBoxActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        try {
            double originalPrice = Double.parseDouble(priceField.getText().trim());

            // Pastikan mendapatkan item dari discountBox sebagai Integer

            String selectedDiscountString = (String) discountBox.getSelectedItem();
            Integer selectedDiscount = Integer.valueOf(selectedDiscountString);
            //
            String kuponString = (String) kuponTambahan.getSelectedItem();
            Integer kuponPilih = Integer.valueOf(kuponString);

            int additionalDiscount = discountSlider.getValue();

            double totalDiscount = selectedDiscount + additionalDiscount + kuponPilih;
            double discountAmount = originalPrice * totalDiscount / 100;
            double finalPrice = originalPrice - discountAmount;

            finalPriceLabel.setText(String.format("Harga Akhir : " + "Rp %.2f", finalPrice));
            savingsLabel.setText(String.format("Hemat : " +"Rp %.2f", discountAmount));

            String result = "Harga Awal: Rp " + originalPrice +
            "\nDiskon: " + totalDiscount + "%" +
            "\nHarga Akhir: Rp " + finalPrice +
            "\nPenghematan: Rp " + discountAmount;

            historyArea.append(result + "\n\n");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan harga yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassCastException ex) {
            JOptionPane.showMessageDialog(this, "Kesalahan tipe data. Pastikan diskon terpilih adalah angka!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_calculateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PerhitunganDiskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerhitunganDiskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerhitunganDiskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerhitunganDiskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerhitunganDiskon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateButton;
    private javax.swing.JComboBox<String> discountBox;
    private javax.swing.JSlider discountSlider;
    private javax.swing.JLabel finalPriceLabel;
    private javax.swing.JTextArea historyArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kuponTambahan;
    private javax.swing.JTextField priceField;
    private javax.swing.JLabel savingsLabel;
    // End of variables declaration//GEN-END:variables
}
