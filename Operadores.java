/**
 * Copyright <YEAR> <COPYRIGHT HOLDER>

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package operadores;

/**
 * Esta clase ilustra el uso de los operadores en el lenguaje Java
 * @author Ali Adame
 */
public class Operadores {
    
    /**
     * El siguiente es un metodo que suma valores
     * utilizando argumentos variables
     * @return double indicando el resultado
     * @param argumentos, arreglos de datos a sumar
     */
    public double sumar(double... argumentos) {
        double resultado = 0.0D;
        for (int i = 0; i < argumentos.length; i++) {
            resultado = resultado + argumentos[i];
        }
        return resultado;
    }
    
    /**
     * El siguiente es un metodo que resta valores
     * utilizando argumentos variables
     * @param argumentos, arreglo de datos a restar
     * @return double indicando el resultado
     */
    public double restar(int inicio, double... argumentos) {
        double resultado = argumentos[inicio];
        for (double arg : argumentos) {
            if(inicio != 0) {
                if(arg > 0) {
                    resultado = resultado - (arg);
                } else {
                    resultado = resultado + (arg);
                }
            } else {
                inicio = 1;
            }
        }
        return resultado;
    }
    
    /**
     * El siguiente es un metodo que multiplica valores
     * utilizando argumentos variables
     * @param args valores con tipo de dato double
     * @return double con la multiplicacion
     */
    public double multiplicar(double... args) {
        double resultado = args[0];
        for (int i = 0; i < args.length; i++) {
            resultado = resultado * Math.abs(args[i]);
        }
        return resultado;
    }
    
    /**
     * El siguiente es un metodo que divide valores
     * utilizando argumentos variables
     * @param args valores con tipo de dato double
     * @return Double con la division o nulo si hay error
     */
    public Double dividir(double... args) {
        double resultado = args[0];
        for (int i = 0; i < args.length; i++) {
            if(args[i] == 0) {
                return null;
            }
            resultado = resultado / Math.abs(args[i]);
        }
        return resultado;
    }

    /**
     * Metodo main, de ejecucion de la operaciones
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Probando el metodo sumar
        System.out.println(new Operadores().sumar(-2,-3,5));
        
        // Probando el metodo restar
        System.out.println(new Operadores().restar(0,-100,-100));
        System.out.println(new Operadores().restar(0,100,100,-100,-200));
        System.out.println(new Operadores().multiplicar(0,-2,-1,-3));
        System.out.println(new Operadores().dividir(100,100));
    }
    
}
