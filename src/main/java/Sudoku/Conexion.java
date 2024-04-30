/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sudoku;

import java.util.ArrayList;
import org.jpl7.Atom;  
import org.jpl7.Term;  
import org.jpl7.Query;  

/**
 *
 * @author Alina Bonilla
 */
public class Conexion {
    public static ArrayList<String> GenerarTablero() {
        ArrayList<String> matriz = new ArrayList();
        Query q1 = new Query("consult",new Term[]{new Atom("src/main/sudoku.pl")});
        System.out.println("consult "+(q1.hasSolution()?"succed":"failed"));
        return matriz;
    }
    
    public static Query GenerarConexion() {
        Query q1 = new Query("consult",new Term[]{new Atom("src/main/sudoku.pl")});
        System.out.println("consult "+(q1.hasSolution()?"succed":"failed"));
        return q1;
    }
}
