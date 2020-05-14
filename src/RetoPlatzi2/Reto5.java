/*
Reto #5 - ¿Cómo está el clima?
Crea un programa que pregunte al usuario si está lloviendo, en caso de responder
“sí” pregunta si está haciendo mucho viento y si responde “sí” nuevamente
muestra un mensaje indicando que hace mucho viento para salir con una sombrilla.
En caso contrario, anima al usuario a que lleve una sombrilla. Para el caso de
responder “no” en la primer pregunta, entonces solo desea un bonito día.
Considera que las respuestas pueden pasarse a minúsculas para evitar posibles
errores.
 */
package RetoPlatzi2;

import javax.swing.JOptionPane;

public class Reto5 {

    public static void main(String[] args) {

        //Este es el reto
        String respuesta;

        respuesta = JOptionPane.showInputDialog("¿Está lloviendo?");
        if (respuesta.equalsIgnoreCase("si")) {
            respuesta = JOptionPane.showInputDialog("¿Está haciendo mucho viento?");
            if (respuesta.equalsIgnoreCase("si")) {
                JOptionPane.showMessageDialog(null, "Hace mucho viento para salir con una sombrilla");
            } else if (respuesta.equalsIgnoreCase("no")) {
                JOptionPane.showMessageDialog(null, "Seria bueno que lleves una sombrilla");
            }
        } else if (respuesta.equalsIgnoreCase("no")) {
            JOptionPane.showMessageDialog(null, "Que tengas un bonito día");
        }
    }
}
