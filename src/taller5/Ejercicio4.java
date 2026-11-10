package taller5;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
 * Ejercicio 4 - Conversión Celsius a Fahrenheit (BufferedReader)
 */
public class Ejercicio4 {
 
    public static double convertirFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }
 
    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
 
        System.out.println("Ingresa la temperatura en Celsius:");
        double celsius = Double.parseDouble(lector.readLine());
 
        double fahrenheit = convertirFahrenheit(celsius);
 
        System.out.printf("Fahrenheit: %.2f%n", fahrenheit);
    }
}