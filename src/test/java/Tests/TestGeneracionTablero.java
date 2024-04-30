/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;
import Sudoku.Tablero;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Froylan Lara Oses
 */
public class TestGeneracionTablero {   
    public static String[][] tablero = obtenerMatrizJuego(); 
    @Test
    void testGeneracionTableroJuegoValores_Uno_A_Nueve() {
        System.out.println("tablero: ");
        ArrayList<String> listaNumeros = new ArrayList();
        listaNumeros.add("1");
        listaNumeros.add("2");
        listaNumeros.add("3");
        listaNumeros.add("4");
        listaNumeros.add("5");
        listaNumeros.add("6");
        listaNumeros.add("7");
        listaNumeros.add("8");
        listaNumeros.add("9");
        listaNumeros.add("0");
        for (int i = 0 ; i < 9 ; i++){
            for (int j = 0 ; j < 9 ; j++){
                assertTrue(listaNumeros.contains(tablero[i][j]), "Valor inválido en la posición (" + i + ", " + j + ")");
            }
        }
    }
    
    @Test
    void testGeneracionTableroRepetidosEnFilas(){
        for (int i = 0 ; i < 9 ; i++){
            assertTrue(validarNoDuplicados(tablero[i]), "Fila numero '" + i + "' tiene valores duplicados.");
        }
    }
    
    @Test
    void testGeneracionTableroRepetidosEnColumnas(){
        for (int j = 0 ; j < 9 ; j++){
            String[] column = new String[9];
            for (int i = 0; i < 9; i++) {
                column[i] = tablero[i][j];
            }
            assertTrue(validarNoDuplicados(column), "Columna numero '" + j + "' tiene valores duplicados.");
        }
    }
    
    @Test
    void testGeneracionTableroRepetidosEnDiagonales(){
        String[] diagonal = new String[9];
        for (int i = 0; i < 9; i++) {
            diagonal[i] = tablero[i][i];
        }
        assertTrue(validarNoDuplicados(diagonal), "Diagonal principal tiene valores duplicados.");
        
        diagonal = new String[9];
        for (int i = 0; i < 9; i++) {
            diagonal[i] = tablero[i][8 - i];
        }
        assertTrue(validarNoDuplicados(diagonal), "La anti diagonal tiene valores duplicados.");
    }
    
    @Test
    void testGeneracionTableroRepetidosEnCuadriculas(){
        for (int i = 0 ; i < 9 ; i+=3){
            String[] cuadricula1 = new String[9];
            String[] cuadricula2 = new String[9];
            String[] cuadricula3 = new String[9];
            cuadricula1[0] = tablero[i][0];
            cuadricula1[1] = tablero[i][1];
            cuadricula1[2] = tablero[i][2];
            cuadricula1[3] = tablero[(i+1)][0];
            cuadricula1[4] = tablero[(i+1)][1];
            cuadricula1[5] = tablero[(i+1)][2];
            cuadricula1[6] = tablero[(i+2)][0];
            cuadricula1[7] = tablero[(i+2)][1];
            cuadricula1[8] = tablero[(i+2)][2];
            
            cuadricula2[0] = tablero[i][3];
            cuadricula2[1] = tablero[i][4];
            cuadricula2[2] = tablero[i][5];
            cuadricula2[3] = tablero[(i+1)][3];
            cuadricula2[4] = tablero[(i+1)][4];
            cuadricula2[5] = tablero[(i+1)][5];
            cuadricula2[6] = tablero[(i+2)][3];
            cuadricula2[7] = tablero[(i+2)][4];
            cuadricula2[8] = tablero[(i+2)][5];
            
            cuadricula3[0] = tablero[i][6];
            cuadricula3[1] = tablero[i][7];
            cuadricula3[2] = tablero[i][8];
            cuadricula3[3] = tablero[(i+1)][6];
            cuadricula3[4] = tablero[(i+1)][7];
            cuadricula3[5] = tablero[(i+1)][8];
            cuadricula3[6] = tablero[(i+2)][6];
            cuadricula3[7] = tablero[(i+2)][7];
            cuadricula3[8] = tablero[(i+2)][8];
            assertTrue(validarNoDuplicados(cuadricula1), "La '" + (i) + "' cuadricula tiene valores duplicados.");
            assertTrue(validarNoDuplicados(cuadricula2), "La '" + (i+1) + "' cuadricula tiene valores duplicados.");
            assertTrue(validarNoDuplicados(cuadricula3), "La '" + (i+2) + "' cuadricula tiene valores duplicados.");
        }
    }
    
//------------------------------------------------------------------------------------------------------------------
    
    private boolean validarNoDuplicados(String[] listaValores){
        ArrayList<String> lista = new ArrayList();
        for (int i = 0; i < 9; i++){
            if (lista.contains(listaValores[i])){
                return false;
            }
            lista.add(listaValores[i]);
        }
        return true;
    }
    
    public static String[][] obtenerMatrizJuego(){
        String res = Tablero.obtenerMatrixJuego();
        res = res.replace("[", "");
        res = res.replace("]", "");
        res = res.replace(" ", "");
        String[] lista = res.split(",");
        String[][] temp = new String[9][9];
        if (res.equals("[]")){
            return temp;
        }
        int cont = 0;
        for (int i = 0 ; i < 9 ; i++){
            for (int j = 0 ; j < 9 ; j++){
                String valor = lista[cont];
                temp[i][j] = valor;
                cont++;
            }
        }
        return temp;
    }
}
