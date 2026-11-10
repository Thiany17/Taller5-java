package taller5;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
* Ejercicio 2 - Promedio de tres notas (BufferedReader)
*
* El autograde invoca por reflexión:
*   calcularPromedio(double n1, double n2, double n3)
*   obtenerEstado(double promedio)
*
* El main debe usar BufferedReader para leer las notas.
*/
public class Ejercicio2 {
 
    public static double calcularPromedio(double n1, double n2, double n3) {
        // Calcula y retorna el promedio de las tres notas
        return (n1 + n2 + n3) / 3.0;
    }
 
    public static String obtenerEstado(double promedio) {
        // Retorna "APROBADO" si cumple con la nota mínima (70), de lo contrario "REPROBADO"
        if (promedio >= 70.0) {
            return "APROBADO";
        } else {
            return "REPROBADO";
        }
    }
 
    public static void main(String[] args) throws IOException {
        // 1. Crear BufferedReader sobre System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 2. Leer las tres notas con br.readLine()
        String input1 = br.readLine();
        String input2 = br.readLine();
        String input3 = br.readLine();
        // 3. Convertir las cadenas de texto a variables de tipo double
        double n1 = Double.parseDouble(input1);
        double n2 = Double.parseDouble(input2);
        double n3 = Double.parseDouble(input3);
        // Calcular los valores utilizando las funciones de la clase
        double promedio = calcularPromedio(n1, n2, n3);
        String estado = obtenerEstado(promedio);
        // 4. Mostrar con System.out.printf EXACTO el formato solicitado
        System.out.printf("Promedio: %.2f\n", promedio);
        System.out.printf("Estado: %s\n", estado);
    }
}