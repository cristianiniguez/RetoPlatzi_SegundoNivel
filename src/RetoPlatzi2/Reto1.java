/*
Reto #1 - Número mayor y menor
Escribe un programa que pida al usuario 2 números, mostrando como salida cuál es
el número mayor y la diferencia de uno respecto al otro. En caso de que los
números sean iguales, mostrarlo también en pantalla.
 */
package RetoPlatzi2;

import javax.swing.JOptionPane;

public class Reto1 {

    public static void main(String[] args) {

        //Este es el reto
        double numero1, numero2, diferencia;

        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer número:"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el segundo número:"));

        if (numero1 > numero2) {
            diferencia = numero1 - numero2;
            JOptionPane.showMessageDialog(null, numero1 + " es el número mayor, con una diferencia de " + diferencia);
        } else if (numero2 > numero1) {
            diferencia = numero2 - numero1;
            JOptionPane.showMessageDialog(null, numero2 + " es el número mayor, con una diferencia de " + diferencia);
        } else {
            JOptionPane.showMessageDialog(null, "Los dos números son iguales");
        }
    }
}
