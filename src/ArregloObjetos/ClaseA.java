package ArregloObjetos;

public class ClaseA {
        //Atributos
        private int carnet;
        private String nombre;
        private int edad;
       
        //Metodos

    public ClaseA(int carnet, String nombre, int edad) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "ClaseA{" + "carnet=" + carnet + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
}//Fin de la clase ClaseA