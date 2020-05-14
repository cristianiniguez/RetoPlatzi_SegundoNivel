/*
Reto #2 - En el rango, por favor
Pide al usuario que indique 2 números: uno que servirá como límite y otro para
comparar. Si el segundo número es menor al primero, mostrarás un mensaje
diciendo “El número ‘x’ se encuentra en el rango, gracias” y en caso contrario
dirá “El número ‘x’ excede el límite permitido”.
 */
package RetoPlatzi2;

import javax.swing.JOptionPane;

public class Reto2 {

    public static void main(String[] args) {

        //Este es el reto
        double limite, x;

        limite = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el límite:"));
        x = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el número a comparar:"));

        if (x <= limite) {
            JOptionPane.showMessageDialog(null, "El número " + x + " se encuentra en el rango, gracias");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + x + " excede el límite permitido");
        }
    }
}
