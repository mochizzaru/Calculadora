package projetos;


import java.util.Random;


public class GameHannibal extends javax.swing.JFrame {

    public GameHannibal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lblJogar = new javax.swing.JButton();
        lblComputador = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        rbPapel = new javax.swing.JRadioButton();
        rbTesoura = new javax.swing.JRadioButton();
        rbPedra = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Microsoft Himalaya", 3, 36)); // NOI18N
        jLabel1.setText("Jogue com o Hannibal † ");

        lblJogar.setBackground(new java.awt.Color(204, 204, 204));
        lblJogar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblJogar.setForeground(new java.awt.Color(51, 0, 0));
        lblJogar.setText("JOGAR");
        lblJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblJogarActionPerformed(evt);
            }
        });

        lblComputador.setText("Hannibal");

        lblResultado.setText("Resultado");

        buttonGroup2.add(rbPapel);
        rbPapel.setText("Papel");
        rbPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPapelActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbTesoura);
        rbTesoura.setText("Tesoura");
        rbTesoura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTesouraActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbPedra);
        rbPedra.setText("Pedra");
        rbPedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPedraActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ss.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblJogar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(rbPedra)
                        .addGap(165, 165, 165)
                        .addComponent(rbPapel)
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addGap(113, 113, 113)
                .addComponent(rbTesoura)
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(lblComputador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblResultado)
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPapel)
                    .addComponent(rbPedra)
                    .addComponent(rbTesoura))
                .addGap(122, 122, 122)
                .addComponent(lblJogar)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComputador)
                    .addComponent(lblResultado))
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblJogarActionPerformed
        int usuario = 0;
        if (rbPedra.isSelected()) {
            usuario = 0;
    }
        if (rbPapel.isSelected()) {
            usuario = 1;
    }
        if (rbTesoura.isSelected()) {
            usuario = 2;
    }
        Random aleatorio = new Random();
        int computador = aleatorio.nextInt(3);
        String escolhaComputador = "";
        if (computador == 0) {
         escolhaComputador = "Pedra";
  }
        if (computador == 1) {
        escolhaComputador = "Papel";
    }
        if (computador == 2) {
        escolhaComputador = "Tesoura";
}
       lblComputador.setText("Hannibal escolheu: " + escolhaComputador);
        if (usuario == computador) {
        lblResultado.setText("Empate!");
    }
        else if (
            (usuario == 0 && computador == 2) ||
            (usuario == 1 && computador == 0) ||
            (usuario == 2 && computador == 1)) {
        lblResultado.setText("Você venceu!");
    }
        else {
        lblResultado.setText("Hannibal venceu!");
    }
    }//GEN-LAST:event_lblJogarActionPerformed

    private void rbPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPapelActionPerformed

    private void rbTesouraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTesouraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbTesouraActionPerformed

    private void rbPedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPedraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPedraActionPerformed

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
            java.util.logging.Logger.getLogger(GameHannibal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameHannibal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameHannibal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameHannibal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameHannibal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblComputador;
    private javax.swing.JButton lblJogar;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JRadioButton rbPapel;
    private javax.swing.JRadioButton rbPedra;
    private javax.swing.JRadioButton rbTesoura;
    // End of variables declaration//GEN-END:variables
}
