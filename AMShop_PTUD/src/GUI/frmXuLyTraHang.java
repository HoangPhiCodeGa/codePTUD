/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

/**
 *
 * @author NHAT TUNG
 */
public class frmXuLyTraHang extends javax.swing.JPanel {

    /**
     * Creates new form frmXuLyTraHang
     */
    public frmXuLyTraHang() {
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

        btnThem = new javax.swing.JButton();
        pnSanPham = new javax.swing.JPanel();
        lbMaHD = new java.awt.Label();
        lbNgayLapHD = new java.awt.Label();
        txtMaHD = new javax.swing.JTextField();
        btnLamMoi = new javax.swing.JButton();
        spHoaDon = new javax.swing.JScrollPane();
        tbHoaDon = new javax.swing.JTable();
        dcNgayLapPT = new com.toedter.calendar.JDateChooser();
        pnPhieuTra = new javax.swing.JPanel();
        lnPhieuTra = new java.awt.Label();
        lbMaPT = new javax.swing.JLabel();
        lbSDT = new javax.swing.JLabel();
        lbTenKH = new javax.swing.JLabel();
        lbNgayLapPT = new javax.swing.JLabel();
        spSPHD = new javax.swing.JScrollPane();
        tbSpHD = new javax.swing.JTable();
        lbTTM = new javax.swing.JLabel();
        lbGiamGia = new javax.swing.JLabel();
        txtTTM = new javax.swing.JLabel();
        lbTTT = new javax.swing.JLabel();
        lbTienTra = new javax.swing.JLabel();
        txtGiamGia = new javax.swing.JLabel();
        txtTienTra = new javax.swing.JLabel();
        txtTTT = new javax.swing.JLabel();
        txtMaPT = new javax.swing.JLabel();
        txtNgayLapPT = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JLabel();
        txtTenKH1 = new javax.swing.JLabel();
        lbDoiTra = new java.awt.Label();
        cbInPT = new javax.swing.JCheckBox();
        btnTraHang = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1400, 680));

        btnThem.setBackground(new java.awt.Color(153, 153, 255));
        btnThem.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText(">>");

        pnSanPham.setBorder(javax.swing.BorderFactory.createTitledBorder("Hóa đơn"));

        lbMaHD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbMaHD.setText("Mã hóa đơn");

        lbNgayLapHD.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbNgayLapHD.setText("Ngày lập");

        txtMaHD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnLamMoi.setBackground(new java.awt.Color(153, 153, 255));
        btnLamMoi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLamMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnLamMoi.setText("Làm Mới");
        btnLamMoi.setBorder(new javax.swing.border.MatteBorder(null));

        spHoaDon.setViewportView(null);

        tbHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Hóa Đơn", "Ngày lập", "Tổng tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbHoaDon.setRowHeight(35);
        tbHoaDon.getTableHeader().setReorderingAllowed(false);
        spHoaDon.setViewportView(tbHoaDon);

        dcNgayLapPT.setDateFormatString("dd/MM/y");

        javax.swing.GroupLayout pnSanPhamLayout = new javax.swing.GroupLayout(pnSanPham);
        pnSanPham.setLayout(pnSanPhamLayout);
        pnSanPhamLayout.setHorizontalGroup(
            pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSanPhamLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNgayLapHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(dcNgayLapPT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(76, 268, Short.MAX_VALUE))
            .addGroup(pnSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSanPhamLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnSanPhamLayout.setVerticalGroup(
            pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSanPhamLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbMaHD, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(txtMaHD))
                .addGap(14, 14, 14)
                .addGroup(pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dcNgayLapPT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNgayLapHD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnPhieuTra.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin phiếu trả"));

        lnPhieuTra.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        lnPhieuTra.setName(""); // NOI18N
        lnPhieuTra.setText("Phiếu trả hàng");

        lbMaPT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbMaPT.setText("Mã phiếu trả");

        lbSDT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbSDT.setText("Số điện thoại");
        lbSDT.setToolTipText("");

        lbTenKH.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbTenKH.setText("Tên khách hàng");

        lbNgayLapPT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbNgayLapPT.setText("Ngày lập");

        tbSpHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Sản phẩm", "Màu sắc", "Size", "Đơn giá", "Số lượng", "Thành tiền", "Giảm giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbSpHD.setRowHeight(30);
        tbSpHD.getTableHeader().setReorderingAllowed(false);
        spSPHD.setViewportView(tbSpHD);
        if (tbSpHD.getColumnModel().getColumnCount() > 0) {
            tbSpHD.getColumnModel().getColumn(1).setMaxWidth(80);
            tbSpHD.getColumnModel().getColumn(2).setMaxWidth(50);
            tbSpHD.getColumnModel().getColumn(3).setMaxWidth(90);
            tbSpHD.getColumnModel().getColumn(4).setMaxWidth(80);
            tbSpHD.getColumnModel().getColumn(5).setMaxWidth(90);
            tbSpHD.getColumnModel().getColumn(6).setMaxWidth(90);
        }

        lbTTM.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbTTM.setText("Tổng tiền mua");

        lbGiamGia.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbGiamGia.setText("Giảm giá");

        txtTTM.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtTTM.setForeground(new java.awt.Color(255, 0, 0));
        txtTTM.setText("0.000 VNĐ");
        txtTTM.setToolTipText("");

        lbTTT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbTTT.setText("Tổng tiền hàng trả");
        lbTTT.setToolTipText("");

        lbTienTra.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbTienTra.setText("Tiền trả khách");

        txtGiamGia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtGiamGia.setForeground(new java.awt.Color(102, 102, 102));
        txtGiamGia.setText("0.000 VNĐ");
        txtGiamGia.setToolTipText("");

        txtTienTra.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtTienTra.setForeground(new java.awt.Color(255, 0, 0));
        txtTienTra.setText("0.000 VNĐ");
        txtTienTra.setToolTipText("");

        txtTTT.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtTTT.setForeground(new java.awt.Color(255, 0, 0));
        txtTTT.setText("0.000 VNĐ");
        txtTTT.setToolTipText("");

        txtMaPT.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtMaPT.setForeground(new java.awt.Color(255, 0, 0));
        txtMaPT.setText("PT001");
        txtMaPT.setToolTipText("");

        txtNgayLapPT.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtNgayLapPT.setForeground(new java.awt.Color(255, 0, 0));
        txtNgayLapPT.setText("1/1/2023");
        txtNgayLapPT.setToolTipText("");

        txtTenKH.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTenKH.setText("Tên khách hàng");

        txtTenKH1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTenKH1.setText("Số điện thoại");

        javax.swing.GroupLayout pnPhieuTraLayout = new javax.swing.GroupLayout(pnPhieuTra);
        pnPhieuTra.setLayout(pnPhieuTraLayout);
        pnPhieuTraLayout.setHorizontalGroup(
            pnPhieuTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPhieuTraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPhieuTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spSPHD)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPhieuTraLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lnPhieuTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPhieuTraLayout.createSequentialGroup()
                        .addGroup(pnPhieuTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMaPT)
                            .addComponent(lbNgayLapPT))
                        .addGap(18, 18, 18)
                        .addGroup(pnPhieuTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaPT)
                            .addComponent(txtNgayLapPT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                        .addGroup(pnPhieuTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTenKH)
                            .addComponent(lbSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(pnPhieuTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenKH1)
                            .addComponent(txtTenKH))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnPhieuTraLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(pnPhieuTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTTM)
                            .addComponent(lbGiamGia))
                        .addGap(28, 28, 28)
                        .addGroup(pnPhieuTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGiamGia)
                            .addComponent(txtTTM))
                        .addGap(50, 50, 50)
                        .addGroup(pnPhieuTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTTT)
                            .addComponent(lbTienTra, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(pnPhieuTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTTT)
                            .addComponent(txtTienTra))
                        .addGap(0, 55, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnPhieuTraLayout.setVerticalGroup(
            pnPhieuTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPhieuTraLayout.createSequentialGroup()
                .addComponent(lnPhieuTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(pnPhieuTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnPhieuTraLayout.createSequentialGroup()
                        .addGroup(pnPhieuTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMaPT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaPT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnPhieuTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNgayLapPT)
                            .addComponent(txtNgayLapPT)))
                    .addGroup(pnPhieuTraLayout.createSequentialGroup()
                        .addGroup(pnPhieuTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenKH1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(pnPhieuTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTenKH)
                            .addComponent(txtTenKH))))
                .addGap(52, 52, 52)
                .addComponent(spSPHD, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addGroup(pnPhieuTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTTT)
                    .addComponent(lbTTT)
                    .addComponent(txtTTM)
                    .addComponent(lbTTM))
                .addGap(33, 33, 33)
                .addGroup(pnPhieuTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGiamGia)
                    .addComponent(txtGiamGia)
                    .addComponent(lbTienTra)
                    .addComponent(txtTienTra))
                .addGap(20, 20, 20))
        );

        lbDoiTra.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbDoiTra.setMinimumSize(new java.awt.Dimension(60, 60));
        lbDoiTra.setText("ĐỔI TRẢ HÓA ĐƠN");

        cbInPT.setSelected(true);
        cbInPT.setText("In phiếu trả");
        cbInPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbInPTActionPerformed(evt);
            }
        });

        btnTraHang.setBackground(new java.awt.Color(153, 153, 255));
        btnTraHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTraHang.setForeground(new java.awt.Color(255, 255, 255));
        btnTraHang.setText("Trả Hàng");
        btnTraHang.setBorder(new javax.swing.border.MatteBorder(null));
        btnTraHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbInPT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTraHang, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnPhieuTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbDoiTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbDoiTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(296, 296, 296)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnPhieuTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTraHang, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbInPT, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbInPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbInPTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbInPTActionPerformed

    private void btnTraHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTraHangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTraHang;
    private javax.swing.JCheckBox cbInPT;
    private com.toedter.calendar.JDateChooser dcNgayLapPT;
    private java.awt.Label lbDoiTra;
    private javax.swing.JLabel lbGiamGia;
    private java.awt.Label lbMaHD;
    private javax.swing.JLabel lbMaPT;
    private java.awt.Label lbNgayLapHD;
    private javax.swing.JLabel lbNgayLapPT;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JLabel lbTTM;
    private javax.swing.JLabel lbTTT;
    private javax.swing.JLabel lbTenKH;
    private javax.swing.JLabel lbTienTra;
    private java.awt.Label lnPhieuTra;
    private javax.swing.JPanel pnPhieuTra;
    private javax.swing.JPanel pnSanPham;
    private javax.swing.JScrollPane spHoaDon;
    private javax.swing.JScrollPane spSPHD;
    private javax.swing.JTable tbHoaDon;
    private javax.swing.JTable tbSpHD;
    private javax.swing.JLabel txtGiamGia;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JLabel txtMaPT;
    private javax.swing.JLabel txtNgayLapPT;
    private javax.swing.JLabel txtTTM;
    private javax.swing.JLabel txtTTT;
    private javax.swing.JLabel txtTenKH;
    private javax.swing.JLabel txtTenKH1;
    private javax.swing.JLabel txtTienTra;
    // End of variables declaration//GEN-END:variables
}
