/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author UTN
 */
public class VictoriaNormal implements EstrategiaVictoria {

    @Override
    public boolean verificarVictoria(Carton c) {

        boolean[][] m = c.getMarcados();

        // H
        for (int i = 0; i < 5; i++) {
            boolean ok = true;
            for (int j = 0; j < 5; j++) {
                if (!m[i][j]) {
                    ok = false;
                }
            }
            if (ok) {
                return true;
            }
        }

        // V
        for (int j = 0; j < 5; j++) {
            boolean ok = true;
            for (int i = 0; i < 5; i++) {
                if (!m[i][j]) {
                    ok = false;
                }
            }
            if (ok) {
                return true;
            }
        }

        // D
        boolean diag1 = true, diag2 = true;
        for (int i = 0; i < 5; i++) {
            if (!m[i][i]) {
                diag1 = false;
            }
            if (!m[i][4 - i]) {
                diag2 = false;
            }
        }
        if (diag1 || diag2) {
            return true;
        }

        return false; 
    } 
} 
