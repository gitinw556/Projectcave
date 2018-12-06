package project;
import javax.swing.JOptionPane;

public class newproject extends javax.swing.JFrame {
    int T=0;
    int N=0;
    int p1=0;
    int p2=0;
    int p3=0;
    int Y=0;
    int Y1=0;
    int Y2=0;
    int Y3=0;
    int Y4=0;
    int Y5=0;
    int Y6=0;
    int Y7=0;
    int K=0;
    int K1=0;
    int K2=0;
    int K3=0;
    int K4=0;
    int K5=0;
    int K6=0;
    int W=0;
    int W1=0;
    int W2=0;
    int W3=0;
    int W4=0;
    int W5=0;
    int W6=0;
    int S=0;
    int S1=0;
    int S2=0;
    int S3=0;
    int S4=0;
    int S5=0; 
    String Total=""; 
    public newproject() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        n = new javax.swing.JPanel();
        n1 = new javax.swing.JRadioButton();
        n2 = new javax.swing.JRadioButton();
        n3 = new javax.swing.JRadioButton();
        y = new javax.swing.JPanel();
        y1 = new javax.swing.JCheckBox();
        y2 = new javax.swing.JCheckBox();
        y3 = new javax.swing.JCheckBox();
        y4 = new javax.swing.JCheckBox();
        y5 = new javax.swing.JCheckBox();
        y6 = new javax.swing.JCheckBox();
        y7 = new javax.swing.JCheckBox();
        k = new javax.swing.JPanel();
        k1 = new javax.swing.JCheckBox();
        k2 = new javax.swing.JCheckBox();
        k3 = new javax.swing.JCheckBox();
        k4 = new javax.swing.JCheckBox();
        k5 = new javax.swing.JCheckBox();
        k6 = new javax.swing.JCheckBox();
        w = new javax.swing.JPanel();
        w1 = new javax.swing.JCheckBox();
        w2 = new javax.swing.JCheckBox();
        w3 = new javax.swing.JCheckBox();
        w4 = new javax.swing.JCheckBox();
        w5 = new javax.swing.JCheckBox();
        w6 = new javax.swing.JCheckBox();
        s = new javax.swing.JPanel();
        s1 = new javax.swing.JCheckBox();
        s2 = new javax.swing.JCheckBox();
        s3 = new javax.swing.JCheckBox();
        s4 = new javax.swing.JCheckBox();
        s5 = new javax.swing.JCheckBox();
        t1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        t2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("เมนูเครป");
        setBackground(new java.awt.Color(0, 102, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 153, 0), new java.awt.Color(0, 204, 51), new java.awt.Color(0, 255, 204), new java.awt.Color(102, 204, 0)), "เลือกแป้ง", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 0, 18))); // NOI18N
        n.setForeground(new java.awt.Color(255, 255, 255));

        n1.setText("แป้ง ธรรมดา 10 บาท");
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        n2.setText("แป้ง ซาโคล์ 15 บาท");
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });

        n3.setText("แป้ง เรนโบว์ 15 บาท");
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nLayout = new javax.swing.GroupLayout(n);
        n.setLayout(nLayout);
        nLayout.setHorizontalGroup(
            nLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(nLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n1)
                    .addComponent(n2)
                    .addComponent(n3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nLayout.setVerticalGroup(
            nLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(n1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(n2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(n3)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        y.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 1, true), new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 1, true)), "แยม 5 บาท", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 0, 18))); // NOI18N
        y.setOpaque(false);

        y1.setText("วนิลา");
        y1.setOpaque(false);
        y1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y1ActionPerformed(evt);
            }
        });

        y2.setText("นูเทลล่า");
        y2.setOpaque(false);
        y2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y2ActionPerformed(evt);
            }
        });

        y3.setText("ใบเตย");
        y3.setOpaque(false);
        y3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y3ActionPerformed(evt);
            }
        });

        y4.setText("สตอเบอรี่");
        y4.setOpaque(false);
        y4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y4ActionPerformed(evt);
            }
        });

        y5.setText("บลูเบอรี่");
        y5.setOpaque(false);
        y5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y5ActionPerformed(evt);
            }
        });

        y6.setText("พริกเผา");
        y6.setOpaque(false);
        y6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y6ActionPerformed(evt);
            }
        });

        y7.setText("พิซซ่า");
        y7.setOpaque(false);
        y7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout yLayout = new javax.swing.GroupLayout(y);
        y.setLayout(yLayout);
        yLayout.setHorizontalGroup(
            yLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(yLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(y1)
                    .addComponent(y2)
                    .addComponent(y3)
                    .addComponent(y4)
                    .addComponent(y5)
                    .addComponent(y6)
                    .addComponent(y7))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        yLayout.setVerticalGroup(
            yLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yLayout.createSequentialGroup()
                .addComponent(y1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(y2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(y3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(y4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(y5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(y6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(y7)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        getContentPane().add(y, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 123, -1, -1));

        k.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0))), "ไส้คาว 10 บาท", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 0, 18))); // NOI18N
        k.setOpaque(false);

        k1.setText("หมูหยอง");
        k1.setOpaque(false);
        k1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k1ActionPerformed(evt);
            }
        });

        k2.setText("ปูอัด");
        k2.setOpaque(false);
        k2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k2ActionPerformed(evt);
            }
        });

        k3.setText("ใส้กรอก");
        k3.setOpaque(false);
        k3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k3ActionPerformed(evt);
            }
        });

        k4.setText("แฮม");
        k4.setOpaque(false);
        k4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k4ActionPerformed(evt);
            }
        });

        k5.setText("ทูน่า");
        k5.setOpaque(false);
        k5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k5ActionPerformed(evt);
            }
        });

        k6.setText("ทาโร่");
        k6.setOpaque(false);
        k6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kLayout = new javax.swing.GroupLayout(k);
        k.setLayout(kLayout);
        kLayout.setHorizontalGroup(
            kLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(kLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(k1)
                    .addComponent(k2)
                    .addComponent(k3)
                    .addComponent(k4)
                    .addComponent(k5)
                    .addComponent(k6))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        kLayout.setVerticalGroup(
            kLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kLayout.createSequentialGroup()
                .addComponent(k1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k6)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        getContentPane().add(k, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 123, -1, -1));

        w.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true)), "ไส้หวาน 5 บาท", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 0, 18))); // NOI18N
        w.setOpaque(false);

        w1.setText("ฝอยหอง");
        w1.setOpaque(false);
        w1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w1ActionPerformed(evt);
            }
        });

        w2.setText("ช็อคโกแลตชิพ");
        w2.setOpaque(false);
        w2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w2ActionPerformed(evt);
            }
        });

        w3.setText("ลูกเกด");
        w3.setOpaque(false);
        w3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w3ActionPerformed(evt);
            }
        });

        w4.setText("เม็ดเยลลี่");
        w4.setOpaque(false);
        w4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w4ActionPerformed(evt);
            }
        });

        w5.setText("คอนเฟล็ก");
        w5.setOpaque(false);
        w5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w5ActionPerformed(evt);
            }
        });

        w6.setText("กล้วยสด");
        w6.setOpaque(false);
        w6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                w6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout wLayout = new javax.swing.GroupLayout(w);
        w.setLayout(wLayout);
        wLayout.setHorizontalGroup(
            wLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(wLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(w1)
                    .addComponent(w2)
                    .addComponent(w3)
                    .addComponent(w4)
                    .addComponent(w5)
                    .addComponent(w6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        wLayout.setVerticalGroup(
            wLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wLayout.createSequentialGroup()
                .addComponent(w1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(w2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(w3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(w4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(w5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(w6)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        getContentPane().add(w, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 123, -1, -1));

        s.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 0), 1, true), new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 1, true)), "ซอส", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Leelawadee UI Semilight", 0, 18))); // NOI18N
        s.setOpaque(false);

        s1.setForeground(new java.awt.Color(0, 0, 51));
        s1.setText("มะเขือเทศ");
        s1.setOpaque(false);
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });

        s2.setForeground(new java.awt.Color(0, 0, 51));
        s2.setText("พริก");
        s2.setOpaque(false);
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });

        s3.setForeground(new java.awt.Color(0, 0, 51));
        s3.setText("นมข้น");
        s3.setOpaque(false);
        s3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3ActionPerformed(evt);
            }
        });

        s4.setForeground(new java.awt.Color(0, 0, 51));
        s4.setText("ช็อคโกแลต");
        s4.setOpaque(false);
        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });

        s5.setForeground(new java.awt.Color(0, 0, 51));
        s5.setText("มายองเนส");
        s5.setOpaque(false);
        s5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sLayout = new javax.swing.GroupLayout(s);
        s.setLayout(sLayout);
        sLayout.setHorizontalGroup(
            sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s1)
                    .addComponent(s2)
                    .addComponent(s3)
                    .addComponent(s4)
                    .addComponent(s5))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        sLayout.setVerticalGroup(
            sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sLayout.createSequentialGroup()
                .addComponent(s1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s5)
                .addGap(0, 56, Short.MAX_VALUE))
        );

        getContentPane().add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 123, -1, -1));

        t1.setEnabled(false);
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 338, 72, 25));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ราคารวม");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 338, -1, 25));

        b1.setForeground(new java.awt.Color(0, 0, 102));
        b1.setText("OK");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 338, 60, -1));

        b2.setForeground(new java.awt.Color(255, 0, 0));
        b2.setText("Clear");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 338, -1, -1));

        b3.setForeground(new java.awt.Color(255, 0, 0));
        b3.setText("Exit");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 338, -1, -1));

        t2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 255, 0)));
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 44, 109, 31));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ชื่อผู้สั่ง");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 24, 80, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("เครปสไตล์เรา");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 200, 100));

        jLabel4.setBackground(getBackground());
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\crepe-3618674__340.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 410, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        
    }//GEN-LAST:event_t1ActionPerformed

    private void y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y1ActionPerformed
        Y1=1;
        if (Y1==1){
            Y=((Y1+Y2+Y3+Y4+Y5+Y6+Y7)*5);
            T=Y+N+K;
            Total+="วนิลา+";
           t1.setText(""+T);
            
        }
    }//GEN-LAST:event_y1ActionPerformed

    private void y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y2ActionPerformed
        Y2=1;
        if (Y2==1){
            Y=((Y1+Y2+Y3+Y4+Y5+Y6+Y7)*5);
            T=Y+N+K;
            Total+="นูเท่ลล่า+";
           t1.setText(""+T);
            
        }
    }//GEN-LAST:event_y2ActionPerformed

    private void y3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y3ActionPerformed
         Y3=1;
        if (Y3==1){
            Y=((Y1+Y2+Y3+Y4+Y5+Y6+Y7)*5);
            T=Y+N+K;
            Total+="ใบเตย+";
           t1.setText(""+T);
            
        }
    }//GEN-LAST:event_y3ActionPerformed

    private void y5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y5ActionPerformed
        Y5=1;
        if (Y5==1){
            Y=((Y1+Y2+Y3+Y4+Y5+Y6+Y7)*5);
            T=Y+N+K;
            Total+="บลูเบอรี่+";
           t1.setText(""+T);
            
        }
    }//GEN-LAST:event_y5ActionPerformed

    private void y6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y6ActionPerformed
        Y6=1;
        if (Y6==1){
            Y=((Y1+Y2+Y3+Y4+Y5+Y6+Y7)*5);
            T=Y+N+K;
            Total+="พริกเผา+";
           t1.setText(""+T);
            
        }
    }//GEN-LAST:event_y6ActionPerformed

    private void y4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y4ActionPerformed
        Y4=1;
        if (Y4==1){
            Y=((Y1+Y2+Y3+Y4+Y5+Y6+Y7)*5);
            T=Y+N+K;
            Total+="สตอเบอรี่+";
           t1.setText(""+T);
            
        }
    }//GEN-LAST:event_y4ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        
    }//GEN-LAST:event_t2ActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
    p1=1;
        if (p1 == 1){
            N=10;
            Total="แป้งธรรมดา+";
        t1.setText(""+N);
        }
        if( n1.isSelected());
            n2.setSelected(false);
            n3.setSelected(false);
    }//GEN-LAST:event_n1ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
    p2=1;
        if (p2==1){
            N=15;
            Total="แป้งซาโคล์+";
        t1.setText(""+N);
        }
        
        if(n2.isSelected());
            n1.setSelected(false);
            n3.setSelected(false);
    }//GEN-LAST:event_n2ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
    p3=1;
        if (p3==1){
            N=15;
            Total="แป้งเรนโบว์+";
        t1.setText(""+N);
        }    
        
        if(n3.isSelected());
            n2.setSelected(false);
            n1.setSelected(false);
    }//GEN-LAST:event_n3ActionPerformed

    private void y7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y7ActionPerformed
        Y7=1;
        if (Y7==1){
            Y=((Y1+Y2+Y3+Y4+Y5+Y6+Y7)*5);
            T=Y+N+K;
            Total+="พิซซ่า";
           t1.setText(""+T); 
        }
    }//GEN-LAST:event_y7ActionPerformed

    private void k1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k1ActionPerformed
         K1=1;
        if (K1==1){
            K=((K1+K2+K3+K4+K5+K6)*10);
            T=Y+N+K;
            Total+="หมูหยอง+";
           t1.setText(""+T);
            
        }
    }//GEN-LAST:event_k1ActionPerformed

    private void k2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k2ActionPerformed
          K2=1;
        if (K2==1){
            K=((K1+K2+K3+K4+K5+K6)*10);
            T=Y+N+K;
            Total+="ปูอัด+";
           t1.setText(""+T);
            
        }
    }//GEN-LAST:event_k2ActionPerformed

    private void k3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k3ActionPerformed
          K3=1;
        if (K3==1){
            K=((K1+K2+K3+K4+K5+K6)*10);
            T=Y+N+K;
            Total+="ใส้กรอก+";
           t1.setText(""+T);
            
        }
    }//GEN-LAST:event_k3ActionPerformed

    private void k4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k4ActionPerformed
          K4=1;
        if (K4==1){
            K=((K1+K2+K3+K4+K5+K6)*10);
            T=Y+N+K;
            Total+="แฮม+";
           t1.setText(""+T);
            
        }
    }//GEN-LAST:event_k4ActionPerformed

    private void k5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k5ActionPerformed
       K5=1;
        if (K5==1){
            K=((K1+K2+K3+K4+K5+K6)*10);
            T=Y+N+K;
            Total+="ทูน่า+";
           t1.setText(""+T);
            
        }
    }//GEN-LAST:event_k5ActionPerformed

    private void k6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k6ActionPerformed
      K6=1;
        if (K6==1){
            K=((K1+K2+K3+K4+K5+K6)*10);
            T=Y+N+K;
            Total+="ท่าโร่+";
           t1.setText(""+T);
            
        }
    }//GEN-LAST:event_k6ActionPerformed

    private void w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_w1ActionPerformed
        W1=1;
        if (W1==1){
            W=((W1+W2+W3+W4+W5+W6)*5);
            T=W+Y+N+K;
            Total+="ฝอยทอง+";
           t1.setText(""+T);
            
        }
    }//GEN-LAST:event_w1ActionPerformed

    private void w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_w2ActionPerformed
    W2=1;
        if (W2==1){
            W=((W1+W2+W3+W4+W5+W6)*5);
            T=W+N+K;
            Total+="ช็อคโกแลตชิพ+";
           t1.setText(""+T);
            
        }
    }//GEN-LAST:event_w2ActionPerformed

    private void w3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_w3ActionPerformed
    W3=1;
        if (W3==1){
            W=((W1+W2+W3+W4+W5+W6)*5);
            T=W+Y+N+K;
            Total+="ลูกเกด+";
           t1.setText(""+T);
            
        }    // TODO add your handling code here:
    }//GEN-LAST:event_w3ActionPerformed

    private void w4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_w4ActionPerformed
    W4=1;
        if (W4==1){
            W=((W1+W2+W3+W4+W5+W6)*5);
            T=W+Y+N+K;
            Total+="เม็ดเยลลี่+";
           t1.setText(""+T);
            
        }    // TODO add your handling code here:
    }//GEN-LAST:event_w4ActionPerformed

    private void w5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_w5ActionPerformed
    W5=1;
        if (W5==1){
            W=((W1+W2+W3+W4+W5+W6)*5);
            T=W+Y+N+K;
            Total+="คอนเฟล็ก+";
           t1.setText(""+T);
            
        }    // TODO add your handling code here:
    }//GEN-LAST:event_w5ActionPerformed

    private void w6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_w6ActionPerformed
    W6=1;
        if (W6==1){
            W=((W1+W2+W3+W4+W5+W6)*5);
            T=W+Y+N+K;
            Total+="กล้วยสด+";
           t1.setText(""+T);
            
        }    // TODO add your handling code here:
    }//GEN-LAST:event_w6ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        this.T=0;
        this.N=0;
        this.W=0;
        this.Y=0;
        this.K=0;
        W1=0;
        W2=0;
        W3=0;
        W4=0;
        W5=0;
        W6=0;
        Y1=0;
        Y2=0;
        Y3=0;
        Y4=0;
        Y5=0;
        Y6=0;
        Y7=0;
        p1=0;
        p2=0;
        p3=0;
        Total=("");
        
        t2.setText(null);
        t1.setText(null);
        n1.setSelected ( false );
        n2.setSelected ( false );
        n3.setSelected ( false );
        y1.setSelected ( false );
        y2.setSelected ( false );
        y3.setSelected ( false );
        y4.setSelected ( false );
        y5.setSelected ( false );
        y6.setSelected ( false );
        y7.setSelected ( false );
        s1.setSelected ( false );
        s2.setSelected ( false );
        s3.setSelected ( false );
        s4.setSelected ( false );
        s5.setSelected ( false );
        w1.setSelected ( false );
        w2.setSelected ( false );
        w3.setSelected ( false );
        w4.setSelected ( false );
        w5.setSelected ( false );
        w6.setSelected ( false );
        k1.setSelected ( false );
        k2.setSelected ( false );
        k3.setSelected ( false );
        k4.setSelected ( false );
        k5.setSelected ( false );
        k6.setSelected ( false );
        
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_b3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        JOptionPane.showMessageDialog(this,"ขอบคุณที่ใช้บริการ");
        System.out.println("ชื่อผู้สั่ง: "+t2.getText());
        System.out.println("รายการที่สั่ง"+Total+"ทั้งหมด"+T+"บาท");;
        System.exit(0);
    }//GEN-LAST:event_b1ActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        Total+="มะเขือเทศ+";
    }//GEN-LAST:event_s1ActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        Total+="พริก+";        // TODO add your handling code here:
    }//GEN-LAST:event_s2ActionPerformed

    private void s3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3ActionPerformed
         Total+="นมข้น+";    // TODO add your handling code here:
    }//GEN-LAST:event_s3ActionPerformed

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
        Total+="ช็อคโกแลต+";    // TODO add your handling code here:
    }//GEN-LAST:event_s4ActionPerformed

    private void s5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s5ActionPerformed
        Total+="มายองเนส+";// TODO add your handling code here:
    }//GEN-LAST:event_s5ActionPerformed

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
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new newproject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel k;
    private javax.swing.JCheckBox k1;
    private javax.swing.JCheckBox k2;
    private javax.swing.JCheckBox k3;
    private javax.swing.JCheckBox k4;
    private javax.swing.JCheckBox k5;
    private javax.swing.JCheckBox k6;
    private javax.swing.JPanel n;
    private javax.swing.JRadioButton n1;
    private javax.swing.JRadioButton n2;
    private javax.swing.JRadioButton n3;
    private javax.swing.JPanel s;
    private javax.swing.JCheckBox s1;
    private javax.swing.JCheckBox s2;
    private javax.swing.JCheckBox s3;
    private javax.swing.JCheckBox s4;
    private javax.swing.JCheckBox s5;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JPanel w;
    private javax.swing.JCheckBox w1;
    private javax.swing.JCheckBox w2;
    private javax.swing.JCheckBox w3;
    private javax.swing.JCheckBox w4;
    private javax.swing.JCheckBox w5;
    private javax.swing.JCheckBox w6;
    private javax.swing.JPanel y;
    private javax.swing.JCheckBox y1;
    private javax.swing.JCheckBox y2;
    private javax.swing.JCheckBox y3;
    private javax.swing.JCheckBox y4;
    private javax.swing.JCheckBox y5;
    private javax.swing.JCheckBox y6;
    private javax.swing.JCheckBox y7;
    // End of variables declaration//GEN-END:variables
}
