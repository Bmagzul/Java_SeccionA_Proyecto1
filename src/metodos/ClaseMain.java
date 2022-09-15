package metodos;
import metodos.Calculadora;
import java.util.Scanner;

public class ClaseMain {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        while (true) {
            Scanner teclado = new Scanner(System.in);
        
            double cantidad1, cantidad2;
            
            System.out.println("Ingrese la primera cantidad: ");
            cantidad1 = teclado.nextDouble();
            System.out.println("Ingrese la segunda cantidad: ");
            cantidad2 = teclado.nextDouble();
            
            calc.setDatos(cantidad1, cantidad2);

            calc.suma();
            calc.resta();
            calc.multiplicacion();
            calc.division();

            calc.resultados();
        }
    }
}
