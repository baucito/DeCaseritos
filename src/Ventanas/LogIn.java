package Ventanas;

import java.awt.Color;

public class LogIn extends javax.swing.JFrame {
    int xMouse,yMouse;
    
    public LogIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Baner = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        TxtUser = new javax.swing.JLabel();
        Pass = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        Log = new javax.swing.JPanel();
        In = new javax.swing.JLabel();
        ExtBut = new javax.swing.JPanel();
        ExitTxt = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Baner.setBackground(new java.awt.Color(255, 153, 0));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ManageMyProps");

        javax.swing.GroupLayout BanerLayout = new javax.swing.GroupLayout(Baner);
        Baner.setLayout(BanerLayout);
        BanerLayout.setHorizontalGroup(
            BanerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BanerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );
        BanerLayout.setVerticalGroup(
            BanerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BanerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(Baner, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 560, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo login.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 500));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("CONTRASEÑA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        User.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        User.setForeground(new java.awt.Color(204, 204, 204));
        User.setText("Ingrese su usuario");
        User.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UserMousePressed(evt);
            }
        });
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });
        jPanel1.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 420, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 330, 10));

        TxtUser.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        TxtUser.setText("USUARIO");
        jPanel1.add(TxtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        Pass.setForeground(new java.awt.Color(204, 204, 204));
        Pass.setText("********");
        Pass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PassMousePressed(evt);
            }
        });
        jPanel1.add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 330, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 214, 330, 10));

        Log.setBackground(new java.awt.Color(255, 153, 0));
        Log.setForeground(new java.awt.Color(255, 153, 0));

        In.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        In.setForeground(new java.awt.Color(255, 255, 255));
        In.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        In.setText("Log In");
        In.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        In.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InMouseExited(evt);
            }
        });

        javax.swing.GroupLayout LogLayout = new javax.swing.GroupLayout(Log);
        Log.setLayout(LogLayout);
        LogLayout.setHorizontalGroup(
            LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(In, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        LogLayout.setVerticalGroup(
            LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(In, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Log, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 160, 60));

        ExtBut.setBackground(new java.awt.Color(255, 255, 255));

        ExitTxt.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        ExitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitTxt.setText("X");
        ExitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ExtButLayout = new javax.swing.GroupLayout(ExtBut);
        ExtBut.setLayout(ExtButLayout);
        ExtButLayout.setHorizontalGroup(
            ExtButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        ExtButLayout.setVerticalGroup(
            ExtButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(ExtBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 30));

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserActionPerformed

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
      xMouse=evt.getX();
      yMouse=evt.getY();
      
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void ExitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseEntered
       ExtBut.setBackground(Color.red);  
       ExitTxt.setForeground(Color.white);
    }//GEN-LAST:event_ExitTxtMouseEntered

    private void ExitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseClicked
       System.exit(0);
    }//GEN-LAST:event_ExitTxtMouseClicked

    private void ExitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseExited
       ExtBut.setBackground(Color.white);  
       ExitTxt.setForeground(Color.black);
    }//GEN-LAST:event_ExitTxtMouseExited

    private void InMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InMouseEntered
       Log.setBackground(new Color(255,170,0));  
    }//GEN-LAST:event_InMouseEntered

    private void InMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InMouseExited
        Log.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_InMouseExited

    private void UserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMousePressed
        if(User.getText().equals("Ingrese su usuario"))
        {
            User.setText("");
            User.setForeground(Color.black);
        }
        if(String.valueOf(Pass.getPassword()).isEmpty())
        {
            Pass.setText("********");
            Pass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_UserMousePressed

    private void PassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassMousePressed
        if(String.valueOf(Pass.getPassword()).equals("********"))
        {
            Pass.setText("");
            Pass.setForeground(Color.black);
        }
        
        if(User.getText().isEmpty())
        {
            User.setText("Ingrese su usuario");
            User.setForeground(Color.gray);
           
        }
        
    }//GEN-LAST:event_PassMousePressed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Baner;
    private javax.swing.JLabel ExitTxt;
    private javax.swing.JPanel ExtBut;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel In;
    private javax.swing.JPanel Log;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JLabel TxtUser;
    private javax.swing.JTextField User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
