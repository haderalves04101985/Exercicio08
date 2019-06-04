/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1_2;

/**
 *
 * @author hader
 */
public class TestaAnimais {
    public static void main(String[] Args)
    {
        
        Papagaio p=new Papagaio("Theo", true, "Theobaldooo");
        p.talk();
        p.imprime();
        
        Arara a=new Arara("Azul", false);
        a.talk();
        a.imprime();
        
        Cachorro c=new Cachorro("Rango", 4, true);
        c.talk();
        a.imprime();
        
        Vaca v=new Vaca("Rubia", 3, true);
        v.talk();
        v.imprime();
        
        
    }
}
