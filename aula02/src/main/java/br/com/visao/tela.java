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
public class tela {
    public static void main(String[] args) {
        Calculos c = new Calculos();
        c.setNumero1(Double.valueOf(JOptionPane.showInputDialog("digite um valor")));
        c.setNumero2(Double.valueOf(JOptionPane.showInputDialog("digite outro valor")));
    
        JOptionPane.showMessageDialog(null,"soma" +c.somar());
    }
    
    
    
}
