/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author UTN
 */
public class VictoriaCartonLleno implements EstrategiaVictoria {

    @Override
    public boolean verificarVictoria(Carton c) {
        boolean[][] m = c.getMarcados();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (!(i == 2 && j == 2)) { // centro libre
                    if (!m[i][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
} 
