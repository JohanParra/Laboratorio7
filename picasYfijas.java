/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Johan
 */
public class picasYfijas {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int contador = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int r = 0;
        int i = 0;
        int o = 0;
        String intento = "";
        String palabra = "abecedario";
        
        while (contador < 11) {
            
            if (contador == 0) {
                System.out.println("________________ BIENVENIDO EL JUEGO____________________");
                System.out.println(" ");
                System.out.println("Intente adivinar una palabra de 10 caracteres");
                System.out.println(" ");
                System.out.println("Pista: Solo ulilice letras del abecedario");
                System.out.println(" ");
                
            }
            
            System.out.println("Inserta tu intento: ");
            intento = leer.nextLine();
            
            switch (intento) {
                
                case "a":
                    
                    System.out.println("Bien! Esta letra esta dentro de la palabra");
                    System.out.println(" ");
                    a = 1;
                    break;
                
                case "b":
                    System.out.println("Bien! Esta letra esta dentro de la palabra");
                    b = 1;
                    break;
                
                case "c":
                    System.out.println("Bien! Esta letra esta dentro de la palabra");
                    c = 1;
                    break;
                
                case "d":
                    System.out.println("Bien! Esta letra esta dentro de la palabra");
                    d = 1;                    
                    break;
                
                case "e":
                    System.out.println("Bien! Esta letra esta dentro de la palabra");
                    e = 1;
                    break;
                
                case "r":
                    System.out.println("Bien! Esta letra esta dentro de la palabra");
                    r = 1;
                    break;
                
                case "i":
                    System.out.println("Bien! Esta letra esta dentro de la palabra");
                    i = 1;
                    break;
                
                case "o":
                    System.out.println("Bien! Esta letra esta dentro de la palabra");
                    o = 1;
                    break;
                
                default:
                    System.out.println("Uy... Casi.a Pero esta letra no está.");
                
            }
            
            contador++;
            
            if (a == 1 && b == 1 && c == 1 && d == 1 && e == 1 && r == 1 && i == 1 && o == 1) {
                
                System.out.println("___________________________________________________________");
                System.out.println("Muy bien esas son las letras correctas");
                System.out.println(" ");
                System.out.println("La palabra era ABECEDARIO");
                System.out.println("_____________________________________________________________");
                
                contador = 11;
                
            }
            
        }
        
    }
    
}
