/*
Reto #4 - “I like turtles”
Escribe un programa que pida al usuario ingrese su animal favorito, si coloca
‘Tortuga’, ‘tortuga’, ‘TORTUGA’ o cualquier otra variante de la palabra entonces
mostrar en pantalla “También me gustan las tortugas”. En caso contrario mostrar
el mensaje “Ese animal es genial, pero prefiero las tortugas”.
 */
package RetoPlatzi2;

import javax.swing.JOptionPane;

public class Reto4 {

    public static void main(String[] args) {

        //Este es el reto
        String animal;

        animal = JOptionPane.showInputDialog("Ingrese su animal favorito:");

        if (animal.equalsIgnoreCase("tortuga")) {
            JOptionPane.showMessageDialog(null, "También me gustan las tortugas");
        } else {
            JOptionPane.showMessageDialog(null, "Ese animal es genial, pero prefiero las tortugas");
        }
    }
}
