/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author clases
 */
public class OperadoresYMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejemplo: residuo de 55 entre 10
        Operadores operador1 = new Operadores();
        System.out.println(operador1.residuoEnDivision(55, 10));
        
        // Las cadenas (String) pueden producir sorpresas
        int a = 5;
        int b = 4;
        System.out.println(a + b);
        
        int valor1 = 5;
        String valor2 = "4";
        System.out.println(valor1 + valor2);
        
        // Podemos ver operadores unarios
        System.out.println(a++); // Imprime 5?
        System.out.println(a); // Imprime 6
        System.out.println(++a); // Imprime 7
        
        parOImpar(55);
        
        System.out.println((13-4) * (5-2) + 3 * (2+8));
        System.out.println(16 + 3 * (6 - 4) - 3 * 5);
        System.out.println(23 - 8 + 6 * 2 - 3 * 4);
        
        if(!false) { // Se evalua que es verdadero
            System.out.println("Hola!");
        }
        if(5 != 10) {
            System.out.println("5 no es 10");
        }
        Integer x = 10;
        int y = 20;
        int z = 30;
        if(x > y && z > y) { // false && true
            System.out.println("Resultado" + (x+y+z) );
        }
        // Variante de Yeicob, el siguiente bloque se imprime
        if(x > y || z > y) { // false || true
            System.out.println("Resultado" + x+y+z );
            System.out.println("Resultado " + (x+y+z) );
            System.out.println("Resultado " + (x.toString() +y+z) );
        }
        
        // Ejemplo de conversion de tipos validos e invalidos
        System.out.println((int) (Math.random() * 100));
        // Error en la siguiente linea, conversion de tipo incorrecta
        //System.out.println((boolean) (Math.random() * 100));
        
        Scanner sc = new Scanner(System.in);
        if(sc != null) {
            System.out.println("Escribe tu edad en un numero");
        }
        Integer edad = sc.nextInt();
        eresMayorDeEdadConSwitch(edad);
        
    }
    
    /**
     * Este metodo nos ayuda a conocer el valor sobrante de una division
     * @param dividendo valor que se divide
     * @param divisor valor que separa al dividendo
     * @return int con la cantidad de unidades sobrantes
     */
    public int residuoEnDivision(int dividendo, int divisor) {
        return dividendo % divisor;
    }
    
    /**
     * Este metodo determina si un numero es par o impar
     * @param numeroAEvaluar 
     * @author Ali Adame
     */
    public static void parOImpar(int numeroAEvaluar) {
        if(numeroAEvaluar % 2 == 0) {
            System.out.println("El numero " + numeroAEvaluar + " es par");
        } else {
            System.out.println("El numero " + numeroAEvaluar + " es impar");
        }
    } // ejemplo de uso parOImpar(55);
    
    /**
     * Metodo que indica si una persona es mayor de edad
     * @param edad int que representa numero de anios cumplidos
     */
    public static void eresMayorDeEdad(int edad) {
        if(edad > 18) {
            System.out.println("Eres mayor de edad");
        } else if(edad == 18) {
            System.out.println("Apenas eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
    
    /**
     * Metodo que indica si una persona es mayor de edad
     * @param edad int que representa numero de anios cumplidos
     */
    public static void eresMayorDeEdadConSwitch(int edad) {
        switch (edad) {
            case 18:
                System.out.println("Apenas eres mayor de edad");
                
            case 20:
                System.out.println("Apenas tienes 20");
                break;
            case 80:
                System.out.println("Ya estas viejo");
                break;
            default:
                System.out.println("No estoy seguro si eres joven o viejo");
        }
    }
    
}
