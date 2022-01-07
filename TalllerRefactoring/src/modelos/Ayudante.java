package modelos;

import java.util.ArrayList;

public class Ayudante extends Usuario{
    protected Estudiante est;
    public ArrayList<Paralelo> paralelos_ayudantias;

    public Ayudante(Estudiante est, ArrayList<Paralelo> paralelo, String nombre, String apellido, String facultad, String direccion, String telefono, ArrayList<Paralelo> paralelos) {
        super(nombre, apellido, facultad, direccion, telefono, paralelos);
        this.est = est;
        this.paralelos_ayudantias = paralelo;
    }

   
    public String getMatricula() {
        return est.getMatricula();
    }

    public void setMatricula(String matricula) {
        est.setMatricula(matricula);
    }

    //Getters y setters se delegan en objeto estudiante para no duplicar código
    public String getNombre() {
        return est.getNombre();
    }

    public String getApellido() {
        return est.getApellido();
    }

    //Los paralelos se añaden/eliminan directamente del Arraylist de paralelos


    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelos_ayudantias){
            //Muestra la info general de cada paralelo
        }
    }
}
