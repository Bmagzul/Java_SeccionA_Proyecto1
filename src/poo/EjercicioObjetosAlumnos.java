package poo;
import java.util.ArrayList;
import java.util.Scanner;
import com.bethecoder.ascii_table.ASCIITable;

public class EjercicioObjetosAlumnos {
 
    public static void main(String[] args) {
        ArrayList<ClaseAlumno> lista = new ArrayList<>();
        int cantidad = 23;
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n----- Alumno " + (i+1) + " -----");
            
            Scanner teclado = new Scanner(System.in);
            
            System.out.print("Ingrese el carnet: ");
            String carnet = teclado.nextLine();
            
            System.out.print("Ingrese el nombre: ");
            String nombre = teclado.nextLine();
            
            System.out.print("Ingrese la edad: ");
            int edad = teclado.nextInt();
            
            ClaseAlumno alumno = new ClaseAlumno();
            alumno.setCarnet(carnet);
            alumno.setNombre(nombre);
            alumno.setEdad(edad);
            
            lista.add(alumno);
        }
        
        String[] encabezado = {"#", "Carnet", "Nombre","edad"};
        
        String [][] datos = new String[cantidad][];
        
        ClaseAlumno tmpAlumno;
        for (int i = 0; i < cantidad; i++) {
            tmpAlumno = lista.get(i);
            
            datos[i] = new String[] {
                String.valueOf(i+1),
                tmpAlumno.getCarnet(),
                tmpAlumno.getNombre(),
                String.valueOf(tmpAlumno.getEdad())
            };
            
        }
        System.out.println("");
        ASCIITable.getInstance().printTable(encabezado, datos, ASCIITable.ALIGN_LEFT);
    }
}
