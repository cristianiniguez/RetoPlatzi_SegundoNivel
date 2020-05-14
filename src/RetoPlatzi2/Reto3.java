/*
Reto #3 - Rangos cambiantes
Nuevamente pide a tu usuario que indique 3 números: un límite superior, un
límite inferior y uno de comparación. Si el número de comparación se encuentra
entre los 2 primeros, comunicarlo en pantalla. En caso estar por debajo del
límite inferior o por arriba del límite superior, también mostrarlo en pantalla.
 */
package RetoPlatzi2;

import javax.swing.JOptionPane;

public class Reto3 {

    public static void main(String[] args) {

        //Este es el reto
        double lim_inferior, lim_superior, x;

        lim_inferior = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el límite inferior:"));
        lim_superior = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el límite superior:"));
        x = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el número a comparar:"));

        if (x >= lim_inferior && x <= lim_superior) {
            JOptionPane.showMessageDialog(null, "El número " + x + " se encuentra en el rango, gracias");
        } else if(x < lim_inferior) {
            JOptionPane.showMessageDialog(null, "El número " + x + " excede el límite inferior");
        }else{
            JOptionPane.showMessageDialog(null, "El número " + x + " excede el límite superior");
        }
    }
}
