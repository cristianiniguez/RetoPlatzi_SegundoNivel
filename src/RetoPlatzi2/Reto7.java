/*
Reto #7 - Mensajes opcionales
Crearás un un script para el que el usuario indicará un número entre 1 y 6. Como
respuesta se le brindará un mensaje según el número leido:
1 - “Hoy aprenderemos sobre prorgamación”
2 - “¿Qué tal tomar un curso de marketing digital?
3 - “Hoy es un gran día para comenzar a aprender de diseño”
4 - ¿Y si aprendemos algo de negocios online?
5 - “Veamos un par de clases sobre producción audiovisual”
6 - “Tal vez sea bueno desarrollar una habilidad blanda en Platzi”
En caso indicar un número distinto, pedir al usuario que ingrese uno en el rango válido.
 */
package RetoPlatzi2;

import javax.swing.JOptionPane;

public class Reto7 {

    public static void main(String[] args) {

        //Este es el reto
        int numero;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entre 1 y 6:"));
            switch (numero) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Hoy aprenderemos sobre programación.");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "¿Qué tal tomar un curso de marketing digital?");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Hoy es un gran día para comenzar a aprender de diseño");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "¿Y si aprendemos algo de negocios online?");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Veamos un par de clases sobre producción audiovisual");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Tal vez sea bueno desarrollar una habilidad blanda en Platzi");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese un número en el rango válido");
            }
        } while (numero > 6 || numero < 1);

    }
}
