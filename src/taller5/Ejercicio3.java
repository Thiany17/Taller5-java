package taller5;
 
import javax.swing.JOptionPane;
 
/**
* Ejercicio 3 - Área y perímetro de un rectángulo (JOptionPane)
*/
public class Ejercicio3 {
 
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }
 
    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }
 
    public static void main(String[] args) {
        String textoBase = JOptionPane.showInputDialog("Ingresa la base del rectángulo:");
        String textoAltura = JOptionPane.showInputDialog("Ingresa la altura del rectángulo:");
 
        double base = Double.parseDouble(textoBase);
        double altura = Double.parseDouble(textoAltura);
 
        double area = calcularArea(base, altura);
        double perimetro = calcularPerimetro(base, altura);
 
        String mensaje = "Área: " + String.format("%.2f", area)
                + "\nPerímetro: " + String.format("%.2f", perimetro);
 
        JOptionPane.showMessageDialog(null, mensaje);
    }
}