/* Copyright 2020 - Ali Adame
Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/
package herenciamultiple;

/**
 * Clase que ilustra los metodos para el circulo
 * @author Ali Adame
 */
public class Circulo implements Dibujable, Figura {
    
    public double radio;
    
    // Constructor especial
    public Circulo(double radio) {
        this.radio = radio;
        System.out.println("Area de nuestro circulo: " + area());
    }
    
    /**
     * Metodo que implementa el area
     * @return double con el resultado
     */
    public double area() {
        // Formula para un area mas precisa
        return Math.PI * (Math.pow(radio, 2));
    }

    /**
     * Implementacion de dibujo para la clase Circulo
     */
    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo");
    }
    
}
