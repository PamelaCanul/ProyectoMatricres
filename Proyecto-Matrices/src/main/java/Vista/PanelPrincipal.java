/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Pamela
 */
public class PanelPrincipal extends javax.swing.JPanel implements ActionListener {

    PanelSumar panelSumar = new PanelSumar();
    PanelMultEscalar panelMultEscalar = new PanelMultEscalar(); 
    PanelMultiplicar panelMultiplicar = new PanelMultiplicar(); 
    PanelObtenerInv panelObtenerInv = new PanelObtenerInv();
    PanelSolucionarEcuacion panelSolucionarEcuacion = new PanelSolucionarEcuacion();
    PanelDeterminante panelDeterminante = new PanelDeterminante(); 
    PanelCramer panelCramer = new PanelCramer();
    
    /**
     * Creates new form PanelPrincipal
     */
    public PanelPrincipal() {
        initComponents();
        
        contenedor.add(panelSumar);
        panelSumar.setVisible(true);
        panelMultEscalar.setVisible(false);
        panelMultiplicar.setVisible(false);
        panelObtenerInv.setVisible(false);
        panelSolucionarEcuacion.setVisible(false);
        panelDeterminante.setVisible(false);
        panelCramer.setVisible(false);
        
        deshabilitarBotones();
        
        btnSumarMatrices.addActionListener(this);
        btnMultiplicarEscalar.addActionListener(this);
        btnMultiplicarMatrices.addActionListener(this);
        btnObtenerInversa.addActionListener(this);
        btnSolucionarSistemaDeEcuaciones.addActionListener(this);
        btnObtenerDeterminante.addActionListener(this);
        btnSolucionarSistemaPorCramer.addActionListener(this);
    }
    
    public void deshabilitarBotones(){
        if(panelSumar.isVisible()){
            btnSumarMatrices.setEnabled(false);
            btnMultiplicarEscalar.setEnabled(true);
            btnMultiplicarMatrices.setEnabled(true);
            btnObtenerInversa.setEnabled(true);
            btnSolucionarSistemaDeEcuaciones.setEnabled(true);
            btnObtenerDeterminante.setEnabled(true);
            btnSolucionarSistemaPorCramer.setEnabled(true);
        }else if(panelMultEscalar.isVisible()){
            btnSumarMatrices.setEnabled(true);
            btnMultiplicarEscalar.setEnabled(false);
            btnMultiplicarMatrices.setEnabled(true);
            btnObtenerInversa.setEnabled(true);
            btnSolucionarSistemaDeEcuaciones.setEnabled(true);
            btnObtenerDeterminante.setEnabled(true);
            btnSolucionarSistemaPorCramer.setEnabled(true);
        } else if (panelMultiplicar.isVisible()){
            btnSumarMatrices.setEnabled(true);
            btnMultiplicarEscalar.setEnabled(true);
            btnMultiplicarMatrices.setEnabled(false);
            btnObtenerInversa.setEnabled(true);
            btnSolucionarSistemaDeEcuaciones.setEnabled(true);
            btnObtenerDeterminante.setEnabled(true);
            btnSolucionarSistemaPorCramer.setEnabled(true);
        }else if (panelObtenerInv.isVisible()){
            btnSumarMatrices.setEnabled(true);
            btnMultiplicarEscalar.setEnabled(true);
            btnMultiplicarMatrices.setEnabled(true);
            btnObtenerInversa.setEnabled(false);
            btnSolucionarSistemaDeEcuaciones.setEnabled(true);
            btnObtenerDeterminante.setEnabled(true);
            btnSolucionarSistemaPorCramer.setEnabled(true);
        } else if (panelSolucionarEcuacion.isVisible()){
            btnSumarMatrices.setEnabled(true);
            btnMultiplicarEscalar.setEnabled(true);
            btnMultiplicarMatrices.setEnabled(true);
            btnObtenerInversa.setEnabled(true);
            btnSolucionarSistemaDeEcuaciones.setEnabled(false);
            btnObtenerDeterminante.setEnabled(true);
            btnSolucionarSistemaPorCramer.setEnabled(true);
        } else if (panelDeterminante.isVisible()){
            btnSumarMatrices.setEnabled(true);
            btnMultiplicarEscalar.setEnabled(true);
            btnMultiplicarMatrices.setEnabled(true);
            btnObtenerInversa.setEnabled(true);
            btnSolucionarSistemaDeEcuaciones.setEnabled(true);
            btnObtenerDeterminante.setEnabled(false);
            btnSolucionarSistemaPorCramer.setEnabled(true);
        }else if (panelCramer.isVisible()){
            btnSumarMatrices.setEnabled(true);
            btnMultiplicarEscalar.setEnabled(true);
            btnMultiplicarMatrices.setEnabled(true);
            btnObtenerInversa.setEnabled(true);
            btnSolucionarSistemaDeEcuaciones.setEnabled(true);
            btnObtenerDeterminante.setEnabled(true);
            btnSolucionarSistemaPorCramer.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnSumarMatrices = new javax.swing.JButton();
        btnMultiplicarEscalar = new javax.swing.JButton();
        btnMultiplicarMatrices = new javax.swing.JButton();
        btnObtenerInversa = new javax.swing.JButton();
        btnSolucionarSistemaDeEcuaciones = new javax.swing.JButton();
        btnObtenerDeterminante = new javax.swing.JButton();
        btnSolucionarSistemaPorCramer = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        contenedor.setLayout(new java.awt.BorderLayout());

        btnSumarMatrices.setText("Suma de matrices");

        btnMultiplicarEscalar.setText("Multiplicar por escalar");

        btnMultiplicarMatrices.setText("Multiplicar matrices");

        btnObtenerInversa.setText("Obtener inversa por Gauss-Jordan");

        btnSolucionarSistemaDeEcuaciones.setText("Solución de un sistema de ecuaciones por Gauss-Jordan");

        btnObtenerDeterminante.setText("Determinante de una matriz");

        btnSolucionarSistemaPorCramer.setText("Solucion de un sistema de ecuaciones por Cramer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSumarMatrices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnMultiplicarEscalar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMultiplicarMatrices, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnObtenerDeterminante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSolucionarSistemaDeEcuaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnObtenerInversa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSolucionarSistemaPorCramer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnSumarMatrices)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMultiplicarEscalar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMultiplicarMatrices)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnObtenerInversa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSolucionarSistemaDeEcuaciones)
                .addGap(18, 18, 18)
                .addComponent(btnObtenerDeterminante)
                .addGap(18, 18, 18)
                .addComponent(btnSolucionarSistemaPorCramer)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        contenedor.add(jPanel1, java.awt.BorderLayout.LINE_START);

        add(contenedor, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * @param args 
     */
    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                new PanelPrincipal().setVisible(false);
            }
        
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMultiplicarEscalar;
    private javax.swing.JButton btnMultiplicarMatrices;
    private javax.swing.JButton btnObtenerDeterminante;
    private javax.swing.JButton btnObtenerInversa;
    private javax.swing.JButton btnSolucionarSistemaDeEcuaciones;
    private javax.swing.JButton btnSolucionarSistemaPorCramer;
    private javax.swing.JButton btnSumarMatrices;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();
        
        if(evt.equals(btnSumarMatrices)){
            panelSumar.setVisible(true);
            panelMultEscalar.setVisible(false);
            panelMultiplicar.setVisible(false);
            panelObtenerInv.setVisible(false);
            panelSolucionarEcuacion.setVisible(false);
            panelDeterminante.setVisible(false);
            panelCramer.setVisible(false);
            
            contenedor.add(panelSumar);
            
            contenedor.validate();
            
            deshabilitarBotones();
            
        } else if(evt.equals(btnMultiplicarEscalar)){
            panelSumar.setVisible(false);
            panelMultEscalar.setVisible(true);
            panelMultiplicar.setVisible(false);
            panelObtenerInv.setVisible(false);
            panelSolucionarEcuacion.setVisible(false);
            panelDeterminante.setVisible(false);
            panelCramer.setVisible(false);
            
            contenedor.add(panelMultEscalar);
            
            contenedor.validate();
            
            deshabilitarBotones();
        } else if (evt.equals(btnMultiplicarMatrices)){
            panelSumar.setVisible(false);
            panelMultEscalar.setVisible(false);
            panelMultiplicar.setVisible(true);
            panelObtenerInv.setVisible(false);
            panelSolucionarEcuacion.setVisible(false);
            panelDeterminante.setVisible(false);
            panelCramer.setVisible(false);
            
            contenedor.add(panelMultiplicar);
            
            contenedor.validate();
            
            deshabilitarBotones();
        } else if (evt.equals(btnObtenerInversa)){
            panelSumar.setVisible(false);
            panelMultEscalar.setVisible(false);
            panelMultiplicar.setVisible(false);
            panelObtenerInv.setVisible(true);
            panelSolucionarEcuacion.setVisible(false);
            panelDeterminante.setVisible(false);
            panelCramer.setVisible(false);
            
            contenedor.add(panelObtenerInv);
            
            contenedor.validate();
            
            deshabilitarBotones();
        } else if (evt.equals(btnSolucionarSistemaDeEcuaciones)){
            panelSumar.setVisible(false);
            panelMultEscalar.setVisible(false);
            panelMultiplicar.setVisible(false);
            panelObtenerInv.setVisible(false);
            panelSolucionarEcuacion.setVisible(true);
            panelDeterminante.setVisible(false);
            panelCramer.setVisible(false);
            
            contenedor.add(panelSolucionarEcuacion);
            
            contenedor.validate();
            
            deshabilitarBotones();
        }else if (evt.equals(btnObtenerDeterminante)){
            panelSumar.setVisible(false);
            panelMultEscalar.setVisible(false);
            panelMultiplicar.setVisible(false);
            panelObtenerInv.setVisible(false);
            panelSolucionarEcuacion.setVisible(false);
            panelDeterminante.setVisible(true);
            panelCramer.setVisible(false);
            
            contenedor.add(panelDeterminante);
            
            contenedor.validate();
            
            deshabilitarBotones();
        } else if (evt.equals(btnSolucionarSistemaPorCramer)){
            panelSumar.setVisible(false);
            panelMultEscalar.setVisible(false);
            panelMultiplicar.setVisible(false);
            panelObtenerInv.setVisible(false);
            panelSolucionarEcuacion.setVisible(false);
            panelDeterminante.setVisible(false);
            panelCramer.setVisible(true);
            
            contenedor.add(panelCramer);
            
            contenedor.validate();
            
            deshabilitarBotones();
        }
    }
}
