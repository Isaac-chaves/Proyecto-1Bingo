/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import java.awt.Color;
import modelo.Carton;

/**
 *
 * @author isaac
 */
public class PanelCartones extends javax.swing.JPanel {

    /**
     * Creates new form PanelCartones
     */
    public PanelCartones() {
        initComponents();
    }
/**
     * Este método cambia el color de fondo de los paneles a rojo.
     */
    public void pintarRojo() {
        Color rojo = Color.RED;

        CartonCambiacolor1.setBackground(rojo);
        CartonCambiacolor2.setBackground(rojo);
        CartonCambiacolor3.setBackground(rojo);
        CartonCambiacolor4.setBackground(rojo);
        CartonCambiacolor5.setBackground(rojo);
        CartonCambiacolor6.setBackground(rojo);
        CartonCambiacolor7.setBackground(rojo);
        CartonCambiacolor8.setBackground(rojo);
        CartonCambiacolor9.setBackground(rojo);
        CartonCambiacolor10.setBackground(rojo);
        CartonCambiacolor11.setBackground(rojo);
        CartonCambiacolor12.setBackground(rojo);
        CartonCambiacolor13.setBackground(rojo);
        CartonCambiacolor14.setBackground(rojo);
        CartonCambiacolor15.setBackground(rojo);
        CartonCambiacolor16.setBackground(rojo);
        CartonCambiacolor17.setBackground(rojo);
        CartonCambiacolor18.setBackground(rojo);
        CartonCambiacolor19.setBackground(rojo);
        CartonCambiacolor20.setBackground(rojo);
        CartonCambiacolor21.setBackground(rojo);
        CartonCambiacolor22.setBackground(rojo);
        CartonCambiacolor23.setBackground(rojo);
        CartonCambiacolor24.setBackground(rojo);
        CartonCambiacolor25.setBackground(rojo);

        this.repaint(); // Fuerza el repintado del panel para mostrar el color
    }

// Dentro de la clase PanelCartones:
/**
 * Cambia el tema de color para los paneles de cartones.
 * @param esOscuro true para tema oscuro, false para tema claro.
 */
public void cambiarTema(boolean esOscuro) {
    Color fondoPrincipal, fondoCarton;
    Color colorTexto;

    if (esOscuro) {
        // Tema Oscuro:
        fondoPrincipal = new Color(30, 30, 30); // Fondo oscuro para el contenedor
        fondoCarton = new Color(60, 63, 65); // Color de los cartones
        colorTexto = Color.WHITE;
    } else {
        // Tema Claro:
        fondoPrincipal = new Color(240, 240, 240); // Fondo claro para el contenedor
        fondoCarton = Color.WHITE; // Color de los cartones
        colorTexto = Color.BLACK;
    }

    // Cambiar el fondo principal del panel
    FondoCarton.setBackground(fondoPrincipal);
    
    // Arrays que contienen tus 25 JPanels y JLabels de cartón (Asegúrate de que estas variables sean accesibles)
    javax.swing.JPanel[] panelesCarton = {
        CartonCambiacolor1, CartonCambiacolor2, CartonCambiacolor3, CartonCambiacolor4, CartonCambiacolor5,
        CartonCambiacolor6, CartonCambiacolor7, CartonCambiacolor8, CartonCambiacolor9, CartonCambiacolor10,
        CartonCambiacolor11, CartonCambiacolor12, CartonCambiacolor13, CartonCambiacolor14, CartonCambiacolor15,
        CartonCambiacolor16, CartonCambiacolor17, CartonCambiacolor18, CartonCambiacolor19, CartonCambiacolor20,
        CartonCambiacolor21, CartonCambiacolor22, CartonCambiacolor23, CartonCambiacolor24, CartonCambiacolor25
    };

    javax.swing.JLabel[] etiquetasNumeros = {
        ContenedorNumCarton1, ContenedorNumCarton2, ContenedorNumCarton3, ContenedorNumCarton4, ContenedorNumCarton5,
        ContenedorNumCarton6, ContenedorNumCarton7, ContenedorNumCarton8, ContenedorNumCarton9, ContenedorNumCarton10,
        ContenedorNumCarton11, ContenedorNumCarton12, ContenedorNumCarton13, ContenedorNumCarton14, ContenedorNumCarton15,
        ContenedorNumCarton16, ContenedorNumCarton17, ContenedorNumCarton18, ContenedorNumCarton19, ContenedorNumCarton20,
        ContenedorNumCarton21, ContenedorNumCarton22, ContenedorNumCarton23, ContenedorNumCarton24, ContenedorNumCarton25
    };

    // Aplicar los colores con la validación de color rojo
    for (int i = 0; i < panelesCarton.length; i++) {
        javax.swing.JPanel panel = panelesCarton[i];
        javax.swing.JLabel etiqueta = etiquetasNumeros[i];
        
        // VALIDACIÓN: Solo cambiar el color si el fondo actual NO es rojo.
        if (panel != null && !java.awt.Color.RED.equals(panel.getBackground())) {
            panel.setBackground(fondoCarton);
            etiqueta.setForeground(colorTexto);
        } else if (panel != null) {
            // Si el panel está en rojo o un color de estado, asegurar texto blanco para visibilidad.
            etiqueta.setForeground(java.awt.Color.WHITE); 
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

        FondoCarton = new javax.swing.JPanel();
        IconBingoSuperior = new javax.swing.JLabel();
        CartonCambiacolor1 = new javax.swing.JPanel();
        ContenedorNumCarton1 = new javax.swing.JLabel();
        CartonCambiacolor2 = new javax.swing.JPanel();
        ContenedorNumCarton2 = new javax.swing.JLabel();
        CartonCambiacolor3 = new javax.swing.JPanel();
        ContenedorNumCarton3 = new javax.swing.JLabel();
        CartonCambiacolor4 = new javax.swing.JPanel();
        ContenedorNumCarton4 = new javax.swing.JLabel();
        CartonCambiacolor5 = new javax.swing.JPanel();
        ContenedorNumCarton5 = new javax.swing.JLabel();
        CartonCambiacolor6 = new javax.swing.JPanel();
        ContenedorNumCarton6 = new javax.swing.JLabel();
        CartonCambiacolor7 = new javax.swing.JPanel();
        ContenedorNumCarton7 = new javax.swing.JLabel();
        CartonCambiacolor8 = new javax.swing.JPanel();
        ContenedorNumCarton8 = new javax.swing.JLabel();
        CartonCambiacolor9 = new javax.swing.JPanel();
        ContenedorNumCarton9 = new javax.swing.JLabel();
        CartonCambiacolor10 = new javax.swing.JPanel();
        ContenedorNumCarton10 = new javax.swing.JLabel();
        CartonCambiacolor11 = new javax.swing.JPanel();
        ContenedorNumCarton11 = new javax.swing.JLabel();
        CartonCambiacolor12 = new javax.swing.JPanel();
        ContenedorNumCarton12 = new javax.swing.JLabel();
        CartonCambiacolor13 = new javax.swing.JPanel();
        ContenedorNumCarton13 = new javax.swing.JLabel();
        CartonCambiacolor14 = new javax.swing.JPanel();
        ContenedorNumCarton14 = new javax.swing.JLabel();
        CartonCambiacolor15 = new javax.swing.JPanel();
        ContenedorNumCarton15 = new javax.swing.JLabel();
        CartonCambiacolor16 = new javax.swing.JPanel();
        ContenedorNumCarton16 = new javax.swing.JLabel();
        CartonCambiacolor17 = new javax.swing.JPanel();
        ContenedorNumCarton17 = new javax.swing.JLabel();
        CartonCambiacolor18 = new javax.swing.JPanel();
        ContenedorNumCarton18 = new javax.swing.JLabel();
        CartonCambiacolor19 = new javax.swing.JPanel();
        ContenedorNumCarton19 = new javax.swing.JLabel();
        CartonCambiacolor20 = new javax.swing.JPanel();
        ContenedorNumCarton20 = new javax.swing.JLabel();
        CartonCambiacolor21 = new javax.swing.JPanel();
        ContenedorNumCarton21 = new javax.swing.JLabel();
        CartonCambiacolor22 = new javax.swing.JPanel();
        ContenedorNumCarton22 = new javax.swing.JLabel();
        CartonCambiacolor23 = new javax.swing.JPanel();
        ContenedorNumCarton23 = new javax.swing.JLabel();
        CartonCambiacolor24 = new javax.swing.JPanel();
        ContenedorNumCarton24 = new javax.swing.JLabel();
        CartonCambiacolor25 = new javax.swing.JPanel();
        ContenedorNumCarton25 = new javax.swing.JLabel();

        FondoCarton.setBackground(new java.awt.Color(51, 51, 51));

        IconBingoSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/superiorBingo.png.jpg"))); // NOI18N
        IconBingoSuperior.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                IconBingoSuperiorAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        ContenedorNumCarton1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton1.setText("0");

        javax.swing.GroupLayout CartonCambiacolor1Layout = new javax.swing.GroupLayout(CartonCambiacolor1);
        CartonCambiacolor1.setLayout(CartonCambiacolor1Layout);
        CartonCambiacolor1Layout.setHorizontalGroup(
            CartonCambiacolor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton1)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor1Layout.setVerticalGroup(
            CartonCambiacolor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton2.setText("0");

        javax.swing.GroupLayout CartonCambiacolor2Layout = new javax.swing.GroupLayout(CartonCambiacolor2);
        CartonCambiacolor2.setLayout(CartonCambiacolor2Layout);
        CartonCambiacolor2Layout.setHorizontalGroup(
            CartonCambiacolor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton2)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor2Layout.setVerticalGroup(
            CartonCambiacolor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton3.setText("0");

        javax.swing.GroupLayout CartonCambiacolor3Layout = new javax.swing.GroupLayout(CartonCambiacolor3);
        CartonCambiacolor3.setLayout(CartonCambiacolor3Layout);
        CartonCambiacolor3Layout.setHorizontalGroup(
            CartonCambiacolor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton3)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor3Layout.setVerticalGroup(
            CartonCambiacolor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton3)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton4.setText("0");

        javax.swing.GroupLayout CartonCambiacolor4Layout = new javax.swing.GroupLayout(CartonCambiacolor4);
        CartonCambiacolor4.setLayout(CartonCambiacolor4Layout);
        CartonCambiacolor4Layout.setHorizontalGroup(
            CartonCambiacolor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton4)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor4Layout.setVerticalGroup(
            CartonCambiacolor4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton4)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton5.setText("0");

        javax.swing.GroupLayout CartonCambiacolor5Layout = new javax.swing.GroupLayout(CartonCambiacolor5);
        CartonCambiacolor5.setLayout(CartonCambiacolor5Layout);
        CartonCambiacolor5Layout.setHorizontalGroup(
            CartonCambiacolor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton5)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor5Layout.setVerticalGroup(
            CartonCambiacolor5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton5)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton6.setText("0");

        javax.swing.GroupLayout CartonCambiacolor6Layout = new javax.swing.GroupLayout(CartonCambiacolor6);
        CartonCambiacolor6.setLayout(CartonCambiacolor6Layout);
        CartonCambiacolor6Layout.setHorizontalGroup(
            CartonCambiacolor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton6)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor6Layout.setVerticalGroup(
            CartonCambiacolor6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton6)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton7.setText("0");

        javax.swing.GroupLayout CartonCambiacolor7Layout = new javax.swing.GroupLayout(CartonCambiacolor7);
        CartonCambiacolor7.setLayout(CartonCambiacolor7Layout);
        CartonCambiacolor7Layout.setHorizontalGroup(
            CartonCambiacolor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton7)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor7Layout.setVerticalGroup(
            CartonCambiacolor7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton7)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton8.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton8.setText("0");

        javax.swing.GroupLayout CartonCambiacolor8Layout = new javax.swing.GroupLayout(CartonCambiacolor8);
        CartonCambiacolor8.setLayout(CartonCambiacolor8Layout);
        CartonCambiacolor8Layout.setHorizontalGroup(
            CartonCambiacolor8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton8)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor8Layout.setVerticalGroup(
            CartonCambiacolor8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton8)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton9.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton9.setText("0");

        javax.swing.GroupLayout CartonCambiacolor9Layout = new javax.swing.GroupLayout(CartonCambiacolor9);
        CartonCambiacolor9.setLayout(CartonCambiacolor9Layout);
        CartonCambiacolor9Layout.setHorizontalGroup(
            CartonCambiacolor9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton9)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor9Layout.setVerticalGroup(
            CartonCambiacolor9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton9)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton10.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton10.setText("0");

        javax.swing.GroupLayout CartonCambiacolor10Layout = new javax.swing.GroupLayout(CartonCambiacolor10);
        CartonCambiacolor10.setLayout(CartonCambiacolor10Layout);
        CartonCambiacolor10Layout.setHorizontalGroup(
            CartonCambiacolor10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor10Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton10)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor10Layout.setVerticalGroup(
            CartonCambiacolor10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor10Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton10)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton11.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton11.setText("0");

        javax.swing.GroupLayout CartonCambiacolor11Layout = new javax.swing.GroupLayout(CartonCambiacolor11);
        CartonCambiacolor11.setLayout(CartonCambiacolor11Layout);
        CartonCambiacolor11Layout.setHorizontalGroup(
            CartonCambiacolor11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor11Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton11)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor11Layout.setVerticalGroup(
            CartonCambiacolor11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor11Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton11)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton12.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton12.setText("0");

        javax.swing.GroupLayout CartonCambiacolor12Layout = new javax.swing.GroupLayout(CartonCambiacolor12);
        CartonCambiacolor12.setLayout(CartonCambiacolor12Layout);
        CartonCambiacolor12Layout.setHorizontalGroup(
            CartonCambiacolor12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor12Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton12)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor12Layout.setVerticalGroup(
            CartonCambiacolor12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor12Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton12)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton13.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton13.setText("0");

        javax.swing.GroupLayout CartonCambiacolor13Layout = new javax.swing.GroupLayout(CartonCambiacolor13);
        CartonCambiacolor13.setLayout(CartonCambiacolor13Layout);
        CartonCambiacolor13Layout.setHorizontalGroup(
            CartonCambiacolor13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor13Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton13)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor13Layout.setVerticalGroup(
            CartonCambiacolor13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor13Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton13)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton14.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton14.setText("Free");

        javax.swing.GroupLayout CartonCambiacolor14Layout = new javax.swing.GroupLayout(CartonCambiacolor14);
        CartonCambiacolor14.setLayout(CartonCambiacolor14Layout);
        CartonCambiacolor14Layout.setHorizontalGroup(
            CartonCambiacolor14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor14Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CartonCambiacolor14Layout.setVerticalGroup(
            CartonCambiacolor14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor14Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(ContenedorNumCarton14)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        ContenedorNumCarton15.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton15.setText("0");

        javax.swing.GroupLayout CartonCambiacolor15Layout = new javax.swing.GroupLayout(CartonCambiacolor15);
        CartonCambiacolor15.setLayout(CartonCambiacolor15Layout);
        CartonCambiacolor15Layout.setHorizontalGroup(
            CartonCambiacolor15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor15Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton15)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor15Layout.setVerticalGroup(
            CartonCambiacolor15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor15Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton15)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton16.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton16.setText("0");

        javax.swing.GroupLayout CartonCambiacolor16Layout = new javax.swing.GroupLayout(CartonCambiacolor16);
        CartonCambiacolor16.setLayout(CartonCambiacolor16Layout);
        CartonCambiacolor16Layout.setHorizontalGroup(
            CartonCambiacolor16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor16Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton16)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor16Layout.setVerticalGroup(
            CartonCambiacolor16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor16Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton16)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton17.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton17.setText("0");

        javax.swing.GroupLayout CartonCambiacolor17Layout = new javax.swing.GroupLayout(CartonCambiacolor17);
        CartonCambiacolor17.setLayout(CartonCambiacolor17Layout);
        CartonCambiacolor17Layout.setHorizontalGroup(
            CartonCambiacolor17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor17Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton17)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor17Layout.setVerticalGroup(
            CartonCambiacolor17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor17Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton17)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton18.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton18.setText("0");

        javax.swing.GroupLayout CartonCambiacolor18Layout = new javax.swing.GroupLayout(CartonCambiacolor18);
        CartonCambiacolor18.setLayout(CartonCambiacolor18Layout);
        CartonCambiacolor18Layout.setHorizontalGroup(
            CartonCambiacolor18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor18Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton18)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor18Layout.setVerticalGroup(
            CartonCambiacolor18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor18Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton18)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton19.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton19.setText("0");

        javax.swing.GroupLayout CartonCambiacolor19Layout = new javax.swing.GroupLayout(CartonCambiacolor19);
        CartonCambiacolor19.setLayout(CartonCambiacolor19Layout);
        CartonCambiacolor19Layout.setHorizontalGroup(
            CartonCambiacolor19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor19Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton19)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor19Layout.setVerticalGroup(
            CartonCambiacolor19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor19Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton19)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton20.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton20.setText("0");

        javax.swing.GroupLayout CartonCambiacolor20Layout = new javax.swing.GroupLayout(CartonCambiacolor20);
        CartonCambiacolor20.setLayout(CartonCambiacolor20Layout);
        CartonCambiacolor20Layout.setHorizontalGroup(
            CartonCambiacolor20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor20Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton20)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor20Layout.setVerticalGroup(
            CartonCambiacolor20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor20Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton20)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton21.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton21.setText("0");

        javax.swing.GroupLayout CartonCambiacolor21Layout = new javax.swing.GroupLayout(CartonCambiacolor21);
        CartonCambiacolor21.setLayout(CartonCambiacolor21Layout);
        CartonCambiacolor21Layout.setHorizontalGroup(
            CartonCambiacolor21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor21Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton21)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor21Layout.setVerticalGroup(
            CartonCambiacolor21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor21Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton21)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton22.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton22.setText("0");

        javax.swing.GroupLayout CartonCambiacolor22Layout = new javax.swing.GroupLayout(CartonCambiacolor22);
        CartonCambiacolor22.setLayout(CartonCambiacolor22Layout);
        CartonCambiacolor22Layout.setHorizontalGroup(
            CartonCambiacolor22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor22Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton22)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor22Layout.setVerticalGroup(
            CartonCambiacolor22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor22Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton22)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton23.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton23.setText("0");

        javax.swing.GroupLayout CartonCambiacolor23Layout = new javax.swing.GroupLayout(CartonCambiacolor23);
        CartonCambiacolor23.setLayout(CartonCambiacolor23Layout);
        CartonCambiacolor23Layout.setHorizontalGroup(
            CartonCambiacolor23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor23Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton23)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor23Layout.setVerticalGroup(
            CartonCambiacolor23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor23Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton23)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton24.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton24.setText("0");

        javax.swing.GroupLayout CartonCambiacolor24Layout = new javax.swing.GroupLayout(CartonCambiacolor24);
        CartonCambiacolor24.setLayout(CartonCambiacolor24Layout);
        CartonCambiacolor24Layout.setHorizontalGroup(
            CartonCambiacolor24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor24Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton24)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor24Layout.setVerticalGroup(
            CartonCambiacolor24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor24Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton24)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        ContenedorNumCarton25.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ContenedorNumCarton25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContenedorNumCarton25.setText("0");

        javax.swing.GroupLayout CartonCambiacolor25Layout = new javax.swing.GroupLayout(CartonCambiacolor25);
        CartonCambiacolor25.setLayout(CartonCambiacolor25Layout);
        CartonCambiacolor25Layout.setHorizontalGroup(
            CartonCambiacolor25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor25Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ContenedorNumCarton25)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        CartonCambiacolor25Layout.setVerticalGroup(
            CartonCambiacolor25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartonCambiacolor25Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ContenedorNumCarton25)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FondoCartonLayout = new javax.swing.GroupLayout(FondoCarton);
        FondoCarton.setLayout(FondoCartonLayout);
        FondoCartonLayout.setHorizontalGroup(
            FondoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoCartonLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(IconBingoSuperior)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoCartonLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(FondoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CartonCambiacolor20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CartonCambiacolor15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CartonCambiacolor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CartonCambiacolor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CartonCambiacolor12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoCartonLayout.createSequentialGroup()
                        .addComponent(CartonCambiacolor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CartonCambiacolor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CartonCambiacolor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CartonCambiacolor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoCartonLayout.createSequentialGroup()
                        .addGroup(FondoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(FondoCartonLayout.createSequentialGroup()
                                .addComponent(CartonCambiacolor7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CartonCambiacolor8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FondoCartonLayout.createSequentialGroup()
                                .addComponent(CartonCambiacolor11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CartonCambiacolor14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(FondoCartonLayout.createSequentialGroup()
                                .addComponent(CartonCambiacolor18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CartonCambiacolor19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FondoCartonLayout.createSequentialGroup()
                                .addComponent(CartonCambiacolor21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CartonCambiacolor24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(FondoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoCartonLayout.createSequentialGroup()
                                .addComponent(CartonCambiacolor23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CartonCambiacolor25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FondoCartonLayout.createSequentialGroup()
                                .addGroup(FondoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CartonCambiacolor22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CartonCambiacolor13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(FondoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CartonCambiacolor17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CartonCambiacolor16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(FondoCartonLayout.createSequentialGroup()
                                .addComponent(CartonCambiacolor9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CartonCambiacolor10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(62, 62, 62))
        );
        FondoCartonLayout.setVerticalGroup(
            FondoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoCartonLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(IconBingoSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CartonCambiacolor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CartonCambiacolor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CartonCambiacolor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CartonCambiacolor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CartonCambiacolor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CartonCambiacolor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CartonCambiacolor7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CartonCambiacolor8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CartonCambiacolor9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CartonCambiacolor10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FondoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoCartonLayout.createSequentialGroup()
                        .addGroup(FondoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CartonCambiacolor12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CartonCambiacolor11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CartonCambiacolor14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CartonCambiacolor13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(FondoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoCartonLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(FondoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CartonCambiacolor15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CartonCambiacolor18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CartonCambiacolor19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(FondoCartonLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(CartonCambiacolor22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(FondoCartonLayout.createSequentialGroup()
                        .addComponent(CartonCambiacolor16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CartonCambiacolor17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(FondoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CartonCambiacolor20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CartonCambiacolor21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CartonCambiacolor23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CartonCambiacolor24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CartonCambiacolor25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoCarton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoCarton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void IconBingoSuperiorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_IconBingoSuperiorAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_IconBingoSuperiorAncestorAdded
public void mostrarCarton(Carton carton) {
    // Lógica para mostrar un cartón específico
}

public void limpiarCarton() {
    // Lógica para limpiar la visualización del cartón
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CartonCambiacolor1;
    private javax.swing.JPanel CartonCambiacolor10;
    private javax.swing.JPanel CartonCambiacolor11;
    private javax.swing.JPanel CartonCambiacolor12;
    private javax.swing.JPanel CartonCambiacolor13;
    private javax.swing.JPanel CartonCambiacolor14;
    private javax.swing.JPanel CartonCambiacolor15;
    private javax.swing.JPanel CartonCambiacolor16;
    private javax.swing.JPanel CartonCambiacolor17;
    private javax.swing.JPanel CartonCambiacolor18;
    private javax.swing.JPanel CartonCambiacolor19;
    private javax.swing.JPanel CartonCambiacolor2;
    private javax.swing.JPanel CartonCambiacolor20;
    private javax.swing.JPanel CartonCambiacolor21;
    private javax.swing.JPanel CartonCambiacolor22;
    private javax.swing.JPanel CartonCambiacolor23;
    private javax.swing.JPanel CartonCambiacolor24;
    private javax.swing.JPanel CartonCambiacolor25;
    private javax.swing.JPanel CartonCambiacolor3;
    private javax.swing.JPanel CartonCambiacolor4;
    private javax.swing.JPanel CartonCambiacolor5;
    private javax.swing.JPanel CartonCambiacolor6;
    private javax.swing.JPanel CartonCambiacolor7;
    private javax.swing.JPanel CartonCambiacolor8;
    private javax.swing.JPanel CartonCambiacolor9;
    private javax.swing.JLabel ContenedorNumCarton1;
    private javax.swing.JLabel ContenedorNumCarton10;
    private javax.swing.JLabel ContenedorNumCarton11;
    private javax.swing.JLabel ContenedorNumCarton12;
    private javax.swing.JLabel ContenedorNumCarton13;
    private javax.swing.JLabel ContenedorNumCarton14;
    private javax.swing.JLabel ContenedorNumCarton15;
    private javax.swing.JLabel ContenedorNumCarton16;
    private javax.swing.JLabel ContenedorNumCarton17;
    private javax.swing.JLabel ContenedorNumCarton18;
    private javax.swing.JLabel ContenedorNumCarton19;
    private javax.swing.JLabel ContenedorNumCarton2;
    private javax.swing.JLabel ContenedorNumCarton20;
    private javax.swing.JLabel ContenedorNumCarton21;
    private javax.swing.JLabel ContenedorNumCarton22;
    private javax.swing.JLabel ContenedorNumCarton23;
    private javax.swing.JLabel ContenedorNumCarton24;
    private javax.swing.JLabel ContenedorNumCarton25;
    private javax.swing.JLabel ContenedorNumCarton3;
    private javax.swing.JLabel ContenedorNumCarton4;
    private javax.swing.JLabel ContenedorNumCarton5;
    private javax.swing.JLabel ContenedorNumCarton6;
    private javax.swing.JLabel ContenedorNumCarton7;
    private javax.swing.JLabel ContenedorNumCarton8;
    private javax.swing.JLabel ContenedorNumCarton9;
    private javax.swing.JPanel FondoCarton;
    private javax.swing.JLabel IconBingoSuperior;
    // End of variables declaration//GEN-END:variables
}
