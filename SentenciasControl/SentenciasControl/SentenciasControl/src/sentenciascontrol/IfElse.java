package sentenciascontrol;

import javax.swing.JOptionPane;
import abstraccion.BifuIfElse;

public class IfElse extends javax.swing.JInternalFrame {

    public IfElse() {
        initComponents();
    }
    
    BifuIfElse nuevo = new BifuIfElse();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEjer1 = new javax.swing.ButtonGroup();
        lEjer1 = new javax.swing.JLabel();
        pLugaresVisitados = new javax.swing.JPanel();
        chbOmetepe = new javax.swing.JCheckBox();
        chbLaguna = new javax.swing.JCheckBox();
        chbIsland = new javax.swing.JCheckBox();
        chbSanJuan = new javax.swing.JCheckBox();
        bMostrar2 = new javax.swing.JButton();
        lEjer2 = new javax.swing.JLabel();
        pEstadoCivil = new javax.swing.JPanel();
        rbSoltero = new javax.swing.JRadioButton();
        rbCasado = new javax.swing.JRadioButton();
        rbOtro = new javax.swing.JRadioButton();
        bMostrar1 = new javax.swing.JButton();
        lEjer3 = new javax.swing.JLabel();
        tbOpcion = new javax.swing.JToggleButton();
        lEjer4 = new javax.swing.JLabel();
        tfNum1 = new javax.swing.JTextField();
        bValidar4 = new javax.swing.JButton();
        lEjer5 = new javax.swing.JLabel();
        tfNum2 = new javax.swing.JTextField();
        bValidar5 = new javax.swing.JButton();
        bMostrar3 = new javax.swing.JButton();
        lEjer6 = new javax.swing.JLabel();
        tfNum3 = new javax.swing.JTextField();
        bValidar6 = new javax.swing.JButton();
        lEjer7 = new javax.swing.JLabel();
        tfNum4 = new javax.swing.JTextField();
        bValidar7 = new javax.swing.JButton();
        lEjer8 = new javax.swing.JLabel();
        tfNum5 = new javax.swing.JTextField();
        bCalcular8 = new javax.swing.JButton();
        tfNum6 = new javax.swing.JTextField();
        tfNum7 = new javax.swing.JTextField();
        tfNum8 = new javax.swing.JTextField();
        lEjer9 = new javax.swing.JLabel();
        tfNum9 = new javax.swing.JTextField();
        bCalcular9 = new javax.swing.JButton();
        lEjer10 = new javax.swing.JLabel();
        tfNum10 = new javax.swing.JTextField();
        bMostrar10 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Sentencia de Bifurcación if...else de Java");

        lEjer1.setText("1. Muestre un mensaje con la selección realizada");

        pLugaresVisitados.setBorder(javax.swing.BorderFactory.createTitledBorder("Lugares Visitados"));

        chbOmetepe.setText("Ometepe");

        chbLaguna.setText("Laguna de Apoyo");

        chbIsland.setText("Corn Island");

        chbSanJuan.setText("San Juan del Sur");

        bMostrar2.setText("Mostrar");
        bMostrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pLugaresVisitadosLayout = new javax.swing.GroupLayout(pLugaresVisitados);
        pLugaresVisitados.setLayout(pLugaresVisitadosLayout);
        pLugaresVisitadosLayout.setHorizontalGroup(
            pLugaresVisitadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLugaresVisitadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pLugaresVisitadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pLugaresVisitadosLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(bMostrar2))
                    .addComponent(chbOmetepe)
                    .addComponent(chbLaguna)
                    .addComponent(chbIsland)
                    .addComponent(chbSanJuan))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pLugaresVisitadosLayout.setVerticalGroup(
            pLugaresVisitadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLugaresVisitadosLayout.createSequentialGroup()
                .addComponent(chbOmetepe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbLaguna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbIsland)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbSanJuan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addComponent(bMostrar2))
        );

        lEjer2.setText("2. Muestre un mensaje con las selecciones realizadas");

        pEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado Civil"));

        bgEjer1.add(rbSoltero);
        rbSoltero.setText("Soltero(a)");

        bgEjer1.add(rbCasado);
        rbCasado.setText("Casado(a)");

        bgEjer1.add(rbOtro);
        rbOtro.setText("Otro");

        bMostrar1.setText("Mostrar");
        bMostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pEstadoCivilLayout = new javax.swing.GroupLayout(pEstadoCivil);
        pEstadoCivil.setLayout(pEstadoCivilLayout);
        pEstadoCivilLayout.setHorizontalGroup(
            pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoCivilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbCasado)
                    .addComponent(rbOtro)
                    .addComponent(rbSoltero))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEstadoCivilLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(bMostrar1)
                .addContainerGap())
        );
        pEstadoCivilLayout.setVerticalGroup(
            pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoCivilLayout.createSequentialGroup()
                .addComponent(rbSoltero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbCasado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbOtro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addComponent(bMostrar1))
        );

        lEjer3.setText("3. Muestre un mensaje con el estado del botón");

        tbOpcion.setText("Opción A");

        lEjer4.setText("4. Valide la mayoría de edad (>=21 años)");

        bValidar4.setText("Validar");
        bValidar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bValidar4ActionPerformed(evt);
            }
        });

        lEjer5.setText("5. Valide si el número es una calificación válida (0 - 100)");

        bValidar5.setText("Validar");
        bValidar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bValidar5ActionPerformed(evt);
            }
        });

        bMostrar3.setText("Mostrar");
        bMostrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrar3ActionPerformed(evt);
            }
        });

        lEjer6.setText("6. Valide si la calificación es aprobada o reprobada");

        bValidar6.setText("Validar");
        bValidar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bValidar6ActionPerformed(evt);
            }
        });

        lEjer7.setText("7. Valide si el año es bisiesto");

        bValidar7.setText("Validar");
        bValidar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bValidar7ActionPerformed(evt);
            }
        });

        lEjer8.setText("8. Calcule el mayor de los números");

        bCalcular8.setText("Calcular");
        bCalcular8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular8ActionPerformed(evt);
            }
        });

        lEjer9.setText("9. Calcule la cantidad de días del mes");

        bCalcular9.setText("Calcular");
        bCalcular9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular9ActionPerformed(evt);
            }
        });

        lEjer10.setText("10. Muestre el reconocimiento según la calificación (E, MB, B, D)");

        bMostrar10.setText("Mostrar");
        bMostrar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrar10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lEjer1)
                    .addComponent(lEjer2)
                    .addComponent(pLugaresVisitados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lEjer3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tbOpcion)
                                .addGap(18, 18, 18)
                                .addComponent(bMostrar3)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lEjer8)
                                .addGap(33, 33, 33))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCalcular8))
                    .addComponent(lEjer4)
                    .addComponent(lEjer5)
                    .addComponent(lEjer6)
                    .addComponent(lEjer7)
                    .addComponent(lEjer9)
                    .addComponent(lEjer10)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNum10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bMostrar10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bValidar7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bValidar6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bValidar5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bValidar4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bCalcular9)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEjer1)
                    .addComponent(lEjer4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bValidar4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lEjer5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bValidar5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lEjer6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bValidar6)))
                    .addComponent(pEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bValidar7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lEjer8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCalcular8)
                            .addComponent(tfNum6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNum7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNum8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lEjer9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNum9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCalcular9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lEjer10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNum10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bMostrar10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pLugaresVisitados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lEjer3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbOpcion)
                            .addComponent(bMostrar3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bMostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrar1ActionPerformed
        try{
        this.nuevo.setOp1(this.rbSoltero.isSelected());
        this.nuevo.setOp2(this.rbCasado.isSelected());
        this.nuevo.setOp3(this.rbOtro.isSelected());
        
            if(this.nuevo.estadoCivil().equals("soltero")){
                JOptionPane.showMessageDialog(this,"Usted esta Soltero ",
                        "Estado Civil", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                if(this.nuevo.estadoCivil().equals("casado")){
                    JOptionPane.showMessageDialog(this,"Usted esta Casado ",
                        "Estado Civil", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    if(this.nuevo.estadoCivil().equals("no especificado")){
                        JOptionPane.showMessageDialog(this,"Prefiere no decirlo",
                        "Estado Civil", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
        catch(java.lang.NullPointerException ex){
            JOptionPane.showMessageDialog(this,"Debe elegir una opcion","Estado Civil",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bMostrar1ActionPerformed

    private void bMostrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrar2ActionPerformed
        this.nuevo.setOp1(this.chbOmetepe.isSelected());
        this.nuevo.setOp2(this.chbLaguna.isSelected());
        this.nuevo.setOp3(this.chbIsland.isSelected());
        this.nuevo.setOp4(this.chbSanJuan.isSelected());
        
               
        JOptionPane.showMessageDialog(this,"Usted ha estado en: \n" + this.nuevo.viajes(),
            "Viajes", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_bMostrar2ActionPerformed

    private void bMostrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrar3ActionPerformed
        this.nuevo.setOp1(this.tbOpcion.isSelected());
        
        if(this.nuevo.opcion()==true){
            JOptionPane.showMessageDialog(this,"Opción A fue seleccionada",
            "Opción", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this,"La opcion no fue seleccionada",
            "Opción", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bMostrar3ActionPerformed

    private void bValidar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bValidar4ActionPerformed
        try{
            this.nuevo.setNum1(Double.parseDouble(this.tfNum1.getText()));
            
            if(this.nuevo.mayoriaDeEdad()==true){
                JOptionPane.showMessageDialog(this,"Usted es mayor de edad",
                    "Edad", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this,"Usted es menor de edad",
                    "Edad", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Debe ingresar una edad",
                "Edad", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bValidar4ActionPerformed

    private void bValidar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bValidar5ActionPerformed
        try{
            this.nuevo.setNum1(Double.parseDouble(this.tfNum2.getText()));
            
            if(this.nuevo.calificacionValida() == true){
                JOptionPane.showMessageDialog(this,"Es una calificación válida",
                    "Calificación", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this,"No es una calificación válida",
                    "Calificación", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Debe ingresar una calificación",
                "Calificación", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bValidar5ActionPerformed

    private void bValidar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bValidar6ActionPerformed
        try{
            this.nuevo.setNum1(Double.parseDouble(this.tfNum3.getText()));
            
            if(this.nuevo.nota().equals("Aprobado")){
                JOptionPane.showMessageDialog(this,"Aprobado",
                    "Calificaciones", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this,"Reprobado",
                    "Calificaciones", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Debe ingresar una calificación",
                "Nota", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bValidar6ActionPerformed

    private void bValidar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bValidar7ActionPerformed
        try{
            this.nuevo.setNum1(Double.parseDouble(this.tfNum4.getText()));
            
            if(this.nuevo.anoBisiesto() == true){
                JOptionPane.showMessageDialog(this,"Es un año bisiesto",
                    "Año", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this,"No es un año bisiesto",
                    "Año", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Ingrese un año",
                "Año", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bValidar7ActionPerformed

    private void bCalcular8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular8ActionPerformed
        try{
           this.nuevo.setNum1(Double.parseDouble(this.tfNum5.getText()));
           this.nuevo.setNum2(Double.parseDouble(this.tfNum6.getText()));
           this.nuevo.setNum3(Double.parseDouble(this.tfNum7.getText()));
           this.nuevo.setNum4(Double.parseDouble(this.tfNum8.getText()));
          
            JOptionPane.showMessageDialog(this,"El mayor es: " + this.nuevo.mayor(),"Mayores", JOptionPane.INFORMATION_MESSAGE);
           
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Debe ingresar 4 numeros","Mayores", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bCalcular8ActionPerformed

    private void bCalcular9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular9ActionPerformed
        try{
            this.nuevo.setIngreso(this.tfNum9.getText());
            
            if(this.nuevo.diasDeMes() == 31){
                JOptionPane.showMessageDialog(this,"Tiene 31 dias",
                    "Meses", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                if(this.nuevo.diasDeMes() == 28){
                    JOptionPane.showMessageDialog(this,"Tiene 28 dias",
                        "Meses", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(this,"Tiene 30 dias",
                        "Meses", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Debe ingresar un mes",
                "Meses", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bCalcular9ActionPerformed

    private void bMostrar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrar10ActionPerformed
        try{
            this.nuevo.setIngreso(this.tfNum10.getText());
           
            if(this.nuevo.calificacionLetra().equalsIgnoreCase("Excelente")){
                JOptionPane.showMessageDialog(this,"Felicidades!\nSu trabajo fue excelente",
                    "Nota", JOptionPane.INFORMATION_MESSAGE);
            }
            if(this.nuevo.calificacionLetra().equalsIgnoreCase("Muy Bueno")){
                JOptionPane.showMessageDialog(this,"Felicidades!\nSu trabajo fue muy bueno",
                    "Nota", JOptionPane.INFORMATION_MESSAGE);
            }
            if(this.nuevo.calificacionLetra().equalsIgnoreCase("Bueno")){
                JOptionPane.showMessageDialog(this,"Su trabajo fue bueno",
                    "Nota", JOptionPane.INFORMATION_MESSAGE);
            }
            if(this.nuevo.calificacionLetra().equalsIgnoreCase("Decente")){
                JOptionPane.showMessageDialog(this,"Su trabajo fue decente",
                    "Nota", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Debe ingresar una nota",
                "Nota", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bMostrar10ActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCalcular8;
    private javax.swing.JButton bCalcular9;
    private javax.swing.JButton bMostrar1;
    private javax.swing.JButton bMostrar10;
    private javax.swing.JButton bMostrar2;
    private javax.swing.JButton bMostrar3;
    private javax.swing.JButton bValidar4;
    private javax.swing.JButton bValidar5;
    private javax.swing.JButton bValidar6;
    private javax.swing.JButton bValidar7;
    private javax.swing.ButtonGroup bgEjer1;
    private javax.swing.JCheckBox chbIsland;
    private javax.swing.JCheckBox chbLaguna;
    private javax.swing.JCheckBox chbOmetepe;
    private javax.swing.JCheckBox chbSanJuan;
    private javax.swing.JLabel lEjer1;
    private javax.swing.JLabel lEjer10;
    private javax.swing.JLabel lEjer2;
    private javax.swing.JLabel lEjer3;
    private javax.swing.JLabel lEjer4;
    private javax.swing.JLabel lEjer5;
    private javax.swing.JLabel lEjer6;
    private javax.swing.JLabel lEjer7;
    private javax.swing.JLabel lEjer8;
    private javax.swing.JLabel lEjer9;
    private javax.swing.JPanel pEstadoCivil;
    private javax.swing.JPanel pLugaresVisitados;
    private javax.swing.JRadioButton rbCasado;
    private javax.swing.JRadioButton rbOtro;
    private javax.swing.JRadioButton rbSoltero;
    private javax.swing.JToggleButton tbOpcion;
    private javax.swing.JTextField tfNum1;
    private javax.swing.JTextField tfNum10;
    private javax.swing.JTextField tfNum2;
    private javax.swing.JTextField tfNum3;
    private javax.swing.JTextField tfNum4;
    private javax.swing.JTextField tfNum5;
    private javax.swing.JTextField tfNum6;
    private javax.swing.JTextField tfNum7;
    private javax.swing.JTextField tfNum8;
    private javax.swing.JTextField tfNum9;
    // End of variables declaration//GEN-END:variables
}