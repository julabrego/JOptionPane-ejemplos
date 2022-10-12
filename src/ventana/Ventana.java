package ventana;

import javax.swing.JOptionPane;

public class Ventana {

    public static void main(String[] args) {
        // Swing
        // JOptionPane
        String nombre;
        nombre = JOptionPane.showInputDialog("Por favor, ingrese su nombre");

        JOptionPane.showMessageDialog(null, "Bienvenido, " + nombre, "Título de la alerta", JOptionPane.QUESTION_MESSAGE);

        int respuesta = JOptionPane.showConfirmDialog(null, "Te gusta programar?");
        System.out.println(respuesta);
        // Respuestas posibles:
        // SI: 0
        // NO: 1
        // CANCELAR: 2
        
        switch (respuesta) {
            case 0:
                JOptionPane.showMessageDialog(null, "Qué bien! :D");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Qué mal! :(");
            default:
                JOptionPane.showMessageDialog(null, "No sabe, no contesta");
        }

        Object[] options = {"Opción custom 1", "Opción custom 2", true, "Otra opción más"};
        JOptionPane.showOptionDialog(null, "Creo un menú personalizado", "Warning",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]);
    }

}
