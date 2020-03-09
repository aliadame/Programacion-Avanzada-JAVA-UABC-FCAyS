/**
 * Copyright <YEAR> <COPYRIGHT HOLDER>
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package numeropersonalizado;

/**
 * Esta clase es una clase personaliza que busca
 * replicar el comportamiento de la clase Integer.java
 * @author clases
 */
public class NumeroPersonalizado extends Number {
    
    /**
     * Variable de tipo primitivo para la clase
     * este valor es el que vamos a usar
     */
    public int miNumero;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definimos numero de referencia, servira para comparaciones
        Integer numeroDeReferencia = 2020;
        
        // Una forma de generar un entero es:        
        //enteroDeReferencia = new Integer(string);
        //enteroDeReferencia = new Integer(int);
        
        // Generamos una instancia de nuestro nuevo entero
        // Esto se hace en el main
        NumeroPersonalizado numero2020 = new NumeroPersonalizado("2020");
        NumeroPersonalizado numero2020entero = new NumeroPersonalizado(2020);
        System.out.println(2020 == numeroDeReferencia);
        System.out.println(numero2020.intValue() == 2020);
        System.out.println(numero2020entero.intValue() == 2020);
        // Comparamos nuestro entero de referencia con el valor primitivo 2020
        System.out.println("Comparacion con equals");
        System.out.println(numeroDeReferencia.equals(2020));
        // Ahora replicamos el proceso con nuestro NumeroPersonalizado
        System.out.println(numero2020entero.equals(2020));
        
        // Comparamos con un doble
        System.out.println("Comparacion con doble");
        System.out.println(numero2020entero.intValue() == 2020.0D);
        Double dosMilVeintiuno = 2021.0D;
        NumeroPersonalizado mmxxi = new NumeroPersonalizado(2021); 
        System.out.println(mmxxi.intValue() == dosMilVeintiuno); // si es true funciona bien
        
        System.out.println("Comparacion por metodo flotante");
        // Comparamos de forma flotante, es decir con tipos reales
        Float miFlotante = 2020.0F;
        System.out.println(numero2020.floatValue() == miFlotante); // si es true funciona bien
    }
    
    // Generamos dos constructores, uno para cadena y otro para entero simple
    public NumeroPersonalizado(int entero) {
        this.miNumero = entero;
    }
    public NumeroPersonalizado(String cadena) {
        this.miNumero = Integer.parseInt(cadena);
    }

    /**
     * Este metodo devuelve el valor entero de nuestro entero personalizado
     * @return valor entero
     */
    @Override
    public int intValue() {
        return this.miNumero;
    }

    @Override
    public long longValue() {
        return this.miNumero;
    }

    @Override
    public float floatValue() {
        return this.miNumero;
    }

    @Override
    public double doubleValue() {
        return this.miNumero;
    }
    
    public boolean equals(Object o) {
       Integer valorComparado = new Integer(o.toString());
       return (this.miNumero == valorComparado);
    }
    
}
