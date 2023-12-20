/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        
        int[][] arreglo1 = {{10, 41, 40}, {1, 2, 3},{1,12,4}};
        int suma = 0;
        for (int fila = 0; fila < arreglo1.length; fila++) {
            for (int col = 0; col < arreglo1[fila].length; col++) {               
               int c=0;
               int f=0;
                if (fila==col){
                    suma =suma +arreglo1[fila][col];
                        
                    }
                }
                
            
        }
        System.out.println( suma);
        // Comenzamos realzando un arreglo que realice el numero de filas y 
        // columnas, ademas le colocamos una restriccion que si esta en las 
        // posiciones [0,0] [1,1] [2,2] entonces recorre las posiciones y estas 
        // a su vez las suma.
    }
    
}

