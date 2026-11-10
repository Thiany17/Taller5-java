package taller5;
 
import javax.swing.JOptionPane;
 
/**
* Ejercicio 1 - Calculadora de propina (JOptionPane)
*/
public class Ejercicio1 {
 
    public static double calcularPropina(double monto, double porcentaje) {
        return monto * porcentaje / 100;
    }
 
    public static double calcularTotal(double monto, double porcentaje) {
        return monto + calcularPropina(monto, porcentaje);
    }
 
    public static void main(String[] args) {
        String textoMonto = JOptionPane.showInputDialog("Ingresa el monto de la cuenta:");
        String textoPorcentaje = JOptionPane.showInputDialog("Ingresa el porcentaje de propina:");
 
        double monto = Double.parseDouble(textoMonto);
        double porcentaje = Double.parseDouble(textoPorcentaje);
 
        double propina = calcularPropina(monto, porcentaje);
        double total = calcularTotal(monto, porcentaje);
 
        String mensaje = "Propina: $" + String.format("%.2f", propina)
                + "\nTotal: $" + String.format("%.2f", total);
 
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
