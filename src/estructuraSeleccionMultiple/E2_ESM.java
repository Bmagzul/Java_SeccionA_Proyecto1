/*
Chimaltenango, 30-07-2022
Programador: Brandon Coyote
Descripción del programa: Ejemplo Estrutura de Seleccion Multiple
 */
package estructuraSeleccionMultiple;

import java.util.Scanner;

/**
 *
 * @author Brandon_Coyote
 */
public class E2_ESM {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);//para que el usuario ingrese por medio el teclado
         //Declaración e inicializacion de variables locales
        int opcionDia = 0;
        System.out.println("Brandon Coyote | 1990-20-8052");
        System.out.println("Ejemplo Estructura Selección Multiple");
        do//REPITE LA EJECUCION DEL CODIGO MIENTRAS SE CUMPLA UNA CONDICION EXPRESADA EN EL WHILE
        {
        System.out.println("________________________________________________________________________________");
        System.out.println("----------------------------RESTAURANTE LA BENDICION----------------------------");
        System.out.print("Porfavor ingrese una opcion del 1 al 7: ");
        opcionDia = entrada.nextInt();
        //Evaluación de la Estructura de Seleecion Multiple
        switch(opcionDia){
            case 0:{
                System.out.println("GRACIAS POR VISITAR NUESTRO MENU.....");
                System.out.println("Que tenga un excelente dia!!!!!");
                break;
            }//fin case 0
            case 1:{
                System.out.println("***********Día Lunes, Caldo de Pata***********");
                System.out.println("Guarniciones: Ensalada Rusa");
                System.out.println("Tortillas");
                System.out.println("Bebida: Fresco de Jamaica");
                System.out.println("Precio: Q45");
                System.out.println("NO INCLUYE POSTRE");
                break;
            }//fin case 1
            case 2:{
                System.out.println("***********Día Martes, Pollo frito***********");
                System.out.println("Guarniciones: papas fritas, arroz");
                System.out.println("Tortillas");
                System.out.println("Bebida: Fresco de Horchata");
                System.out.println("Postre: Gelatina");
                System.out.println("Precio: Q50");
                break;
            }//fin case 2
            case 3:{
                System.out.println("***********Día Miercoles, Hilachas***********");
                System.out.println("Guarniciones: Arroz, acompañado con papas");
                System.out.println("Tortillas");
                System.out.println("Bebida: Fresco de Horchata");
                System.out.println("Postre: HElado");
                System.out.println("Precio: Q45");
                break;
            }//fin case 3
            case 4:{
                System.out.println("***********Día Jueves, Chiles Rellenos***********");
                System.out.println("Guarniciones: Arroz, Frijol frito");
                System.out.println("Tortillas");
                System.out.println("Bebida: Fresco de Horchata");
                System.out.println("Postre: Gelatina");
                System.out.println("Precio: Q35");
                break;
            }//fin case 4
            case 5:{
                System.out.println("***********Día Viernes, Caldo de Mariscos***********");
                System.out.println("Guarniciones: Ensalada de Lechuga");
                System.out.println("Tortillas");
                System.out.println("Bebida: Fresco de Tamarindo");
                System.out.println("Precio: Q65");
                System.out.println("POSTRE SORPRESA");
                break;
            }//fin case 5
            case 6:{
                System.out.println("***********Día Sábado, Carnita Asada***********");
                break;
            }//fin case 6
            case 7:{
                System.out.println("***********Día Domingo, Ceviche***********");
                break;
            }//fin case 7
            default:{
                System.out.println("No se econtro el menu.");
                System.out.println("Por favor ingrese un numero del 1 al 7.");
                System.out.println("o presione 0 para salir del programa.");
                break;
            }
        }//Fin switch
        }while (opcionDia !=0);//mientras la opcion no sea cero, el programa se repite
    
    }//fin del metodo principal main()

    private static void System(String cls) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}//Fin de la clase E2_ESM
