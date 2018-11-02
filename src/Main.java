
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edo
 */
public class Main extends javax.swing.JFrame {
    FormPengguna frmPengguna;
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        initState();
        setExtendedState(JFrame.MAXIMIZED_BOTH);        
    }
    
    private void initState() {
        sbLogout.setEnabled(false);
        // ..
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        sbLogin = new javax.swing.JMenuItem();
        sbLogout = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        smExit = new javax.swing.JMenuItem();
        smPegawai = new javax.swing.JMenu();
        smPasien = new javax.swing.JMenuItem();
        smDokter = new javax.swing.JMenuItem();
        smObat = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        smPetugas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        smPendaftaran = new javax.swing.JMenuItem();
        smPemeriksaan = new javax.swing.JMenuItem();
        smPembayaran = new javax.swing.JMenuItem();
        smResep = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        smLapDokter = new javax.swing.JMenuItem();
        smLapObat = new javax.swing.JMenuItem();
        smLapPetugas = new javax.swing.JMenuItem();
        smLapPendaftaran = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        smLapPemeriksaan = new javax.swing.JMenuItem();
        smLapPembayaran = new javax.swing.JMenuItem();
        smLapResep = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();

        jMenuItem17.setText("jMenuItem17");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem Informasi Rekam Medis (SIRM)");

        jMenu1.setText("File");

        sbLogin.setText("Login");
        jMenu1.add(sbLogin);

        sbLogout.setText("Logout");
        jMenu1.add(sbLogout);
        jMenu1.add(jSeparator1);

        smExit.setText("Exit");
        smExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smExitActionPerformed(evt);
            }
        });
        jMenu1.add(smExit);

        jMenuBar1.add(jMenu1);

        smPegawai.setText("Master");

        smPasien.setText("Pasien");
        smPegawai.add(smPasien);

        smDokter.setText("Dokter");
        smPegawai.add(smDokter);

        smObat.setText("Obat");
        smPegawai.add(smObat);

        jMenuItem1.setText("Pegawai");
        smPegawai.add(jMenuItem1);
        smPegawai.add(jSeparator2);

        smPetugas.setText("Pengguna");
        smPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smPetugasActionPerformed(evt);
            }
        });
        smPegawai.add(smPetugas);

        jMenuBar1.add(smPegawai);

        jMenu3.setText("Transaksi");

        smPendaftaran.setText("Pendaftaran");
        jMenu3.add(smPendaftaran);

        smPemeriksaan.setText("Pemeriksaan");
        jMenu3.add(smPemeriksaan);

        smPembayaran.setText("Pembayaran");
        jMenu3.add(smPembayaran);

        smResep.setText("Resep");
        jMenu3.add(smResep);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Laporan");

        smLapDokter.setText("Laporan Data Pasien");
        jMenu4.add(smLapDokter);

        smLapObat.setText("Laporan Data Dokter");
        jMenu4.add(smLapObat);

        smLapPetugas.setText("Laporan Data Obat");
        jMenu4.add(smLapPetugas);

        smLapPendaftaran.setText("Laporan Data Petugas");
        jMenu4.add(smLapPendaftaran);
        jMenu4.add(jSeparator3);

        smLapPemeriksaan.setText("Laporan Pendaftaran");
        jMenu4.add(smLapPemeriksaan);

        smLapPembayaran.setText("Laporan Pemeriksaan");
        jMenu4.add(smLapPembayaran);

        smLapResep.setText("Laporan Pembayaran");
        jMenu4.add(smLapResep);

        jMenuItem20.setText("Laporan Resep");
        jMenu4.add(jMenuItem20);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void smExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smExitActionPerformed
        int jawab = JOptionPane.showConfirmDialog(this, 
                "Anda yakin akan keluar dari aplikasi ?", 
                "Konfirmasi", 
                JOptionPane.YES_NO_OPTION);
        if (jawab == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_smExitActionPerformed

    private void smPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smPetugasActionPerformed
        if (frmPengguna == null) {
            frmPengguna = new FormPengguna(this, true);
        }
        frmPengguna.setVisible(true);
    }//GEN-LAST:event_smPetugasActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem sbLogin;
    private javax.swing.JMenuItem sbLogout;
    private javax.swing.JMenuItem smDokter;
    private javax.swing.JMenuItem smExit;
    private javax.swing.JMenuItem smLapDokter;
    private javax.swing.JMenuItem smLapObat;
    private javax.swing.JMenuItem smLapPembayaran;
    private javax.swing.JMenuItem smLapPemeriksaan;
    private javax.swing.JMenuItem smLapPendaftaran;
    private javax.swing.JMenuItem smLapPetugas;
    private javax.swing.JMenuItem smLapResep;
    private javax.swing.JMenuItem smObat;
    private javax.swing.JMenuItem smPasien;
    private javax.swing.JMenu smPegawai;
    private javax.swing.JMenuItem smPembayaran;
    private javax.swing.JMenuItem smPemeriksaan;
    private javax.swing.JMenuItem smPendaftaran;
    private javax.swing.JMenuItem smPetugas;
    private javax.swing.JMenuItem smResep;
    // End of variables declaration//GEN-END:variables

    
}
