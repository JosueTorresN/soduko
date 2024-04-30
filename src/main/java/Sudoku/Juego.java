/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sudoku;

import java.util.ArrayList;

/**
 *
 * @author Froylan Lara
 * @author Alina Bonilla
 */
public class Juego {
    public ArrayList<ArrayList<String>> historialTablero;
    public ArrayList<String> matrizActual; 
    public ArrayList<String> matrizCompleta;
    public int estado;     //0 en juego      1 partida ganada      2 autosolucion      3 abandonada
    public int verificaciones;    
    public int errores;
    public int sugerencias;
    public int ingresoDigitos;
    public String cronometro;
    
    public Juego(){
        historialTablero = new ArrayList(); 
        matrizActual = new ArrayList();
        matrizCompleta = new ArrayList();
        estado = 0;
        verificaciones = 0;   
        errores = 0;
        sugerencias = 0;
        ingresoDigitos = 0;
        cronometro = "";
    }
}
