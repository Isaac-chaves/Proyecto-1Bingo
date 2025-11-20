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
    

    private Random random;
    
    public FabricaCartones() {
        this.random = new Random();
    }
    
  
 public Carton crearCartonManual(String id, int[][] numerosIngresados) throws IllegalArgumentException {
       if (numerosIngresados.length != 5 || numerosIngresados[0].length != 5) {
     throw new IllegalArgumentException("El cartón debe ser una matriz 5x5");
        }
        for (int col = 0; col < 5; col++) {
       for (int fila = 0; fila < 5; fila++) {
              int numero = numerosIngresados[fila][col];
              if (fila == 2 && col == 2) {
                  if (numero != 0) {
                        throw new IllegalArgumentException("La casilla central debe estar vacía (0)");
                    }
                    continue;
                }
              
             if (!esNumeroValidoParaColumna(numero, col)) {
                    throw new IllegalArgumentException("Número " + numero + " no válido para columna " + (col + 1) + ". Debe estar entre " + getMinimoColumna(col) + " y " + getMaximoColumna(col));
                }
                
               if (estaDuplicado(numerosIngresados, fila, col, numero)) {
                    throw new IllegalArgumentException("Número duplicado: " + numero);
                }
            }
        }
        
        return new Carton(id, numerosIngresados);
    }
    
public Carton crearCartonAutomatico(String id) {
    int[][] numeros = new int[5][5];
        for (int col = 0; col < 5; col++) {
        List<Integer> numerosColumna = generarNumerosParaColumna(col);
           for (int fila = 0; fila < 5; fila++) {
                numeros[fila][col] = numerosColumna.get(fila);
            }
        }
        numeros[2][2] = 0;
        return new Carton(id, numeros);
    }
    
  
private List<Integer> generarNumerosParaColumna(int columna) {
    int min = getMinimoColumna(columna);
    int max = getMaximoColumna(columna);
    List<Integer> todosLosNumeros = new ArrayList<>();
    for (int i = min; i <= max; i++) {
        todosLosNumeros.add(i); // <-- Corregido: un solo "Los"
    }
    Collections.shuffle(todosLosNumeros, random);
    return new ArrayList<>(todosLosNumeros.subList(0, 5));
}
    
private boolean estaDuplicado(int[][] matriz, int filaActual, int colActual, int numeroBuscado) {
    for (int fila = 0; fila < 5; fila++) {
          for (int col = 0; col < 5; col++) {
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
   
private boolean esNumeroValidoParaColumna(int numero, int columna) {
        int min = getMinimoColumna(columna);
        int max = getMaximoColumna(columna);
        return numero >= min && numero <= max;
    }
    
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
    

 public boolean validarCarton(Carton carton) {
        int[][] numeros = carton.getNumeros();
        
        if (numeros[2][2] != 0) {
            return false;
        }
        
        for (int col = 0; col < 5; col++) {
            for (int fila = 0; fila < 5; fila++) {
                int numero = numeros[fila][col];
                
                if (fila == 2 && col == 2) {
                    continue;
                }    
                
                if (!esNumeroValidoParaColumna(numero, col)) {
                    return false;
                }
                
                if (estaDuplicado(numeros, fila, col, numero)) {
                    return false;
                }
            }
        }
        
        return true;
    }
} // Aquí termina la clase FabricaCartones