package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
    Dada una secuencia de números leídos por pantalla, que acabe con un –1, por ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,……,-1;

    Escriba un algoritmo que determine y muestre el valor máximo, mínimo y el promedio . Suponemos que el usuario no ingresará números negativo

    CONSIDERACIONES: para escribir el algoritmo se puede utilizar la sintaxis del lenguaje de programación que se prefiera
	 */

        Scanner sc = new Scanner(System.in);
        Integer numero = 0;
        String secuencia = "";
        Integer valorMayor = 0;
        Integer valorMenor = 1000;
        Double suma = 0.0;
        Integer contador = 0;

        while (numero != -1) {
            System.out.println("Ingrese un numero (-1 para terminar): ");
            numero = sc.nextInt();
            secuencia = secuencia + numero;
        }
        for (int i = 0; i < secuencia.length() - 2; i++) {
            numero = Character.getNumericValue(secuencia.charAt(i));
            System.out.println(numero);
            if (numero < valorMenor) {
                valorMenor = numero;
            } else if (numero > valorMayor) {
                valorMayor = numero;
            }
            contador = contador + 1;
            suma = suma + numero;
        }
        System.out.println("valor mayor: " + valorMayor);
        System.out.println("valor menor: " + valorMenor);
        System.out.println("promedio: " + suma / contador);


    /*
    Escriba un algoritmo para calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se calcula según el siguiente criterio:
    la parte práctica vale el 10%;
    la parte de problemas vale el 50%;
    y la parte teórica el 40%.
    El algoritmo leerá el nombre del alumno, las tres notas, presentará por pantalla el resultado y volverá a pedir los datos
    del siguiente alumno hasta que el nombre sea una cadena vacía.
    Las notas deben estar entre 0 y 10, si no lo están, no imprimirá el resultado, mostrará un mensaje de error y volverá a pedir otro alumno.
     */

        String nombre = "";
        Double nota = 0.0;
        Double[] notas = new Double[3];
        Double resultado = 0.0;
        sc.nextLine();

        do {
            System.out.println("Ingrese el nombre del alumno: ");
            nombre = sc.nextLine();
            Boolean notaMal = false;
            for (int i = 1; i < 4; i++) {
                System.out.println("Ingrese la nota : ");
                nota = sc.nextDouble();
                if (nota >= 0 && nota < 11) {
                    notas[i-1] = nota;
                } else {
                    notaMal = true;
                    break;
                }
            }
            sc.nextLine();
            if (!notaMal){
                resultado = notas[0]*0.10+notas[1]*0.50+notas[2]*0.40;

            }else {
                resultado = -1.0;

            }

            if (nombre != "" && resultado != -1.0) {
                System.out.println("El alumno " + nombre + " obtuvo una nota final de " + resultado);
            } else if (nombre == ""){
                System.out.println("El alumno no existe");
            }else {
                System.out.println("Las notas ingresadas estan fuera de rango");
            }

        } while (nombre != "");
    }
}
