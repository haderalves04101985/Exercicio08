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
public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public Empregado(int codigoSetor, double salarioBase, double imposto, String n, String e, int t) {
        super(n, e, t);
        setCodigoSetor(codigoSetor);
        setSalarioBase(salarioBase);
        setImposto(imposto);
    }
    
    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    public double calcularSalario()
    {
        return this.salarioBase-(this.salarioBase*this.imposto/100);
    }
    
    
}
