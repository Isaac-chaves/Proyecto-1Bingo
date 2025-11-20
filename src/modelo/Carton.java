/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author UTN
 */
public class Carton {

    private String id;
    private int[][] numeros;
    private boolean[][] marcados;

    public Carton(String id) {
        this.id = id;
        this.numeros = numeros;

        this.marcados = new boolean[5][5];

        marcados[2][2] = true;
    }

    public String getId() {
        return id;
    }

    public int[][] getNumeros() {
        return numeros;
    }

    public boolean[][] getMarcados() {
        return marcados;
    }

    public void marcarNumero(int n) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (numeros[i][j] == n) {
                    marcados[i][j] = true;
                }
            }
        }
    }

    public void desmarcarNumero(int n) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (numeros[i][j] == n) {
                    marcados[i][j] = false;
                }
            }
        }
        marcados[2][2] = true;
    }
} 
