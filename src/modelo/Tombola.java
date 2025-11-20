/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Random;

/**
 *
 * @author UTN
 */
public class Tombola {

    private static Tombola instancia;
    private Random rnd = new Random();
    private TableroNumeros tablero = TableroNumeros.getInstancia();

    private Tombola() {
    }

    public static Tombola getInstancia() {
        if (instancia == null) {
            instancia = new Tombola();
        }
        return instancia;
    }

    public int generarNumero() {
        int n;
        do {
            n = rnd.nextInt(75) + 1;
        } while (!tablero.agregarNumero(n));
        return n;
    }

    public boolean ingresarManual(int n) {
        return tablero.agregarNumero(n);
    }

    public void reiniciar() {
    }
} 
