/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import java.awt.Color;

/**
 *
 * @author isaac
 */
public class PanelTablero extends javax.swing.JPanel {
    
    // El array de paneles ya estaba declarado en el snippet
    private final javax.swing.JPanel[] panelesMarcador = new javax.swing.JPanel[75];
    
    private static final Color COLOR_MARCADO = Color.GREEN;
    private static final Color COLOR_POR_DEFECTO = Color.LIGHT_GRAY;

    /**
     * Creates new form PanelTablero
     */
    public PanelTablero() {
        initComponents();
        inicializarPanelesMarcador();
        reiniciarTablero(); // Llamar para asegurar el color inicial
    }
private void inicializarPanelesMarcador() {
    // Inicialización de la lista de paneles para acceso por índice (0-74)
    panelesMarcador[0] = panelMarcador_1;
    panelesMarcador[1] = panelMarcador_2;
    panelesMarcador[2] = panelMarcador_3;
    panelesMarcador[3] = panelMarcador_4;
    panelesMarcador[4] = panelMarcador_5;
    panelesMarcador[5] = panelMarcador_6;
    panelesMarcador[6] = panelMarcador_7;
    panelesMarcador[7] = panelMarcador_8;
    panelesMarcador[8] = panelMarcador_9;
    panelesMarcador[9] = panelMarcador_10;
    panelesMarcador[10] = panelMarcador_11;
    panelesMarcador[11] = panelMarcador_12;
    panelesMarcador[12] = panelMarcador_13;
    panelesMarcador[13] = panelMarcador_14;
    panelesMarcador[14] = panelMarcador_15;
    panelesMarcador[15] = panelMarcador_16;
    panelesMarcador[16] = panelMarcador_17;
    panelesMarcador[17] = panelMarcador_18;
    panelesMarcador[18] = panelMarcador_19;
    panelesMarcador[19] = panelMarcador_20;
    panelesMarcador[20] = panelMarcador_21;
    panelesMarcador[21] = panelMarcador_22;
    panelesMarcador[22] = panelMarcador_23;
    panelesMarcador[23] = panelMarcador_24;
    panelesMarcador[24] = panelMarcador_25;
    panelesMarcador[25] = panelMarcador_26;
    panelesMarcador[26] = panelMarcador_27;
    panelesMarcador[27] = panelMarcador_28;
    panelesMarcador[28] = panelMarcador_29;
    panelesMarcador[29] = panelMarcador_30;
    panelesMarcador[30] = panelMarcador_31;
    panelesMarcador[31] = panelMarcador_32;
    panelesMarcador[32] = panelMarcador_33;
    panelesMarcador[33] = panelMarcador_34;
    panelesMarcador[34] = panelMarcador_35;
    panelesMarcador[35] = panelMarcador_36;
    panelesMarcador[36] = panelMarcador_37;
    panelesMarcador[37] = panelMarcador_38;
    panelesMarcador[38] = panelMarcador_39;
    panelesMarcador[39] = panelMarcador_40;
    panelesMarcador[40] = panelMarcador_41;
    panelesMarcador[41] = panelMarcador_42;
    panelesMarcador[42] = panelMarcador_43;
    panelesMarcador[43] = panelMarcador_44;
    panelesMarcador[44] = panelMarcador_45;
    panelesMarcador[45] = panelMarcador_46;
    panelesMarcador[46] = panelMarcador_47;
    panelesMarcador[47] = panelMarcador_48;
    panelesMarcador[48] = panelMarcador_49;
    panelesMarcador[49] = panelMarcador_50;
    panelesMarcador[50] = panelMarcador_51;
    panelesMarcador[51] = panelMarcador_52;
    panelesMarcador[52] = panelMarcador_53;
    panelesMarcador[53] = panelMarcador_54;
    panelesMarcador[54] = panelMarcador_55;
    panelesMarcador[55] = panelMarcador_56;
    panelesMarcador[56] = panelMarcador_57;
    panelesMarcador[57] = panelMarcador_58;
    panelesMarcador[58] = panelMarcador_59;
    panelesMarcador[59] = panelMarcador_60;
    panelesMarcador[60] = panelMarcador_61;
    panelesMarcador[61] = panelMarcador_62;
    panelesMarcador[62] = panelMarcador_63;
    panelesMarcador[63] = panelMarcador_64;
    panelesMarcador[64] = panelMarcador_65;
    panelesMarcador[65] = panelMarcador_66;
    panelesMarcador[66] = panelMarcador_67;
    panelesMarcador[67] = panelMarcador_68;
    panelesMarcador[68] = panelMarcador_69;
    panelesMarcador[69] = panelMarcador_70;
    panelesMarcador[70] = panelMarcador_71;
    panelesMarcador[71] = panelMarcador_72;
    panelesMarcador[72] = panelMarcador_73;
    panelesMarcador[73] = panelMarcador_74;
    panelesMarcador[74] = panelMarcador_75;
    
}

public void marcarNumero(int numero) {
        if (numero >= 1 && numero <= 75) {
            // El índice del array es 'numero - 1'
            panelesMarcador[numero - 1].setBackground(COLOR_MARCADO);
        }
    }

    /**
     * Desmarca visualmente el número en el tablero (vuelve al color por defecto).
     * @param numero El número a desmarcar (1 a 75).
     */
    public void desmarcarNumero(int numero) {
        if (numero >= 1 && numero <= 75) {
            // El índice del array es 'numero - 1'
            panelesMarcador[numero - 1].setBackground(COLOR_POR_DEFECTO);
        }
    }
    
    /**
     * Reinicia el tablero desmarcando todos los números.
     */
    public void reiniciarTablero() {
        for (int i = 0; i < 75; i++) {
            panelesMarcador[i].setBackground(COLOR_POR_DEFECTO);
        }
    }
public void cambiarTema(boolean esOscuro) {
    // Definición de colores
    Color fondoTableroPrincipal;
    Color fondoMarcador;
    Color colorTexto;

    if (esOscuro) {
        // Tema Oscuro:
        fondoTableroPrincipal = new Color(40, 44, 52); // Gris oscuro principal
        fondoMarcador = new Color(60, 65, 75); // Gris para los paneles de números
        colorTexto = Color.WHITE;
    } else {
        // Tema Claro:
        fondoTableroPrincipal = new Color(150, 150, 150); // Gris claro para el fondo principal
        fondoMarcador = Color.WHITE; // Blanco para los paneles de números
        colorTexto = Color.BLACK;
    }

    // 1. Aplicar color al fondo principal del tablero
    TableroConNumero.setBackground(fondoTableroPrincipal);

    // 2. Aplicar color a los 75 paneles de marcador con validación
    for (javax.swing.JPanel panel : panelesMarcador) { // 'panelesMarcador' es tu arreglo de 75 paneles
        if (panel != null) {
            
            // VALIDACIÓN: Solo cambiar el color si el fondo actual NO es rojo.
            if (!java.awt.Color.RED.equals(panel.getBackground())) {
                panel.setBackground(fondoMarcador);

                // Cambiar el color del texto (JLabel) dentro de cada panel
                for (java.awt.Component component : panel.getComponents()) {
                    if (component instanceof javax.swing.JLabel) {
                        ((javax.swing.JLabel) component).setForeground(colorTexto);
                    }
                }
            } else {
                // Si el panel está en rojo, asegurar que el texto dentro sea blanco.
                for (java.awt.Component component : panel.getComponents()) {
                    if (component instanceof javax.swing.JLabel) {
                        ((javax.swing.JLabel) component).setForeground(java.awt.Color.WHITE);
                    }
                }
            }
        }
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

        TableroConNumero = new javax.swing.JPanel();
        panelMarcador_1 = new javax.swing.JPanel();
        Num_1 = new javax.swing.JLabel();
        panelMarcador_2 = new javax.swing.JPanel();
        Num_2 = new javax.swing.JLabel();
        panelMarcador_3 = new javax.swing.JPanel();
        Num_3 = new javax.swing.JLabel();
        panelMarcador_4 = new javax.swing.JPanel();
        Num_4 = new javax.swing.JLabel();
        panelMarcador_5 = new javax.swing.JPanel();
        Num_5 = new javax.swing.JLabel();
        panelMarcador_6 = new javax.swing.JPanel();
        Num_6 = new javax.swing.JLabel();
        panelMarcador_7 = new javax.swing.JPanel();
        Num_7 = new javax.swing.JLabel();
        panelMarcador_8 = new javax.swing.JPanel();
        Num_8 = new javax.swing.JLabel();
        panelMarcador_9 = new javax.swing.JPanel();
        Num_9 = new javax.swing.JLabel();
        panelMarcador_10 = new javax.swing.JPanel();
        Num_10 = new javax.swing.JLabel();
        panelMarcador_11 = new javax.swing.JPanel();
        Num_11 = new javax.swing.JLabel();
        panelMarcador_12 = new javax.swing.JPanel();
        Num_12 = new javax.swing.JLabel();
        panelMarcador_13 = new javax.swing.JPanel();
        Num_13 = new javax.swing.JLabel();
        panelMarcador_14 = new javax.swing.JPanel();
        Num_14 = new javax.swing.JLabel();
        panelMarcador_15 = new javax.swing.JPanel();
        Num_15 = new javax.swing.JLabel();
        panelMarcador_16 = new javax.swing.JPanel();
        Num_16 = new javax.swing.JLabel();
        panelMarcador_17 = new javax.swing.JPanel();
        Num_17 = new javax.swing.JLabel();
        panelMarcador_18 = new javax.swing.JPanel();
        Num_18 = new javax.swing.JLabel();
        panelMarcador_19 = new javax.swing.JPanel();
        Num_19 = new javax.swing.JLabel();
        panelMarcador_20 = new javax.swing.JPanel();
        Num_20 = new javax.swing.JLabel();
        panelMarcador_21 = new javax.swing.JPanel();
        Num_21 = new javax.swing.JLabel();
        panelMarcador_22 = new javax.swing.JPanel();
        Num_22 = new javax.swing.JLabel();
        panelMarcador_23 = new javax.swing.JPanel();
        Num_23 = new javax.swing.JLabel();
        panelMarcador_24 = new javax.swing.JPanel();
        Num_24 = new javax.swing.JLabel();
        panelMarcador_25 = new javax.swing.JPanel();
        Num_25 = new javax.swing.JLabel();
        panelMarcador_26 = new javax.swing.JPanel();
        Num_26 = new javax.swing.JLabel();
        panelMarcador_27 = new javax.swing.JPanel();
        Num_27 = new javax.swing.JLabel();
        panelMarcador_28 = new javax.swing.JPanel();
        Num_28 = new javax.swing.JLabel();
        panelMarcador_29 = new javax.swing.JPanel();
        Num_29 = new javax.swing.JLabel();
        panelMarcador_30 = new javax.swing.JPanel();
        Num_30 = new javax.swing.JLabel();
        panelMarcador_31 = new javax.swing.JPanel();
        Num_31 = new javax.swing.JLabel();
        panelMarcador_32 = new javax.swing.JPanel();
        Num_32 = new javax.swing.JLabel();
        panelMarcador_33 = new javax.swing.JPanel();
        Num_33 = new javax.swing.JLabel();
        panelMarcador_34 = new javax.swing.JPanel();
        Num_34 = new javax.swing.JLabel();
        panelMarcador_35 = new javax.swing.JPanel();
        Num_35 = new javax.swing.JLabel();
        panelMarcador_36 = new javax.swing.JPanel();
        Num_36 = new javax.swing.JLabel();
        panelMarcador_37 = new javax.swing.JPanel();
        Num_37 = new javax.swing.JLabel();
        panelMarcador_38 = new javax.swing.JPanel();
        Num_38 = new javax.swing.JLabel();
        panelMarcador_39 = new javax.swing.JPanel();
        Num_39 = new javax.swing.JLabel();
        panelMarcador_40 = new javax.swing.JPanel();
        Num_40 = new javax.swing.JLabel();
        panelMarcador_41 = new javax.swing.JPanel();
        Num_41 = new javax.swing.JLabel();
        panelMarcador_42 = new javax.swing.JPanel();
        Num_42 = new javax.swing.JLabel();
        panelMarcador_43 = new javax.swing.JPanel();
        Num_43 = new javax.swing.JLabel();
        panelMarcador_44 = new javax.swing.JPanel();
        Num_44 = new javax.swing.JLabel();
        panelMarcador_45 = new javax.swing.JPanel();
        Num_45 = new javax.swing.JLabel();
        panelMarcador_46 = new javax.swing.JPanel();
        Num_46 = new javax.swing.JLabel();
        panelMarcador_47 = new javax.swing.JPanel();
        Num_47 = new javax.swing.JLabel();
        panelMarcador_48 = new javax.swing.JPanel();
        Num_48 = new javax.swing.JLabel();
        panelMarcador_49 = new javax.swing.JPanel();
        Num_49 = new javax.swing.JLabel();
        panelMarcador_50 = new javax.swing.JPanel();
        Num_50 = new javax.swing.JLabel();
        panelMarcador_51 = new javax.swing.JPanel();
        Num_51 = new javax.swing.JLabel();
        panelMarcador_52 = new javax.swing.JPanel();
        Num_52 = new javax.swing.JLabel();
        panelMarcador_53 = new javax.swing.JPanel();
        Num_53 = new javax.swing.JLabel();
        panelMarcador_54 = new javax.swing.JPanel();
        Num_54 = new javax.swing.JLabel();
        panelMarcador_55 = new javax.swing.JPanel();
        Num_55 = new javax.swing.JLabel();
        panelMarcador_56 = new javax.swing.JPanel();
        Num_56 = new javax.swing.JLabel();
        panelMarcador_57 = new javax.swing.JPanel();
        Num_57 = new javax.swing.JLabel();
        panelMarcador_58 = new javax.swing.JPanel();
        Num_58 = new javax.swing.JLabel();
        panelMarcador_59 = new javax.swing.JPanel();
        Num_59 = new javax.swing.JLabel();
        panelMarcador_60 = new javax.swing.JPanel();
        Num_60 = new javax.swing.JLabel();
        panelMarcador_61 = new javax.swing.JPanel();
        Num_61 = new javax.swing.JLabel();
        panelMarcador_62 = new javax.swing.JPanel();
        Num_62 = new javax.swing.JLabel();
        panelMarcador_63 = new javax.swing.JPanel();
        Num_63 = new javax.swing.JLabel();
        panelMarcador_64 = new javax.swing.JPanel();
        Num_64 = new javax.swing.JLabel();
        panelMarcador_65 = new javax.swing.JPanel();
        Num_65 = new javax.swing.JLabel();
        panelMarcador_66 = new javax.swing.JPanel();
        Num_66 = new javax.swing.JLabel();
        panelMarcador_67 = new javax.swing.JPanel();
        Num_67 = new javax.swing.JLabel();
        panelMarcador_68 = new javax.swing.JPanel();
        Num_68 = new javax.swing.JLabel();
        panelMarcador_69 = new javax.swing.JPanel();
        Num_69 = new javax.swing.JLabel();
        panelMarcador_70 = new javax.swing.JPanel();
        Num_70 = new javax.swing.JLabel();
        panelMarcador_71 = new javax.swing.JPanel();
        Num_71 = new javax.swing.JLabel();
        panelMarcador_72 = new javax.swing.JPanel();
        Num_72 = new javax.swing.JLabel();
        panelMarcador_73 = new javax.swing.JPanel();
        Num_73 = new javax.swing.JLabel();
        panelMarcador_74 = new javax.swing.JPanel();
        Num_74 = new javax.swing.JLabel();
        panelMarcador_75 = new javax.swing.JPanel();
        Num_75 = new javax.swing.JLabel();

        TableroConNumero.setBackground(new java.awt.Color(77, 102, 126));

        panelMarcador_1.setBackground(new java.awt.Color(255, 255, 255));

        Num_1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_1.setText("1");

        javax.swing.GroupLayout panelMarcador_1Layout = new javax.swing.GroupLayout(panelMarcador_1);
        panelMarcador_1.setLayout(panelMarcador_1Layout);
        panelMarcador_1Layout.setHorizontalGroup(
            panelMarcador_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMarcador_1Layout.setVerticalGroup(
            panelMarcador_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_2.setBackground(new java.awt.Color(255, 255, 255));

        Num_2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_2.setText("2");

        javax.swing.GroupLayout panelMarcador_2Layout = new javax.swing.GroupLayout(panelMarcador_2);
        panelMarcador_2.setLayout(panelMarcador_2Layout);
        panelMarcador_2Layout.setHorizontalGroup(
            panelMarcador_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMarcador_2Layout.setVerticalGroup(
            panelMarcador_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_3.setBackground(new java.awt.Color(255, 255, 255));

        Num_3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_3.setText("3");

        javax.swing.GroupLayout panelMarcador_3Layout = new javax.swing.GroupLayout(panelMarcador_3);
        panelMarcador_3.setLayout(panelMarcador_3Layout);
        panelMarcador_3Layout.setHorizontalGroup(
            panelMarcador_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMarcador_3Layout.setVerticalGroup(
            panelMarcador_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_4.setBackground(new java.awt.Color(255, 255, 255));

        Num_4.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_4.setText("4");

        javax.swing.GroupLayout panelMarcador_4Layout = new javax.swing.GroupLayout(panelMarcador_4);
        panelMarcador_4.setLayout(panelMarcador_4Layout);
        panelMarcador_4Layout.setHorizontalGroup(
            panelMarcador_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMarcador_4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Num_4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelMarcador_4Layout.setVerticalGroup(
            panelMarcador_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMarcador_4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Num_4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMarcador_5.setBackground(new java.awt.Color(255, 255, 255));

        Num_5.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_5.setText("5");

        javax.swing.GroupLayout panelMarcador_5Layout = new javax.swing.GroupLayout(panelMarcador_5);
        panelMarcador_5.setLayout(panelMarcador_5Layout);
        panelMarcador_5Layout.setHorizontalGroup(
            panelMarcador_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMarcador_5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Num_5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelMarcador_5Layout.setVerticalGroup(
            panelMarcador_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMarcador_5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Num_5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMarcador_6.setBackground(new java.awt.Color(255, 255, 255));

        Num_6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_6.setText("6");

        javax.swing.GroupLayout panelMarcador_6Layout = new javax.swing.GroupLayout(panelMarcador_6);
        panelMarcador_6.setLayout(panelMarcador_6Layout);
        panelMarcador_6Layout.setHorizontalGroup(
            panelMarcador_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMarcador_6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Num_6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMarcador_6Layout.setVerticalGroup(
            panelMarcador_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMarcador_6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Num_6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMarcador_7.setBackground(new java.awt.Color(255, 255, 255));

        Num_7.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_7.setText("7");

        javax.swing.GroupLayout panelMarcador_7Layout = new javax.swing.GroupLayout(panelMarcador_7);
        panelMarcador_7.setLayout(panelMarcador_7Layout);
        panelMarcador_7Layout.setHorizontalGroup(
            panelMarcador_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMarcador_7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Num_7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelMarcador_7Layout.setVerticalGroup(
            panelMarcador_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMarcador_7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Num_7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMarcador_8.setBackground(new java.awt.Color(255, 255, 255));

        Num_8.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_8.setText("8");

        javax.swing.GroupLayout panelMarcador_8Layout = new javax.swing.GroupLayout(panelMarcador_8);
        panelMarcador_8.setLayout(panelMarcador_8Layout);
        panelMarcador_8Layout.setHorizontalGroup(
            panelMarcador_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMarcador_8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Num_8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelMarcador_8Layout.setVerticalGroup(
            panelMarcador_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMarcador_8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Num_8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMarcador_9.setBackground(new java.awt.Color(255, 255, 255));

        Num_9.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_9.setText("9");

        javax.swing.GroupLayout panelMarcador_9Layout = new javax.swing.GroupLayout(panelMarcador_9);
        panelMarcador_9.setLayout(panelMarcador_9Layout);
        panelMarcador_9Layout.setHorizontalGroup(
            panelMarcador_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMarcador_9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Num_9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelMarcador_9Layout.setVerticalGroup(
            panelMarcador_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMarcador_9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Num_9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMarcador_10.setBackground(new java.awt.Color(255, 255, 255));

        Num_10.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_10.setText("10");

        javax.swing.GroupLayout panelMarcador_10Layout = new javax.swing.GroupLayout(panelMarcador_10);
        panelMarcador_10.setLayout(panelMarcador_10Layout);
        panelMarcador_10Layout.setHorizontalGroup(
            panelMarcador_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMarcador_10Layout.setVerticalGroup(
            panelMarcador_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_11.setBackground(new java.awt.Color(255, 255, 255));

        Num_11.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_11.setText("11");

        javax.swing.GroupLayout panelMarcador_11Layout = new javax.swing.GroupLayout(panelMarcador_11);
        panelMarcador_11.setLayout(panelMarcador_11Layout);
        panelMarcador_11Layout.setHorizontalGroup(
            panelMarcador_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMarcador_11Layout.setVerticalGroup(
            panelMarcador_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_12.setBackground(new java.awt.Color(255, 255, 255));

        Num_12.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_12.setText("12");

        javax.swing.GroupLayout panelMarcador_12Layout = new javax.swing.GroupLayout(panelMarcador_12);
        panelMarcador_12.setLayout(panelMarcador_12Layout);
        panelMarcador_12Layout.setHorizontalGroup(
            panelMarcador_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMarcador_12Layout.setVerticalGroup(
            panelMarcador_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_13.setBackground(new java.awt.Color(255, 255, 255));

        Num_13.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_13.setText("13");

        javax.swing.GroupLayout panelMarcador_13Layout = new javax.swing.GroupLayout(panelMarcador_13);
        panelMarcador_13.setLayout(panelMarcador_13Layout);
        panelMarcador_13Layout.setHorizontalGroup(
            panelMarcador_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMarcador_13Layout.setVerticalGroup(
            panelMarcador_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_14.setBackground(new java.awt.Color(255, 255, 255));

        Num_14.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_14.setText("14");

        javax.swing.GroupLayout panelMarcador_14Layout = new javax.swing.GroupLayout(panelMarcador_14);
        panelMarcador_14.setLayout(panelMarcador_14Layout);
        panelMarcador_14Layout.setHorizontalGroup(
            panelMarcador_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMarcador_14Layout.setVerticalGroup(
            panelMarcador_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_15.setBackground(new java.awt.Color(255, 255, 255));

        Num_15.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_15.setText("15");

        javax.swing.GroupLayout panelMarcador_15Layout = new javax.swing.GroupLayout(panelMarcador_15);
        panelMarcador_15.setLayout(panelMarcador_15Layout);
        panelMarcador_15Layout.setHorizontalGroup(
            panelMarcador_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMarcador_15Layout.setVerticalGroup(
            panelMarcador_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_16.setBackground(new java.awt.Color(255, 255, 255));

        Num_16.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_16.setText("16");

        javax.swing.GroupLayout panelMarcador_16Layout = new javax.swing.GroupLayout(panelMarcador_16);
        panelMarcador_16.setLayout(panelMarcador_16Layout);
        panelMarcador_16Layout.setHorizontalGroup(
            panelMarcador_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMarcador_16Layout.setVerticalGroup(
            panelMarcador_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_17.setBackground(new java.awt.Color(255, 255, 255));

        Num_17.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_17.setText("17");

        javax.swing.GroupLayout panelMarcador_17Layout = new javax.swing.GroupLayout(panelMarcador_17);
        panelMarcador_17.setLayout(panelMarcador_17Layout);
        panelMarcador_17Layout.setHorizontalGroup(
            panelMarcador_17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMarcador_17Layout.setVerticalGroup(
            panelMarcador_17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_18.setBackground(new java.awt.Color(255, 255, 255));

        Num_18.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_18.setText("18");

        javax.swing.GroupLayout panelMarcador_18Layout = new javax.swing.GroupLayout(panelMarcador_18);
        panelMarcador_18.setLayout(panelMarcador_18Layout);
        panelMarcador_18Layout.setHorizontalGroup(
            panelMarcador_18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMarcador_18Layout.setVerticalGroup(
            panelMarcador_18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_19.setBackground(new java.awt.Color(255, 255, 255));

        Num_19.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_19.setText("19");

        javax.swing.GroupLayout panelMarcador_19Layout = new javax.swing.GroupLayout(panelMarcador_19);
        panelMarcador_19.setLayout(panelMarcador_19Layout);
        panelMarcador_19Layout.setHorizontalGroup(
            panelMarcador_19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMarcador_19Layout.setVerticalGroup(
            panelMarcador_19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_20.setBackground(new java.awt.Color(255, 255, 255));

        Num_20.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_20.setText("20");

        javax.swing.GroupLayout panelMarcador_20Layout = new javax.swing.GroupLayout(panelMarcador_20);
        panelMarcador_20.setLayout(panelMarcador_20Layout);
        panelMarcador_20Layout.setHorizontalGroup(
            panelMarcador_20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMarcador_20Layout.setVerticalGroup(
            panelMarcador_20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_21.setBackground(new java.awt.Color(255, 255, 255));

        Num_21.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_21.setText("21");

        javax.swing.GroupLayout panelMarcador_21Layout = new javax.swing.GroupLayout(panelMarcador_21);
        panelMarcador_21.setLayout(panelMarcador_21Layout);
        panelMarcador_21Layout.setHorizontalGroup(
            panelMarcador_21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMarcador_21Layout.setVerticalGroup(
            panelMarcador_21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_22.setBackground(new java.awt.Color(255, 255, 255));

        Num_22.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_22.setText("22");

        javax.swing.GroupLayout panelMarcador_22Layout = new javax.swing.GroupLayout(panelMarcador_22);
        panelMarcador_22.setLayout(panelMarcador_22Layout);
        panelMarcador_22Layout.setHorizontalGroup(
            panelMarcador_22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMarcador_22Layout.setVerticalGroup(
            panelMarcador_22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_23.setBackground(new java.awt.Color(255, 255, 255));

        Num_23.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_23.setText("23");

        javax.swing.GroupLayout panelMarcador_23Layout = new javax.swing.GroupLayout(panelMarcador_23);
        panelMarcador_23.setLayout(panelMarcador_23Layout);
        panelMarcador_23Layout.setHorizontalGroup(
            panelMarcador_23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMarcador_23Layout.setVerticalGroup(
            panelMarcador_23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_24.setBackground(new java.awt.Color(255, 255, 255));

        Num_24.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_24.setText("24");

        javax.swing.GroupLayout panelMarcador_24Layout = new javax.swing.GroupLayout(panelMarcador_24);
        panelMarcador_24.setLayout(panelMarcador_24Layout);
        panelMarcador_24Layout.setHorizontalGroup(
            panelMarcador_24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMarcador_24Layout.setVerticalGroup(
            panelMarcador_24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_24, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_25.setBackground(new java.awt.Color(255, 255, 255));

        Num_25.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_25.setText("25");

        javax.swing.GroupLayout panelMarcador_25Layout = new javax.swing.GroupLayout(panelMarcador_25);
        panelMarcador_25.setLayout(panelMarcador_25Layout);
        panelMarcador_25Layout.setHorizontalGroup(
            panelMarcador_25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_25, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_25Layout.setVerticalGroup(
            panelMarcador_25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_26.setBackground(new java.awt.Color(255, 255, 255));

        Num_26.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_26.setText("26");

        javax.swing.GroupLayout panelMarcador_26Layout = new javax.swing.GroupLayout(panelMarcador_26);
        panelMarcador_26.setLayout(panelMarcador_26Layout);
        panelMarcador_26Layout.setHorizontalGroup(
            panelMarcador_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_26, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_26Layout.setVerticalGroup(
            panelMarcador_26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_27.setBackground(new java.awt.Color(255, 255, 255));

        Num_27.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_27.setText("27");

        javax.swing.GroupLayout panelMarcador_27Layout = new javax.swing.GroupLayout(panelMarcador_27);
        panelMarcador_27.setLayout(panelMarcador_27Layout);
        panelMarcador_27Layout.setHorizontalGroup(
            panelMarcador_27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_27, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_27Layout.setVerticalGroup(
            panelMarcador_27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_28.setBackground(new java.awt.Color(255, 255, 255));

        Num_28.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_28.setText("28");

        javax.swing.GroupLayout panelMarcador_28Layout = new javax.swing.GroupLayout(panelMarcador_28);
        panelMarcador_28.setLayout(panelMarcador_28Layout);
        panelMarcador_28Layout.setHorizontalGroup(
            panelMarcador_28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_28, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_28Layout.setVerticalGroup(
            panelMarcador_28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_29.setBackground(new java.awt.Color(255, 255, 255));

        Num_29.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_29.setText("29");

        javax.swing.GroupLayout panelMarcador_29Layout = new javax.swing.GroupLayout(panelMarcador_29);
        panelMarcador_29.setLayout(panelMarcador_29Layout);
        panelMarcador_29Layout.setHorizontalGroup(
            panelMarcador_29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_29, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_29Layout.setVerticalGroup(
            panelMarcador_29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_30.setBackground(new java.awt.Color(255, 255, 255));

        Num_30.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_30.setText("30");

        javax.swing.GroupLayout panelMarcador_30Layout = new javax.swing.GroupLayout(panelMarcador_30);
        panelMarcador_30.setLayout(panelMarcador_30Layout);
        panelMarcador_30Layout.setHorizontalGroup(
            panelMarcador_30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_30, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_30Layout.setVerticalGroup(
            panelMarcador_30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_31.setBackground(new java.awt.Color(255, 255, 255));

        Num_31.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_31.setText("31");

        javax.swing.GroupLayout panelMarcador_31Layout = new javax.swing.GroupLayout(panelMarcador_31);
        panelMarcador_31.setLayout(panelMarcador_31Layout);
        panelMarcador_31Layout.setHorizontalGroup(
            panelMarcador_31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_31, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_31Layout.setVerticalGroup(
            panelMarcador_31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_32.setBackground(new java.awt.Color(255, 255, 255));

        Num_32.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_32.setText("32");

        javax.swing.GroupLayout panelMarcador_32Layout = new javax.swing.GroupLayout(panelMarcador_32);
        panelMarcador_32.setLayout(panelMarcador_32Layout);
        panelMarcador_32Layout.setHorizontalGroup(
            panelMarcador_32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_32, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_32Layout.setVerticalGroup(
            panelMarcador_32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_33.setBackground(new java.awt.Color(255, 255, 255));

        Num_33.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_33.setText("33");

        javax.swing.GroupLayout panelMarcador_33Layout = new javax.swing.GroupLayout(panelMarcador_33);
        panelMarcador_33.setLayout(panelMarcador_33Layout);
        panelMarcador_33Layout.setHorizontalGroup(
            panelMarcador_33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_33, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_33Layout.setVerticalGroup(
            panelMarcador_33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_33)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_34.setBackground(new java.awt.Color(255, 255, 255));

        Num_34.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_34.setText("34");

        javax.swing.GroupLayout panelMarcador_34Layout = new javax.swing.GroupLayout(panelMarcador_34);
        panelMarcador_34.setLayout(panelMarcador_34Layout);
        panelMarcador_34Layout.setHorizontalGroup(
            panelMarcador_34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_34, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_34Layout.setVerticalGroup(
            panelMarcador_34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_35.setBackground(new java.awt.Color(255, 255, 255));

        Num_35.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_35.setText("35");

        javax.swing.GroupLayout panelMarcador_35Layout = new javax.swing.GroupLayout(panelMarcador_35);
        panelMarcador_35.setLayout(panelMarcador_35Layout);
        panelMarcador_35Layout.setHorizontalGroup(
            panelMarcador_35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_35, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_35Layout.setVerticalGroup(
            panelMarcador_35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_36.setBackground(new java.awt.Color(255, 255, 255));

        Num_36.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_36.setText("36");

        javax.swing.GroupLayout panelMarcador_36Layout = new javax.swing.GroupLayout(panelMarcador_36);
        panelMarcador_36.setLayout(panelMarcador_36Layout);
        panelMarcador_36Layout.setHorizontalGroup(
            panelMarcador_36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_36, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_36Layout.setVerticalGroup(
            panelMarcador_36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_36)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_37.setBackground(new java.awt.Color(255, 255, 255));

        Num_37.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_37.setText("37");

        javax.swing.GroupLayout panelMarcador_37Layout = new javax.swing.GroupLayout(panelMarcador_37);
        panelMarcador_37.setLayout(panelMarcador_37Layout);
        panelMarcador_37Layout.setHorizontalGroup(
            panelMarcador_37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_37, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_37Layout.setVerticalGroup(
            panelMarcador_37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_38.setBackground(new java.awt.Color(255, 255, 255));

        Num_38.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_38.setText("38");

        javax.swing.GroupLayout panelMarcador_38Layout = new javax.swing.GroupLayout(panelMarcador_38);
        panelMarcador_38.setLayout(panelMarcador_38Layout);
        panelMarcador_38Layout.setHorizontalGroup(
            panelMarcador_38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_38, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_38Layout.setVerticalGroup(
            panelMarcador_38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_38)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_39.setBackground(new java.awt.Color(255, 255, 255));

        Num_39.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_39.setText("39");

        javax.swing.GroupLayout panelMarcador_39Layout = new javax.swing.GroupLayout(panelMarcador_39);
        panelMarcador_39.setLayout(panelMarcador_39Layout);
        panelMarcador_39Layout.setHorizontalGroup(
            panelMarcador_39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_39, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_39Layout.setVerticalGroup(
            panelMarcador_39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_39)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_40.setBackground(new java.awt.Color(255, 255, 255));

        Num_40.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_40.setText("40");

        javax.swing.GroupLayout panelMarcador_40Layout = new javax.swing.GroupLayout(panelMarcador_40);
        panelMarcador_40.setLayout(panelMarcador_40Layout);
        panelMarcador_40Layout.setHorizontalGroup(
            panelMarcador_40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_40, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_40Layout.setVerticalGroup(
            panelMarcador_40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_40)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_41.setBackground(new java.awt.Color(255, 255, 255));

        Num_41.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_41.setText("41");

        javax.swing.GroupLayout panelMarcador_41Layout = new javax.swing.GroupLayout(panelMarcador_41);
        panelMarcador_41.setLayout(panelMarcador_41Layout);
        panelMarcador_41Layout.setHorizontalGroup(
            panelMarcador_41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_41, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_41Layout.setVerticalGroup(
            panelMarcador_41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_41)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_42.setBackground(new java.awt.Color(255, 255, 255));

        Num_42.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_42.setText("42");

        javax.swing.GroupLayout panelMarcador_42Layout = new javax.swing.GroupLayout(panelMarcador_42);
        panelMarcador_42.setLayout(panelMarcador_42Layout);
        panelMarcador_42Layout.setHorizontalGroup(
            panelMarcador_42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_42, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_42Layout.setVerticalGroup(
            panelMarcador_42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_43.setBackground(new java.awt.Color(255, 255, 255));

        Num_43.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_43.setText("43");

        javax.swing.GroupLayout panelMarcador_43Layout = new javax.swing.GroupLayout(panelMarcador_43);
        panelMarcador_43.setLayout(panelMarcador_43Layout);
        panelMarcador_43Layout.setHorizontalGroup(
            panelMarcador_43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_43, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_43Layout.setVerticalGroup(
            panelMarcador_43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_43)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_44.setBackground(new java.awt.Color(255, 255, 255));

        Num_44.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_44.setText("44");

        javax.swing.GroupLayout panelMarcador_44Layout = new javax.swing.GroupLayout(panelMarcador_44);
        panelMarcador_44.setLayout(panelMarcador_44Layout);
        panelMarcador_44Layout.setHorizontalGroup(
            panelMarcador_44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_44, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_44Layout.setVerticalGroup(
            panelMarcador_44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_44)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_45.setBackground(new java.awt.Color(255, 255, 255));

        Num_45.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_45.setText("45");

        javax.swing.GroupLayout panelMarcador_45Layout = new javax.swing.GroupLayout(panelMarcador_45);
        panelMarcador_45.setLayout(panelMarcador_45Layout);
        panelMarcador_45Layout.setHorizontalGroup(
            panelMarcador_45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_45, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_45Layout.setVerticalGroup(
            panelMarcador_45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_45)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_46.setBackground(new java.awt.Color(255, 255, 255));

        Num_46.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_46.setText("46");

        javax.swing.GroupLayout panelMarcador_46Layout = new javax.swing.GroupLayout(panelMarcador_46);
        panelMarcador_46.setLayout(panelMarcador_46Layout);
        panelMarcador_46Layout.setHorizontalGroup(
            panelMarcador_46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_46, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_46Layout.setVerticalGroup(
            panelMarcador_46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_46)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_47.setBackground(new java.awt.Color(255, 255, 255));

        Num_47.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_47.setText("47");

        javax.swing.GroupLayout panelMarcador_47Layout = new javax.swing.GroupLayout(panelMarcador_47);
        panelMarcador_47.setLayout(panelMarcador_47Layout);
        panelMarcador_47Layout.setHorizontalGroup(
            panelMarcador_47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_47, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_47Layout.setVerticalGroup(
            panelMarcador_47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_47)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_48.setBackground(new java.awt.Color(255, 255, 255));

        Num_48.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_48.setText("48");

        javax.swing.GroupLayout panelMarcador_48Layout = new javax.swing.GroupLayout(panelMarcador_48);
        panelMarcador_48.setLayout(panelMarcador_48Layout);
        panelMarcador_48Layout.setHorizontalGroup(
            panelMarcador_48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_48, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_48Layout.setVerticalGroup(
            panelMarcador_48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_48)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_49.setBackground(new java.awt.Color(255, 255, 255));

        Num_49.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_49.setText("49");

        javax.swing.GroupLayout panelMarcador_49Layout = new javax.swing.GroupLayout(panelMarcador_49);
        panelMarcador_49.setLayout(panelMarcador_49Layout);
        panelMarcador_49Layout.setHorizontalGroup(
            panelMarcador_49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_49, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_49Layout.setVerticalGroup(
            panelMarcador_49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_49)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_50.setBackground(new java.awt.Color(255, 255, 255));

        Num_50.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_50.setText("50");

        javax.swing.GroupLayout panelMarcador_50Layout = new javax.swing.GroupLayout(panelMarcador_50);
        panelMarcador_50.setLayout(panelMarcador_50Layout);
        panelMarcador_50Layout.setHorizontalGroup(
            panelMarcador_50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_50, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_50Layout.setVerticalGroup(
            panelMarcador_50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_50)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_51.setBackground(new java.awt.Color(255, 255, 255));

        Num_51.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_51.setText("51");

        javax.swing.GroupLayout panelMarcador_51Layout = new javax.swing.GroupLayout(panelMarcador_51);
        panelMarcador_51.setLayout(panelMarcador_51Layout);
        panelMarcador_51Layout.setHorizontalGroup(
            panelMarcador_51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_51, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_51Layout.setVerticalGroup(
            panelMarcador_51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_51)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_52.setBackground(new java.awt.Color(255, 255, 255));

        Num_52.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_52.setText("52");

        javax.swing.GroupLayout panelMarcador_52Layout = new javax.swing.GroupLayout(panelMarcador_52);
        panelMarcador_52.setLayout(panelMarcador_52Layout);
        panelMarcador_52Layout.setHorizontalGroup(
            panelMarcador_52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_52, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_52Layout.setVerticalGroup(
            panelMarcador_52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_52)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_53.setBackground(new java.awt.Color(255, 255, 255));

        Num_53.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_53.setText("53");

        javax.swing.GroupLayout panelMarcador_53Layout = new javax.swing.GroupLayout(panelMarcador_53);
        panelMarcador_53.setLayout(panelMarcador_53Layout);
        panelMarcador_53Layout.setHorizontalGroup(
            panelMarcador_53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_53, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_53Layout.setVerticalGroup(
            panelMarcador_53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_53Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_53)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_54.setBackground(new java.awt.Color(255, 255, 255));

        Num_54.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_54.setText("54");

        javax.swing.GroupLayout panelMarcador_54Layout = new javax.swing.GroupLayout(panelMarcador_54);
        panelMarcador_54.setLayout(panelMarcador_54Layout);
        panelMarcador_54Layout.setHorizontalGroup(
            panelMarcador_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_54, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_54Layout.setVerticalGroup(
            panelMarcador_54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_54)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_55.setBackground(new java.awt.Color(255, 255, 255));

        Num_55.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_55.setText("55");

        javax.swing.GroupLayout panelMarcador_55Layout = new javax.swing.GroupLayout(panelMarcador_55);
        panelMarcador_55.setLayout(panelMarcador_55Layout);
        panelMarcador_55Layout.setHorizontalGroup(
            panelMarcador_55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_55, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_55Layout.setVerticalGroup(
            panelMarcador_55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_55)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_56.setBackground(new java.awt.Color(255, 255, 255));

        Num_56.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_56.setText("56");

        javax.swing.GroupLayout panelMarcador_56Layout = new javax.swing.GroupLayout(panelMarcador_56);
        panelMarcador_56.setLayout(panelMarcador_56Layout);
        panelMarcador_56Layout.setHorizontalGroup(
            panelMarcador_56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_56, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_56Layout.setVerticalGroup(
            panelMarcador_56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_56)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_57.setBackground(new java.awt.Color(255, 255, 255));

        Num_57.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_57.setText("57");

        javax.swing.GroupLayout panelMarcador_57Layout = new javax.swing.GroupLayout(panelMarcador_57);
        panelMarcador_57.setLayout(panelMarcador_57Layout);
        panelMarcador_57Layout.setHorizontalGroup(
            panelMarcador_57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_57, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_57Layout.setVerticalGroup(
            panelMarcador_57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_57)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_58.setBackground(new java.awt.Color(255, 255, 255));

        Num_58.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_58.setText("58");

        javax.swing.GroupLayout panelMarcador_58Layout = new javax.swing.GroupLayout(panelMarcador_58);
        panelMarcador_58.setLayout(panelMarcador_58Layout);
        panelMarcador_58Layout.setHorizontalGroup(
            panelMarcador_58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_58, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_58Layout.setVerticalGroup(
            panelMarcador_58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_58)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_59.setBackground(new java.awt.Color(255, 255, 255));

        Num_59.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_59.setText("59");

        javax.swing.GroupLayout panelMarcador_59Layout = new javax.swing.GroupLayout(panelMarcador_59);
        panelMarcador_59.setLayout(panelMarcador_59Layout);
        panelMarcador_59Layout.setHorizontalGroup(
            panelMarcador_59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_59, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_59Layout.setVerticalGroup(
            panelMarcador_59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_59Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_59)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_60.setBackground(new java.awt.Color(255, 255, 255));

        Num_60.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_60.setText("60");

        javax.swing.GroupLayout panelMarcador_60Layout = new javax.swing.GroupLayout(panelMarcador_60);
        panelMarcador_60.setLayout(panelMarcador_60Layout);
        panelMarcador_60Layout.setHorizontalGroup(
            panelMarcador_60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_60, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_60Layout.setVerticalGroup(
            panelMarcador_60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_60Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_60)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_61.setBackground(new java.awt.Color(255, 255, 255));

        Num_61.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_61.setText("61");

        javax.swing.GroupLayout panelMarcador_61Layout = new javax.swing.GroupLayout(panelMarcador_61);
        panelMarcador_61.setLayout(panelMarcador_61Layout);
        panelMarcador_61Layout.setHorizontalGroup(
            panelMarcador_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_61, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_61Layout.setVerticalGroup(
            panelMarcador_61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_61)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_62.setBackground(new java.awt.Color(255, 255, 255));

        Num_62.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_62.setText("62");

        javax.swing.GroupLayout panelMarcador_62Layout = new javax.swing.GroupLayout(panelMarcador_62);
        panelMarcador_62.setLayout(panelMarcador_62Layout);
        panelMarcador_62Layout.setHorizontalGroup(
            panelMarcador_62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_62, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_62Layout.setVerticalGroup(
            panelMarcador_62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_62)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_63.setBackground(new java.awt.Color(255, 255, 255));

        Num_63.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_63.setText("63");

        javax.swing.GroupLayout panelMarcador_63Layout = new javax.swing.GroupLayout(panelMarcador_63);
        panelMarcador_63.setLayout(panelMarcador_63Layout);
        panelMarcador_63Layout.setHorizontalGroup(
            panelMarcador_63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_63, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_63Layout.setVerticalGroup(
            panelMarcador_63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_63Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_63)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_64.setBackground(new java.awt.Color(255, 255, 255));

        Num_64.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_64.setText("64");

        javax.swing.GroupLayout panelMarcador_64Layout = new javax.swing.GroupLayout(panelMarcador_64);
        panelMarcador_64.setLayout(panelMarcador_64Layout);
        panelMarcador_64Layout.setHorizontalGroup(
            panelMarcador_64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_64, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_64Layout.setVerticalGroup(
            panelMarcador_64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_64Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_64)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_65.setBackground(new java.awt.Color(255, 255, 255));

        Num_65.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_65.setText("65");

        javax.swing.GroupLayout panelMarcador_65Layout = new javax.swing.GroupLayout(panelMarcador_65);
        panelMarcador_65.setLayout(panelMarcador_65Layout);
        panelMarcador_65Layout.setHorizontalGroup(
            panelMarcador_65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_65, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_65Layout.setVerticalGroup(
            panelMarcador_65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_65Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_65)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_66.setBackground(new java.awt.Color(255, 255, 255));

        Num_66.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_66.setText("66");

        javax.swing.GroupLayout panelMarcador_66Layout = new javax.swing.GroupLayout(panelMarcador_66);
        panelMarcador_66.setLayout(panelMarcador_66Layout);
        panelMarcador_66Layout.setHorizontalGroup(
            panelMarcador_66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_66, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_66Layout.setVerticalGroup(
            panelMarcador_66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_66Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_66)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_67.setBackground(new java.awt.Color(255, 255, 255));

        Num_67.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_67.setText("67");

        javax.swing.GroupLayout panelMarcador_67Layout = new javax.swing.GroupLayout(panelMarcador_67);
        panelMarcador_67.setLayout(panelMarcador_67Layout);
        panelMarcador_67Layout.setHorizontalGroup(
            panelMarcador_67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_67, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_67Layout.setVerticalGroup(
            panelMarcador_67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_67Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_67)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_68.setBackground(new java.awt.Color(255, 255, 255));

        Num_68.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_68.setText("68");

        javax.swing.GroupLayout panelMarcador_68Layout = new javax.swing.GroupLayout(panelMarcador_68);
        panelMarcador_68.setLayout(panelMarcador_68Layout);
        panelMarcador_68Layout.setHorizontalGroup(
            panelMarcador_68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_68, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_68Layout.setVerticalGroup(
            panelMarcador_68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_68Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_68)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_69.setBackground(new java.awt.Color(255, 255, 255));

        Num_69.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_69.setText("69");

        javax.swing.GroupLayout panelMarcador_69Layout = new javax.swing.GroupLayout(panelMarcador_69);
        panelMarcador_69.setLayout(panelMarcador_69Layout);
        panelMarcador_69Layout.setHorizontalGroup(
            panelMarcador_69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_69, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_69Layout.setVerticalGroup(
            panelMarcador_69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_69Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_69)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_70.setBackground(new java.awt.Color(255, 255, 255));

        Num_70.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_70.setText("70");

        javax.swing.GroupLayout panelMarcador_70Layout = new javax.swing.GroupLayout(panelMarcador_70);
        panelMarcador_70.setLayout(panelMarcador_70Layout);
        panelMarcador_70Layout.setHorizontalGroup(
            panelMarcador_70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_70, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_70Layout.setVerticalGroup(
            panelMarcador_70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_70Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_70)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_71.setBackground(new java.awt.Color(255, 255, 255));

        Num_71.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_71.setText("71");

        javax.swing.GroupLayout panelMarcador_71Layout = new javax.swing.GroupLayout(panelMarcador_71);
        panelMarcador_71.setLayout(panelMarcador_71Layout);
        panelMarcador_71Layout.setHorizontalGroup(
            panelMarcador_71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_71, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_71Layout.setVerticalGroup(
            panelMarcador_71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_71Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_71)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_72.setBackground(new java.awt.Color(255, 255, 255));

        Num_72.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_72.setText("72");

        javax.swing.GroupLayout panelMarcador_72Layout = new javax.swing.GroupLayout(panelMarcador_72);
        panelMarcador_72.setLayout(panelMarcador_72Layout);
        panelMarcador_72Layout.setHorizontalGroup(
            panelMarcador_72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_72, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_72Layout.setVerticalGroup(
            panelMarcador_72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_72Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_72)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_73.setBackground(new java.awt.Color(255, 255, 255));

        Num_73.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_73.setText("73");

        javax.swing.GroupLayout panelMarcador_73Layout = new javax.swing.GroupLayout(panelMarcador_73);
        panelMarcador_73.setLayout(panelMarcador_73Layout);
        panelMarcador_73Layout.setHorizontalGroup(
            panelMarcador_73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_73, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_73Layout.setVerticalGroup(
            panelMarcador_73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_73Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_73)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_74.setBackground(new java.awt.Color(255, 255, 255));

        Num_74.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_74.setText("74");

        javax.swing.GroupLayout panelMarcador_74Layout = new javax.swing.GroupLayout(panelMarcador_74);
        panelMarcador_74.setLayout(panelMarcador_74Layout);
        panelMarcador_74Layout.setHorizontalGroup(
            panelMarcador_74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_74, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_74Layout.setVerticalGroup(
            panelMarcador_74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_74Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_74)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMarcador_75.setBackground(new java.awt.Color(255, 255, 255));

        Num_75.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        Num_75.setText("75");

        javax.swing.GroupLayout panelMarcador_75Layout = new javax.swing.GroupLayout(panelMarcador_75);
        panelMarcador_75.setLayout(panelMarcador_75Layout);
        panelMarcador_75Layout.setHorizontalGroup(
            panelMarcador_75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Num_75, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );
        panelMarcador_75Layout.setVerticalGroup(
            panelMarcador_75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcador_75Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Num_75)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TableroConNumeroLayout = new javax.swing.GroupLayout(TableroConNumero);
        TableroConNumero.setLayout(TableroConNumeroLayout);
        TableroConNumeroLayout.setHorizontalGroup(
            TableroConNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableroConNumeroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TableroConNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TableroConNumeroLayout.createSequentialGroup()
                        .addGroup(TableroConNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(TableroConNumeroLayout.createSequentialGroup()
                                .addComponent(panelMarcador_25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelMarcador_26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelMarcador_27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelMarcador_28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelMarcador_29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelMarcador_30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelMarcador_31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelMarcador_32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelMarcador_33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelMarcador_34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelMarcador_35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TableroConNumeroLayout.createSequentialGroup()
                                .addGroup(TableroConNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(TableroConNumeroLayout.createSequentialGroup()
                                        .addComponent(panelMarcador_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(panelMarcador_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(TableroConNumeroLayout.createSequentialGroup()
                                        .addComponent(panelMarcador_13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(panelMarcador_14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TableroConNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(TableroConNumeroLayout.createSequentialGroup()
                                        .addComponent(panelMarcador_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(panelMarcador_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(TableroConNumeroLayout.createSequentialGroup()
                                        .addComponent(panelMarcador_15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(panelMarcador_16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TableroConNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(TableroConNumeroLayout.createSequentialGroup()
                                        .addComponent(panelMarcador_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(panelMarcador_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(TableroConNumeroLayout.createSequentialGroup()
                                        .addComponent(panelMarcador_17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(panelMarcador_18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TableroConNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelMarcador_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelMarcador_19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TableroConNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(TableroConNumeroLayout.createSequentialGroup()
                                        .addComponent(panelMarcador_20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(panelMarcador_21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(TableroConNumeroLayout.createSequentialGroup()
                                        .addComponent(panelMarcador_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(panelMarcador_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TableroConNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelMarcador_10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelMarcador_22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TableroConNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelMarcador_11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelMarcador_23, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TableroConNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TableroConNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(panelMarcador_12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panelMarcador_24, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(panelMarcador_36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TableroConNumeroLayout.createSequentialGroup()
                        .addComponent(panelMarcador_37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TableroConNumeroLayout.createSequentialGroup()
                        .addComponent(panelMarcador_49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TableroConNumeroLayout.createSequentialGroup()
                        .addComponent(panelMarcador_61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TableroConNumeroLayout.createSequentialGroup()
                        .addComponent(panelMarcador_73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelMarcador_75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        TableroConNumeroLayout.setVerticalGroup(
            TableroConNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableroConNumeroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TableroConNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelMarcador_10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarcador_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarcador_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarcador_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarcador_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarcador_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarcador_11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarcador_12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarcador_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarcador_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarcador_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarcador_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TableroConNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMarcador_13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarcador_14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarcador_15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarcador_16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarcador_17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarcador_18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarcador_19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarcador_20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarcador_21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarcador_22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarcador_23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarcador_24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TableroConNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMarcador_25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TableroConNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMarcador_37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TableroConNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMarcador_49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TableroConNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMarcador_61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TableroConNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMarcador_73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMarcador_75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TableroConNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TableroConNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Num_1;
    private javax.swing.JLabel Num_10;
    private javax.swing.JLabel Num_11;
    private javax.swing.JLabel Num_12;
    private javax.swing.JLabel Num_13;
    private javax.swing.JLabel Num_14;
    private javax.swing.JLabel Num_15;
    private javax.swing.JLabel Num_16;
    private javax.swing.JLabel Num_17;
    private javax.swing.JLabel Num_18;
    private javax.swing.JLabel Num_19;
    private javax.swing.JLabel Num_2;
    private javax.swing.JLabel Num_20;
    private javax.swing.JLabel Num_21;
    private javax.swing.JLabel Num_22;
    private javax.swing.JLabel Num_23;
    private javax.swing.JLabel Num_24;
    private javax.swing.JLabel Num_25;
    private javax.swing.JLabel Num_26;
    private javax.swing.JLabel Num_27;
    private javax.swing.JLabel Num_28;
    private javax.swing.JLabel Num_29;
    private javax.swing.JLabel Num_3;
    private javax.swing.JLabel Num_30;
    private javax.swing.JLabel Num_31;
    private javax.swing.JLabel Num_32;
    private javax.swing.JLabel Num_33;
    private javax.swing.JLabel Num_34;
    private javax.swing.JLabel Num_35;
    private javax.swing.JLabel Num_36;
    private javax.swing.JLabel Num_37;
    private javax.swing.JLabel Num_38;
    private javax.swing.JLabel Num_39;
    private javax.swing.JLabel Num_4;
    private javax.swing.JLabel Num_40;
    private javax.swing.JLabel Num_41;
    private javax.swing.JLabel Num_42;
    private javax.swing.JLabel Num_43;
    private javax.swing.JLabel Num_44;
    private javax.swing.JLabel Num_45;
    private javax.swing.JLabel Num_46;
    private javax.swing.JLabel Num_47;
    private javax.swing.JLabel Num_48;
    private javax.swing.JLabel Num_49;
    private javax.swing.JLabel Num_5;
    private javax.swing.JLabel Num_50;
    private javax.swing.JLabel Num_51;
    private javax.swing.JLabel Num_52;
    private javax.swing.JLabel Num_53;
    private javax.swing.JLabel Num_54;
    private javax.swing.JLabel Num_55;
    private javax.swing.JLabel Num_56;
    private javax.swing.JLabel Num_57;
    private javax.swing.JLabel Num_58;
    private javax.swing.JLabel Num_59;
    private javax.swing.JLabel Num_6;
    private javax.swing.JLabel Num_60;
    private javax.swing.JLabel Num_61;
    private javax.swing.JLabel Num_62;
    private javax.swing.JLabel Num_63;
    private javax.swing.JLabel Num_64;
    private javax.swing.JLabel Num_65;
    private javax.swing.JLabel Num_66;
    private javax.swing.JLabel Num_67;
    private javax.swing.JLabel Num_68;
    private javax.swing.JLabel Num_69;
    private javax.swing.JLabel Num_7;
    private javax.swing.JLabel Num_70;
    private javax.swing.JLabel Num_71;
    private javax.swing.JLabel Num_72;
    private javax.swing.JLabel Num_73;
    private javax.swing.JLabel Num_74;
    private javax.swing.JLabel Num_75;
    private javax.swing.JLabel Num_8;
    private javax.swing.JLabel Num_9;
    private javax.swing.JPanel TableroConNumero;
    private javax.swing.JPanel panelMarcador_1;
    private javax.swing.JPanel panelMarcador_10;
    private javax.swing.JPanel panelMarcador_11;
    private javax.swing.JPanel panelMarcador_12;
    private javax.swing.JPanel panelMarcador_13;
    private javax.swing.JPanel panelMarcador_14;
    private javax.swing.JPanel panelMarcador_15;
    private javax.swing.JPanel panelMarcador_16;
    private javax.swing.JPanel panelMarcador_17;
    private javax.swing.JPanel panelMarcador_18;
    private javax.swing.JPanel panelMarcador_19;
    private javax.swing.JPanel panelMarcador_2;
    private javax.swing.JPanel panelMarcador_20;
    private javax.swing.JPanel panelMarcador_21;
    private javax.swing.JPanel panelMarcador_22;
    private javax.swing.JPanel panelMarcador_23;
    private javax.swing.JPanel panelMarcador_24;
    private javax.swing.JPanel panelMarcador_25;
    private javax.swing.JPanel panelMarcador_26;
    private javax.swing.JPanel panelMarcador_27;
    private javax.swing.JPanel panelMarcador_28;
    private javax.swing.JPanel panelMarcador_29;
    private javax.swing.JPanel panelMarcador_3;
    private javax.swing.JPanel panelMarcador_30;
    private javax.swing.JPanel panelMarcador_31;
    private javax.swing.JPanel panelMarcador_32;
    private javax.swing.JPanel panelMarcador_33;
    private javax.swing.JPanel panelMarcador_34;
    private javax.swing.JPanel panelMarcador_35;
    private javax.swing.JPanel panelMarcador_36;
    private javax.swing.JPanel panelMarcador_37;
    private javax.swing.JPanel panelMarcador_38;
    private javax.swing.JPanel panelMarcador_39;
    private javax.swing.JPanel panelMarcador_4;
    private javax.swing.JPanel panelMarcador_40;
    private javax.swing.JPanel panelMarcador_41;
    private javax.swing.JPanel panelMarcador_42;
    private javax.swing.JPanel panelMarcador_43;
    private javax.swing.JPanel panelMarcador_44;
    private javax.swing.JPanel panelMarcador_45;
    private javax.swing.JPanel panelMarcador_46;
    private javax.swing.JPanel panelMarcador_47;
    private javax.swing.JPanel panelMarcador_48;
    private javax.swing.JPanel panelMarcador_49;
    private javax.swing.JPanel panelMarcador_5;
    private javax.swing.JPanel panelMarcador_50;
    private javax.swing.JPanel panelMarcador_51;
    private javax.swing.JPanel panelMarcador_52;
    private javax.swing.JPanel panelMarcador_53;
    private javax.swing.JPanel panelMarcador_54;
    private javax.swing.JPanel panelMarcador_55;
    private javax.swing.JPanel panelMarcador_56;
    private javax.swing.JPanel panelMarcador_57;
    private javax.swing.JPanel panelMarcador_58;
    private javax.swing.JPanel panelMarcador_59;
    private javax.swing.JPanel panelMarcador_6;
    private javax.swing.JPanel panelMarcador_60;
    private javax.swing.JPanel panelMarcador_61;
    private javax.swing.JPanel panelMarcador_62;
    private javax.swing.JPanel panelMarcador_63;
    private javax.swing.JPanel panelMarcador_64;
    private javax.swing.JPanel panelMarcador_65;
    private javax.swing.JPanel panelMarcador_66;
    private javax.swing.JPanel panelMarcador_67;
    private javax.swing.JPanel panelMarcador_68;
    private javax.swing.JPanel panelMarcador_69;
    private javax.swing.JPanel panelMarcador_7;
    private javax.swing.JPanel panelMarcador_70;
    private javax.swing.JPanel panelMarcador_71;
    private javax.swing.JPanel panelMarcador_72;
    private javax.swing.JPanel panelMarcador_73;
    private javax.swing.JPanel panelMarcador_74;
    private javax.swing.JPanel panelMarcador_75;
    private javax.swing.JPanel panelMarcador_8;
    private javax.swing.JPanel panelMarcador_9;
    // End of variables declaration//GEN-END:variables
}
