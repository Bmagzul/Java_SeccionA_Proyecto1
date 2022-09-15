package ArregloObjetos;
import java.util.Scanner;

public class ClaseObjetos {
    public static void main(String[] args) {
        System.out.println("Arreglo de objetos");
        //Definir arreglo
        ClaseA arregloAlumno[] = new ClaseA[3];       
        int vCarnet,vEdad;
        String vNombre;
        Scanner teclado = new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.print("Carnet : ");
            vCarnet = teclado.nextInt();
            teclado.nextLine();
            System.out.print("Nombre : ");
            vNombre = teclado.nextLine();
            System.out.print("Edad   : ");
            vEdad = teclado.nextInt();
            arregloAlumno[i] =new ClaseA(vCarnet,vNombre,vEdad);       
        }//fin for
       //Mostrar datos
       for(int i=0; i<3; i++){
           System.out.println(arregloAlumno[i].toString());  
       }//fin for
     
    }//fin metodo main()
}//fin clase ClaseObjetos

