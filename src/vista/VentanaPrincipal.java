/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ControladorBingo;

/**
 *
 * @author isaac
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private controlador.ControladorBingo controlador;
    private vista.PanelResultado panelResultado;
    private vista.PanelTablero panelTablero;
    private vista.PanelCartones panelCartones;
    // Variables de los paneles a insertar
  // Variables de los paneles a insertar
private vista.PanelCartones panelCartones;
private vista.PanelTablero panelTablero;
private vista.PanelResultado panelResultado;
    public VentanaPrincipal() {
        initComponents();
        inicializarPaneles();
        configurarMenuTema();
      aplicarTema(true);
        configurarEventosControlador();
        controlador = new controlador.ControladorBingo(this);
        // Inicializar el controlador después de inicializar los paneles
    }
    private void configurarEventosControlador() {
        // Configurar eventos que llaman a los métodos del controlador
        botonCrear.addActionListener(e -> controlador.crearNuevoCarton());
        BtnCarbiarCarton.addActionListener(e -> controlador.cambiarCarton(true));
        jButton2.addActionListener(e -> controlador.reiniciarJuego());
        btnRegresarCarton.addActionListener(e -> controlador.cambiarCarton(false));
        
        jRadioButtonMenuItem1.addActionListener(e -> controlador.cambiarModoJuego("NORMAL"));
        // Configurar eventos del menú de modos de juego
        jRadioButtonMenuItem3.addActionListener(e -> controlador.cambiarModoJuego("CARTON_LLENO"));
        jRadioButtonMenuItem2.addActionListener(e -> controlador.cambiarModoJuego("CUATRO_ESQUINAS"));
    }
    

    public void inicializarPaneles() {
        panelCartones = new vista.PanelCartones();
        panelCartones.setBounds(0, 0, ContenedorCarton.getWidth(), ContenedorCarton.getHeight());
        ContenedorCarton.add(panelCartones);
        
        panelTablero = new vista.PanelTablero();
        contenedorTablero.setLayout(new java.awt.BorderLayout());
        contenedorTablero.add(panelTablero, java.awt.BorderLayout.CENTER);
        
        panelResultado = new vista.PanelResultado();
        ContendorResultado.setLayout(new java.awt.BorderLayout());
        ContendorResultado.add(panelResultado, java.awt.BorderLayout.CENTER);
        
        this.revalidate();
        this.repaint();
    }
    
    panelTablero = new vista.PanelTablero(); //
    contenedorTablero.setLayout(new java.awt.BorderLayout());
    contenedorTablero.add(panelTablero, java.awt.BorderLayout.CENTER);
    panelResultado = new vista.PanelResultado(); //
    // Usamos BorderLayout para que el panel ocupe todo el JPanel ContendorResultado
    ContendorResultado.setLayout(new java.awt.BorderLayout());
    ContendorResultado.add(panelResultado, java.awt.BorderLayout.CENTER);
    this.revalidate();
    this.repaint();
}
 
    // Dentro de la clase VentanaPrincipal:

private void configurarMenuTema() {
    // 1. Cambiar el texto de los elementos del menú
        jMenu1.setText("Tema");
    if (jMenu1 != null) {
    }
        jMenuItem1.setText("Tema Claro");
    if (jMenuItem1 != null) {
        // 2. Agregar ActionListener para Tema Claro
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarTema(false); // false = Tema Claro
            }
        });
    }

    if (jMenuItem2 != null) {
        jMenuItem2.setText("Tema Oscuro");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
        // 3. Agregar ActionListener para Tema Oscuro
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicarTema(true); // true = Tema Oscuro
        });
            }
    }
}


// En VentanaPrincipal.java
   private void aplicarTema(boolean esOscuro) {

    java.awt.Color fondoPrincipal;
    java.awt.Color colorTexto;
    
    if (esOscuro) {
        // Tema Oscuro: Color base para la Ventana Principal
        fondoPrincipal = new java.awt.Color(35, 38, 45); 
        colorTexto = java.awt.Color.WHITE;
    } else {
        // Tema Claro: Color base para la Ventana Principal
        colorTexto = java.awt.Color.BLACK;
        fondoPrincipal = new java.awt.Color(230, 230, 230); 
    }

    // 1. Aplicar color a los contenedores de la Ventana Principal
    // Al panel de contenido principal de la ventana
    this.getContentPane().setBackground(fondoPrincipal);
    
    // A la barra de menú (jMenuBar1)
    
    if (jMenuBar1 != null) {
        jMenuBar1.setForeground(colorTexto); // Cambia el color del texto del menú
    }
        jMenuBar1.setBackground(fondoPrincipal);
    
    if (contenedorTablero != null) {
    // A los JPanels y contenedores que rodean los paneles hijos:
        contenedorTablero.setBackground(fondoPrincipal);
    if (ContenedorCarton != null) {
    }
    }
        ContenedorCarton.setBackground(fondoPrincipal);
        ContendorResultado.setBackground(fondoPrincipal);
    if (ContendorResultado != null) {
    }
    
    if (jPanel1 != null) {
    // Incluye cualquier otro JPanel de la Ventana Principal (jPanel1, jPanel2, etc.):
        jPanel1.setBackground(fondoPrincipal);
    if (jPanel2 != null) {
    }
        jPanel2.setBackground(fondoPrincipal);
    }
    }
        jPanel3.setBackground(fondoPrincipal);
    if (jPanel3 != null) {
    if (jPanel4 != null) {
        jPanel4.setBackground(fondoPrincipal);
    }
    if (jPanel5 != null) {
        jPanel5.setBackground(fondoPrincipal);
    }
    
    // 2. Llamar al método cambiarTema en cada panel hijo
    if (panelCartones != null) {
        panelCartones.cambiarTema(esOscuro);
    if (panelTablero != null) {
    }
        panelTablero.cambiarTema(esOscuro);
    }
    if (panelResultado != null) {
        panelResultado.cambiarTema(esOscuro);

    }
    this.revalidate();
    this.repaint();
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        ContenedorCarton = new javax.swing.JDesktopPane();
        contenedorTablero = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ContendorResultado = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        botonCrear = new javax.swing.JButton();
        ComboModo = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnCarbiarCarton = new javax.swing.JButton();
        btnRegresarCarton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ContenedorCartonLayout = new javax.swing.GroupLayout(ContenedorCarton);
        ContenedorCarton.setLayout(ContenedorCartonLayout);
        ContenedorCartonLayout.setHorizontalGroup(
            ContenedorCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );
        ContenedorCartonLayout.setVerticalGroup(
            ContenedorCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );

        contenedorTablero.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout contenedorTableroLayout = new javax.swing.GroupLayout(contenedorTablero);
        contenedorTablero.setLayout(contenedorTableroLayout);
        contenedorTableroLayout.setHorizontalGroup(
            contenedorTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );
        contenedorTableroLayout.setVerticalGroup(
            contenedorTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ContendorResultadoLayout = new javax.swing.GroupLayout(ContendorResultado);
        ContendorResultado.setLayout(ContendorResultadoLayout);
        ContendorResultadoLayout.setHorizontalGroup(
            ContendorResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );
        ContendorResultadoLayout.setVerticalGroup(
            ContendorResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(62, 62, 75));

        botonCrear.setText("Crear Nuevo Cartón");
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });

        ComboModo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual", "Automatico" }));
        ComboModo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboModoActionPerformed(evt);
            }
        });

        jButton2.setText("Reiniciar");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(botonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(79, 79, 79)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboModo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboModo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jLabel1.setText("Cartón = ");

        BtnCarbiarCarton.setText("⬆");

        btnRegresarCarton.setText("⬇");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnCarbiarCarton)
                            .addComponent(btnRegresarCarton))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCarbiarCarton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegresarCarton)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ContenedorCarton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContendorResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contenedorTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ContenedorCarton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ContendorResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contenedorTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGap(58, 58, 58))
        );

        jMenu1.setText("Tema");

        jMenuItem1.setText("Oscuro");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Claro");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Modo");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Normal");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem1);

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("Cuatro Esquinas");
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem2);

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("Completo");
        jRadioButtonMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboModoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboModoActionPerformed
        
     
        
        
    }//GEN-LAST:event_ComboModoActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed

    private void jRadioButtonMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
       
             String modoSeleccionado = (String) ComboModo.getSelectedItem();
        if ("Manual".equals(modoSeleccionado)) {
            vista.ControlManual controlManualDialog = new vista.ControlManual(this, true);
            controlManualDialog.setLocationRelativeTo(this);
            controlManualDialog.setVisible(true);
 
        } else if ("Automatico".equals(modoSeleccionado)) {
  
        }
        
    }//GEN-LAST:event_botonCrearActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCarbiarCarton;
    private javax.swing.JComboBox<String> ComboModo;
    private javax.swing.JPanel ContendorResultado;
    private javax.swing.JDesktopPane ContenedorCarton;
    private javax.swing.JButton botonCrear;
    private javax.swing.JButton btnRegresarCarton;
    private javax.swing.JPanel contenedorTablero;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
