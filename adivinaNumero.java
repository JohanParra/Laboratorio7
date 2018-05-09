/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import java.util.Scanner;

/**
 *
 * @author Johan
 */
public class adivinaNumero {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero = 0;
        int aleatorio = 0;
        int contador = 0;
        boolean nivel = false;

        System.out.println("¿Empezamos fácil? True/False");
        nivel = leer.nextBoolean();
        
        
        if (nivel == true) {
            do {
                aleatorio = (int) (Math.random() * 100);

                if (contador == 0) {

                    System.out.println(" -> INTENTE ADVININAR UN NÚMERO RAMDOM DE DOS CIFRAS <-");
                    System.out.println(" ");

                }

                System.out.println("Dijite su intento de número de dos cifras");
                numero = leer.nextInt();

                if (aleatorio > numero) {
                    System.out.println("Pista: Es un número MAYOR");

                } else {
                    System.out.println("Pista: Es un número MENOR");
                }
                if (contador == 6) {
                    System.out.println("Exsediste el número de intentos");
                    break;
                }
                contador++;

            } while (aleatorio != numero);
            {
                if (contador < 6) {

                    System.out.println("MUY BIEN!!!! Adivinaste el número en " + contador + " intentos");
                }

            }
        } else {

            do {
                aleatorio = (int) (Math.random() * 10000);

                if (contador == 0) {

                    System.out.println(" -> INTENTE ADVININAR UN NÚMERO RAMDOM DE CUATRO CIFRAS<-");
                    System.out.println(" ");

                }

                System.out.println("Dijite su intento de número de cuatro cifras");
                numero = leer.nextInt();

                if (aleatorio > numero) {
                    System.out.println("Pista: Es un número MAYOR");

                } else {
                    System.out.println("Pista: Es un número MENOR");
                }
                if (contador == 6) {
                    System.out.println("Exsediste el número de intentos");
                    break;
                }
                contador++;

            } while (aleatorio != numero);
            {
                if (contador < 6) {

                    System.out.println("MUY BIEN!!!! Adivinaste el número en " + contador + " intentos");
                }

            }

        }

    }
}
