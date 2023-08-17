/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author marco.borges
 */
public class Calculos {
    private double Nota1;
    private double Nota2;

    public double getNota1() {
        return Nota1;
    }

    public void setNota1(double Nota1) {
        this.Nota1 = Nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public void setNota2(double Nota2) {
        this.Nota2 = Nota2;
    }
    public double calcularMedia(){
        var soma = this.Nota1+this.Nota2;
        return soma/2;
        
    }
        
    
    
}
