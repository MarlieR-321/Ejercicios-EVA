package sentenciascontrol;
import abstraccion.Arreglo1Cl;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;



public class Arreglo1 extends javax.swing.JInternalFrame {

    
    public Arreglo1() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    
    Arreglo1Cl arreglo = new Arreglo1Cl();
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pArreglo = new javax.swing.JPanel();
        lTamaño = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        bEstTamaño = new javax.swing.JButton();
        lMensaje = new javax.swing.JLabel();
        lElemento = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lsNumeros = new javax.swing.JList<>();
        tfMultiplo = new javax.swing.JTextField();
        Ingresar = new javax.swing.JButton();
        pInfoArreglo = new javax.swing.JPanel();
        bMostrarMayoryMenor = new javax.swing.JButton();
        lMayor = new javax.swing.JLabel();
        tfMayor = new javax.swing.JTextField();
        lMenor = new javax.swing.JLabel();
        tfMenor = new javax.swing.JTextField();
        bPromedio = new javax.swing.JButton();
        tfPromedio = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lsNumMayorProm = new javax.swing.JList<>();

        setClosable(true);
        setResizable(true);
        setTitle("Arreglo Unidemensional | Elementos enteros");

        pArreglo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Arreglo de tipo entero", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        lTamaño.setText("Tamaño:");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("0");

        bEstTamaño.setText("Establecer Tamaño");
        bEstTamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEstTamañoActionPerformed(evt);
            }
        });

        lMensaje.setText("Almacenar sólo números múltiplos de:");

        lElemento.setText("Elemento:");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lsNumeros);

        Ingresar.setText("Ingresar");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pArregloLayout = new javax.swing.GroupLayout(pArreglo);
        pArreglo.setLayout(pArregloLayout);
        pArregloLayout.setHorizontalGroup(
            pArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pArregloLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pArregloLayout.createSequentialGroup()
                        .addGroup(pArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pArregloLayout.createSequentialGroup()
                                .addComponent(lTamaño)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bEstTamaño))
                            .addComponent(lElemento, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pArregloLayout.createSequentialGroup()
                        .addGroup(pArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pArregloLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(8, 8, 8)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(Ingresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pArregloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfMultiplo))
        );
        pArregloLayout.setVerticalGroup(
            pArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pArregloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEstTamaño)
                    .addComponent(lTamaño))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMensaje)
                    .addComponent(tfMultiplo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(pArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(lElemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pInfoArreglo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información del arreglo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        bMostrarMayoryMenor.setText("Mostrar el mayor y menor de los elementos");
        bMostrarMayoryMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarMayoryMenorActionPerformed(evt);
            }
        });

        lMayor.setText("Mayor:");

        tfMayor.setEditable(false);

        lMenor.setText("Menor:");

        tfMenor.setEditable(false);

        bPromedio.setText("Mostrar Promedio");
        bPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPromedioActionPerformed(evt);
            }
        });

        jButton2.setText("Mostrar números mayores al promedio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(lsNumMayorProm);

        javax.swing.GroupLayout pInfoArregloLayout = new javax.swing.GroupLayout(pInfoArreglo);
        pInfoArreglo.setLayout(pInfoArregloLayout);
        pInfoArregloLayout.setHorizontalGroup(
            pInfoArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bMostrarMayoryMenor)
            .addGroup(pInfoArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(pInfoArregloLayout.createSequentialGroup()
                    .addComponent(bPromedio)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(tfPromedio))
                .addGroup(pInfoArregloLayout.createSequentialGroup()
                    .addComponent(lMayor)
                    .addGap(18, 18, 18)
                    .addComponent(tfMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(lMenor)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tfMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(pInfoArregloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2))
            .addGroup(pInfoArregloLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pInfoArregloLayout.setVerticalGroup(
            pInfoArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInfoArregloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bMostrarMayoryMenor)
                .addGap(18, 18, 18)
                .addGroup(pInfoArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMayor)
                    .addComponent(tfMayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lMenor)
                    .addComponent(tfMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pInfoArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPromedio)
                    .addComponent(tfPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pInfoArreglo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pArreglo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pInfoArreglo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEstTamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEstTamañoActionPerformed
        this.arreglo.setLongitud(Integer.parseInt(this.jTextField1.getText()));
    }//GEN-LAST:event_bEstTamañoActionPerformed

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        this.arreglo.setDivisor(Integer.parseInt(this.tfMultiplo.getText()));
    }//GEN-LAST:event_IngresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.arreglo.multiplo();
       DefaultListModel modelo = new DefaultListModel();
       for(int M : this.arreglo.getSalida()){
           if(M != 0){
               modelo.addElement(M);
           }
       }
       this.lsNumeros.setModel(modelo);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bMostrarMayoryMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarMayoryMenorActionPerformed
        this.tfMayor.setText(String.valueOf(this.arreglo.mayor()));
        this.tfMenor.setText(String.valueOf(this.arreglo.menor()));
    }//GEN-LAST:event_bMostrarMayoryMenorActionPerformed

    private void bPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPromedioActionPerformed
        this.tfPromedio.setText(String.valueOf(this.arreglo.promedio()));
    }//GEN-LAST:event_bPromedioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.arreglo.mayorQueProm();
         DefaultListModel modelo = new DefaultListModel();
         for(int R : this.arreglo.getMayorPromedio()){
             if(R != 0 ){
                 modelo.addElement(R);
             }
         }
         lsNumMayorProm.setModel(modelo);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Arreglo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arreglo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arreglo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arreglo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arreglo1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar;
    private javax.swing.JButton bEstTamaño;
    private javax.swing.JButton bMostrarMayoryMenor;
    private javax.swing.JButton bPromedio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lElemento;
    private javax.swing.JLabel lMayor;
    private javax.swing.JLabel lMenor;
    private javax.swing.JLabel lMensaje;
    private javax.swing.JLabel lTamaño;
    private javax.swing.JList<String> lsNumMayorProm;
    private javax.swing.JList<String> lsNumeros;
    private javax.swing.JPanel pArreglo;
    private javax.swing.JPanel pInfoArreglo;
    private javax.swing.JTextField tfMayor;
    private javax.swing.JTextField tfMenor;
    private javax.swing.JTextField tfMultiplo;
    private javax.swing.JTextField tfPromedio;
    // End of variables declaration//GEN-END:variables
}
