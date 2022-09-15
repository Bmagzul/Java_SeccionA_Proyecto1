/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.util.ArrayList;


public class ObjetosAlumnos {
    public static void main(String[] args) {
        ArrayList<Alumno> lista = new ArrayList<Alumno>();
        
        String[] carnets = {
            "1990-05-14126", "1990-15-22068", "1990-15-22087",
            "1990-16-21102", "1990-17-14574", "1990-18-4867",
            "1990-18-12062", "1990-19-8827","1990-19-10663",
            "1990-19-19545", "1990-20-533", "1990-20-5407",
            "1990-20-8999", "1990-20-15550", "1990-20-15746",
            "1990-20-17923", "1990-20-19580", "1990-20-23005",
            "1990-21-1102", "1990-21-1428", "1990-21-2624",
            "1990-21-7731", "1990-21-9820", "1990-21-9837"
        };
        
        String[] nombres = {
            "Rigoberto Abdias Peren Sotz",
            "Wilians Orlando Cubur Rucal",
            "Edwin Waldemar Alvarez Diaz",
            "Julio Mardoqueo Serech Cuxil",
            "Elder Gudiel Sequen Urlao",
            "JosueManuel Bosel Sequen ",
            "Erick Etsson Perez Garcia",
            "Jordeen David Villatoro Hernandez",
            "Gabriel Aljandro Rivera Garcia",
            "Andy Fernando Xinico Aju",
            "Luis Fernando lopez Roca",
            "Carlos Daniel Estrada Coc",
            "Evelyn Marleny Apen Simon",
            "Claudia Geobana Estrada Ruano",
            "Juan Jose Francisco Tocora",
            "Omar Francisco Barrutia Gonzalez",
            "Marlon Eduardo Yax Serech",
            "Ericka Elizabeth Batzibal Martin",
            "Ronald Lopez Flores",
            "Mario Laureano Subuyuc Toma",
            "Kevin Alexander Sunuc Texaj",
            "Jairo Elias Charuc Turcios",
            "Emily Jazmin Duarte Ariza",
            "Erwin Oliva Ramirez"
        };
        
        String[] emails = {
            "rperens@miumg.edu.gt",
            "wcuburr@miumg.edu.gt",
            "ealvarezd2@miumg.edu.gt",
            "jserechc@miumg.edu.gt",
            "esequenu@miumg.edu.gt",
            "jbosels@miumg.edu.gt",
            "eperezg29@miumg.edu.gt",
            "jvillatoroh1@miumg.edu.gt",
            "griverag1@miumg.edu.gt",
            "axinincoa1@miumg.edu.gt",
            "llopezr40@miumg.edu.gt",
            "cestradac12@miumg.edu.gt",
            "eapens1@miumg.edu.gt",
            "cestradar4@miumg.edu.gt",
            "jtocoraa@miumg.edu.gt",
            "obarrutiag@miumg.edu.gt",
            "myaxs2@miumg.edu.gt",
            "ebatzibalm@miumg.edu.gt",
            "rlopezf10@miumg.edu.gt",
            "msubuyuct@miumg.edu.gt",
            "ksunuct@miumg.edu.gt",
            "jcharuct1@miumg.edu.gt",
            "eduartea4@miumg.edu.gt",
            "eolivar3@miumg.edu.gt"
        }; 
        
        int[] edades = {15, 20, 18, 19, 20, 21, 22, 23, 22, 21, 20,19,19,20,21,22,23,24,25,27,28,38,18};
        
        for (int i = 0; i <= 23; i++) {
            Alumno alumno = new Alumno();
            alumno.carnet = carnets[i];
            alumno.nombre = nombres[i];
            alumno.edad = edades[i];
            alumno.email = emails[i];
            
            lista.add(alumno);
        }
        
        System.out.println("No.   CARNET                   EDAD                                                                  NOMBRE                                            CORREO");
        System.out.println("___________________________________________________________________________________________________________________________________________________________________________");
        
        for (int i = 0; i < lista.size(); i++) {
            Alumno alumno = lista.get(i);
            System.out.println((i + 1) +"      "+alumno.carnet+"                   "+ alumno.edad+"                                       "+alumno.nombre+"                                   "+alumno.email);
            
        }
        
    }
    
}