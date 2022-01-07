/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Usuario {
    public String nombre;
    public String apellido;
    public String facultad;
    public int edad;
    public String direccion;
    public String telefono;
    public ArrayList paralelos;

    public Usuario(String nombre, String apellido, String facultad, String direccion, String telefono, ArrayList<Paralelo> paralelos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.facultad = facultad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paralelos = paralelos;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList getParalelos() {
        return paralelos;
    }

    public void setParalelos(ArrayList paralelos) {
        this.paralelos = paralelos;
    }
    
}
