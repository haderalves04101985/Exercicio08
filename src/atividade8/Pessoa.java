
package atividade8;

/**
 *
 * @author ifnmg
 */
public class Pessoa {
    private String nome;
    private String endereco;
    private int telefone;
    
    public Pessoa(String n, String e, int t)
    {
        setNome(n);
        setEndereco(e);
        setTelefone(t);
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setNome(String n)
    {
        this.nome=n;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
   
            
    
}
