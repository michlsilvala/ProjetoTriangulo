/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

/**
 *
 * @author Michel
 */
public class ProjetoTriangulo extends javax.swing.JFrame {
    static int a;
    static int b;
    static int c;
 
    /**
     * Creates new form ProjetoTriangulo
     */
    public ProjetoTriangulo() {
        initComponents();
        paineRes.setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        segA = new javax.swing.JSlider();
        segB = new javax.swing.JSlider();
        segC = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        paineRes = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        formaTriangulo = new javax.swing.JLabel();
        tipoTriangulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        segA.setValue(0);
        segA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                segAStateChanged(evt);
            }
        });

        segB.setValue(0);
        segB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                segBStateChanged(evt);
            }
        });

        segC.setValue(0);
        segC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                segCStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Segmento a");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Segmento b");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Segmento c");

        lblA.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N
        lblA.setText("0");

        lblB.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N
        lblB.setText("0");

        lblC.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N
        lblC.setText("0");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 31)); // NOI18N
        jLabel7.setText("PROJETO TRIANGULO");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Triangulo para jframe.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setText("Tipo");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setText("Forma Triangulo ?");

        formaTriangulo.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        formaTriangulo.setForeground(new java.awt.Color(0, 153, 255));
        formaTriangulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tipoTriangulo.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        tipoTriangulo.setForeground(new java.awt.Color(0, 51, 255));
        tipoTriangulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout paineResLayout = new javax.swing.GroupLayout(paineRes);
        paineRes.setLayout(paineResLayout);
        paineResLayout.setHorizontalGroup(
            paineResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineResLayout.createSequentialGroup()
                .addGroup(paineResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paineResLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel9))
                    .addGroup(paineResLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel10)))
                .addGap(93, 93, 93)
                .addGroup(paineResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(formaTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tipoTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        paineResLayout.setVerticalGroup(
            paineResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paineResLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(paineResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(formaTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(paineResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(180, 180, 180))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paineRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(segA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblA))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(segC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblC))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(segB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblB)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(segA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(lblA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(segB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(lblB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(segC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(lblC)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addComponent(paineRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void segAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_segAStateChanged
        lblA.setText(Integer.toString(segA.getValue()));
        
            a = segA.getValue();
            b = segB.getValue();
            c = segC.getValue();
            
            if(a < b + c && b < a + c && c < a + b){
               formaTriangulo.setText("Sim ");
               if(a == b && b == c && c == a){
                   tipoTriangulo.setText("Equilátero");
               }else if(a != b && b != c && c != a){
                   tipoTriangulo.setText("Escaleno");
               }else {
                   tipoTriangulo.setText("Isósceles");
               }
            }else{
                formaTriangulo.setText("Não");
                tipoTriangulo.setText("");
            }
        
        
        
    }//GEN-LAST:event_segAStateChanged

    private void segBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_segBStateChanged
        lblB.setText(Integer.toString(segB.getValue()));
        
            a = segA.getValue();
            b = segB.getValue();
            c = segC.getValue();
            
            if(a < b + c && b < a + c && c < a + b){
               formaTriangulo.setText("Sim ");
               if(a == b && b == c && c == a){
                   tipoTriangulo.setText("Equilátero");
               }else if(a != b && b != c && c != a){
                   tipoTriangulo.setText("Escaleno");
               }else {
                   tipoTriangulo.setText("Isósceles");
               }
            }else{
                formaTriangulo.setText("Não ");
                tipoTriangulo.setText("");
            }
    }//GEN-LAST:event_segBStateChanged

    private void segCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_segCStateChanged
        lblC.setText(Integer.toString(segC.getValue()));
        
            a = segA.getValue();
            b = segB.getValue();
            c = segC.getValue();
            
            if(a < b + c && b < a + c && c < a + b){
               formaTriangulo.setText("Sim ");
               if(a == b && b == c && c == a){
                   tipoTriangulo.setText("Equilátero");
               }else if(a != b && b != c && c != a){
                   tipoTriangulo.setText("Escaleno");
               }else {
                   tipoTriangulo.setText("Isósceles");
               }
            }else{
                formaTriangulo.setText("Não ");
                tipoTriangulo.setText("");
            }
    }//GEN-LAST:event_segCStateChanged

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
            java.util.logging.Logger.getLogger(ProjetoTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjetoTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjetoTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjetoTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjetoTriangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel formaTriangulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JPanel paineRes;
    private javax.swing.JSlider segA;
    private javax.swing.JSlider segB;
    private javax.swing.JSlider segC;
    private javax.swing.JLabel tipoTriangulo;
    // End of variables declaration//GEN-END:variables
}
