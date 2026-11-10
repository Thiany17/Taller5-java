package taller5;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
 
public class Ejercicio5 {
 
    public static void main(String[] args) throws IOException {
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre del estudiante:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad:"));
 
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
 
        System.out.println("Ingresa la nota 1:");
        double nota1 = Double.parseDouble(lector.readLine());
        System.out.println("Ingresa la nota 2:");
        double nota2 = Double.parseDouble(lector.readLine());
        System.out.println("Ingresa la nota 3:");
        double nota3 = Double.parseDouble(lector.readLine());
 
        Estudiante estudiante = new Estudiante(nombre, edad, nota1, nota2, nota3);
 
        String mensaje = "Nombre: " + estudiante.getNombre()
                + "\nEdad: " + estudiante.getEdad()
                + "\nPromedio: " + String.format("%.2f", estudiante.getPromedio());
 
        JOptionPane.showMessageDialog(null, mensaje);
    }
}