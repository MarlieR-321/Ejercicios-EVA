package sentenciascontrol;
import abstraccion.ForCl;
import javax.swing.JOptionPane;

public class For extends javax.swing.JInternalFrame {

    /**
     * Creates new form For
     */
    public For() {
        initComponents();
    }

    ForCl ciclo = new ForCl();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lEjer1 = new javax.swing.JLabel();
        tfNum1 = new javax.swing.JTextField();
        ln1 = new javax.swing.JLabel();
        bCalcular4 = new javax.swing.JButton();
        lEjer2 = new javax.swing.JLabel();
        la2 = new javax.swing.JLabel();
        tfNum2 = new javax.swing.JTextField();
        bCalcular2 = new javax.swing.JButton();
        lb2 = new javax.swing.JLabel();
        tfNum3 = new javax.swing.JTextField();
        lEjer3 = new javax.swing.JLabel();
        tfNum4 = new javax.swing.JTextField();
        bVerificar3 = new javax.swing.JButton();
        lEjer4 = new javax.swing.JLabel();
        ln4 = new javax.swing.JLabel();
        tfNum5 = new javax.swing.JTextField();
        bCalcular1 = new javax.swing.JButton();
        lEjer5 = new javax.swing.JLabel();
        bImprimir6 = new javax.swing.JButton();
        lEjer6 = new javax.swing.JLabel();
        bCalcular5 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Sentencia de Repetición for de Java");

        lEjer1.setText("1. Calcule la sumatoria de los números entre 1 y N");

        ln1.setText("N=");

        bCalcular4.setText("Calcular");
        bCalcular4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular4ActionPerformed(evt);
            }
        });

        lEjer2.setText("2. Calcule la sumatoria de los números entre a y b");

        la2.setText("a=");

        bCalcular2.setText("Calcular");
        bCalcular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular2ActionPerformed(evt);
            }
        });

        lb2.setText("b=");

        lEjer3.setText("3. Verificar si el siguiente número es primo");

        bVerificar3.setText("Verificar");
        bVerificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerificar3ActionPerformed(evt);
            }
        });

        lEjer4.setText("4. Calcular el promedio de N calificaciones");

        ln4.setText("N=");

        bCalcular1.setText("Calcular");
        bCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular1ActionPerformed(evt);
            }
        });

        lEjer5.setText("5. Imprimir la suma de los número pares existentes entre 1 y 100");

        bImprimir6.setText("Imprimir");
        bImprimir6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bImprimir6ActionPerformed(evt);
            }
        });

        lEjer6.setText("6. Imprimir los 6 primeros términos de la serie de Fibonacci");

        bCalcular5.setText("Calcular");
        bCalcular5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(ln4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCalcular4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tfNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bVerificar3))
                    .addComponent(lEjer1)
                    .addComponent(lEjer2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ln1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bCalcular1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(la2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bCalcular2))))
                    .addComponent(lEjer3)
                    .addComponent(lEjer4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCalcular5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bImprimir6)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lEjer1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ln1)
                    .addComponent(tfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCalcular1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lEjer2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la2)
                    .addComponent(tfNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCalcular2)
                    .addComponent(lb2)
                    .addComponent(tfNum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVerificar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ln4)
                    .addComponent(tfNum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCalcular4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer5)
                    .addComponent(bCalcular5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer6)
                    .addComponent(bImprimir6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCalcular4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular4ActionPerformed
        this.ciclo.setNum1(Integer.parseInt(this.tfNum5.getText()));
        JOptionPane.showMessageDialog(this,"El promedio es: "+this.ciclo.sumaDeCalificaciones(),"Promedio",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bCalcular4ActionPerformed

    private void bCalcular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular2ActionPerformed
        try{
            this.ciclo.setNum1(Integer.parseInt(this.tfNum2.getText()));
            this.ciclo.setNum2(Integer.parseInt(this.tfNum3.getText()));
            
            JOptionPane.showMessageDialog(this, "La suma es: "+ this.ciclo.cicloAEleccion(),"Suma",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Ingrese un numero","Suma",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bCalcular2ActionPerformed

    private void bVerificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerificar3ActionPerformed
        try{
            this.ciclo.setNum1(Integer.parseInt(this.tfNum4.getText()));
            JOptionPane.showMessageDialog(this, this.ciclo.numeroPrimo(),"Suma",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Ingrese un numero","Suma",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bVerificar3ActionPerformed

    private void bCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular1ActionPerformed
       try{
            this.ciclo.setNum1(Integer.parseInt(this.tfNum1.getText()));
            
            JOptionPane.showMessageDialog(this, "La suma es: "+ this.ciclo.UnoAN(),"Suma",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Ingrese un numero","Suma",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bCalcular1ActionPerformed

    private void bImprimir6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bImprimir6ActionPerformed
        JOptionPane.showMessageDialog(this, "Primeros seis terminos:\n"+this.ciclo.seisTerminos(),"Fibonacci",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bImprimir6ActionPerformed

    private void bCalcular5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular5ActionPerformed
        JOptionPane.showMessageDialog(this, "La suma es de los números pares: "+this.ciclo.sumaPares(),"Suma",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bCalcular5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCalcular1;
    private javax.swing.JButton bCalcular2;
    private javax.swing.JButton bCalcular4;
    private javax.swing.JButton bCalcular5;
    private javax.swing.JButton bImprimir6;
    private javax.swing.JButton bVerificar3;
    private javax.swing.JLabel lEjer1;
    private javax.swing.JLabel lEjer2;
    private javax.swing.JLabel lEjer3;
    private javax.swing.JLabel lEjer4;
    private javax.swing.JLabel lEjer5;
    private javax.swing.JLabel lEjer6;
    private javax.swing.JLabel la2;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel ln1;
    private javax.swing.JLabel ln4;
    private javax.swing.JTextField tfNum1;
    private javax.swing.JTextField tfNum2;
    private javax.swing.JTextField tfNum3;
    private javax.swing.JTextField tfNum4;
    private javax.swing.JTextField tfNum5;
    // End of variables declaration//GEN-END:variables
}
