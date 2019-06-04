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
public class Operario extends Empregado{
    private double valorProducao;
    private double comissao;

    public Operario(double valorProducao, double comissao, int codigoSetor, double salarioBase, double imposto, String n, String e, int t) {
        super(codigoSetor, salarioBase, imposto, n, e, t);
        setValorProducao(valorProducao);
        setComissao(comissao);
    }
    
    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    public double calcularSalario()
    {
        return this.calcularSalario()+(this.getValorProducao()*this.getComissao());
    }
    
}
