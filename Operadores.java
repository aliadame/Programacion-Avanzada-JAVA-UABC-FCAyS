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
     * Metodo main, de ejecucion de la operaciones
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(new Operadores().sumar(2,3,5));
    }
    
}
