/*
Reto #6 - Edad permitida
Pide al usuario que ingrese su edad y mostrarás un mensaje correspondiente si
esta coincide con las siguientes condiciones:
Más de 30 años: Nunca es tarde para aprender ¿Qué curso tomaremos?
Entre 29 y 18 años: Es un momento excelente para impulsar tu carrera.
Menos de 18 años: ¿Sabes hacia dónde dirigir tu futuro? Seguro puedo ayudarte.
 */
package RetoPlatzi2;

import javax.swing.JOptionPane;

public class Reto6 {

    public static void main(String[] args) {

        //Este es el reto
        int edad;
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));

        if (edad >= 30) {
            JOptionPane.showMessageDialog(null, "Nunca es tarde para aprender ¿Qué curso tomaremos?");
        } else if (edad < 18) {
            JOptionPane.showMessageDialog(null, "¿Sabes hacia dónde dirigir tu futuro?");
        } else {
            JOptionPane.showMessageDialog(null, "Es un momento excelente para impulsar tu carrera");
        }
    }
}
