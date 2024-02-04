//Autor: Diana Ramírez Ministro
package principal;

//Librerías 
import SQL.conexionSQL;
import com.itextpdf.text.BaseColor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
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
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


import javax.swing.table.DefaultTableModel;

public class personalaltas extends javax.swing.JFrame {

    //Conectamos la base de datos
    conexionSQL conec = new conexionSQL();
    Connection con = conec.conectar();


    //iniciar componentes 
    public personalaltas() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jid = new javax.swing.JTextField();
        jnombre = new javax.swing.JTextField();
        jpaterno = new javax.swing.JTextField();
        jmaterno = new javax.swing.JTextField();
        jpuesto = new javax.swing.JTextField();
        jfecha = new javax.swing.JTextField();
        jdep = new javax.swing.JTextField();
        jsucursal = new javax.swing.JTextField();
        jcurp = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        botonsalir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jnivel = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jsueldo = new javax.swing.JTextField();
        imprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaempleados = new javax.swing.JTable();
        mostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("ALTAS PERSONAL");

        jLabel2.setText("No. de empleado ");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido paterno ");

        jLabel5.setText("Apellido materno ");

        jLabel6.setText("CURP");

        jLabel7.setText("Fecha de ingeso");

        jLabel8.setText("Departamento");

        jLabel9.setText("Puesto");

        jLabel10.setText("Sucursal ");

        jpaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpaternoActionPerformed(evt);
            }
        });

        jmaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmaternoActionPerformed(evt);
            }
        });

        jfecha.setText("2022-01-01");
        jfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfechaActionPerformed(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(255, 255, 255));
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/guardar.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        botonsalir.setBackground(new java.awt.Color(255, 255, 255));
        botonsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/Regresar.png"))); // NOI18N
        botonsalir.setText("Salir");
        botonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsalirActionPerformed(evt);
            }
        });

        jLabel11.setText("Nivel acádemico");

        jnivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnivelActionPerformed(evt);
            }
        });

        jLabel12.setText("Sueldo ");

        jsueldo.setText("0.0");

        imprimir.setBackground(new java.awt.Color(255, 255, 255));
        imprimir.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\DIANA\\Netbeans\\prueba\\src\\principal\\impresion.png")); // NOI18N
        imprimir.setText("IMPRIMIR");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });

        tablaempleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N.empleado", "Nombre", "A. paterno", "A. meterno", "CURP", "N. acédmico", "Puesto", "Fecha", "Depto", "Sucursal", "Sueldo"
            }
        ));
        jScrollPane1.setViewportView(tablaempleados);
        if (tablaempleados.getColumnModel().getColumnCount() > 0) {
            tablaempleados.getColumnModel().getColumn(9).setResizable(false);
        }

        mostrar.setBackground(new java.awt.Color(255, 255, 255));
        mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/mostrar.png"))); // NOI18N
        mostrar.setText("Mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(guardar)
                .addGap(132, 132, 132)
                .addComponent(mostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imprimir)
                .addGap(154, 154, 154))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jid, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(36, 36, 36)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel12))
                                            .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(67, 67, 67)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(57, 57, 57)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcurp, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel8))
                                        .addGap(18, 18, 18)
                                        .addComponent(jdep, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jnivel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jpaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jmaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(jpuesto)
                                    .addComponent(jsucursal)))
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(botonsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jpaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jcurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jnivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jdep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jsucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(imprimir)
                    .addComponent(mostrar))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(botonsalir)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmaternoActionPerformed

    private void botonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsalirActionPerformed
        if (evt.getSource() == botonsalir) {
            dispose();
        }
    }//GEN-LAST:event_botonsalirActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

    guardar(); 
    limpiarcajas(); 

   
    }//GEN-LAST:event_guardarActionPerformed

    private void jnivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnivelActionPerformed

    private void jpaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpaternoActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        mostrar();
    }//GEN-LAST:event_mostrarActionPerformed

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed

//Código para imprimir 
        Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/ Reporte_altas.pdf"));
            com.itextpdf.text.Image header = com.itextpdf.text.Image.getInstance("src/principal/reportea.png");
            header.scaleToFit(600, 800);
            header.setAbsolutePosition(TOP_ALIGNMENT, 650);
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("\n\n\n\n\n\n\n\n\n\n\n\n Datos del personal. \n\n\n\n\n");
            parrafo.setFont(FontFactory.getFont("Tohama", 18, Font.BOLD, BaseColor.BLUE));
            documento.open();
            documento.add(header);
            documento.add(parrafo);
            PdfPTable tabla = new PdfPTable(11);

            tabla.setWidthPercentage(107); 
  
            tabla.addCell("ID ");
            tabla.addCell("Nombre");
            tabla.addCell("Apellido paterno");
            tabla.addCell("Apellido materno.");
            tabla.addCell("CURP");
            tabla.addCell("Nivel acádemico");
            tabla.addCell("Puesto");
            tabla.addCell("Fecha");
            tabla.addCell("Depto");
            tabla.addCell("Sucursal");
            tabla.addCell("Sueldo");

            String sql = "SELECT *FROM personal";
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
                        tabla.addCell(resul.getString(6));
                        tabla.addCell(resul.getString(7));
                        tabla.addCell(resul.getString(8));
                        tabla.addCell(resul.getString(9));
                        tabla.addCell(resul.getString(10));
                        tabla.addCell(resul.getString(11));

                    } while (resul.next());
                    documento.add(tabla);

                }

            } catch (DocumentException e) {
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado");
        } catch (DocumentException | HeadlessException | FileNotFoundException | SQLException e) {

        } catch (IOException ex) {
            Logger.getLogger(personalaltas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_imprimirActionPerformed

    private void jfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfechaActionPerformed

    public void mostrar() {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("ID empleado");
        modelo.addColumn("Nombre");
        modelo.addColumn("A. Paterno");
        modelo.addColumn("A. Materno");
        modelo.addColumn("CURP");
        modelo.addColumn("N. acádemico");
        modelo.addColumn("Puesto");
        modelo.addColumn("Fecha");
        modelo.addColumn("Depto");
        modelo.addColumn("Sucursal");
        modelo.addColumn("Sueldo");

        tablaempleados.setModel(modelo);
        String sql = "SELECT *FROM personal";
        String datos[] = new String[11];
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
                datos[8] = resul.getString(9);
                datos[9] = resul.getString(10);
                datos[10] = resul.getString(11);

                modelo.addRow(datos);
            }
            tablaempleados.setModel(modelo);
        } catch (SQLException e) {
        }
    }
    
    
    public void guardar(){
        
       String i = jid.getText();
       String  n = jnombre.getText();
       String p = jpaterno.getText();
       String m = jmaterno.getText();
       String c = jcurp.getText();
       String nc = jnivel.getText();
       String ps = jpuesto.getText();
       String f = jfecha.getText();
       String d = jdep.getText();
       String sc = jsucursal.getText();
       String sl = jsueldo.getText();
       
       String sql = "Insert into personal() VALUES (?,?,?,?,?,?,?,?,?,?,?)"; 
       
try{
    //método para identificar si el ID existe en la base de datos 
    Statement set = con.createStatement(); 
    ResultSet  resultado = set.executeQuery("Select * from personal WHERE empleadoid like '"+i+"' "); 
    if (resultado.next()) {
        getToolkit().beep(); 
        JOptionPane.showMessageDialog(null,"Error, el ID ya existe, vuelve a intentarlo");
       jid.requestFocus();  
    } else if (jid.getText().isEmpty()){
        getToolkit().beep(); 
        JOptionPane.showMessageDialog(null,"Error, el ID es obligatorio");
       jid.requestFocus();
    } else {
       PreparedStatement almacenar = con.prepareStatement(sql); 
       almacenar.setString(1, i);
       almacenar.setString(2, n);
       almacenar.setString(3, p);
       almacenar.setString(4, m);
       almacenar.setString(5, c);
       almacenar.setString(6, nc);
       almacenar.setString(7, ps);
       almacenar.setString(8, f);
       almacenar.setString(9, d);
       almacenar.setString(10, sc);
       almacenar.setString(11, sl);
       almacenar.execute(); 
        JOptionPane.showMessageDialog(null,"Datos guardados con éxito");
    }
}   catch(SQLException ex){
    
}     
    }

    public void limpiarcajas() {

        jid.setText("");
        jnombre.setText("");
        jpaterno.setText("");
        jmaterno.setText("");
        jcurp.setText("");
        jnivel.setText("");
        jpuesto.setText("");
        jfecha.setText("");
        jdep.setText("");
        jsucursal.setText("");
        jsueldo.setText("");

    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(personalaltas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new personalaltas().setVisible(true);
        });
    }

    //Componentes gráficos 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonsalir;
    private javax.swing.JButton guardar;
    private javax.swing.JButton imprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jcurp;
    private javax.swing.JTextField jdep;
    private javax.swing.JTextField jfecha;
    private javax.swing.JTextField jid;
    private javax.swing.JTextField jmaterno;
    private javax.swing.JTextField jnivel;
    private javax.swing.JTextField jnombre;
    private javax.swing.JTextField jpaterno;
    private javax.swing.JTextField jpuesto;
    private javax.swing.JTextField jsucursal;
    private javax.swing.JTextField jsueldo;
    private javax.swing.JButton mostrar;
    private javax.swing.JTable tablaempleados;
    // End of variables declaration//GEN-END:variables
}
