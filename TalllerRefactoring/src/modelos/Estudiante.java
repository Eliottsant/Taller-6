package modelos;

import java.util.ArrayList;

public class Estudiante extends Usuario{
    //Informacion del estudiante
    public String matricula;

    public Estudiante(String matricula, String nombre, String apellido, String facultad, String direccion, String telefono, ArrayList<Paralelo> paralelos) {
        super(nombre, apellido, facultad, direccion, telefono, paralelos);
        this.matricula = matricula;
    }
    
    
    
    //Getter y setter de Matricula

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
    
}
        
    
    
    
            
        
        
