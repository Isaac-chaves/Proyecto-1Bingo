/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UTN
 */
public class JuegoBingo {

    private List<Carton> cartones;
    private EstrategiaVictoria estrategiaActual;
    private TableroNumeros tablero;
    private Tombola tombola;
    private Carton cartonGanador;

    public JuegoBingo() {
        this.cartones = new ArrayList<>();
        this.estrategiaActual = new VictoriaNormal();
        this.tablero = TableroNumeros.getInstancia();
        this.tombola = Tombola.getInstancia();
        this.cartonGanador = null;
    }

    public void agregarCarton(Carton carton) {
        if (carton != null && !existeCarton(carton.getId())) {
            cartones.add(carton);
        }
    }

    public void eliminarCarton(String id) {
        cartones.removeIf(carton -> carton.getId().equals(id));
    }

    private boolean existeCarton(String id) {
        for (Carton carton : cartones) {
            if (carton.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public boolean procesarNumero(int numero) {
        if (numero < 1 || numero > 75) {
            return false;
        }
        if (!tablero.agregarNumero(numero)) {
            return false;
        }
        for (Carton carton : cartones) {
            carton.marcarNumero(numero);
        }
        verificarGanadores();
        return true;
    }

    public int sacarNumeroAutomatico() {
        int numero = tombola.generarNumero();
        procesarNumero(numero);
        return numero;
    }

    private void verificarGanadores() {
        for (Carton carton : cartones) {
            if (estrategiaActual.verificarVictoria(carton)) {
                cartonGanador = carton;
                break;
            }
        }
    }

    public void cambiarEstrategiaVictoria(String tipoJuego) {
        switch (tipoJuego.toUpperCase()) {
            case "NORMAL":
                estrategiaActual = new VictoriaNormal();
                break;
            case "CUATRO_ESQUINAS":
                estrategiaActual = new VictoriaCuatroEsquinas();
                break;
            case "CARTON_LLENO":
                estrategiaActual = new VictoriaCartonLleno();
                break;
            default:
                estrategiaActual = new VictoriaNormal();
        }
        cartonGanador = null;
    }

    public void desmarcarNumero(int numero) {
        for (Carton carton : cartones) {
            carton.desmarcarNumero(numero);
        }
        cartonGanador = null;
    }

    public void reiniciarJuego() {

        cartones.clear();

        if (tablero != null) {
            tablero.limpiarNumerosCantados();
        }

        cartonGanador = null;

    }

    private void reiniciarCarton(Carton carton) {
        boolean[][] marcados = carton.getMarcados();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                marcados[i][j] = false;
            }
        }

        marcados[2][2] = true;
    }

    public Integer getUltimoNumero() {
        return tablero.getUltimoNumero();
    }

    public List<Carton> getCartones() {
        return new ArrayList<>(cartones);
    }

    public EstrategiaVictoria getEstrategiaActual() {
        return estrategiaActual;
    }

    public TableroNumeros getTablero() {
        return tablero;
    }

    public Tombola getTombola() {
        return tombola;
    }

    public Carton getCartonGanador() {
        return cartonGanador;
    }

    public boolean hayGanador() {
        return cartonGanador != null;
    }

    public String getTipoJuegoActual() {
        if (estrategiaActual instanceof VictoriaNormal) {
            return "NORMAL";
        } else if (estrategiaActual instanceof VictoriaCuatroEsquinas) {
            return "CUATRO_ESQUINAS";
        } else if (estrategiaActual instanceof VictoriaCartonLleno) {
            return "CARTON_LLENO";
        }
        return "NORMAL";
    }
} 
