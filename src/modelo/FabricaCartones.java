/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author UTN
 */
public class FabricaCartones {
    
/**
 *
 * @author UTN
 */

    private Random random;
    
    public FabricaCartones() {
        this.random = new Random();
    }
    
    /**
     * Crea un cartón de manera manual con validaciones
     */
    public Carton crearCartonManual(String id, int[][] numerosIngresados) throws IllegalArgumentException {
        // Validar que la matriz es 5x5
        if (numerosIngresados.length != 5 || numerosIngresados[0].length != 5) {
            throw new IllegalArgumentException("El cartón debe ser una matriz 5x5");
        }
        
        // Validar números por columna y duplicados
        for (int col = 0; col < 5; col++) {
            for (int fila = 0; fila < 5; fila++) {
                int numero = numerosIngresados[fila][col];
                
                // Saltar la casilla central (libre)
                if (fila == 2 && col == 2) {
                    if (numero != 0) {
                        throw new IllegalArgumentException("La casilla central debe estar vacía (0)");
                    }
                    continue;
                }
                
                // Validar rango por columna
                if (!esNumeroValidoParaColumna(numero, col)) {
                    throw new IllegalArgumentException("Número " + numero + " no válido para columna " + (col + 1) + 
                                                     ". Debe estar entre " + getMinimoColumna(col) + " y " + getMaximoColumna(col));
                }
                
                // Validar duplicados
                if (estaDuplicado(numerosIngresados, fila, col, numero)) {
                    throw new IllegalArgumentException("Número duplicado: " + numero);
                }
            }
        }
        
        return new Carton(id, numerosIngresados);
    }
    
    /**
     * Crea un cartón de manera automática con números aleatorios
     */
    public Carton crearCartonAutomatico(String id) {
        int[][] numeros = new int[5][5];
        
        // Generar números para cada columna
        for (int col = 0; col < 5; col++) {
            List<Integer> numerosColumna = generarNumerosParaColumna(col);
            for (int fila = 0; fila < 5; fila++) {
                numeros[fila][col] = numerosColumna.get(fila);
            }
        }
        
        // La casilla central se marca como libre (0)
        numeros[2][2] = 0;
        
        return new Carton(id, numeros);
    }
    
    /**
     * Genera 5 números únicos para una columna específica (MÉTODO MEJORADO)
     */
    private List<Integer> generarNumerosParaColumna(int columna) {
        int min = getMinimoColumna(columna);
        int max = getMaximoColumna(columna);
        
        // Crear lista con todos los números posibles para esta columna
        List<Integer> todosLosNumeros = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            todosLosNumeros.add(i);
        }
        
        // Mezclar aleatoriamente la lista
        Collections.shuffle(todosLosNumeros, random);
        
        // Tomar los primeros 5 números
        return new ArrayList<>(todosLosNumeros.subList(0, 5));
    }
    
    /**
     * Verifica si un número está duplicado en la matriz
     */
    private boolean estaDuplicado(int[][] matriz, int filaActual, int colActual, int numeroBuscado) {
        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 5; col++) {
                // Saltar la posición actual y la casilla central
                if ((fila == filaActual && col == colActual) || (fila == 2 && col == 2)) {
                    continue;
                }
                if (matriz[fila][col] == numeroBuscado) {
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Valida si un número es válido para una columna específica
     */
    private boolean esNumeroValidoParaColumna(int numero, int columna) {
        int min = getMinimoColumna(columna);
        int max = getMaximoColumna(columna);
        return numero >= min && numero <= max;
    }
    
    /**
     * Obtiene el mínimo número para una columna
     */
    private int getMinimoColumna(int columna) {
        switch (columna) {
            case 0: return 1;    // Columna B: 1-15
            case 1: return 16;   // Columna I: 16-30
            case 2: return 31;   // Columna N: 31-45
            case 3: return 46;   // Columna G: 46-60
            case 4: return 61;   // Columna O: 61-75
            default: return 1;
        }
    }
    
    /**
     * Obtiene el máximo número para una columna
     */
    private int getMaximoColumna(int columna) {
        switch (columna) {
            case 0: return 15;   // Columna B: 1-15
            case 1: return 30;   // Columna I: 16-30
            case 2: return 45;   // Columna N: 31-45
            case 3: return 60;   // Columna G: 46-60
            case 4: return 75;   // Columna O: 61-75
            default: return 75;
        }
    }
    
    /**
     * Valida un cartón completo según las reglas del bingo
     */
    public boolean validarCarton(Carton carton) {
        int[][] numeros = carton.getNumeros();
        
        // Verificar que la casilla central esté como libre (0)
        if (numeros[2][2] != 0) {
            return false;
        }
        
        // Verificar números por columna y duplicados
        for (int col = 0; col < 5; col++) {
            for (int fila = 0; fila < 5; fila++) {
                int numero = numeros[fila][col];
                
                // Saltar la casilla central (libre)
                if (fila == 2 && col == 2) {
                    continue;
                }
                
                // Validar rango por columna
                if (!esNumeroValidoParaColumna(numero, col)) {
                    return false;
                }
                
                // Validar duplicados
                if (estaDuplicado(numeros, fila, col, numero)) {
                    return false;
                }
            }
        }
        
        return true;
    }
}

