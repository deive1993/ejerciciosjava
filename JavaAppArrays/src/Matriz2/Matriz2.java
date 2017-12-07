/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriz2;

import java.util.Scanner;

/**
 *
 * @author PC12
 */
public class Matriz2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        int matriz[][]= new int [3][3];
        
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.println("introduce el elemento["+x+","+y+"]:" );
                matriz[x][y] = consola.nextInt();
                
                
            }
            
            
           
                
            }
            
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.println("["+x+","+y+"]:"+matriz[x][y]);
                
            }
            
        }
            
        }
        
    }
