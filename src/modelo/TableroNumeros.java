/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author UTN
 */
public class TableroNumeros {

    private static TableroNumeros instancia;

    private Set<Integer> numerosCantados = new HashSet<>();
    private Integer ultimoNumero = null;

    private TableroNumeros() {
    }

    public static TableroNumeros getInstancia() {
        if (instancia == null) {
            instancia = new TableroNumeros();
        }
        return instancia;
    }

    public boolean agregarNumero(int n) {
        if (n < 1 || n > 75) {
            return false;
        }
        if (numerosCantados.contains(n)) {
            return false;
        }

        numerosCantados.add(n);
        ultimoNumero = n;
        return true;
    }

    public Set<Integer> getNumerosCantados() {
        return new HashSet<>(numerosCantados);
    }

    public void reiniciar() {
        numerosCantados.clear();
        ultimoNumero = null;
    }

    public Integer getUltimoNumero() {
        return ultimoNumero;
    }
} 
