package vistas;

import java.awt.Color;
import java.util.LinkedList;
import modelos.procesos;
import logica.timeout;

public class panel extends javax.swing.JFrame {
    int numero_vehiculo= 1;
    String id_caso="";
    LinkedList vehiculos_estacionamiento =  new LinkedList();
    int cajones;
    Double tiempo_salir;
    procesos operaciones = new procesos();
    timeout timer = new timeout();
            
    
    public panel() {
        initComponents();
        cajones_disponibles.setBackground(Color.green);
        cajones_disponibles.setText(String.valueOf(cajones));
    }
    
    
    
    public void ponerDatos(String cajones,Double tiempo_salir,String id_c){
        this.cajones = Integer.parseInt(cajones);
        this.cajones_disponibles.setText(cajones);
        this.tiempo_salir = tiempo_salir;
        this.id_caso = id_c;
        System.out.println(tiempo_salir);
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cajones_disponibles = new javax.swing.JTextField();
        tiempo_liberarse = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        b_entrada = new javax.swing.JButton();
        b_salida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        cajones_disponibles.setEditable(false);
        cajones_disponibles.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajones_disponibles.setText("0");

        tiempo_liberarse.setEditable(false);
        tiempo_liberarse.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tiempo_liberarse.setText("00:00");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel1.setText("Cajones disponibles");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tiempo para liberarse un espacio");

        b_entrada.setBackground(new java.awt.Color(254, 254, 254));
        b_entrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/entrada.png"))); // NOI18N
        b_entrada.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        b_entrada.setBorderPainted(false);
        b_entrada.setMaximumSize(new java.awt.Dimension(110, 94));
        b_entrada.setMinimumSize(new java.awt.Dimension(110, 94));
        b_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_entradaActionPerformed(evt);
            }
        });

        b_salida.setBackground(new java.awt.Color(254, 254, 254));
        b_salida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/salida.png"))); // NOI18N
        b_salida.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        b_salida.setBorderPainted(false);
        b_salida.setEnabled(false);
        b_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_salidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(cajones_disponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(71, 71, 71))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(b_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(b_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tiempo_liberarse, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(cajones_disponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b_entrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tiempo_liberarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_entradaActionPerformed
        int espacios = Integer.parseInt(cajones_disponibles.getText());
        espacios-=1;
        Double segundos_salida= tiempo_salir*60;
        
        cajones_disponibles.setText(String.valueOf(espacios));
        String vehiculo = "vehiculo "+numero_vehiculo;
        vehiculos_estacionamiento.offer(vehiculo);
        
        operaciones.entradaVehiculo(vehiculo,id_caso);
        numero_vehiculo++;
        
       
        if(espacios == 0){
            cajones_disponibles.setBackground(Color.red);
            b_entrada.setEnabled(false);
            String tiempo_entrada = operaciones.tiempoEntradaVehiculo(id_caso);
            System.out.println(tiempo_entrada);
            String tiempo = operaciones.pasarSegundosTiempo(String.valueOf(segundos_salida));
            //System.out.println(tiempo);
            
            String tiempo_liberarse_espacio = operaciones.tiempoLiberarseEspacio(tiempo_entrada,tiempo);
            //System.out.println(tiempo_liberarse_espacio);
            tiempo_liberarse.setText(tiempo_liberarse_espacio);
            
            String [] datos = operaciones.extraerTiempo(tiempo_liberarse_espacio);
            String hora = datos[0];
            String minuto = datos[1];
            String segundo = datos[2];
            
            timer.ponerDatos(hora, minuto, segundo);
            timer.start(0, 1000);
            
            
            //sacarTiempoEspera();
        }
        
        if(espacios!=cajones){
            b_salida.setEnabled(true);
        }
    }//GEN-LAST:event_b_entradaActionPerformed

    private void b_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_salidaActionPerformed
        //timer.detener();
        
        int espacios = Integer.parseInt(cajones_disponibles.getText());
        espacios+=1;
        cajones_disponibles.setText(String.valueOf(espacios));
        String vehiculo = String.valueOf(vehiculos_estacionamiento.poll());
        
        operaciones.salidaVehiculo(vehiculo, id_caso);
        
        if(espacios > 0){
            b_entrada.setEnabled(true);
            cajones_disponibles.setBackground(Color.green);
        }
        
        if(espacios==cajones){
            b_salida.setEnabled(false);
        }
        
    }//GEN-LAST:event_b_salidaActionPerformed

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
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_entrada;
    private javax.swing.JButton b_salida;
    private javax.swing.JTextField cajones_disponibles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tiempo_liberarse;
    // End of variables declaration//GEN-END:variables
}
