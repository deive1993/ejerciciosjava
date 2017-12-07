/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matriz4;

/**
 *
 * @author PC12
 */
public class matriz4x3 {
    public static void main(String[] args) {
        int matriz[][] = new int [4][3];
        
        matriz [0][0] = 2;
        matriz [0][1] = 4;
        matriz [0][2] = 4;
        matriz [1][0] = 6;
        matriz [1][1] = 6;
        matriz [1][2] = 9;
        matriz [2][0] = 8;
        matriz [2][1] = 10;
        matriz [2][2] = 12;
        matriz [3][0] = 3;
        matriz [3][1] = 5;
        matriz [3][2] = 7;
        
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                
                System.out.println(matriz[x][y]);
            }
            
        }
       
    }
    
}
