/*
    Chimaltenango, 16-07-2022
    Programador: Brandon Leonel Coyote Alvarado
    Descripcion de Programa: Areas y perimetros de figuras geometricas
 */
package estructuraSecuencial;
public class ES_Ejercicio2 {
    public static void main(String[] args){
        System.out.println("***************************Areas y perimetros de figuras geometricas***************************");
        //RECTANGULO
        float base = 15;
        float altura = 7;
        float area = 0;
        area = base * altura;
        System.out.println("_______________RECTANGULO_______________");
        System.out.println("-MEDIDAS-");
        System.out.println("Base: 15");
        System.out.println("altura: 7");
        System.out.println("El area del rectangunlo es : "+area);
        float perimetro = 0;
        perimetro = base + base + altura + altura;
        System.out.println("El perimetrro del rectangulo es: "+perimetro);
        
        //TRIANGULO
        System.out.println("_______________TRIANGULO________________");
        System.out.println("-MEDIDAS-");
        System.out.println("Base: 12");
        System.out.println("Altura: 15");
        System.out.println("Lado: 16.16");
        float baseTriangulo = 12;
        float alturaTriangulo = 15;
        double ladoTriangulo = 16.16;
        float areaTriangulo = 0;
        float perimetroTriangulo = 0;
        areaTriangulo = (baseTriangulo * alturaTriangulo)/2;
        perimetroTriangulo = (float) (baseTriangulo + ladoTriangulo + ladoTriangulo);
        System.out.println("El area del Triangulo es: "+areaTriangulo);
        System.out.println("El perimetro del Triangulo es: "+perimetroTriangulo);
        
        //ROMBO
        System.out.println("_________________ROMBO__________________");
        System.out.println("-MEDIDAS-");
        System.out.println("Diagonal Mayor: 8");
        System.out.println("Diagonal Menor: 6");
        System.out.println("Lado: 5");
        float D = 8;
        float d = 6;
        float ladoRombo = 5;
        float areaRombo = 0;
        float perimetroRombo = 0;
        areaRombo = (8*6)/2;
        perimetroRombo = ladoRombo * 4;
        System.out.println("El area del Rombo es: "+areaRombo);
        System.out.println("El perimetro del Rombo es: "+perimetroRombo);
        
        //CUADRADO
        System.out.println("_______________CUADRADO_________________");
        System.out.println("-MEDIDAS-");
        System.out.println("Lado: 5");
        float ladoCuadrado = 5;
        float areaCuadrado = 0;
        float perimetroCuadrado = 0;
        areaCuadrado = ladoCuadrado * ladoCuadrado ;
        perimetroCuadrado = ladoCuadrado * 4;
        System.out.println("El area del Cuadrado es: "+areaCuadrado);
        System.out.println("El perimetro del Cuadrado es: "+perimetroCuadrado);
        
        //ROMBOIDE
        System.out.println("_______________ROMBOIDE_________________");
        System.out.println("-MEDIDAS-");
        System.out.println("Base: 14");
        System.out.println("Altura: 9");
        System.out.println("Lado: 12");
        float ladoRomboide = 12;
        float baseRomboide = 14;
        float alturaRomboide = 9;
        float areaRomboide = 0;
        float perimetroRomboide = 0;
        areaRomboide = baseRomboide * alturaRomboide;
        perimetroRomboide = (2*baseRomboide) + (2*ladoRomboide);
        System.out.println("El area del Romboide es: "+areaRomboide);
        System.out.println("El perimetro del Romboide es: "+perimetroRomboide);
        
    }//fin metodo main
    
}
