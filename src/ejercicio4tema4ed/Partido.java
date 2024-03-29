/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4tema4ed;

/**
 *
 * @author Antonio
 */
public class Partido extends javax.swing.JFrame {

    private Quiniela q;
    /**
     * Creates new form Partido
     */
    public Partido() {
        initComponents();
    }
    
    public Partido(Quiniela q) {
        initComponents();
        setTitle("Agregar nuevo partido");
        this.setLocationRelativeTo(null);
        this.q=q;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPrincipal = new javax.swing.JPanel();
        lPartido1 = new javax.swing.JLabel();
        tPartido = new javax.swing.JTextField();
        bAceptar = new javax.swing.JButton();
        lAdvertencia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pPrincipal.setLayout(new java.awt.BorderLayout());

        lPartido1.setText("Partido:");
        pPrincipal.add(lPartido1, java.awt.BorderLayout.WEST);
        pPrincipal.add(tPartido, java.awt.BorderLayout.CENTER);

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });
        pPrincipal.add(bAceptar, java.awt.BorderLayout.EAST);

        lAdvertencia.setText("Advertencia: ventana de subprograma");
        pPrincipal.add(lAdvertencia, java.awt.BorderLayout.SOUTH);

        getContentPane().add(pPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
       String nombre=tPartido.getText();
        q.agregarPartido(nombre);
        tPartido.setText("");
    }//GEN-LAST:event_bAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Partido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Partido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Partido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Partido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Partido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JLabel lAdvertencia;
    private javax.swing.JLabel lPartido1;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JTextField tPartido;
    // End of variables declaration//GEN-END:variables
}
