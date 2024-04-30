/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Sudoku;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Froylan Lara
 * @author Alina Bonilla
 */
public class Estadisticas extends javax.swing.JFrame {

    /**
     * Creates new form Estadisticas
     * @param hJuegos
     */
    public Estadisticas(ArrayList<Juego> pHistorialJuegos,Sudoku.Tablero tablero) {
        historialJuegos = pHistorialJuegos;
        juego = tablero;
        initComponents();
        Estadisticos(1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jCheckBoxDigitos = new javax.swing.JCheckBox();
        jCheckBoxVerificaciones = new javax.swing.JCheckBox();
        jCheckBoxErrores = new javax.swing.JCheckBox();
        jCheckBoxSugerencias = new javax.swing.JCheckBox();
        jCheckBoxTipo = new javax.swing.JCheckBox();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelSeparador = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaMostrar = new javax.swing.JTextArea();
        jCheckBoxTiempo = new javax.swing.JCheckBox();
        jButtonAtras = new javax.swing.JButton();
        jLabelMsgTotal = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jCheckBoxDigitos.setSelected(true);
        jCheckBoxDigitos.setText("Cantidad de celdas de ingreso de digitos");
        jCheckBoxDigitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDigitosActionPerformed(evt);
            }
        });

        jCheckBoxVerificaciones.setText("Cantidad de verificaciones realizadas");
        jCheckBoxVerificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxVerificacionesActionPerformed(evt);
            }
        });

        jCheckBoxErrores.setText("Cantidad de errores de verificacion");
        jCheckBoxErrores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxErroresActionPerformed(evt);
            }
        });

        jCheckBoxSugerencias.setText("Cantidad de sugerencias utilizadas");
        jCheckBoxSugerencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSugerenciasActionPerformed(evt);
            }
        });

        jCheckBoxTipo.setText("Tipo de finalizacion");
        jCheckBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTipoActionPerformed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabelTitulo.setText("Estadisticas ");
        jLabelTitulo.setToolTipText("");

        jLabelSeparador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextAreaMostrar.setColumns(20);
        jTextAreaMostrar.setRows(5);
        jScrollPane1.setViewportView(jTextAreaMostrar);

        jCheckBoxTiempo.setText("Tiempo de juego");
        jCheckBoxTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTiempoActionPerformed(evt);
            }
        });

        jButtonAtras.setText("Atras");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jLabelMsgTotal.setText("Total de Juegos:  ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxDigitos)
                            .addComponent(jCheckBoxTipo)
                            .addComponent(jCheckBoxSugerencias)
                            .addComponent(jCheckBoxErrores)
                            .addComponent(jCheckBoxVerificaciones)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBoxTiempo)))
                .addGap(20, 20, 20)
                .addComponent(jLabelSeparador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49))
                        .addComponent(jButtonAtras, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelMsgTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabelSeparador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabelTitulo)
                        .addGap(45, 45, 45)
                        .addComponent(jCheckBoxDigitos)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxVerificaciones)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxErrores)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxSugerencias)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxTipo)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxTiempo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAtras)
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMsgTotal)
                    .addComponent(jLabelTotal))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxVerificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxVerificacionesActionPerformed
        jCheckBoxDigitos.setSelected(false);
        jCheckBoxErrores.setSelected(false);
        jCheckBoxSugerencias.setSelected(false);
        jCheckBoxTipo.setSelected(false);
        jCheckBoxTiempo.setSelected(false);
        if (!jCheckBoxVerificaciones.isSelected()){
            jCheckBoxVerificaciones.setSelected(true);            
        }else{
            Estadisticos(2);
        }
    }//GEN-LAST:event_jCheckBoxVerificacionesActionPerformed

    private void jCheckBoxDigitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDigitosActionPerformed
        jCheckBoxErrores.setSelected(false);
        jCheckBoxSugerencias.setSelected(false);
        jCheckBoxTipo.setSelected(false);
        jCheckBoxVerificaciones.setSelected(false);
        jCheckBoxTiempo.setSelected(false);
        if (!jCheckBoxDigitos.isSelected()){
            jCheckBoxDigitos.setSelected(true);            
        }else{
            Estadisticos(1);
        }
    }//GEN-LAST:event_jCheckBoxDigitosActionPerformed

    private void jCheckBoxErroresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxErroresActionPerformed
        jCheckBoxDigitos.setSelected(false);
        jCheckBoxSugerencias.setSelected(false);
        jCheckBoxTipo.setSelected(false);
        jCheckBoxVerificaciones.setSelected(false);
        jCheckBoxTiempo.setSelected(false);
        if (!jCheckBoxErrores.isSelected()){
            jCheckBoxErrores.setSelected(true);            
        }else{
            Estadisticos(3);
        }
    }//GEN-LAST:event_jCheckBoxErroresActionPerformed

    private void jCheckBoxSugerenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSugerenciasActionPerformed
        jCheckBoxDigitos.setSelected(false);
        jCheckBoxErrores.setSelected(false);
        jCheckBoxTipo.setSelected(false);
        jCheckBoxVerificaciones.setSelected(false);
        jCheckBoxTiempo.setSelected(false);
        if (!jCheckBoxSugerencias.isSelected()){
            jCheckBoxSugerencias.setSelected(true);            
        }else{
            Estadisticos(4);
        }
    }//GEN-LAST:event_jCheckBoxSugerenciasActionPerformed

    private void jCheckBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTipoActionPerformed
        jCheckBoxDigitos.setSelected(false);
        jCheckBoxErrores.setSelected(false);
        jCheckBoxSugerencias.setSelected(false);
        jCheckBoxVerificaciones.setSelected(false);
        jCheckBoxTiempo.setSelected(false);
        if (!jCheckBoxTipo.isSelected()){
            jCheckBoxTipo.setSelected(true);
        }else{
            Estadisticos(5);
        }
    }//GEN-LAST:event_jCheckBoxTipoActionPerformed

    private void jCheckBoxTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTiempoActionPerformed
        jCheckBoxDigitos.setSelected(false);
        jCheckBoxErrores.setSelected(false);
        jCheckBoxTipo.setSelected(false);
        jCheckBoxVerificaciones.setSelected(false);
        if (!jCheckBoxTiempo.isSelected()){
            jCheckBoxTiempo.setSelected(true);            
        }else{
            Estadisticos(6);
        }
    }//GEN-LAST:event_jCheckBoxTiempoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        this.dispose();
        juego.setVisible(true);
        if(juego.juegoActual != null){
            if(juego.juegoActual.estado == 0){
                juego.empezar();
                juego.t.start();
            }
        }
    }//GEN-LAST:event_jButtonAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estadisticas(new ArrayList(),new Tablero()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JCheckBox jCheckBoxDigitos;
    private javax.swing.JCheckBox jCheckBoxErrores;
    private javax.swing.JCheckBox jCheckBoxSugerencias;
    private javax.swing.JCheckBox jCheckBoxTiempo;
    private javax.swing.JCheckBox jCheckBoxTipo;
    private javax.swing.JCheckBox jCheckBoxVerificaciones;
    private javax.swing.JLabel jLabelMsgTotal;
    private javax.swing.JLabel jLabelSeparador;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaMostrar;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Juego> historialJuegos;
    private Tablero juego;
    
    private void Estadisticos(int flag) {
        String msg = "No se ha finalizado ningun juego, por tanto no \nse puede mostrar ninguna estadistica";
        int total = 0;        
        if (!historialJuegos.toString().equals("[]")){
            ArrayList<Integer> cantXCeldas = new ArrayList();
            ArrayList<String> tiempos = new ArrayList();
            for(Juego juegoHistorial: historialJuegos){
                if (flag == 1){
                    cantXCeldas.add(juegoHistorial.ingresoDigitos);
                }else if (flag == 2){
                    cantXCeldas.add(juegoHistorial.verificaciones);
                }else if (flag == 3){
                    cantXCeldas.add(juegoHistorial.errores);
                }else if (flag == 4){
                    cantXCeldas.add(juegoHistorial.sugerencias);
                }else if (flag == 5){
                    cantXCeldas.add(juegoHistorial.estado);
                }else{
                    String crono = juegoHistorial.cronometro.toString();
                    tiempos.add(crono);
                    crono = crono.replace(" ", "");
                    String[] temp = crono.split(":");
                    cantXCeldas.add(((Integer.parseInt(temp[0]))*1000000)+((Integer.parseInt(temp[1]))*10000)+((Integer.parseInt(temp[2]))*100)+(Integer.parseInt(temp[3])));
                }
            }
            ArrayList<Integer> listaCXCeldas = new ArrayList(cantXCeldas);
            
            Set<Integer> hashSet = new HashSet<>(cantXCeldas);
            cantXCeldas.clear();
            cantXCeldas.addAll(hashSet);
            
            if (flag == 6){
                Set<String> hashSetTiempos = new HashSet<>(tiempos);
                tiempos.clear();
                tiempos.addAll(hashSetTiempos);
            }
            
            ArrayList<ArrayList<Integer>> lista = new ArrayList();
            for(int cantXCelda: cantXCeldas){
                int cont = 0;
                for(int cant: listaCXCeldas){
                    if (cantXCelda == cant){
                        cont++;
                    }
                }
                ArrayList<Integer> x = new ArrayList();
                x.add(cantXCelda);
                x.add(cont);
                lista.add(x);
            }
            ArrayList<String> lineasMsg = new ArrayList();
            int i = 0;
            for (ArrayList<Integer> valores : lista){                
                String temp = "";
                total  += valores.get(1);
                if ((flag != 5) && (flag != 6)){
                    temp = "\n  " + valores.get(0) + "\t\t  " + valores.get(1);
                }else if (flag != 6){
                    switch (valores.get(0)) {
                        case 1:
                            temp = "\n  Exitosas:\t\t  " + valores.get(1);
                            break;
                        case 2:
                            temp = "\n  Autosolución:\t\t  " + valores.get(1);
                            break;
                        default:
                            temp = "\n  Abandonadas:\t\t  " + valores.get(1);
                            break;
                    }
                }else{
                    temp = "\n  " + tiempos.get(i) + "\t\t  " + valores.get(1);
                }       
                lineasMsg.add(temp);
                i++;
            }
            Collections.sort(lineasMsg);
            Collections.reverse(lineasMsg);
            if (flag == 1){
                msg = "Cantidad por celda\tCantidad";
            }else if (flag == 2){
                msg = "Cantidad de verificaciones\tCantidad";
            }else if (flag == 3){
                msg = "Cantidad de errores\tCantidad";
            }else if (flag == 4){
                msg = "Cantidad sugerencias\tCantidad";
            }else if (flag == 5){
                msg = "Tipo de finalización\tCantidad";
            }else{
                msg = "Tiempo\t\tCantidad";
            }
            
            for (String linea : lineasMsg){
                msg += linea;
            }
        }
        jLabelTotal.setText(Integer.toString(total));
        jTextAreaMostrar.setText(msg);
    }
}