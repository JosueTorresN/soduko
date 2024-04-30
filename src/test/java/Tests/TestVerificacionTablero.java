/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

import Sudoku.Tablero;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Froylan Lara Oses
 */
public class TestVerificacionTablero {
    
    @Test
    void testVerificacionJuego_FinPartida_TodasCasillasCorrectas(){
        String tablero = "[1, 8, 2, 6, 4, 3, 9, 5, 7, 7, 5, 9, 8, 1, 2, 6, 4, 3, 6, 4, 3, 9, 5, 7, 8, 2, 1, 8, 9, 6, 4, 3, 5, 7, 1, 2, 4, 2, 7, 1, 6, 8, 3, 9, 5, 3, 1, 5, 2, 7, 9, 4, 8, 6, 5, 7, 1, 3, 8, 4, 2, 6, 9, 2, 3, 8, 5, 9, 6, 1, 7, 4, 9, 6, 4, 7, 2, 1, 5, 3, 8]";
        String[] resultadoVerificacion = Tablero.verificarTablero(tablero,tablero); 
        assertTrue((Arrays.toString(resultadoVerificacion).equals("[]")), "El valor esperado era '[]', ya que, se termina el juego ya que todas las casillas son correctas.");
    }
    
    @Test
    void testVerificacionJuego_TodasCasillasLlenas_UnaIncorrecta(){
        String tablero = "[1, 8, 2, 6, 4, 3, 9, 5, 7, 7, 5, 9, 8, 1, 2, 6, 4, 3, 6, 4, 3, 9, 5, 7, 8, 2, 1, 8, 9, 6, 4, 3, 5, 7, 1, 2, 4, 2, 7, 1, 6, 8, 3, 9, 5, 3, 1, 5, 2, 7, 9, 4, 8, 6, 5, 7, 1, 3, 8, 4, 2, 6, 9, 2, 3, 8, 5, 9, 6, 1, 7, 4, 9, 6, 4, 7, 2, 1, 5, 3, 8]";
        String juego = "[1, 5, 2, 6, 4, 3, 9, 5, 7, 7, 5, 9, 8, 1, 2, 6, 4, 3, 6, 4, 3, 9, 5, 7, 8, 2, 1, 8, 9, 6, 4, 3, 5, 7, 1, 2, 4, 2, 7, 1, 6, 8, 3, 9, 5, 3, 1, 5, 2, 7, 9, 4, 8, 6, 5, 7, 1, 3, 8, 4, 2, 6, 9, 2, 3, 8, 5, 9, 6, 1, 7, 4, 9, 6, 4, 7, 2, 1, 5, 3, 8]";
        String[] resultadoVerificacion = Tablero.verificarTablero(juego,tablero); 
        System.out.println("resultadoVerificacion: " + Arrays.toString(resultadoVerificacion)); 
        System.out.println("comparacion: " + (Arrays.toString(resultadoVerificacion).equals("[1, 0, 80]")));
        assertTrue((Arrays.toString(resultadoVerificacion).equals("[1, 0, 80]")), "El valor esperado era '[1,0,80]', ya que, hay una casilla incorrecta, mas ninguna vacia.");
    }
    
    @Test
    void testVerificacionJuego_CincoCasillasVacias_CeroIncorrecta(){
        String tablero = "[1, 8, 2, 6, 4, 3, 9, 5, 7, 7, 5, 9, 8, 1, 2, 6, 4, 3, 6, 4, 3, 9, 5, 7, 8, 2, 1, 8, 9, 6, 4, 3, 5, 7, 1, 2, 4, 2, 7, 1, 6, 8, 3, 9, 5, 3, 1, 5, 2, 7, 9, 4, 8, 6, 5, 7, 1, 3, 8, 4, 2, 6, 9, 2, 3, 8, 5, 9, 6, 1, 7, 4, 9, 6, 4, 7, 2, 1, 5, 3, 8]";
        String juego = "[0, 0, 0, 0, 0, 3, 9, 5, 7, 7, 5, 9, 8, 1, 2, 6, 4, 3, 6, 4, 3, 9, 5, 7, 8, 2, 1, 8, 9, 6, 4, 3, 5, 7, 1, 2, 4, 2, 7, 1, 6, 8, 3, 9, 5, 3, 1, 5, 2, 7, 9, 4, 8, 6, 5, 7, 1, 3, 8, 4, 2, 6, 9, 2, 3, 8, 5, 9, 6, 1, 7, 4, 9, 6, 4, 7, 2, 1, 5, 3, 8]";
        String[] resultadoVerificacion = Tablero.verificarTablero(juego,tablero); 
        assertTrue((Arrays.toString(resultadoVerificacion).equals("[0, 5, 76]")), "El valor esperado era '[0,5,76]', ya que, no hay casillas incorrectas pero si hay 5 vacias.");
    }
    
    @Test
    void testVerificacionJuego_CincoCasillasVacias_SeisIncorrecta(){
        String tablero = "[1, 8, 2, 6, 4, 3, 9, 5, 7, 7, 5, 9, 8, 1, 2, 6, 4, 3, 6, 4, 3, 9, 5, 7, 8, 2, 1, 8, 9, 6, 4, 3, 5, 7, 1, 2, 4, 2, 7, 1, 6, 8, 3, 9, 5, 3, 1, 5, 2, 7, 9, 4, 8, 6, 5, 7, 1, 3, 8, 4, 2, 6, 9, 2, 3, 8, 5, 9, 6, 1, 7, 4, 9, 6, 4, 7, 2, 1, 5, 3, 8]";
        String juego = "[0, 0, 0, 0, 0, 4, 8, 6, 8, 8, 4, 9, 8, 1, 2, 6, 4, 3, 6, 4, 3, 9, 5, 7, 8, 2, 1, 8, 9, 6, 4, 3, 5, 7, 1, 2, 4, 2, 7, 1, 6, 8, 3, 9, 5, 3, 1, 5, 2, 7, 9, 4, 8, 6, 5, 7, 1, 3, 8, 4, 2, 6, 9, 2, 3, 8, 5, 9, 6, 1, 7, 4, 9, 6, 4, 7, 2, 1, 5, 3, 8]";
        String[] resultadoVerificacion = Tablero.verificarTablero(juego,tablero); 
        assertTrue((Arrays.toString(resultadoVerificacion).equals("[6, 5, 70]")), "El valor esperado era '[6,5,70]', ya que, hay 6 casillas incorrectas y 5 vacias.");
    }
}
