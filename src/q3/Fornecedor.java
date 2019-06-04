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

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;
    
    public Fornecedor(String n, String e, int t, double vc, double vd)
    {
        super(n, e, t);
    setValorCredito(vc);
        setValorDivida(vd);
                
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    
    public double obterSaldo()
    {
        return this.valorCredito-this.valorDivida;
    }
    
    
    
}
