/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade8;

/**
 *
 * @author ifnmg
 */
public class Teste {
    public static void main(String[] Args)
    {
        Pessoa p1=new Pessoa("Hader", "Rua A", 999119903);
        Fornecedor f1=new Fornecedor("Log", "Rua C", 37439011, 15000, 5000);
        Empregado e1=new Empregado(2100, 2400, 10, "Hader", "Rua A", 999119903);
        Administrador a1=new Administrador(800, 2100, 2400, 5, "hader", "Rua a", 99911903);
        
        System.out.println(f1.obterSaldo());
        
        System.out.println(e1.calcularSalario());
        
        System.out.println(a1.calcularSalario());
        
    }
}
