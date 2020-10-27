package sentenciascontrol;
import abstraccion.Arreglo2Cl;
import javax.swing.JOptionPane;

public class Arreglo2 extends javax.swing.JInternalFrame{

    /**
     * Creates new form Arreglo2
     */
    public Arreglo2() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    
    Arreglo2Cl arreglo = new Arreglo2Cl();
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lMensaje = new javax.swing.JLabel();
        lMatriz = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfEscalar = new javax.swing.JTextField();
        bResultado = new javax.swing.JButton();
        lMensaje1 = new javax.swing.JLabel();
        lMatrizb = new javax.swing.JLabel();
        bSumarAyB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Matriz Bidimensional");

        lMensaje.setText("Dada la siguiente matriz A:");

        lMatriz.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lMatriz.setText("int[][] matrizA ={{10, 15, 20}, {-3, 12, 4}, {0, 5, -4}};");

        jLabel1.setText("Multiplicar por el escalar K: ");

        bResultado.setText("Ver Resultado");
        bResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResultadoActionPerformed(evt);
            }
        });

        lMensaje1.setText("Dada la siguiente matriz B:");

        lMatrizb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lMatrizb.setText("int[][] matrizB ={{25, -5, 10}, {-10, 21, 54}, {10, -55, -25}};");

        bSumarAyB.setText("Suma Matriz A y Matriz B");
        bSumarAyB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSumarAyBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bSumarAyB)
                    .addComponent(lMatrizb)
                    .addComponent(lMensaje1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEscalar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bResultado))
                    .addComponent(lMatriz)
                    .addComponent(lMensaje))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lMatriz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfEscalar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bResultado))
                .addGap(18, 18, 18)
                .addComponent(lMensaje1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lMatrizb)
                .addGap(18, 18, 18)
                .addComponent(bSumarAyB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResultadoActionPerformed
        try {
            this.arreglo.setK(Integer.parseInt(this.tfEscalar.getText()));
            JOptionPane.showMessageDialog(this,this.arreglo.multEscalar(),"Escalar",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Ingrese un numero.","Escalar",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bResultadoActionPerformed

    private void bSumarAyBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSumarAyBActionPerformed
        JOptionPane.showMessageDialog(this,this.arreglo.sumarMatrices(),"Sumar",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bSumarAyBActionPerformed

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
            java.util.logging.Logger.getLogger(Arreglo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arreglo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arreglo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arreglo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arreglo2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bResultado;
    private javax.swing.JButton bSumarAyB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lMatriz;
    private javax.swing.JLabel lMatrizb;
    private javax.swing.JLabel lMensaje;
    private javax.swing.JLabel lMensaje1;
    private javax.swing.JTextField tfEscalar;
    // End of variables declaration//GEN-END:variables
}
