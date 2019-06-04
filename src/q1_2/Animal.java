
package q1_2;
public class Animal {
    private String nome;
    
    public Animal(String n)
    {
        setNome(n);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void talk()
    {
        
    }
    
    public void imprime()
    {
        System.out.println(this.getNome());
    }
    
    
}
