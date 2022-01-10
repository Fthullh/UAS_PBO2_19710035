package Frame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Model.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Model.Santri;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Fthullh_
 */
public class TampilNilaiSantriFrame extends javax.swing.JFrame {
    
    Santri santri;
    /**
     * Creates new form TampilNilaiSantriFrame
     */
    public TampilNilaiSantriFrame() {
        initComponents();
        setLocationRelativeTo(null);
        resetTable("");
        TampilTabel();  
    }
    
    private DefaultTableModel DftTblModel;
    private String SQL; 

    public void TampilTabel() {
        DftTblModel = new DefaultTableModel();
        DftTblModel.addColumn("NIS");
        DftTblModel.addColumn("Nama Santri");
        DftTblModel.addColumn("Tauhid");
        DftTblModel.addColumn("Tasawuf");
        DftTblModel.addColumn("Figh");
        DftTblModel.addColumn("Hadits");
        DftTblModel.addColumn("Nahwu");
        DftTblModel.addColumn("Shorof");
        DftTblModel.addColumn("Lugot");
        DftTblModel.addColumn("Tafsir");
        DftTblModel.addColumn("Jumlah Nilai");
        DftTblModel.addColumn("Rata-rata");
        DftTblModel.addColumn("Huruf");
        DftTblModel.addColumn("Hasil");
        tabelSantri.setModel(DftTblModel);
        Connection conn = Koneksi.getConnection();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "SELECT * FROM nilaisantri";
            java.sql.ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                DftTblModel.addRow(new Object[]{
                    rs.getInt("nis"),
                    rs.getString("nama_santri"),
                    rs.getInt("tauhid"),
                    rs.getInt("tasawuf"),
                    rs.getInt("fiqh"),
                    rs.getInt("hadits"),
                    rs.getInt("nahwu"),
                    rs.getInt("shorof"),
                    rs.getInt("lugot"),
                    rs.getInt("tafsir"),
                    rs.getInt("jumlah_nilai"), 
                    rs.getInt("rata_rata"),
                    rs.getString("huruf"),
                    rs.getString("hasil")
                });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }    
    
     public ArrayList<Santri> getSantriList(String keyword){
        ArrayList<Santri> santriList = new ArrayList<Santri>();

        Connection connection = Koneksi.getConnection();
        String query = "SELECT * FROM nilaisantri "+keyword;
        Statement st;
        ResultSet rs;
        
        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                santri = new Santri(
                    rs.getInt("nis"),  
                    rs.getString("nama_santri"),
                    rs.getInt("tauhid"),
                    rs.getInt("tasawuf"),
                    rs.getInt("fiqh"),
                    rs.getInt("hadits"),
                    rs.getInt("nahwu"),
                    rs.getInt("shorof"),
                    rs.getInt("lugot"),
                    rs.getInt("tafsir"),
                    rs.getInt("jumlah_nilai"), 
                    rs.getInt("rata_rata"),
                    rs.getString("huruf"),
                    rs.getString("hasil"));
                    
                santriList.add(santri);
            }
        } catch (SQLException | NullPointerException ex) {
            System.err.println("Koneksi Null Gagal");
        }
        return santriList;
    }
    
    public void selectSantri(String keyword){
        ArrayList<Santri> list = getSantriList(keyword);
        DefaultTableModel model = (DefaultTableModel)tabelSantri.getModel();
        Object[] row = new Object[14];
        
        for (int i = 0; i < list.size(); i++){
            row[0] = list.get(i).getNis();
            row[1] = list.get(i).getNama_santri();
            row[2] = list.get(i).getTauhid();
            row[3] = list.get(i).getTasawuf();
            row[4] = list.get(i).getFiqh();
            row[5] = list.get(i).getHadits();
            row[6] = list.get(i).getNahwu();
            row[7] = list.get(i).getShorof();
            row[8] = list.get(i).getLugot();
            row[9] = list.get(i).getTafsir();
            row[10] = list.get(i).getJumlah_nilai();
            row[11] = list.get(i).getRata_rata();
            row[12] = list.get(i).getHuruf();
            row[13] = list.get(i).getHasil();
            
            model.addRow(row);
        }
    }
    
    public final void resetTable(String keyword){
        DefaultTableModel model = (DefaultTableModel)tabelSantri.getModel();
        model.setRowCount(0);
        selectSantri(keyword);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bTambah = new javax.swing.JButton();
        bUbah = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bKeluar = new javax.swing.JButton();
        bCari = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelSantri = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Menghitung Data Nilai Santri");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        bTambah.setText("Tambah + Hitung");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        bUbah.setText("Ubah");
        bUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUbahActionPerformed(evt);
            }
        });

        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bKeluar.setText("Keluar");
        bKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKeluarActionPerformed(evt);
            }
        });

        bCari.setText("Cari");
        bCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCariActionPerformed(evt);
            }
        });

        jLabel1.setText("Cari Data Santri :");

        tabelSantri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelSantri);

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel2.setText("Aplikasi Menghitung Data Nilai Santri");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("FATHULLOH_19710035");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1045, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCari, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(169, 169, 169)
                        .addComponent(jLabel3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bTambah)
                        .addGap(18, 18, 18)
                        .addComponent(bUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCari)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTambah)
                    .addComponent(bUbah)
                    .addComponent(bHapus)
                    .addComponent(bKeluar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        // TODO add your handling code here:
        TambahNilaiSantriFrame tambahnilaisantri = new TambahNilaiSantriFrame();
        tambahnilaisantri.setVisible(true);
    }//GEN-LAST:event_bTambahActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        resetTable("");
    }//GEN-LAST:event_formWindowActivated

    private void bUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUbahActionPerformed
        // TODO add your handling code here:
        int i = tabelSantri.getSelectedRow();
        if(i>=0){
            TableModel model = tabelSantri.getModel();
            santri = new Santri();
            santri.setNis(Integer.parseInt(model.getValueAt(i, 0).toString()));
            santri.setNama_santri(model.getValueAt(i, 1).toString());
            santri.setTauhid(Integer.parseInt(model.getValueAt(i, 2).toString()));
            santri.setTasawuf(Integer.parseInt(model.getValueAt(i, 3).toString()));
            santri.setFiqh(Integer.parseInt(model.getValueAt(i, 4).toString()));
            santri.setHadits(Integer.parseInt(model.getValueAt(i, 5).toString()));
            santri.setNahwu(Integer.parseInt(model.getValueAt(i, 6).toString()));
            santri.setShorof(Integer.parseInt(model.getValueAt(i, 7).toString()));
            santri.setLugot(Integer.parseInt(model.getValueAt(i, 8).toString()));
            santri.setTafsir(Integer.parseInt(model.getValueAt(i, 9).toString()));
            santri.setJumlah_nilai(Integer.parseInt(model.getValueAt(i, 10).toString()));
            santri.setRata_rata(Integer.parseInt(model.getValueAt(i, 11).toString()));
            santri.setHuruf(model.getValueAt(i, 12).toString());
            santri.setHasil(model.getValueAt(i, 13).toString());
            
            TambahNilaiSantriFrame tambahnilaisantri = new TambahNilaiSantriFrame(santri);
            tambahnilaisantri.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Pilih data yang ingin diubah");
        }
    }//GEN-LAST:event_bUbahActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        // TODO add your handling code here:
        int i = tabelSantri.getSelectedRow();
            int pilihan = JOptionPane.showConfirmDialog(null,
                    "Yakin mau hapus ?",
                    "Konfirmasi hapus",
                    JOptionPane.YES_NO_OPTION);
            if(pilihan==0){
                if(i>=0){
                    try {
                        TableModel model = tabelSantri.getModel();
                        Connection con = Koneksi.getConnection();
                        String executeQuery = "delete from nilaisantri where nis=?";
                        PreparedStatement ps = con.prepareStatement(executeQuery);
                        ps.setString(1, model.getValueAt(i, 0).toString());
                        ps.executeUpdate();
                    }catch (SQLException ex){
                        System.err.println(ex);
                    }
                }else {
                    JOptionPane.showMessageDialog(null, "Pilih data yang ingin dihapus");
                }
            } resetTable("");
    }//GEN-LAST:event_bHapusActionPerformed

    private void bKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bKeluarActionPerformed

    private void bCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCariActionPerformed
        // TODO add your handling code here:
        resetTable(" WHERE nis like '%"+jTextFieldCari.getText()+"%' OR"
                + " nama_santri like '%"+jTextFieldCari.getText()+"%'");
    }//GEN-LAST:event_bCariActionPerformed

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
            java.util.logging.Logger.getLogger(TampilNilaiSantriFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilNilaiSantriFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilNilaiSantriFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilNilaiSantriFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilNilaiSantriFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCari;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bKeluar;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCari;
    private javax.swing.JTable tabelSantri;
    // End of variables declaration//GEN-END:variables
}
