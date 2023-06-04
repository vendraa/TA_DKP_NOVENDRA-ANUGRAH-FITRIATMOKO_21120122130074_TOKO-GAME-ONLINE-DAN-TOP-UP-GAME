package tugas.akhir.dkp;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class TopUpFrame extends javax.swing.JFrame {
    String Cetak, diamond;
    
    public TopUpFrame() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    public void diamond(){
      JRadioButton[] jumlahButtons = {jumlah1, jumlah2, jumlah3, jumlah4, jumlah5, jumlah6};
              for (JRadioButton button : jumlahButtons){
                  if(button.isSelected()){
                      diamond = button.getText();
                      break;
                  }
              }
    }
    private void Cetak(){
        if(userid.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Masukkan Data Pembelian Dulu");
        }
        else{
            int h;
            h = JOptionPane.showConfirmDialog(null, "Konfirmasi Pesananmu?" , "Halaman Konfirmasi", JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE);
            if(h == JOptionPane.YES_OPTION){
                Cetak=
                        "SELAMAT PEMBELIAN ANDA BERHASIL"+
                        "\n User ID : "+userid.getText()+
                        "\n Jumlah Diamond : "+diamond+
                        "\n Metode Pembayaran : "+metode.getSelectedItem();
            
                JOptionPane.showMessageDialog(null, Cetak , "Data Pemesanan Top Up Diamond" ,JOptionPane.INFORMATION_MESSAGE);
            
                if(h==JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Silahkan Periksa Lagi","Cek",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        jumlah2 = new javax.swing.JRadioButton();
        jumlah1 = new javax.swing.JRadioButton();
        jumlah4 = new javax.swing.JRadioButton();
        jumlah5 = new javax.swing.JRadioButton();
        jumlah6 = new javax.swing.JRadioButton();
        jumlah3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        metode = new javax.swing.JComboBox<>();
        beli = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Halaman Top Up");

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setBackground(new java.awt.Color(230, 126, 34));
        jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ZOYTOY STORE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(75, 119, 190));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("User ID :");

        userid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        userid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridActionPerformed(evt);
            }
        });

        buttonGroup1.add(jumlah2);
        jumlah2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jumlah2.setForeground(new java.awt.Color(0, 0, 0));
        jumlah2.setText("60 Diamond (Rp 49.000)");
        jumlah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jumlah1);
        jumlah1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jumlah1.setForeground(new java.awt.Color(0, 0, 0));
        jumlah1.setText("20 Diamond (Rp 19.000)");
        jumlah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jumlah4);
        jumlah4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jumlah4.setForeground(new java.awt.Color(0, 0, 0));
        jumlah4.setText("290 Diamond (Rp 99.000)");
        jumlah4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jumlah5);
        jumlah5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jumlah5.setForeground(new java.awt.Color(0, 0, 0));
        jumlah5.setText("550 Diamond (Rp 179.000)");
        jumlah5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jumlah6);
        jumlah6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jumlah6.setForeground(new java.awt.Color(0, 0, 0));
        jumlah6.setText("1.100 Diamond (Rp 359.000)");
        jumlah6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah6ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jumlah3);
        jumlah3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jumlah3.setForeground(new java.awt.Color(0, 0, 0));
        jumlah3.setText("150 Diamond (Rp 79.000)");
        jumlah3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Pilih Jumlah Diamond");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Pilih Metode Pembayaran");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Meode Pembayaran :");

        metode.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        metode.setForeground(new java.awt.Color(0, 0, 0));
        metode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Pilih Metode Pembayaran---", "BCA Virtual Account", "Mandiri Virtual Account", "GoPay", "OVO", "DANA" }));

        beli.setBackground(new java.awt.Color(0, 255, 0));
        beli.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        beli.setForeground(new java.awt.Color(0, 0, 0));
        beli.setText("BELI");
        beli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Masukkan User ID dan Pilih Jumlah Diamond");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("yang Diinginkan serta Pilih Metode Pembayaran");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(beli)
                .addGap(53, 53, 53))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(metode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jumlah3)
                                .addComponent(jumlah1)
                                .addComponent(jumlah2))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jumlah4)
                                .addComponent(jumlah6)
                                .addComponent(jumlah5))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlah1)
                    .addComponent(jumlah4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlah2)
                    .addComponent(jumlah5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlah6)
                    .addComponent(jumlah3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(metode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beli)
                    .addComponent(jButton2))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jumlah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah1ActionPerformed
      diamond();
    }//GEN-LAST:event_jumlah1ActionPerformed

    private void jumlah4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah4ActionPerformed
       diamond();
    }//GEN-LAST:event_jumlah4ActionPerformed

    private void jumlah5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah5ActionPerformed
        diamond();
    }//GEN-LAST:event_jumlah5ActionPerformed

    private void jumlah6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah6ActionPerformed
        diamond();
    }//GEN-LAST:event_jumlah6ActionPerformed

    private void jumlah3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah3ActionPerformed
        diamond();
    }//GEN-LAST:event_jumlah3ActionPerformed

    private void useridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridActionPerformed
        
    }//GEN-LAST:event_useridActionPerformed

    private void beliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliActionPerformed
        Cetak();
    }//GEN-LAST:event_beliActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       new MainFrame().show();
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jumlah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah2ActionPerformed
        diamond();
    }//GEN-LAST:event_jumlah2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TopUpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beli;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jumlah1;
    private javax.swing.JRadioButton jumlah2;
    private javax.swing.JRadioButton jumlah3;
    private javax.swing.JRadioButton jumlah4;
    private javax.swing.JRadioButton jumlah5;
    private javax.swing.JRadioButton jumlah6;
    private javax.swing.JComboBox<String> metode;
    private javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables
}
