package ejecutable;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //  ingrese la cantidad de días
        int dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de días"));

        // Creamos el arreglo para almacenar las calorías diarias
        int[] calorias = new int[dias];

        // el usuario ingresa las calorías diarias
        for (int i = 0; i < dias; i++) {
            calorias[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las calorías del día " + (i+1)));
        }

        // Calculamos el promedio de calorías
        int suma = 0;
        for (int i = 0; i < dias; i++) {
            suma += calorias[i];
        }
        double promedio = (double)suma / dias;
        JOptionPane.showMessageDialog(null, "El promedio de calorías diarias es: " + promedio);

        // Buscamos la cantidad máxima de calorías
        int maximo = calorias[0];
        for (int i = 1; i < dias; i++) {
            if (calorias[i] > maximo) {
                maximo = calorias[i];
            }
        }
        JOptionPane.showMessageDialog(null, "La cantidad máxima de calorías diarias es: " + maximo);

        // Buscamos la cantidad mínima de calorías
        int minimo = calorias[0];
        for (int i = 1; i < dias; i++) {
            if (calorias[i] < minimo) {
                minimo = calorias[i];
            }
        }
        JOptionPane.showMessageDialog(null, "La cantidad mínima de calorías diarias es: " + minimo);

        // Ordenamos las calorías de manera ascendente para asi dar las calorias 
        JOptionPane.showMessageDialog(null, "Las calorías diarias ordenadas de manera ascendente son: " + Arrays.toString(calorias));
        
        System.exit(0);
    
    }
}

