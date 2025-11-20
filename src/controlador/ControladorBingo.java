package controlador;

import modelo.JuegoBingo;
import modelo.Carton;
import vista.VentanaPrincipal;
import vista.PanelCartones;
import vista.PanelTablero;
import vista.PanelResultado;
import java.util.List;

public class ControladorBingo {
    private VentanaPrincipal ventana;
    private JuegoBingo juego;
    private int cartonActualIndex;

    public ControladorBingo(VentanaPrincipal ventana) {
        this.ventana = ventana;
        this.juego = new JuegoBingo();
        this.cartonActualIndex = 0;
        configurarEventos();
        actualizarVista();
    }

    private void configurarEventos() {
        // Usar los métodos públicos de VentanaPrincipal para acceder a los componentes
        // o configurar los eventos directamente en VentanaPrincipal llamando a métodos del controlador
    }

    // Métodos públicos que serán llamados desde VentanaPrincipal
    public void crearNuevoCarton() {
        String modoSeleccionado = ventana.getModoSeleccionado();
        if ("Manual".equals(modoSeleccionado)) {
            // Abrir diálogo para creación manual
            vista.ControlManual controlManualDialog = new vista.ControlManual(ventana, true);
            controlManualDialog.setLocationRelativeTo(ventana);
            controlManualDialog.setVisible(true);
            
            // Aquí deberías obtener el cartón creado del diálogo y agregarlo al juego
            // Carton nuevoCarton = controlManualDialog.getCartonCreado();
            // if (nuevoCarton != null) {
            //     juego.agregarCarton(nuevoCarton);
            //     actualizarVista();
            // }
        } else if ("Automatico".equals(modoSeleccionado)) {
            // Crear cartón automático
            Carton cartonAutomatico = generarCartonAutomatico();
            juego.agregarCarton(cartonAutomatico);
            actualizarVista();
        }
    }

    private Carton generarCartonAutomatico() {
        // Implementar la generación automática de cartones
        // Por ahora, retornamos un cartón vacío como ejemplo
        // Deberías implementar la lógica real de generación automática
        return new Carton("AUTO-" + System.currentTimeMillis());
    }

    public void procesarNumero(int numero) {
        boolean exito = juego.procesarNumero(numero);
        if (exito) {
            actualizarVista();
            
            // Verificar si hay ganador
            if (juego.hayGanador()) {
                mostrarGanador();
            }
        }
    }

    public void sacarNumeroAutomatico() {
        int numero = juego.sacarNumeroAutomatico();
        actualizarVista();
        
        if (juego.hayGanador()) {
            mostrarGanador();
        }
    }

    public void cambiarModoJuego(String modo) {
        juego.cambiarEstrategiaVictoria(modo);
        actualizarVista();
    }

    public void reiniciarJuego() {
        juego.reiniciarJuego();
        cartonActualIndex = 0;
        actualizarVista();
    }

    public void cambiarCarton(boolean siguiente) {
        List<Carton> cartones = juego.getCartones();
        if (cartones.isEmpty()) return;

        if (siguiente) {
            cartonActualIndex = (cartonActualIndex + 1) % cartones.size();
        } else {
            cartonActualIndex = (cartonActualIndex - 1 + cartones.size()) % cartones.size();
        }
        
        actualizarVista();
    }

    private void actualizarVista() {
        // Actualizar panel de cartones
        if (ventana.getPanelCartones() != null) {
            List<Carton> cartones = juego.getCartones();
            if (!cartones.isEmpty() && cartonActualIndex < cartones.size()) {
                ventana.getPanelCartones().mostrarCarton(cartones.get(cartonActualIndex));
            } else {
                ventana.getPanelCartones().limpiarCarton();
            }
            
            // Actualizar indicador de cartón actual
            ventana.actualizarIndicadorCarton((cartones.isEmpty() ? "0" : (cartonActualIndex + 1)) + "/" + cartones.size());
        }

        // Actualizar panel del tablero
        if (ventana.getPanelTablero() != null) {
            ventana.getPanelTablero().actualizarTablero(juego.getTablero());
        }

        // Actualizar panel de resultados
        if (ventana.getPanelResultado() != null) {
            ventana.getPanelResultado().actualizarResultados(juego);
        }

        // Actualizar estado de los botones
        actualizarEstadoBotones();
    }

    private void actualizarEstadoBotones() {
        List<Carton> cartones = juego.getCartones();
        boolean hayCartones = !cartones.isEmpty();
        
        ventana.actualizarEstadoBotonesNavegacion(hayCartones && cartones.size() > 1);
    }

    private void mostrarGanador() {
        Carton ganador = juego.getCartonGanador();
        if (ganador != null && ventana.getPanelResultado() != null) {
            ventana.getPanelResultado().mostrarGanador(ganador);
        }
    }

    // Métodos públicos para acceso desde otros componentes
    public JuegoBingo getJuego() {
        return juego;
    }

    public VentanaPrincipal getVentana() {
        return ventana;
    }

    public int getCartonActualIndex() {
        return cartonActualIndex;
    }

    public void setCartonActualIndex(int index) {
        if (index >= 0 && index < juego.getCartones().size()) {
            this.cartonActualIndex = index;
            actualizarVista();
        }
    }
}