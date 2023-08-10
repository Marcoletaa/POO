/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.visao;

import br.com.controller.Dobro;
import javax.swing.JOptionPane;

/**
 *
 * @author marco.borges
 */
public class Tela {
    public static void main(String[] args) {
      Dobro d = new Dobro();
      d.setValor(Integer.valueOf(JOptionPane.showInputDialog("digite um valor")));
      JOptionPane.showMessageDialog(null,   d.calcularDobro());
     
              
    }
}
