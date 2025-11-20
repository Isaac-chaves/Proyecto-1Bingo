package vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelCartones extends JPanel {
    
    // CAMBIO CLAVE: Usamos JLabel en lugar de JButton
    private final JLabel[][] lbl;
    private final int numFilas = 5;
    private final int numColumnas = 5;
    
    // CONSTANTES DE COLOR
    private final Color COLOR_MARCADO = Color.RED; // Color de marcado simple y confiable
    private final Color COLOR_TEXTO_MARCADO = Color.WHITE;
    private final Color COLOR_FONDO_NORMAL = new Color(240, 240, 240);
    private final Color COLOR_TEXTO_NORMAL = Color.BLACK; 
    private final String TEXTO_CASILLA_LIBRE = "FREE";

    public PanelCartones() {
        this.setLayout(new GridLayout(numFilas, numColumnas, 2, 2));
        this.setBackground(Color.DARK_GRAY);
        lbl = new JLabel[numFilas][numColumnas];

        // Inicializar etiquetas
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                lbl[i][j] = new JLabel();
                // Fuente base
                lbl[i][j].setFont(new Font("Arial", Font.BOLD, 18));
                // Alineación al centro
                lbl[i][j].setHorizontalAlignment(SwingConstants.CENTER);
                
                // *** CLAVE: Habilitar la pintura de fondo en JLabel ***
                lbl[i][j].setOpaque(true);
                
                lbl[i][j].setBackground(COLOR_FONDO_NORMAL);
                lbl[i][j].setForeground(COLOR_TEXTO_NORMAL);
                
                this.add(lbl[i][j]);
            }
        }
        
        configurarCasillaCentral();
        limpiarCarton(); 
    }

    // Casilla central
    private void configurarCasillaCentral() {
        if (numFilas > 2 && numColumnas > 2) {
            lbl[2][2].setText(TEXTO_CASILLA_LIBRE);
            lbl[2][2].setBackground(Color.BLACK);
            lbl[2][2].setForeground(Color.WHITE);
            lbl[2][2].setFont(new Font("Arial", Font.BOLD, 14));
        }
    }
    
    // =========================================================================
    // MÉTODO DE MARCADO INSTANTÁNEO (USADO POR EL CONTROLADOR)
    // =========================================================================
    /**
     * Busca el número y lo marca con el color de fondo ROJO.
     */
    public void marcarCasilla(int numero) {
        String numStr = String.valueOf(numero);
        
        busqueda:
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                if (i == 2 && j == 2) continue; // Ignorar centro
                
                // Comparamos el texto actual del JLabel (que debe ser el número)
                if (lbl[i][j].getText().equals(numStr)) {
                    // Ahora el cambio de color es CONFIABLE
                    lbl[i][j].setBackground(COLOR_MARCADO); 
                    lbl[i][j].setForeground(COLOR_TEXTO_MARCADO); // Texto blanco
                    lbl[i][j].repaint(); // Forzar repintado
                    break busqueda; 
                }
            }
        }
    }
    
    // =========================================================================
    // MÉTODO PARA MOSTRAR CARTÓN (PERSISTENCIA AL CAMBIAR DE CARTÓN)
    // =========================================================================
    /**
     * Carga el cartón con los números y marcas persistentes.
     */
    public void mostrarCarton(int[][] numeros, boolean[][] marcados) {
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                JLabel etiqueta = lbl[i][j];

                if (i == 2 && j == 2) continue; // Saltamos el centro

                int numero = numeros[i][j];
                String numStr = String.valueOf(numero);
                
                etiqueta.setText(numStr);
                
                if (marcados[i][j]) {
                    // Aplicar el marcado (el JLabel lo acepta sin problema)
                    etiqueta.setBackground(COLOR_MARCADO);
                    etiqueta.setForeground(COLOR_TEXTO_MARCADO);
                } else {
                    // Estado normal
                    etiqueta.setBackground(COLOR_FONDO_NORMAL);
                    etiqueta.setForeground(COLOR_TEXTO_NORMAL);
                }
            }
        }
        this.repaint();
    }

    public void limpiarCarton() {
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                if (i == 2 && j == 2) {
                    configurarCasillaCentral();
                } else {
                    lbl[i][j].setText("");
                    lbl[i][j].setForeground(COLOR_TEXTO_NORMAL);
                    lbl[i][j].setBackground(COLOR_FONDO_NORMAL);
                }
            }
        }
}
// Código en PanelTablero.java (ya existente en tu código)
public void marcarNumero(int numero) {
    if (numero >= 1 && numero <= 75) {
        javax.swing.JPanel panel = panelesMarcador[numero - 1];
        if (panel != null) {
            panel.setBackground(COLOR_MARCADO); // Marcar con rojo
            
            // Asegurar que el texto dentro del JLabel sea blanco para contraste
            for (Component component : panel.getComponents()) {
                if (component instanceof JLabel jLabel) {
                    jLabel.setForeground(Color.WHITE);
                    break; 
                }
            }
        }
    }
}
    // Métodos Getter
    public JLabel getLabel(int i, int j) {
        return lbl[i][j];
    }
    
    // El resto de código generado por NetBeans debe estar aquí...
    // <editor-fold defaultstate="collapsed" desc="Generated Code">...</editor-fold>
    // ...
/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoCarton = new javax.swing.JPanel();

        FondoCarton.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout FondoCartonLayout = new javax.swing.GroupLayout(FondoCarton);
        FondoCarton.setLayout(FondoCartonLayout);
        FondoCartonLayout.setHorizontalGroup(
            FondoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
        );
        FondoCartonLayout.setVerticalGroup(
            FondoCartonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FondoCarton;
    // End of variables declaration//GEN-END:variables
}
