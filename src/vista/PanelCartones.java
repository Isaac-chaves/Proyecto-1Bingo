package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelCartones extends JPanel {
    
    private final JButton[][] btn;
    private final int numFilas = 5;
    private final int numColumnas = 5;
    
    // ⭐ CONSTANTES DE COLOR
    private final Color COLOR_MARCADO = Color.RED;
    private final Color COLOR_TEXTO_MARCADO = Color.WHITE;
    private final Color COLOR_FONDO_NORMAL = new Color(240, 240, 240); // Gris claro
    private final Color COLOR_TEXTO_NORMAL = Color.BLACK; 
    private final String TEXTO_CASILLA_LIBRE = "FREE";

    public PanelCartones() {
        this.setLayout(new GridLayout(numFilas, numColumnas, 2, 2));
        this.setBackground(Color.DARK_GRAY);
        btn = new JButton[numFilas][numColumnas];
        
        // ⭐ INICIALIZACIÓN COMPLETA DE BOTONES EN EL CONSTRUCTOR
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                btn[i][j] = new JButton();
                btn[i][j].setFont(new Font("Arial", Font.BOLD, 18));
                btn[i][j].setOpaque(true);
                btn[i][j].setBorderPainted(false);
                this.add(btn[i][j]);
            }
        }
        
        // Configura la casilla central "FREE" y luego limpia el resto
        if (numFilas > 2 && numColumnas > 2) {
             btn[2][2].setText(TEXTO_CASILLA_LIBRE);
             btn[2][2].setBackground(Color.BLACK);
             btn[2][2].setForeground(Color.WHITE);
        }
        
        limpiarCarton(); // Llama al nuevo método para establecer el estado inicial
    }
    
// -------------------------------------------------------------------------
    
    /**
     * Muestra el cartón completo (números y estado de marcado) desde el modelo.
     * Este método es llamado por actualizarVistaCarton() del controlador.
     * @param numeros Matriz de números del cartón.
     * @param marcados Matriz booleana con el estado de marcado.
     */
    public void mostrarCarton(int[][] numeros, boolean[][] marcados) {
        
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                
                // Omite la casilla central "FREE"
                if (i == 2 && j == 2) {
                    continue; 
                }
                
                // 1. Muestra el número
                btn[i][j].setText(String.valueOf(numeros[i][j]));
                
                // 2. Aplica el color según el estado de marcado
                if (marcados[i][j]) {
                    // Si está marcado en el modelo, píntalo de ROJO
                    btn[i][j].setBackground(COLOR_MARCADO);
                    btn[i][j].setForeground(COLOR_TEXTO_MARCADO);
                } else {
                    // Si no está marcado, usa el color normal
                    btn[i][j].setBackground(COLOR_FONDO_NORMAL);
                    btn[i][j].setForeground(COLOR_TEXTO_NORMAL);
                }
            }
        }
    }

    /**
     * Limpia los números y colores del panel, dejando solo la casilla "FREE".
     * Usado cuando no hay cartones cargados o al inicio del juego.
     */
    public void limpiarCarton() {
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                
                if (i == 2 && j == 2) {
                    // Mantiene la casilla central como "FREE"
                    btn[i][j].setText(TEXTO_CASILLA_LIBRE);
                } else {
                    // Limpia el texto y restaura los colores
                    btn[i][j].setText("");
                    btn[i][j].setBackground(COLOR_FONDO_NORMAL);
                    btn[i][j].setForeground(COLOR_TEXTO_NORMAL);
                }
            }
        }
    } 
    
// -------------------------------------------------------------------------
    
    /**
     * Busca y marca la casilla con el número extraído en el cartón (Método de marcado rápido).
     * @param numero El número extraído.
     */
    public void marcarCasilla(int numero) {
        // Convierte el número a String para compararlo con el texto del botón
        String numStr = String.valueOf(numero);
        
        // Etiqueta para el bucle externo
        busqueda:
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                
                // Evita la casilla "Free"
                if (i == 2 && j == 2) {
                    continue;
                }
                
                // ⭐ LÓGICA DE MARCADO: Busca el botón y cambia su color
                if (btn[i][j] != null && btn[i][j].getText().equals(numStr)) {
                    btn[i][j].setBackground(COLOR_MARCADO); // Fondo ROJO
                    btn[i][j].setForeground(COLOR_TEXTO_MARCADO); // Texto BLANCO para contraste
                    break busqueda; // Terminar la búsqueda una vez encontrado
                }
            }
        }
    }
    
    // Método que parece ser para pruebas, lo mantengo pero no es esencial para el flujo MVC.
    public void cambiarColorRojo() {
        this.setBackground(Color.RED);
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
