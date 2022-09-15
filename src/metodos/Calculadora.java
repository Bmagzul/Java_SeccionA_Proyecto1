package metodos;

public class Calculadora  {
    private double cantidad1;
    private double cantidad2;
    private double suma;
    private double resta;
    private double multiplicacion;
    private double division;
    
    public void setDatos(double n1, double n2) {
        cantidad1 = n1;
        cantidad2 = n2;
    }
   
    public void suma() {
        suma = cantidad1 + cantidad2;
    }
    
    public void resta() {
        resta = cantidad1 - cantidad2;
    }
    
    public void multiplicacion() {
        multiplicacion = cantidad1 * cantidad2;
    }
    
    public void division()
    {
        if (cantidad2 != 0) {
            division = cantidad1 / cantidad2;
        } else {
            division = 0;
            System.out.println("¡Error de division entre 0!");
        }
    }
    
    public void resultados() {
        System.out.println("----- Resultados -----");
        System.out.println("Cantidad 1 = " + cantidad1);
        System.out.println("Cantidad 2 = " + cantidad2 + "\n");
        
        System.out.println("Suma:           " + suma);
        System.out.println("Resta:          " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division:       " + division + "\n\n");
    }
}
