package sentenciascontrol;

import javax.swing.JOptionPane;
import abstraccion.SwitchCl;

public class Switch extends javax.swing.JInternalFrame {

    public Switch() {
        initComponents();
    }
    
    SwitchCl elector = new SwitchCl();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taEjer1 = new javax.swing.JTextArea();
        tfMes1 = new javax.swing.JTextField();
        bMostrar1 = new javax.swing.JButton();
        lEjer2 = new javax.swing.JLabel();
        tfMes2 = new javax.swing.JTextField();
        bMostrar2 = new javax.swing.JButton();
        lEjer3 = new javax.swing.JLabel();
        tfMes3 = new javax.swing.JTextField();
        bMostrar3 = new javax.swing.JButton();
        lEjer4 = new javax.swing.JLabel();
        pEstadoCivil = new javax.swing.JPanel();
        rbRaiz = new javax.swing.JRadioButton();
        rbResiduo = new javax.swing.JRadioButton();
        rbMenor = new javax.swing.JRadioButton();
        bCalcular4 = new javax.swing.JButton();
        lEjer5 = new javax.swing.JLabel();
        tfNum5 = new javax.swing.JTextField();
        bDeterminar5 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Sentencia de Bifurcación switch de Java");

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBar(null);

        taEjer1.setEditable(false);
        taEjer1.setBackground(new java.awt.Color(240, 240, 240));
        taEjer1.setColumns(20);
        taEjer1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        taEjer1.setLineWrap(true);
        taEjer1.setRows(5);
        taEjer1.setText("1. De acuerdo con el nombre del mes digitado, muestre si pertenece al grupo de 28 días, 29 días, 30 días o 31 días");
        taEjer1.setToolTipText("");
        taEjer1.setAutoscrolls(false);
        taEjer1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(taEjer1);

        bMostrar1.setText("Mostar");
        bMostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrar1ActionPerformed(evt);
            }
        });

        lEjer2.setText("2. Según el número del mes, determine la época del año");

        bMostrar2.setText("Mostar");
        bMostrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrar2ActionPerformed(evt);
            }
        });

        lEjer3.setText("3. Según el número del mes, determine el número de días");

        bMostrar3.setText("Mostar");
        bMostrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrar3ActionPerformed(evt);
            }
        });

        lEjer4.setText("4. Realice la tarea que indica la selección");

        pEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Menú"));

        rbRaiz.setText("Calcular la raíz de un número");

        rbResiduo.setText("Calcular el residuo de una división entera");

        rbMenor.setText("Mostrar el menor de N números");

        bCalcular4.setText("Calcular");
        bCalcular4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pEstadoCivilLayout = new javax.swing.GroupLayout(pEstadoCivil);
        pEstadoCivil.setLayout(pEstadoCivilLayout);
        pEstadoCivilLayout.setHorizontalGroup(
            pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoCivilLayout.createSequentialGroup()
                .addGroup(pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pEstadoCivilLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbResiduo)
                            .addComponent(rbMenor)
                            .addComponent(rbRaiz)))
                    .addGroup(pEstadoCivilLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(bCalcular4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pEstadoCivilLayout.setVerticalGroup(
            pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoCivilLayout.createSequentialGroup()
                .addComponent(rbRaiz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbResiduo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbMenor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCalcular4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lEjer5.setText("5. Determinar si el número entero es par o impar");

        bDeterminar5.setText("Determinar");
        bDeterminar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeterminar5ActionPerformed(evt);
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
                        .addComponent(tfMes1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMostrar1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfMes2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMostrar2))
                    .addComponent(lEjer3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfMes3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMostrar3))
                    .addComponent(lEjer4)
                    .addComponent(lEjer2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lEjer5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDeterminar5)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMostrar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMostrar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lEjer3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMostrar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDeterminar5)
                    .addComponent(tfNum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bMostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrar1ActionPerformed

        this.elector.setMes(this.tfMes1.getText());
        
        JOptionPane.showMessageDialog(this, "Tiene: "+this.elector.diaMes()+" días","Días por Mes", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bMostrar1ActionPerformed

    private void bMostrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrar2ActionPerformed
        try {
        this.elector.setNum1(Integer.parseInt(this.tfMes2.getText()));
        
        JOptionPane.showMessageDialog(this, this.elector.epocaDeMes(),"Época del Año", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Ingrese un número de mes","Época del Año", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bMostrar2ActionPerformed

    private void bMostrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrar3ActionPerformed
        try{
           this.elector.setNum1(Integer.parseInt(this.tfMes3.getText()));
            JOptionPane.showMessageDialog(this,"Tiene "+this.elector.diaMesNumero()+" días",
                        "Meses", JOptionPane.INFORMATION_MESSAGE);
                    
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Debe ingresar un mes",
                "Meses", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bMostrar3ActionPerformed

    private void bCalcular4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular4ActionPerformed

        try{
        this.elector.setOp1(this.rbRaiz.isSelected());
        this.elector.setOp2(this.rbResiduo.isSelected());
        this.elector.setOp3(this.rbMenor.isSelected());
        
        if (this.rbRaiz.isSelected() == true){ 
        this.elector.setRaiz(Double.parseDouble(JOptionPane.showInputDialog(this,
                    "Inserte el numero para la raiz","Ingresar",JOptionPane.QUESTION_MESSAGE)));
        }
        
        if(this.rbResiduo.isSelected() == true){
        this.elector.setNum2(Double.parseDouble(JOptionPane.showInputDialog(this,
            "Inserte el dividendo","Ingresar",JOptionPane.QUESTION_MESSAGE)));
        this.elector.setNum3(Double.parseDouble(JOptionPane.showInputDialog(this,
            "Inserte el divisor","Ingresar",JOptionPane.QUESTION_MESSAGE)));
        }
        
        if(this.rbMenor.isSelected() == true){
            this.elector.setNum1(Integer.parseInt(JOptionPane.showInputDialog(this,
            "Inserte la cantidad de numeros a ingresar","Ingresar",JOptionPane.QUESTION_MESSAGE)));
            
        }
        
        
        JOptionPane.showMessageDialog(this,"Resultados:\n"+this.elector.operaciones(), "Operaciones", 
                        JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Inserte número","Menor",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bCalcular4ActionPerformed

    private void bDeterminar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeterminar5ActionPerformed
        try{
            this.elector.setNum1(Integer.parseInt(this.tfNum5.getText()));
            
            JOptionPane.showMessageDialog(this,this.elector.paresEImpares(), "Pares e Impares", 
                        JOptionPane.INFORMATION_MESSAGE);
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Debe ingresar un número",
                "Pares e Impares", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bDeterminar5ActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCalcular4;
    private javax.swing.JButton bDeterminar5;
    private javax.swing.JButton bMostrar1;
    private javax.swing.JButton bMostrar2;
    private javax.swing.JButton bMostrar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lEjer2;
    private javax.swing.JLabel lEjer3;
    private javax.swing.JLabel lEjer4;
    private javax.swing.JLabel lEjer5;
    private javax.swing.JPanel pEstadoCivil;
    private javax.swing.JRadioButton rbMenor;
    private javax.swing.JRadioButton rbRaiz;
    private javax.swing.JRadioButton rbResiduo;
    private javax.swing.JTextArea taEjer1;
    private javax.swing.JTextField tfMes1;
    private javax.swing.JTextField tfMes2;
    private javax.swing.JTextField tfMes3;
    private javax.swing.JTextField tfNum5;
    // End of variables declaration//GEN-END:variables
}
