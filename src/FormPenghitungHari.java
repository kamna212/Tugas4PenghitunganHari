import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import javax.swing.*;
import com.toedter.calendar.JCalendar;

public class FormPenghitungHari extends javax.swing.JFrame {

    public FormPenghitungHari() {
        initComponents();
        initCustom();
    }

    // Inisialisasi tambahan
    private void initCustom() {
        // Isi combobox bulan
        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni",
                          "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        cmbBulan.setModel(new DefaultComboBoxModel<>(bulan));

        // Tahun default
        spnTahun.setValue(LocalDate.now().getYear());
    }

    // Fungsi hitung jumlah hari dalam bulan dan tahun
    private void hitungJumlahHari() {
        int tahun = (int) spnTahun.getValue();
        int bulan = cmbBulan.getSelectedIndex() + 1;
        YearMonth ym = YearMonth.of(tahun, bulan);

        int jumlahHari = ym.lengthOfMonth();
        lblHasil.setText("Jumlah Hari: " + jumlahHari);

        LocalDate hariPertama = ym.atDay(1);
        LocalDate hariTerakhir = ym.atEndOfMonth();

        lblHariPertama.setText("Hari pertama: " + hariPertama.getDayOfWeek());
        lblHariTerakhir.setText("Hari terakhir: " + hariTerakhir.getDayOfWeek());
    }

    // Fungsi menghitung selisih antara dua tanggal
    private void hitungSelisihHari() {
        LocalDate tgl1 = calTanggal1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate tgl2 = calTanggal2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        long selisih = ChronoUnit.DAYS.between(tgl1, tgl2);
        txtSelisih.setText(selisih + " hari");
        
        spnTahun.addChangeListener(e -> hitungJumlahHari());
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelUtama = new javax.swing.JPanel();
        lblBulan = new javax.swing.JLabel();
        lblTahun = new javax.swing.JLabel();
        cmbBulan = new javax.swing.JComboBox<>();
        spnTahun = new javax.swing.JSpinner();
        btnHitung = new javax.swing.JButton();
        lblHasil = new javax.swing.JLabel();
        lblHariPertama = new javax.swing.JLabel();
        lblHariTerakhir = new javax.swing.JLabel();
        lblSelisih = new javax.swing.JLabel();
        txtSelisih = new javax.swing.JTextField();
        btnSelisih = new javax.swing.JButton();
        calTanggal1 = new com.toedter.calendar.JCalendar();
        calTanggal2 = new com.toedter.calendar.JCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(117, 138, 147));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Aplikasi Penghitung Hari");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        panelUtama.setBackground(new java.awt.Color(236, 213, 188));

        lblBulan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBulan.setText("Bulan :");

        lblTahun.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTahun.setText("Tahun :");

        btnHitung.setBackground(new java.awt.Color(233, 182, 59));
        btnHitung.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        lblHasil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHasil.setText("Jumlah Hari :");

        lblHariPertama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHariPertama.setText("Hari Pertama :");

        lblHariTerakhir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHariTerakhir.setText("Hari Terakhir :");

        lblSelisih.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSelisih.setText("Hasil selisih :");

        btnSelisih.setBackground(new java.awt.Color(198, 110, 82));
        btnSelisih.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSelisih.setText("Hitung Selisih");
        btnSelisih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelisihActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelUtamaLayout = new javax.swing.GroupLayout(panelUtama);
        panelUtama.setLayout(panelUtamaLayout);
        panelUtamaLayout.setHorizontalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calTanggal1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calTanggal2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUtamaLayout.createSequentialGroup()
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUtamaLayout.createSequentialGroup()
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHitung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelUtamaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelUtamaLayout.createSequentialGroup()
                                        .addComponent(lblBulan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbBulan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblTahun)
                                        .addGap(18, 18, 18)
                                        .addComponent(spnTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblHasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblHariPertama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblHariTerakhir)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUtamaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSelisih, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUtamaLayout.createSequentialGroup()
                                .addComponent(lblSelisih)
                                .addGap(12, 12, 12)
                                .addComponent(txtSelisih)))))
                .addContainerGap())
        );
        panelUtamaLayout.setVerticalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBulan)
                    .addComponent(lblTahun)
                    .addComponent(cmbBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnHitung)
                .addGap(18, 18, 18)
                .addComponent(lblHasil)
                .addGap(18, 18, 18)
                .addComponent(lblHariPertama)
                .addGap(18, 18, 18)
                .addComponent(lblHariTerakhir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calTanggal2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(calTanggal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelisih)
                    .addComponent(txtSelisih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelisih, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        // TODO add your handling code here:
        hitungJumlahHari();
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnSelisihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelisihActionPerformed
        // TODO add your handling code here:
        hitungSelisihHari();
    }//GEN-LAST:event_btnSelisihActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPenghitungHari().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnSelisih;
    private com.toedter.calendar.JCalendar calTanggal1;
    private com.toedter.calendar.JCalendar calTanggal2;
    private javax.swing.JComboBox<String> cmbBulan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBulan;
    private javax.swing.JLabel lblHariPertama;
    private javax.swing.JLabel lblHariTerakhir;
    private javax.swing.JLabel lblHasil;
    private javax.swing.JLabel lblSelisih;
    private javax.swing.JLabel lblTahun;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JSpinner spnTahun;
    private javax.swing.JTextField txtSelisih;
    // End of variables declaration//GEN-END:variables
}
