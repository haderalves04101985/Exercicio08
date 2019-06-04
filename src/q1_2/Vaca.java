
package q1_2;

public class Vaca extends Mamifero {
    private boolean temLeite;
    
    public Vaca(String n, int p, boolean t)
    {
        super(n, p);
        setTemLeite(t);
    }
    
    public void setTemLeite(boolean t)
    {
        this.temLeite=t;
    }
    
    public boolean getTemLeite()
    {
        return this.temLeite;
    }
    
    public void talk()
    {
        System.out.println("muuuu muuuuu");
    }
}
