package gui;

import iconos.Implementacion;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class PantallaCarga extends javax.swing.JFrame {

    Implementacion escalar = new Implementacion();
    
    PantallaCarga() {
        initComponents();
        
        // Icono de Ventana
        setIconImage(new ImageIcon(getClass().getResource("/iconos/car.png")).getImage());
        
        // Imagenes
        escalar.escalarLabel(icoCar, "/iconos/car.png");
        
        Timer timer = new Timer(1500, e -> {
            // Cerrar la pantalla de carga
            this.dispose();
            
            // Aquí se ejecuta la clase Main o la siguiente ventana
            new Main().setVisible(true); // Cambia "Main" por la clase principal que deseas abrir
        });
        
        // Iniciar el temporizador
        timer.setRepeats(false); // Para que solo se ejecute una vez
        timer.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCreditos = new javax.swing.JLabel();
        lblParking = new javax.swing.JLabel();
        lblControl1 = new javax.swing.JLabel();
        icoCar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblCreditos.setBackground(new java.awt.Color(30, 30, 30));
        lblCreditos.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        lblCreditos.setForeground(new java.awt.Color(30, 30, 30));
        lblCreditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreditos.setText("@GitCats - 2024");

        lblParking.setFont(new java.awt.Font("Verdana", 1, 96)); // NOI18N
        lblParking.setForeground(new java.awt.Color(235, 205, 33));
        lblParking.setText("Parking");

        lblControl1.setFont(new java.awt.Font("Verdana", 1, 96)); // NOI18N
        lblControl1.setForeground(new java.awt.Color(243, 225, 122));
        lblControl1.setText("Control");

        icoCar.setPreferredSize(new java.awt.Dimension(117, 117));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCreditos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(lblControl1)
                .addGap(15, 15, 15)
                .addComponent(lblParking)
                .addGap(15, 15, 15)
                .addComponent(icoCar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(327, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblParking)
                        .addComponent(lblControl1))
                    .addComponent(icoCar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(272, 272, 272)
                .addComponent(lblCreditos)
                .addGap(45, 45, 45))
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
            java.util.logging.Logger.getLogger(PantallaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaCarga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icoCar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblControl1;
    private javax.swing.JLabel lblCreditos;
    private javax.swing.JLabel lblParking;
    // End of variables declaration//GEN-END:variables
}
