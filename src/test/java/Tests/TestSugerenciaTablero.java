/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

import java.util.ArrayList;
import Sudoku.Tablero;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Froylan Lara Oses
 */
public class TestSugerenciaTablero {
    ArrayList<String> matrizJuegoCompleta = obtenerListaJuego();
    ArrayList<String> matrizInicio;
    
    @Test
    void testSugerenciaJuego_SoloUnaSugerencia(){
        System.out.println("testSugerenciaJuego_SoloUnaSugerencia");
        String[] nuevaMatrizSugerencia = Tablero.obtenerSugerencia(matrizInicio.toString(),matrizJuegoCompleta.toString());
        System.out.println("nuevaMatrizSugerencia: " + (Arrays.toString(nuevaMatrizSugerencia)));
        int cambios = 0;
        for(int i = 0; i < nuevaMatrizSugerencia.length; i++){
            if(!(matrizInicio.get(i).equals(nuevaMatrizSugerencia[i]))){
                cambios++;
            }
        }
        assertTrue(cambios == 1, "Se dan más de una sugerencia, lo cual es incorrecto.");
    }
    
    @Test
    void testSugerenciaJuego_ValidarSugerencia(){
        String[] nuevaMatrizSugerencia = Tablero.obtenerSugerencia(matrizInicio.toString(),matrizJuegoCompleta.toString());
        int pos = 0;
        for(int i = 0; i < nuevaMatrizSugerencia.length; i++){
            if(!(matrizInicio.get(i).equals(nuevaMatrizSugerencia[i]))){
                pos = i;
                break;
            }
        }
        
        assertTrue(((matrizJuegoCompleta.get(pos).equals(nuevaMatrizSugerencia[pos]))), "La sugerencia realizada no es correcta.");
    }
    
//------------------------------------------------------------------------------------------------------------------- 
    private ArrayList<String> obtenerListaJuego(){
        String stringJuego = Tablero.obtenerMatrixJuego();
        System.out.println("stringJuego: " + stringJuego);
        stringJuego = stringJuego.replace("[", "");
        stringJuego = stringJuego.replace("]", "");
        stringJuego = stringJuego.replace(" ", "");
        String[] lista = stringJuego.split(",");
        ArrayList<String> arrayJuego = new ArrayList();
        arrayJuego.addAll(Arrays.asList(lista)); 
        System.out.println("Tablero.crearPistas");
        matrizInicio = Tablero.crearPistas (arrayJuego);
        System.out.println("Fin funcion Test");
        return arrayJuego;
    }
}
