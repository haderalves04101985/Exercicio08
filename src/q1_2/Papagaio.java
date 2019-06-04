package q1_2;
public class Papagaio extends Ave {
    private String frase;
    
    public Papagaio(String n, boolean v, String f)
    {
        super(n, v);
        setFrase(f);
    }
    
    public void setFrase(String f)
    {
        this.frase=f;
    }
    
    public String getFrase()
    {
        return this.frase;
    }
    
    public void talk()
    {
        System.out.println(getFrase());
    }
}
