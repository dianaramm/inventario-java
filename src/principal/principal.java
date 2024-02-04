//Autor: Diana Ramírez Ministro

package principal;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class principal extends javax.swing.JFrame implements ActionListener {

    
    //Iniciar componentes 
    
    public principal() {
        initComponents();
        this.setLocationRelativeTo(null);

        altasmenu.addActionListener(this);
        bajasmenu.addActionListener(this);
   
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonsalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        altasmenu = new javax.swing.JMenuItem();
        bajasmenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contedor.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("COMPUTADORAS");

        botonsalir.setBackground(new java.awt.Color(255, 255, 255));
        botonsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/Salir.png"))); // NOI18N
        botonsalir.setText("Salir ");
        botonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsalirActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/1.png"))); // NOI18N

        javax.swing.GroupLayout contedorLayout = new javax.swing.GroupLayout(contedor);
        contedor.setLayout(contedorLayout);
        contedorLayout.setHorizontalGroup(
            contedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contedorLayout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contedorLayout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addGroup(contedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contedorLayout.createSequentialGroup()
                        .addComponent(botonsalir)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contedorLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(259, 259, 259))))
        );
        contedorLayout.setVerticalGroup(
            contedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contedorLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(botonsalir)
                .addContainerGap())
        );

        jMenu1.setText("Personal");

        altasmenu.setText("Altas");
        altasmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altasmenuActionPerformed(evt);
            }
        });
        jMenu1.add(altasmenu);

        bajasmenu.setText("Bajas");
        jMenu1.add(bajasmenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altasmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altasmenuActionPerformed

    }//GEN-LAST:event_altasmenuActionPerformed

    private void botonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsalirActionPerformed
        dispose(); 
    }//GEN-LAST:event_botonsalirActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }


//Compoentes gráficos
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem altasmenu;
    private javax.swing.JMenuItem bajasmenu;
    private javax.swing.JButton botonsalir;
    private javax.swing.JPanel contedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    
    
    //Eventos del menú 
    
    @Override
    public void actionPerformed(ActionEvent e) {

        Container evento = this.getContentPane();
        if (e.getSource() == botonsalir) {
            dispose();
        }
        if (e.getSource() == bajasmenu) {
            Personalbajas v2 = new Personalbajas();  //método para mostrar ventana
            v2.setVisible(true); //mostrar visible la ventana   
        }
        
        if (e.getSource() == altasmenu) {
            personalaltas v2 = new personalaltas();  //método para mostrar ventana 
            v2.setVisible(true); //mostrar visible la ventana      
        }
        
        
        
    }
}
