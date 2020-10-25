/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alejandro_e3_layouts;

import javax.swing.JFrame;

/**
 *
 * @author Alejandro Campos Maestre
 */
public class alejandro_e3_layouts extends javax.swing.JFrame
{

    /**
     * Creates new form alejandro_e3_layouts
     */
    public alejandro_e3_layouts()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        panelPrincipal = new javax.swing.JPanel();
        panelSuperior = new javax.swing.JPanel();
        jLabelFiestas = new javax.swing.JLabel();
        btnLunes = new javax.swing.JButton();
        btnMartes = new javax.swing.JButton();
        btnMiercoles = new javax.swing.JButton();
        panelCentral = new javax.swing.JPanel();
        panel0 = new javax.swing.JPanel();
        jlPanel0 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        jlPanel1 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        jlPanel2 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        jlPanel3 = new javax.swing.JLabel();
        panelInferior = new javax.swing.JPanel();
        btnRestaurar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSuperior.setBackground(new java.awt.Color(102, 102, 102));
        panelSuperior.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(76, 102, 6)));
        panelSuperior.setLayout(new java.awt.GridLayout(1, 0));

        jLabelFiestas.setText("Programa Fiestas");
        panelSuperior.add(jLabelFiestas);

        btnLunes.setText("Lunes");
        btnLunes.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLunesActionPerformed(evt);
            }
        });
        panelSuperior.add(btnLunes);

        btnMartes.setText("Martes");
        btnMartes.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMartesActionPerformed(evt);
            }
        });
        panelSuperior.add(btnMartes);

        btnMiercoles.setText("Miércoles");
        btnMiercoles.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMiercolesActionPerformed(evt);
            }
        });
        panelSuperior.add(btnMiercoles);

        panelPrincipal.add(panelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 580, -1));

        panelCentral.setLayout(new java.awt.CardLayout());

        panel0.setBackground(new java.awt.Color(6, 28, 102));
        panel0.setAlignmentX(0.5F);
        panel0.setAlignmentY(0.5F);
        panel0.setLayout(new javax.swing.BoxLayout(panel0, javax.swing.BoxLayout.LINE_AXIS));

        jlPanel0.setText("Pulsa sobre los botones para ver la programación de las actividades para ese día");
        panel0.add(jlPanel0);

        panelCentral.add(panel0, "card2");

        panel1.setBackground(new java.awt.Color(102, 0, 153));
        panel1.setLayout(new javax.swing.BoxLayout(panel1, javax.swing.BoxLayout.LINE_AXIS));

        jlPanel1.setText("Eventos del lunes");
        panel1.add(jlPanel1);

        panelCentral.add(panel1, "card3");

        panel2.setBackground(new java.awt.Color(51, 102, 0));
        panel2.setLayout(new javax.swing.BoxLayout(panel2, javax.swing.BoxLayout.LINE_AXIS));

        jlPanel2.setText("Eventos del martes");
        panel2.add(jlPanel2);

        panelCentral.add(panel2, "card4");

        panel3.setBackground(new java.awt.Color(0, 102, 102));
        panel3.setLayout(new javax.swing.BoxLayout(panel3, javax.swing.BoxLayout.LINE_AXIS));

        jlPanel3.setText("Eventos del miercoles");
        panel3.add(jlPanel3);

        panelCentral.add(panel3, "card5");

        panelPrincipal.add(panelCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 46, 580, 160));

        panelInferior.setBackground(new java.awt.Color(102, 73, 6));
        panelInferior.setLayout(new java.awt.BorderLayout());

        btnRestaurar.setText("Restaurar aplicacion");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRestaurarActionPerformed(evt);
            }
        });
        panelInferior.add(btnRestaurar, java.awt.BorderLayout.CENTER);

        btnSalir.setText("Salir de la aplicacion");
        btnSalir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSalirActionPerformed(evt);
            }
        });
        panelInferior.add(btnSalir, java.awt.BorderLayout.PAGE_START);

        panelPrincipal.add(panelInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 213, 580, -1));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLunesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLunesActionPerformed
    {//GEN-HEADEREND:event_btnLunesActionPerformed
        desactivacionBoton(btnLunes);
        this.panel0.setVisible(false);
        this.panel1.setVisible(true);
    }//GEN-LAST:event_btnLunesActionPerformed

    private void btnMartesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMartesActionPerformed
    {//GEN-HEADEREND:event_btnMartesActionPerformed
        desactivacionBoton(btnMartes);
        this.panel0.setVisible(false);
        this.panel1.setVisible(false);
        this.panel2.setVisible(true);
    }//GEN-LAST:event_btnMartesActionPerformed

    private void btnMiercolesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMiercolesActionPerformed
    {//GEN-HEADEREND:event_btnMiercolesActionPerformed
        desactivacionBoton(btnMiercoles);
        this.panel0.setVisible(false);
        this.panel1.setVisible(false);
        this.panel2.setVisible(false);
        this.panel3.setVisible(true);
    }//GEN-LAST:event_btnMiercolesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalirActionPerformed
    {//GEN-HEADEREND:event_btnSalirActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRestaurarActionPerformed
    {//GEN-HEADEREND:event_btnRestaurarActionPerformed
        restaurarAplicacion();
        this.panel0.setVisible(true);
    }//GEN-LAST:event_btnRestaurarActionPerformed

    //Metodos Personales
    private void desactivacionBoton(javax.swing.JButton botonPulsado)
    {
        btnLunes.setEnabled(true);
        btnMartes.setEnabled(true);
        btnMiercoles.setEnabled(true);
        
        botonPulsado.setEnabled(false);
    }
    
    private void restaurarAplicacion()
    {
        btnLunes.setEnabled(true);
        btnMartes.setEnabled(true);
        btnMiercoles.setEnabled(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(alejandro_e3_layouts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(alejandro_e3_layouts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(alejandro_e3_layouts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(alejandro_e3_layouts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new alejandro_e3_layouts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLunes;
    private javax.swing.JButton btnMartes;
    private javax.swing.JButton btnMiercoles;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabelFiestas;
    private javax.swing.JLabel jlPanel0;
    private javax.swing.JLabel jlPanel1;
    private javax.swing.JLabel jlPanel2;
    private javax.swing.JLabel jlPanel3;
    private javax.swing.JPanel panel0;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSuperior;
    // End of variables declaration//GEN-END:variables
}
