package juego;


import controlador.Objeto;
import java.awt.event.KeyEvent;
import controlador.Controles;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author rubee
 */
public class Pantalla extends javax.swing.JFrame {
    
        Objeto objeto2;
        int alturaInicial;
        int alturaDespues;
    /**
     * Creates new form Pantalla
     */
    public Pantalla() {        
        initComponents();
        jPanel1.setFocusable(true);
        this.alturaDespues = personaje.getY() - 120;
        this.alturaInicial = personaje.getY();
        objeto2 = new Objeto();
        objeto2.moverObjeto(objeto, jPanel1, personaje, puntos);       
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        personaje = new javax.swing.JLabel();
        pepito = new javax.swing.JLabel();
        objeto = new javax.swing.JLabel();
        nada = new javax.swing.JLabel();
        puntos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel1KeyReleased(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klipartz.com (1).png"))); // NOI18N
        personaje.setAlignmentY(0.2F);
        personaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                personajeKeyPressed(evt);
            }
        });
        jPanel1.add(personaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 180, 170));

        pepito.setBackground(new java.awt.Color(204, 0, 0));
        pepito.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        pepito.setForeground(new java.awt.Color(255, 51, 102));
        pepito.setText("PEPITO");
        jPanel1.add(pepito, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 90, -1));

        objeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klipartz.com (2).png"))); // NOI18N
        objeto.setMaximumSize(new java.awt.Dimension(60, 60));
        objeto.setMinimumSize(new java.awt.Dimension(60, 60));
        jPanel1.add(objeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 90, 130));

        nada.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        nada.setForeground(new java.awt.Color(255, 102, 102));
        nada.setText("PUNTOS:");
        jPanel1.add(nada, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 180, 60));

        puntos.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        puntos.setForeground(new java.awt.Color(255, 102, 102));
        puntos.setText("0");
        jPanel1.add(puntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 150, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/depositphotos_114799064-stock-illustration-game-background-2d-application-vector.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personajeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_personajeKeyPressed

    }//GEN-LAST:event_personajeKeyPressed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
              Controles controles = new Controles();
              
              controles.moverPersonaje(personaje, pepito, evt);
              
    }//GEN-LAST:event_jPanel1KeyPressed

    private void jPanel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel1KeyReleased
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nada;
    private javax.swing.JLabel objeto;
    private javax.swing.JLabel pepito;
    private javax.swing.JLabel personaje;
    private javax.swing.JLabel puntos;
    // End of variables declaration//GEN-END:variables
}
