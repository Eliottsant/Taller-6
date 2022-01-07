package modelos;

import java.util.ArrayList;

public class Profesor extends Usuario {
    
    public int añosdeTrabajo;

    public double BonoFijo;

    public Profesor(int añosdeTrabajo, double BonoFijo, String nombre, String apellido, String facultad, String direccion, String telefono, ArrayList<Paralelo> paralelos) {
        super(nombre, apellido, facultad, direccion, telefono, paralelos);
        this.añosdeTrabajo = añosdeTrabajo;
        this.BonoFijo = BonoFijo;
    }
    
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }

    public int getAñosdeTrabajo() {
        return añosdeTrabajo;
    }

    public void setAñosdeTrabajo(int añosdeTrabajo) {
        this.añosdeTrabajo = añosdeTrabajo;
    }

    public double getBonoFijo() {
        return BonoFijo;
    }

    public void setBonoFijo(double BonoFijo) {
        this.BonoFijo = BonoFijo;
    }  
       public double calcularSueldo(Profesor prof){
        double sueldo=0;
        sueldo= prof.añosdeTrabajo*600 + prof.BonoFijo;
        return sueldo;
    }  
}
