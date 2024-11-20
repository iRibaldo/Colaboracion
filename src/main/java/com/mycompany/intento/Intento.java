/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.intento;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Intento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int notas[] = new int[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("Ingrese las notas del estudiante:" + (i + 1));
            notas[i] = sc.nextInt();
        }

        Scanner menu = new Scanner(System.in);
        int opcion = 0;
        while (opcion!=4) {

            System.out.println("Opcion 1: Promedio");
            System.out.println("Opcion 2: Alta Baja");
            System.out.println("Opcion 3: aprobado reprobado");
            System.out.println("Salir");

           opcion = menu.nextInt();
            int suma = 0;
            for (int i = 0; i < 5; i++) {

                suma = notas[i] + suma;

            }
            int notaAlta = 0;
            int notaB = 0;

            for (int i = 0; i < 5; i++) {
                if (notas[i] > 0) {
                    notaAlta = notas[i];
                }

                if (notas[i] <= 0) {
                    notaB = notas[i];
                }
            }

            switch (opcion) {
                case 1:
                    System.out.println("El promedio de notas es de:" + (suma / 5));

                    break;
                default:
                    System.out.println("Elija la opcion corecta");

                case 2:
                    System.out.println("la nota alta: " + notaAlta + "baja es:" + notaB);
                    break;

                case 3:
                    int caprobado = 0;
                    int creprobado = 0;
                    int aprobado = 0;
                    int reprobado = 0;
                    for (int i = 0; i < 5; i++) {
                        if (notas[i] <= 7) {
                            caprobado++;
                            aprobado = caprobado;
                        } else {
                            creprobado++;
                            reprobado = creprobado;

                        }

                    }
                    System.out.println("los aprobados son:" + aprobado);
                    System.out.println("los reprobados son:" + reprobado);
                    break;

            }
        }
    }
}
