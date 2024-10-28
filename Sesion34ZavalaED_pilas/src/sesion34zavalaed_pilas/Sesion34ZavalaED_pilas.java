/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion34zavalaed_pilas;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author velia
 */
public class Sesion34ZavalaED_pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Integer> pilaZavala = new Stack<>();
        
        pilaZavala.push(100);
        pilaZavala.push(150);
        pilaZavala.push(230);
        pilaZavala.push(10);
        pilaZavala.push(160);
        JOptionPane.showMessageDialog(null, "Datos de la pila ordenada es :"+pilaZavala);
        
    }
    
}
