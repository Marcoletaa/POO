/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */





package visao;

import controle.OperacaoMatematica;
import controle.Soma;
import controle.Subtracao;

public class ObjetoCalculo {
    public static double calcule(OperacaoMatematica op, double valor1, double valor2){
    return op.calcular(valor1, valor2); 
 }
    public static void main(String[] args) {
        double pvalor1 =10;
        double pvalor2 =2;
        System.out.println(""+calcule(new Soma(),pvalor1,pvalor2));
     
        System.out.println(""+calcule(new Subtracao(),pvalor1,pvalor2));
    
    }
    
}
