/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmad Ansyori
 */
public class postest2 extends javax.swing.JFrame {

    private String kec;

    /**
     * Creates new form postest2
     */
    public postest2() {
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

        buttonGroupJK = new javax.swing.ButtonGroup();
        buttonGroupkewarganegaraan = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLformktp = new javax.swing.JLabel();
        jLnama = new javax.swing.JLabel();
        jLttl = new javax.swing.JLabel();
        jLjk = new javax.swing.JLabel();
        jLalamat = new javax.swing.JLabel();
        jLrt = new javax.swing.JLabel();
        jLdesa = new javax.swing.JLabel();
        jLkecamatan = new javax.swing.JLabel();
        jLkota = new javax.swing.JLabel();
        jLagama = new javax.swing.JLabel();
        jLstatus = new javax.swing.JLabel();
        jLgoldar = new javax.swing.JLabel();
        jLpekerjaan = new javax.swing.JLabel();
        jLkewarganegaraan = new javax.swing.JLabel();
        jRBperempuan = new javax.swing.JRadioButton();
        jTFnama = new javax.swing.JTextField();
        jTFttl = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTFtl = new javax.swing.JTextField();
        jTFalamat = new javax.swing.JTextField();
        jTFRT = new javax.swing.JTextField();
        jTFRW = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jRBlaki = new javax.swing.JRadioButton();
        jTFkec = new javax.swing.JTextField();
        jTFdesa = new javax.swing.JTextField();
        jTFkota = new javax.swing.JTextField();
        jCBagama = new javax.swing.JComboBox<String>();
        jCBstatus = new javax.swing.JComboBox<String>();
        jCBgodar = new javax.swing.JComboBox<String>();
        jRBwna = new javax.swing.JRadioButton();
        jRBwni = new javax.swing.JRadioButton();
        jTFpekerjaan = new javax.swing.JTextField();
        jBreset = new javax.swing.JButton();
        jBregister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 255));

        jLformktp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLformktp.setText("FORM KARTU TANDA PENDUDUK");

        jLnama.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLnama.setText("Nama");

        jLttl.setBackground(new java.awt.Color(102, 255, 255));
        jLttl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLttl.setText("Tempat/Tanggal Lahir");

        jLjk.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLjk.setText("Jenis Kelamin");

        jLalamat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLalamat.setText("Alamat");

        jLrt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLrt.setForeground(new java.awt.Color(0, 0, 255));
        jLrt.setText("RT/RW");

        jLdesa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLdesa.setForeground(new java.awt.Color(0, 0, 255));
        jLdesa.setText("Kel/Desa");

        jLkecamatan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLkecamatan.setForeground(new java.awt.Color(0, 0, 255));
        jLkecamatan.setText("Kecamatan");

        jLkota.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLkota.setForeground(new java.awt.Color(0, 0, 255));
        jLkota.setText("Kota");

        jLagama.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLagama.setForeground(new java.awt.Color(0, 51, 255));
        jLagama.setText("Agama");

        jLstatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLstatus.setText("Status");

        jLgoldar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLgoldar.setText("Golongan Darah");

        jLpekerjaan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLpekerjaan.setText("Pekerjaan");

        jLkewarganegaraan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLkewarganegaraan.setText("Kewarganegaraan");

        buttonGroupJK.add(jRBperempuan);
        jRBperempuan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRBperempuan.setText("Perempuan");

        jLabel1.setText("/");

        jLabel2.setText("/");

        buttonGroupJK.add(jRBlaki);
        jRBlaki.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRBlaki.setText("Laki-laki");

        jCBagama.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCBagama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ISLAM", "KRISTEN", "BUDHA", "KATOLIK", " " }));

        jCBstatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCBstatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KAWIN", "BELUM KAWIN" }));

        jCBgodar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCBgodar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "AB", "O" }));
        jCBgodar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBgodarActionPerformed(evt);
            }
        });

        buttonGroupkewarganegaraan.add(jRBwna);
        jRBwna.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRBwna.setText("WNA");

        buttonGroupkewarganegaraan.add(jRBwni);
        jRBwni.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRBwni.setText("WNI");
        jRBwni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBwniActionPerformed(evt);
            }
        });

        jBreset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBreset.setText("Reset");
        jBreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBresetActionPerformed(evt);
            }
        });

        jBregister.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBregister.setText("Register");
        jBregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBregisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBreset)
                .addGap(18, 18, 18)
                .addComponent(jBregister)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLnama)
                            .addComponent(jLttl)
                            .addComponent(jLjk)
                            .addComponent(jLalamat)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLdesa)
                            .addComponent(jLrt)
                            .addComponent(jLkecamatan)
                            .addComponent(jLkota)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLagama))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLstatus))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLgoldar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLkewarganegaraan))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLpekerjaan)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFpekerjaan)
                            .addComponent(jTFalamat)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTFttl, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2))
                                    .addComponent(jRBlaki, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFtl, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 9, Short.MAX_VALUE)
                                        .addComponent(jRBperempuan, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9))))
                            .addComponent(jTFkec)
                            .addComponent(jTFdesa)
                            .addComponent(jTFkota, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBgodar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBagama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTFRT, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel1)
                                        .addGap(7, 7, 7)
                                        .addComponent(jTFRW, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRBwna)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRBwni)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(56, 56, 56))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLformktp)
                            .addComponent(jTFnama, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLformktp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnama)
                    .addComponent(jTFnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLttl)
                    .addComponent(jTFttl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFtl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLjk)
                    .addComponent(jRBperempuan)
                    .addComponent(jRBlaki))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLalamat)
                    .addComponent(jTFalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLrt)
                    .addComponent(jTFRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFRW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLdesa)
                    .addComponent(jTFdesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLkecamatan)
                    .addComponent(jTFkec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLkota)
                    .addComponent(jTFkota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLagama)
                    .addComponent(jCBagama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLstatus)
                    .addComponent(jCBstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLgoldar)
                    .addComponent(jCBgodar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLpekerjaan)
                    .addComponent(jTFpekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLkewarganegaraan)
                    .addComponent(jRBwna)
                    .addComponent(jRBwni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBreset)
                    .addComponent(jBregister)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBwniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBwniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBwniActionPerformed

    private void jBresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBresetActionPerformed
        // TODO add your handling code here:
        jTFnama.setText("");
        jTFttl.setText("");
        jTFtl.setText("");
        buttonGroupJK.clearSelection();
        jTFalamat.setText("");
        jTFRT.setText("");
        jTFRW.setText("");
        jTFdesa.setText("");
        jTFkec.setText("");
        jTFkota.setText("");
        jCBagama.setSelectedItem(null);
        jCBstatus.setSelectedItem(null);
        jCBgodar.setSelectedItem(null);
        jTFpekerjaan.setText("");
        buttonGroupkewarganegaraan.clearSelection();
    }//GEN-LAST:event_jBresetActionPerformed

    private void jBregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBregisterActionPerformed
        // TODO add your handling code here:
        String Nama1, ttl1, tl1, JK=null, Alamat1, RT1, RW1, desa1, Kec1, kota1, agama1, status1, godar1, pekerjaan1;
        Nama1 = jTFnama.getText();
        ttl1 = jTFttl.getText();
        tl1 = jTFtl.getText();
            if (jRBlaki.isSelected())
            {JK = jRBlaki.getText();}
            else if (jRBperempuan.isSelected())
            {JK =jRBperempuan.getText();}
        Alamat1 =jTFalamat.getText();
        RT1 = jTFRT.getText();
        RW1 = jTFRW.getText();
        desa1 = jTFdesa.getText();
        Kec1 = jTFkec.getText();
        kota1 = jTFkota.getText();
        agama1 = jCBagama.getSelectedItem().toString();
        status1 = jCBstatus.getSelectedItem().toString();
        godar1 = jCBgodar.getSelectedItem().toString();
        pekerjaan1 = jTFpekerjaan.getText();
        String kewarganegaraan1=null;
            if (jRBwna.isSelected())
            {kewarganegaraan1 = jRBwni.getText();}
            else if (jRBwni.isSelected())
            {kewarganegaraan1 = jRBwna.getText();}
            
       
       output x = new output(Nama1, ttl1, tl1, JK, Alamat1, RT1, RW1, desa1, Kec1, kota1, agama1, status1, godar1, pekerjaan1, kewarganegaraan1);
        x.setVisible(true);
    }//GEN-LAST:event_jBregisterActionPerformed

    private void jCBgodarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBgodarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBgodarActionPerformed

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
            java.util.logging.Logger.getLogger(postest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(postest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(postest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(postest2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new postest2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupJK;
    private javax.swing.ButtonGroup buttonGroupkewarganegaraan;
    private javax.swing.JButton jBregister;
    private javax.swing.JButton jBreset;
    private javax.swing.JComboBox<String> jCBagama;
    private javax.swing.JComboBox<String> jCBgodar;
    private javax.swing.JComboBox<String> jCBstatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLagama;
    private javax.swing.JLabel jLalamat;
    private javax.swing.JLabel jLdesa;
    private javax.swing.JLabel jLformktp;
    private javax.swing.JLabel jLgoldar;
    private javax.swing.JLabel jLjk;
    private javax.swing.JLabel jLkecamatan;
    private javax.swing.JLabel jLkewarganegaraan;
    private javax.swing.JLabel jLkota;
    private javax.swing.JLabel jLnama;
    private javax.swing.JLabel jLpekerjaan;
    private javax.swing.JLabel jLrt;
    private javax.swing.JLabel jLstatus;
    private javax.swing.JLabel jLttl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBlaki;
    private javax.swing.JRadioButton jRBperempuan;
    private javax.swing.JRadioButton jRBwna;
    private javax.swing.JRadioButton jRBwni;
    private javax.swing.JTextField jTFRT;
    private javax.swing.JTextField jTFRW;
    private javax.swing.JTextField jTFalamat;
    private javax.swing.JTextField jTFdesa;
    private javax.swing.JTextField jTFkec;
    private javax.swing.JTextField jTFkota;
    private javax.swing.JTextField jTFnama;
    private javax.swing.JTextField jTFpekerjaan;
    private javax.swing.JTextField jTFtl;
    private javax.swing.JTextField jTFttl;
    // End of variables declaration//GEN-END:variables

    private static class outputktp {

        public outputktp() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
