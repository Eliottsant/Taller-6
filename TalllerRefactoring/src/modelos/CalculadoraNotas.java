/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author Eliot
 */
public class CalculadoraNotas {
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.

    public double CalcularNota(Paralelo p, double nexamen, double ndeberes, double nlecciones, double ntalleres, ArrayList<Paralelo> paralelos) {
        double nota = 0;
        for (Paralelo par : paralelos) {
            if (p.equals(par)) {
                double notaTeorico = (nexamen + ndeberes + nlecciones) * 0.80;
                double notaPractico = (ntalleres) * 0.20;
                nota = notaTeorico + notaPractico;
            }
        }
        return nota;
    }


    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(Paralelo p, ArrayList<Paralelo> paralelos) {
        double notaTotal = 0;
        for (Paralelo par : paralelos) {
            if (p.equals(par)) {
                notaTotal = (p.getMateria().notaInicial + p.getMateria().notaFinal) / 2;

            }
        }
        return notaTotal;

    }
}
