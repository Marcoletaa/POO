/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controle.Calculos;
import javax.swing.JOptionPane;

/**
 *
 * @author marco.borges
 */
public class Tela {
    public static void main(String[] args) {
        Calculos c = new Calculos();
        c.setNota1(Double.valueOf(JOptionPane.showInputDialog("digite a primeira nota")));
        c.setNota2(Double.valueOf(JOptionPane.showInputDialog("digite a segunda nota")));
    var media = c.calcularMedia();
        if (media >6.0){
            JOptionPane.showMessageDialog(null,"APROVADO");
       
        }else if (media<4.0){
            JOptionPane.showMessageDialog(null, "REPROVADO");
        }else {
            JOptionPane.showMessageDialog(null, "RECUPERAÇÃO");
        }
        
        
    }
    
}
