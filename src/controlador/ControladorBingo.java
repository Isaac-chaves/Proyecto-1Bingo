package controlador;

import modelo.*;
import vista.*;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Controlador principal que coordina el Modelo y la Vista del juego de Bingo
 */
public class ControladorBingo {
    
    // Modelo
    private JuegoBingo juegoBingo;
    private FabricaCartones fabricaCartones;
    
    // Vista
    private VentanaPrincipal ventanaPrincipal;
    private PanelCartones panelCartones;
    private PanelTablero panelTablero;
    private PanelResultado panelResultado;
    
    // Estado del juego
    private int indiceCartonActual = 0;
    private boolean juegoEnCurso = false;
    
    public ControladorBingo(VentanaPrincipal ventana) {
        this.ventanaPrincipal = ventana;
        this.juegoBingo = new JuegoBingo();
        this.fabricaCartones = new FabricaCartones();
        
        // Obtener referencias a los paneles
        this.panelCartones = ventana.getPanelCartones();
        this.panelTablero = ventana.getPanelTablero();
        this.panelResultado = ventana.getPanelResultado();
        
        inicializarControlador();
    }
    
    private void inicializarControlador() {
        // El controlador está listo
        actualizarVista();
    }
    
    // ========== MÉTODOS PARA GESTIONAR CARTONES ==========
    
    /**
     * Crea un cartón manual a partir de una matriz de números
     */
    public void crearCartonManual(int[][] numeros) {
        try {
            String id = "CARTON-" + (juegoBingo.getCartones().size() + 1);
            Carton nuevoCarton = fabricaCartones.crearCartonManual(id, numeros);
            
            juegoBingo.agregarCarton(nuevoCarton);
            indiceCartonActual = juegoBingo.getCartones().size() - 1;
            
            actualizarVistaCarton();
            actualizarLabelCarton();
            
            JOptionPane.showMessageDialog(ventanaPrincipal, 
                "¡Cartón creado exitosamente!\nID: " + id, 
                "Éxito", JOptionPane.INFORMATION_MESSAGE);
                
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(ventanaPrincipal, 
                "Error al crear el cartón:\n" + e.getMessage(), 
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Crea un cartón automático
     */
    public void crearCartonAutomatico() {
        String id = "CARTON-" + (juegoBingo.getCartones().size() + 1);
        Carton nuevoCarton = fabricaCartones.crearCartonAutomatico(id);
        
        juegoBingo.agregarCarton(nuevoCarton);
        indiceCartonActual = juegoBingo.getCartones().size() - 1;
        
        actualizarVistaCarton();
        actualizarLabelCarton();
        
        JOptionPane.showMessageDialog(ventanaPrincipal, 
            "¡Cartón automático creado!\nID: " + id, 
            "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }
    
    /**
     * Navega al siguiente cartón
     */
    public void siguienteCarton() {
        List<Carton> cartones = juegoBingo.getCartones();
        if (cartones.isEmpty()) {
            JOptionPane.showMessageDialog(ventanaPrincipal, 
                "No hay cartones creados", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        indiceCartonActual = (indiceCartonActual + 1) % cartones.size();
        actualizarVistaCarton();
        actualizarLabelCarton();
    }
    
    /**
     * Navega al cartón anterior
     */
    public void anteriorCarton() {
        List<Carton> cartones = juegoBingo.getCartones();
        if (cartones.isEmpty()) {
            JOptionPane.showMessageDialog(ventanaPrincipal, 
                "No hay cartones creados", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        indiceCartonActual--;
        if (indiceCartonActual < 0) {
            indiceCartonActual = cartones.size() - 1;
        }
        actualizarVistaCarton();
        actualizarLabelCarton();
    }
    
    /**
     * Busca un cartón por ID
     */
    public void buscarCarton(String id) {
        if (id == null || id.trim().isEmpty()) {
            JOptionPane.showMessageDialog(ventanaPrincipal, 
                "Ingrese un ID de cartón", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        List<Carton> cartones = juegoBingo.getCartones();
        for (int i = 0; i < cartones.size(); i++) {
            if (cartones.get(i).getId().equalsIgnoreCase(id.trim())) {
                indiceCartonActual = i;
                actualizarVistaCarton();
                actualizarLabelCarton();
                return;
            }
        }
        
        JOptionPane.showMessageDialog(ventanaPrincipal, 
            "Cartón no encontrado: " + id, "Aviso", JOptionPane.WARNING_MESSAGE);
    }
    
    // ========== MÉTODOS PARA CONTROL DEL JUEGO ==========
    
    /**
     * Genera un número automático (modo automático)
     */
public void generarNumeroAutomatico() {
        if (juegoBingo.getCartones().isEmpty()) {
            JOptionPane.showMessageDialog(ventanaPrincipal, 
                "Debe crear al menos un cartón antes de jugar", 
                "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (juegoBingo.hayGanador()) {
            JOptionPane.showMessageDialog(ventanaPrincipal, 
                "¡Ya hay un ganador! Reinicie el juego para continuar.", 
                "Juego terminado", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        juegoEnCurso = true;
        int numeroGenerado = juegoBingo.sacarNumeroAutomatico();
        
        // 1. Marcar el número en el tablero global
        actualizarVistaTablero();
        
        // ⭐ PASO CLAVE 1: Marcar inmediatamente en el cartón visible (nueva característica)
        panelCartones.marcarCasilla(numeroGenerado); 
        
        // 2. Actualizar el panel de resultado
        actualizarResultado(numeroGenerado);
        
        // 3. No es necesario llamar a actualizarVistaCarton(), el marcado fue directo.
        
        verificarGanador();
    }
    
    /**
     * Ingresa un número manualmente
     */
    public void ingresarNumeroManual(String numeroStr) {
        if (juegoBingo.getCartones().isEmpty()) {
            JOptionPane.showMessageDialog(ventanaPrincipal, 
                "Debe crear al menos un cartón antes de jugar", 
                "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try {
            int numero = Integer.parseInt(numeroStr);
            
            if (numero < 1 || numero > 75) {
                JOptionPane.showMessageDialog(ventanaPrincipal, 
                    "El número debe estar entre 1 y 75", 
                    "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            boolean exitoso = juegoBingo.procesarNumero(numero);
            
            if (!exitoso) {
                JOptionPane.showMessageDialog(ventanaPrincipal, 
                    "El número " + numero + " ya fue cantado", 
                    "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            juegoEnCurso = true;
            
            // 1. Marcar el número en el tablero global
            actualizarVistaTablero();
            
            // ⭐ PASO CLAVE 2: Marcar inmediatamente en el cartón visible (nueva característica)
            panelCartones.marcarCasilla(numero); 
            
            // 2. Actualizar el panel de resultado
            actualizarResultado(numero);
            
            // 3. No es necesario llamar a actualizarVistaCarton(), el marcado fue directo.
            
            verificarGanador();
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(ventanaPrincipal, 
                "Ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Reinicia el juego completamente
     */
    public void reiniciarJuego() {
        int respuesta = JOptionPane.showConfirmDialog(ventanaPrincipal, 
            "¿Está seguro que desea reiniciar el juego?\nSe mantendrán los cartones creados.", 
            "Confirmar reinicio", JOptionPane.YES_NO_OPTION);
            
        if (respuesta == JOptionPane.YES_OPTION) {
            juegoBingo.reiniciarJuego();
            juegoEnCurso = false;
            
            actualizarVistaTablero();
            actualizarVistaCarton();
            panelResultado.mostrarNumero(0);
            
            JOptionPane.showMessageDialog(ventanaPrincipal, 
                "Juego reiniciado correctamente", 
                "Reinicio", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    /**
     * Cambia el modo de juego (estrategia de victoria)
     */
    public void cambiarModoJuego(String modo) {
        juegoBingo.cambiarEstrategiaVictoria(modo);
        JOptionPane.showMessageDialog(ventanaPrincipal, 
            "Modo de juego cambiado a: " + obtenerNombreModo(modo), 
            "Modo de juego", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private String obtenerNombreModo(String modo) {
        switch (modo.toUpperCase()) {
            case "NORMAL": return "Normal (Líneas y diagonales)";
            case "CUATRO_ESQUINAS": return "Cuatro Esquinas";
            case "CARTON_LLENO": return "Cartón Lleno";
            default: return modo;
        }
    }
    
    // ========== MÉTODOS DE ACTUALIZACIÓN DE VISTA ==========
    
    private void actualizarVista() {
        actualizarVistaCarton();
        actualizarVistaTablero();
        actualizarLabelCarton();
    }
    
    /**
     * Actualiza el panel de cartones con el cartón actual
     */
   private void actualizarVistaCarton() {
    List<Carton> cartones = juegoBingo.getCartones();
    
    if (cartones.isEmpty()) {
        // Si no hay cartones, limpia la vista.
        panelCartones.limpiarCarton(); 
        ventanaPrincipal.actualizarLabelCarton("Sin cartones");
        return;
    }

    // Obtiene el cartón actual basado en el índice
    Carton cartonActual = cartones.get(indiceCartonActual);
    
    // Obtiene las matrices de números y de estado de marcado
    int[][] numeros = cartonActual.getNumeros();
    boolean[][] marcados = cartonActual.getMarcados();
    
    // ⭐ LLAMADA CLAVE: Pasa ambos estados al panel. 
    // PanelCartones debe usar 'marcados' para pintar de rojo.
    panelCartones.mostrarCarton(numeros, marcados);
    
    // Actualiza la etiqueta de "Cartón X de Y"
    actualizarLabelCarton(); 
}
    
    /**
     * Actualiza el tablero de números cantados
     */
    private void actualizarVistaTablero() {
        // Marcar todos los números cantados
        for (int i = 1; i <= 75; i++) {
            if (juegoBingo.getTablero().getNumerosCantados().contains(i)) {
                panelTablero.marcarNumero(i);
            } else {
                panelTablero.desmarcarNumero(i);
            }
        }
    }
    
    /**
     * Actualiza el label que muestra el número de cartón actual
     */
    private void actualizarLabelCarton() {
        List<Carton> cartones = juegoBingo.getCartones();
        if (!cartones.isEmpty()) {
            String texto = "Cartón " + (indiceCartonActual + 1) + " de " + cartones.size();
            ventanaPrincipal.actualizarLabelCarton(texto);
        } else {
            ventanaPrincipal.actualizarLabelCarton("Sin cartones");
        }
    }
    
    /**
     * Actualiza el panel de resultado con el último número
     */
    private void actualizarResultado(int numero) {
        panelResultado.mostrarNumero(numero);
    }
    
    /**
     * Verifica si hay un ganador y muestra el resultado
     */
    private void verificarGanador() {
        if (juegoBingo.hayGanador()) {
            Carton ganador = juegoBingo.getCartonGanador();
            panelResultado.mostrarGanador(ganador.getId());
            
            String modoJuego = obtenerNombreModo(juegoBingo.getTipoJuegoActual());
            
            JOptionPane.showMessageDialog(ventanaPrincipal, 
                "¡¡¡ BINGO !!!\n\n" +
                "Cartón ganador: " + ganador.getId() + "\n" +
                "Modo de juego: " + modoJuego, 
                "¡GANADOR!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    // ========== GETTERS ==========
    
    public JuegoBingo getJuegoBingo() {
        return juegoBingo;
    }
    
    public boolean isJuegoEnCurso() {
        return juegoEnCurso;
    }
}