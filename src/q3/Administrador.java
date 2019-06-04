/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

/**
 *
 * @author ifnmg
 */
public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public Administrador(double ajudaDeCusto, int codigoSetor, double salarioBase, double imposto, String n, String e, int t) {
        super(codigoSetor, salarioBase, imposto, n, e, t);
        setAjudaDeCusto(ajudaDeCusto);
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
    public double calcularSalario()
    {
        return super.calcularSalario()+this.getAjudaDeCusto();
    }
    
}

