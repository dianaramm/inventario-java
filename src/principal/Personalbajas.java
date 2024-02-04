//Autor: Diana Ramírez Ministro 
package principal;

import SQL.conexionSQL;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Personalbajas extends javax.swing.JFrame {

    conexionSQL conec = new conexionSQL();
    Connection con = conec.conectar();

//Iniciar componentes gráficos 
    public Personalbajas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablabajas = new javax.swing.JTable();
        txtbuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        botonsalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablareportes = new javax.swing.JTable();
        mostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("BAJAS PERSONAL");

        jLabel2.setText("No. de empleado ");

        tablabajas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "A. Paterno", "A. Materno", "Nivel A. ", "Puesto", "Depto", "Sucursal", "Sueldo"
            }
        ));
        jScrollPane1.setViewportView(tablabajas);

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/buscar.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/borrar.png"))); // NOI18N
        jButton2.setText("Eliminar ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        botonsalir.setBackground(new java.awt.Color(255, 255, 255));
        botonsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/Salir.png"))); // NOI18N
        botonsalir.setText("Salir ");
        botonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsalirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("REPORTE BAJAS ");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\DPO2_U3_A2_DIRM\\DPO2_U3_A2_DIRM\\src\\principal\\impresion.png")); // NOI18N
        jButton3.setText("Imprimir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tablareportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID empleado", "Nombre", "Apellido paterno", "Apellido materno", "Motivo"
            }
        ));
        jScrollPane2.setViewportView(tablareportes);

        mostrar.setBackground(new java.awt.Color(255, 255, 255));
        mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/mostrar.png"))); // NOI18N
        mostrar.setText("Mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(43, 43, 43)
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addContainerGap(417, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mostrar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(20, 20, 20))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(botonsalir)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento del botón salir 

    private void botonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsalirActionPerformed
        if (evt.getSource() == botonsalir) {
            dispose();
        }


    }//GEN-LAST:event_botonsalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        busqueda(txtbuscar.getText());


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        eliminar();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased

    }//GEN-LAST:event_txtbuscarKeyReleased

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        datoseliminados();
    }//GEN-LAST:event_mostrarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/ Reporte_bajas.pdf"));
            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/principal/reporteb.png");
            header.scaleToFit(600, 800);
            header.setAbsolutePosition(TOP_ALIGNMENT, 650);
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("\n\n\n\n\n\n\n\n\n\n\n\n Datos del personal. \n\n\n\n\n");
            parrafo.setFont(FontFactory.getFont("Tohama", 18, Font.BOLD, BaseColor.BLUE));
            documento.open();
            documento.add(header);
            documento.add(parrafo);

            PdfPTable tabla = new PdfPTable(5);
            tabla.setWidthPercentage(107);
            
            tabla.addCell("ID empleado");
            tabla.addCell("Nombre");
            tabla.addCell("A. Paterno");
            tabla.addCell("A. Materno");
            tabla.addCell("Motivo");

            String sql = "SELECT *FROM reportes";
            Statement set;

            try {
                set = con.createStatement();
                ResultSet resul = set.executeQuery(sql);

                if (resul.next()) {
                    do {
                        tabla.addCell(resul.getString(1));
                        tabla.addCell(resul.getString(2));
                        tabla.addCell(resul.getString(3));
                        tabla.addCell(resul.getString(4));
                        tabla.addCell(resul.getString(5));

                    } while (resul.next());
                    documento.add(tabla);
                }

            } catch (DocumentException e) {
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado");
        } catch (DocumentException | HeadlessException | FileNotFoundException | SQLException e) {

        } catch (IOException ex) {
            Logger.getLogger(Personalbajas.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    public void busqueda(String idempleo) {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Nombre");
        modelo.addColumn("A. Paterno");
        modelo.addColumn("A. Materno");
        modelo.addColumn("N. acádemico");
        modelo.addColumn("Puesto");
        modelo.addColumn("Depto");
        modelo.addColumn("Sucursal");
        modelo.addColumn("Sueldo");

        tablabajas.setModel(modelo);
        String sql = idempleo;

        if (idempleo.equals("")) {
            // JOptionPane.showMessageDialog(null, "ID no econtrado");

        } else {
            sql = "SELECT empleadoid, nombre, app, apm, nivelac, puesto, depto, sucursal, sueldo FROM personal WHERE empleadoid like '%" + idempleo + "%'";
        }
        String datos[] = new String[8];
        Statement set;

        try {
            set = con.createStatement();
            ResultSet resul = set.executeQuery(sql);
            while (resul.next()) {

                datos[0] = resul.getString(1);
                datos[1] = resul.getString(2);
                datos[2] = resul.getString(3);
                datos[3] = resul.getString(4);
                datos[4] = resul.getString(5);
                datos[5] = resul.getString(6);
                datos[6] = resul.getString(7);
                datos[7] = resul.getString(8);

                modelo.addRow(datos);
            }
            tablabajas.setModel(modelo);
        } catch (Exception e) {

        }
    }

    public void datoseliminados() {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID empleado");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido paterno");
        modelo.addColumn("Apellido materno");
        modelo.addColumn("Motivo");

        tablareportes.setModel(modelo);

        String sql = "SELECT idempleado, nombre, app, apm, motivo sueldo FROM reportes";
        String datos[] = new String[5];
        Statement set;

        try {
            set = con.createStatement();
            ResultSet resul = set.executeQuery(sql);
            while (resul.next()) {

                datos[0] = resul.getString(1);
                datos[1] = resul.getString(2);
                datos[2] = resul.getString(3);
                datos[3] = resul.getString(4);
                datos[4] = resul.getString(5);

                modelo.addRow(datos);
            }
            tablareportes.setModel(modelo);
        } catch (Exception e) {

        }

    }

    public void eliminar() {
        int fila = tablabajas.getSelectedRow();
        String idemple = tablabajas.getValueAt(fila, 0).toString();
        int n = JOptionPane.showConfirmDialog(null, "Si elimina el registro se perderá por completo ¿Desaea continuar?", "registro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (n == JOptionPane.YES_NO_OPTION) {

            try {
                //GUARDAR 
                PreparedStatement guardar = con.prepareStatement("INSERT INTO bdcomputadoras.reportes (idempleado, nombre, app, apm)SELECT empleadoid, nombre, app, apm FROM bdcomputadoras.personal WHERE empleadoid = '" + idemple + "'");
                //Elimimanos el registro
                PreparedStatement borrar = con.prepareStatement("Delete from personal where empleadoid = '" + idemple + "'");
                guardar.executeUpdate();
                borrar.executeUpdate();

                try {
                    String motivo;
                    motivo = JOptionPane.showInputDialog("Ingrese el motivo de baja ");

                    //Modificamos el registro
                    PreparedStatement motiv = con.prepareStatement("UPDATE reportes SET motivo = '" + motivo + "' WHERE idempleado = '" + idemple + "'");
                    motiv.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro eliminado con éxito");
                    busqueda("");
                } catch (SQLException ex) {
                    Logger.getLogger(Personalbajas.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Personalbajas.class.getName()).log(Level.SEVERE, null, ex);
            }

            txtbuscar.setText("");
        }
    }

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
            java.util.logging.Logger.getLogger(Personalbajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personalbajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personalbajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personalbajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personalbajas().setVisible(true);
            }
        });
    }

    //Componentes gráficos

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mostrar;
    private javax.swing.JTable tablabajas;
    private javax.swing.JTable tablareportes;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
